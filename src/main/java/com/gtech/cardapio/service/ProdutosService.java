package com.gtech.cardapio.service;

import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }

    public List<Produtos> getProdutosByGrupoId(Long grupoId) {
        return produtosRepository.findByGrupoId(grupoId);
    }
}

