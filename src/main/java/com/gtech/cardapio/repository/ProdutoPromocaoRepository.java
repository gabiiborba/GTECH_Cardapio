package com.gtech.cardapio.repository;

import com.gtech.cardapio.model.ProdutoPromocao;
import com.gtech.cardapio.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoPromocaoRepository extends JpaRepository<ProdutoPromocao, Long> {
    @Query("SELECT pp.produtos FROM ProdutoPromocao pp " +
            "WHERE CURRENT_DATE BETWEEN pp.dataInicio AND pp.dataFim " +
            "AND pp.excluido = false " +
            "AND pp.ativo = true ")
    List<Produtos> findProdutosEmPromocao();
}
