package com.gtech.cardapio.controller;

import com.gtech.cardapio.model.Precos;
import com.gtech.cardapio.repository.PrecoRepository;
import com.gtech.cardapio.service.PrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/precos")
public class PrecoController {
    private final PrecoService precoService;

    public PrecoController(PrecoService precoService) {
        this.precoService = precoService;
    }

    @Autowired
    public PrecoController(PrecoService precoService, PrecoRepository precoRepository) {
        this.precoService = new PrecoService(precoRepository);
    }

    @GetMapping
    public ResponseEntity <List<Precos>> getAllPrecos() {
        List<Precos> precos = precoService.findAllPrecos();
        return ResponseEntity.ok(precos);
    }

}
