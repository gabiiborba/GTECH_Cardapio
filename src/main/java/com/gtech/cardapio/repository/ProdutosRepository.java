package com.gtech.cardapio.repository;

import com.gtech.cardapio.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    List<Produtos> findAll();
    List<Produtos> findByGrupoId(Long grupoId);
}