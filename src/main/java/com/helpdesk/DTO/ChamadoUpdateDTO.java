package com.helpdesk.DTO;

import com.helpdesk.model.StatusChamado;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChamadoUpdateDTO {

    @NotBlank(message = "Título é obrigatório")
    @Size(min = 5, max = 100, message = "Título deve ter entre 5 e 100 caracteres")
    private String titulo;

    @NotBlank(message = "Descrição é obrigatória")
    private String descricao;

    @NotNull(message = "Status é Obrigatorio")
    private StatusChamado status;
}
