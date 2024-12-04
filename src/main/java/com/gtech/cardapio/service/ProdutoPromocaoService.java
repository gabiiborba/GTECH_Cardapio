package com.gtech.cardapio.service;

import com.gtech.cardapio.model.ProdutoPromocao;
import com.gtech.cardapio.repository.ProdutoPromocaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoPromocaoService {

    private final ProdutoPromocaoRepository produtoPromocaoRepository;

    public ProdutoPromocaoService(ProdutoPromocaoRepository produtoPromocaoRepository) {
        this.produtoPromocaoRepository = produtoPromocaoRepository;
    }

    public List<ProdutoPromocao> listarProdutosEmPromocao() {
        return produtoPromocaoRepository.findProdutosEmPromocao();
    }
}