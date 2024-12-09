package com.gtech.cardapio.repository;

import com.gtech.cardapio.model.ProdutoPromocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoPromocaoRepository extends JpaRepository<ProdutoPromocao, Long> {
    @Query("SELECT pp FROM ProdutoPromocao pp " +
            "JOIN pp.produto p " +
            "WHERE CURRENT_DATE BETWEEN pp.dataInicio AND pp.dataFim " +
            "AND pp.precoPromocional > 0")
    List<ProdutoPromocao> findProdutosEmPromocao();
}
