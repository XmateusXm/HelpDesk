package com.helpdesk.service;

import com.helpdesk.model.Chamado;
import com.helpdesk.repository.ChamadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoRepository repository;

    public ChamadoService(ChamadoRepository repository) {
        this.repository = repository;
    }

    public Chamado salvar(Chamado chamado) {
        chamado.setStatus("ABERTO");
        chamado.setDataCriacao(java.time.LocalDateTime.now());

        return repository.save(chamado);
    }


    public List<Chamado> listar() {
        return repository.findAll();
    }

    public Chamado buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
    }

}
