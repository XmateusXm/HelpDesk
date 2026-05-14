package com.helpdesk.service;

import com.helpdesk.DTO.ChamadoDTO;
import com.helpdesk.DTO.ChamadoResponseDTO;
import com.helpdesk.DTO.ChamadoUpdateDTO;
import com.helpdesk.excepions.ChamadoNaoEncontradoException;
import com.helpdesk.model.Chamado;
import com.helpdesk.model.StatusChamado;
import com.helpdesk.repository.ChamadoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoRepository repository;

    public ChamadoService(ChamadoRepository repository) {
        this.repository = repository;
    }

    public ChamadoResponseDTO salvar(ChamadoDTO dto) {

        Chamado chamado = new Chamado();

        chamado.setTitulo(dto.getTitulo());
        chamado.setDescricao(dto.getDescricao());
        chamado.setStatus(StatusChamado.ABERTO);
        chamado.setDataCriacao(java.time.LocalDateTime.now());

        Chamado salvo = repository.save(chamado);
        return new ChamadoResponseDTO(salvo);
    }

    public ChamadoResponseDTO buscar(Long id) {
        Chamado chamado = repository.findById(id)
                .orElseThrow(() -> new ChamadoNaoEncontradoException("Chamado não encontrado"));
        return new ChamadoResponseDTO(chamado);
    }



    public List<ChamadoResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(chamado -> new ChamadoResponseDTO(chamado))
                .toList();
    }


    public ChamadoResponseDTO atualizar(Long id, ChamadoUpdateDTO dadosNovos) {
        Chamado chamadoExistente = repository.findById(id)
                .orElseThrow(() -> new ChamadoNaoEncontradoException("Chamado não encontrado"));
        chamadoExistente.setTitulo(dadosNovos.getTitulo());
        chamadoExistente.setDescricao(dadosNovos.getDescricao());
        chamadoExistente.setStatus(dadosNovos.getStatus());
        Chamado salvo = repository.save(chamadoExistente);
        return new ChamadoResponseDTO(salvo);
    }

     public void deletar(Long id){
        repository.findById(id)
                .orElseThrow(() -> new ChamadoNaoEncontradoException("Chamado não encontrado"));
         repository.deleteById(id);

     }
}
