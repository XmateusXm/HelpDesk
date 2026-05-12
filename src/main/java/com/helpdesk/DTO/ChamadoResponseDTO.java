package com.helpdesk.DTO;

import com.helpdesk.model.Chamado;
import com.helpdesk.model.StatusChamado;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class ChamadoResponseDTO {

    private final Long id;

    private final String titulo;

    private final String descricao;

    private final StatusChamado status;

    private final LocalDateTime dataCriacao;

    public ChamadoResponseDTO(Chamado chamado) {
        this.id = chamado.getId();
        this.titulo = chamado.getTitulo();
        this.descricao = chamado.getDescricao();
        this.status = chamado.getStatus();
        this.dataCriacao = chamado.getDataCriacao();
    }

}
