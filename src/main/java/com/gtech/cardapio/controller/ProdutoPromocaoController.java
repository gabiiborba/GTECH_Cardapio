package com.gtech.cardapio.controller;

import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.service.ProdutoPromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoPromocaoController {

    @Autowired
    private ProdutoPromocaoService produtoPromocaoService;

    @GetMapping("/promocao")
    public ResponseEntity<List<Produtos>> getProdutosEmPromocao() {
        List<Produtos> produtosEmPromocao = produtoPromocaoService.getProdutosEmPromocao();
        return ResponseEntity.ok(produtosEmPromocao);
    }
}