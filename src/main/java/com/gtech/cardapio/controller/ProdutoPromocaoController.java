package com.gtech.cardapio.controller;

import com.gtech.cardapio.model.ProdutoPromocao;
import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.service.ProdutoPromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promocao")
public class ProdutoPromocaoController {

    private final ProdutoPromocaoService produtoPromocaoService;

    public ProdutoPromocaoController(ProdutoPromocaoService produtoPromocaoService) {
        this.produtoPromocaoService = produtoPromocaoService;
    }

    @GetMapping
    public List<ProdutoPromocao> listarProdutosEmPromocao() {
        return produtoPromocaoService.listarProdutosEmPromocao();
    }
}