package com.helpdesk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table (name = "chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String titulo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusChamado status;
    private LocalDateTime dataCriacao;


}






