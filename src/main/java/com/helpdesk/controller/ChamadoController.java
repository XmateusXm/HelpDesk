package com.helpdesk.controller;


import com.helpdesk.DTO.ChamadoDTO;
import com.helpdesk.DTO.ChamadoResponseDTO;
import com.helpdesk.DTO.ChamadoUpdateDTO;
import com.helpdesk.model.Chamado;
import com.helpdesk.service.ChamadoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamado" )
public class ChamadoController {

    private final ChamadoService service;

    public ChamadoController(ChamadoService service) {
        this.service = service;
    }

    @Operation(summary = "Cria um novo chamado")
    @PostMapping
    public ResponseEntity<ChamadoResponseDTO> criar(@RequestBody @Valid ChamadoDTO dto){
        return ResponseEntity.ok(service.salvar(dto));
    }

    @Operation(summary = "Busca um chamado pelo id")
    @GetMapping("/{id}")
    public ChamadoResponseDTO buscarPorId(@PathVariable Long id){
        return service.buscar(id);
    }

    @Operation(summary = "Lista os chamados existentes")
    @GetMapping
    public List<ChamadoResponseDTO> listar(){
        return service.listar();
    }

    @Operation(summary = "Atualiza os Chamados")
    @PutMapping("/{id}")
      public  ChamadoResponseDTO atualizar(@PathVariable Long id,@RequestBody @Valid ChamadoUpdateDTO chamado) {
      return service.atualizar(id, chamado);
    }
    @Operation(summary = "Deleta um chamado")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

}




