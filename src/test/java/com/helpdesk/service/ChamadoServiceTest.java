package com.helpdesk.service;

import com.helpdesk.DTO.ChamadoDTO;
import com.helpdesk.DTO.ChamadoResponseDTO;
import com.helpdesk.model.Chamado;
import com.helpdesk.model.StatusChamado;
import com.helpdesk.repository.ChamadoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ChamadoServiceTest {

    @Mock
    private ChamadoRepository repository;

    @InjectMocks
    private ChamadoService service;

    @Test
    void deveSalvarChamadoComStatusAberto() {


        ChamadoDTO dto = new ChamadoDTO();
        dto.setTitulo("Computador não liga");
        dto.setDescricao("O computador não está ligando");


        Chamado chamadoSalvo = new Chamado();
        chamadoSalvo.setTitulo(dto.getTitulo());
        chamadoSalvo.setDescricao(dto.getDescricao());
        chamadoSalvo.setStatus(StatusChamado.ABERTO);
        chamadoSalvo.setDataCriacao(LocalDateTime.now());

        when(repository.save(any())).thenReturn(chamadoSalvo);


        ChamadoResponseDTO resultado = service.salvar(dto);


        assertEquals(StatusChamado.ABERTO, resultado.getStatus());
    }
    @Test
    void verificaDataCriacao(){

        ChamadoDTO dto = new ChamadoDTO();
        dto.setTitulo("Computador não liga");
        dto.setDescricao("O computador não está ligando");


        Chamado chamadoSalvo = new Chamado();
        chamadoSalvo.setTitulo(dto.getTitulo());
        chamadoSalvo.setDescricao(dto.getDescricao());
        chamadoSalvo.setStatus(StatusChamado.ABERTO);
        chamadoSalvo.setDataCriacao(LocalDateTime.now());

        when(repository.save(any())).thenReturn(chamadoSalvo);


        ChamadoResponseDTO resultado = service.salvar(dto);


        assertNotNull(resultado.getDataCriacao());
    }

    @Test
    void deveRetornarChamadoResponseDTO(){
        ChamadoDTO dto = new ChamadoDTO();
        dto.setTitulo("Computador não liga");
        dto.setDescricao("O computador não está ligando");


        Chamado chamadoSalvo = new Chamado();
        chamadoSalvo.setTitulo(dto.getTitulo());
        chamadoSalvo.setDescricao(dto.getDescricao());
        chamadoSalvo.setStatus(StatusChamado.ABERTO);
        chamadoSalvo.setDataCriacao(LocalDateTime.now());

        when(repository.save(any())).thenReturn(chamadoSalvo);


        ChamadoResponseDTO resultado = service.salvar(dto);
        assertNotNull(resultado);
    }
}
