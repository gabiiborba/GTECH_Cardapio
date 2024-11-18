package com.gtech.cardapio.service;

import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.repository.ProdutoPromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoPromocaoService {

    @Autowired
    private ProdutoPromocaoRepository produtoPromocaoRepository;

    public List<Produtos> getProdutosEmPromocao() {
        return produtoPromocaoRepository.findProdutosEmPromocao();
    }
}
