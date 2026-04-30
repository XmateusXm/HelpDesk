package com.helpdesk.controller;


import com.helpdesk.model.Chamado;
import com.helpdesk.service.ChamadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamado" )
public class ChamadoController {

    private final ChamadoService service;

    public ChamadoController(ChamadoService service) {
        this.service = service;
    }
    @PostMapping
     Chamado receber(@RequestBody Chamado chamado){
        return service.salvar(chamado);
    }
    @GetMapping
    public List<Chamado> listar(){
        return service.listar();
    }
}
