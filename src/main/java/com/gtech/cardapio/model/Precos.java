package com.gtech.cardapio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table (name = "preco_produto_tipo_pagamento")
public class Precos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produtos produtos;

    @Column(name = "id_tipopagamento", nullable = false)
    private Integer tipoPagamento;

    @Column(name = "preco", nullable = false, precision = 20, scale = 6)
    private BigDecimal preco;
}
