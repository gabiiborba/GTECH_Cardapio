package com.gtech.cardapio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "view_produtos_cardapio")
@Getter
@Setter
public class ProdutoPromocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "preco_promocional", nullable = false)
    private BigDecimal precoPromocional;

    @Column(name = "data_inicial", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_final", nullable = false)
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Produtos produto;
}