package com.gtech.cardapio.controller;

import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutosController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping
    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }

    @GetMapping("/{idGrupo}")
    public List<Produtos> listarProdutosPorGrupo(@PathVariable Long idGrupo) {
        return produtosRepository.findByGrupoId(idGrupo);
    }
}