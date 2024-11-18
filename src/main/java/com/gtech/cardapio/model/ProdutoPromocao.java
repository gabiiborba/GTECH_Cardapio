package com.gtech.cardapio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "promocao_produto")
@Getter
@Setter
public class ProdutoPromocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)  // Relacionamento com Produto
    private Produtos produtos;

    @Column(name = "excluido", nullable = false)
    private Boolean excluido = false; // Excluído por padrão será false

    @Column(name = "preco", nullable = false)
    private Double preco;

    @Column(name = "preco_promocional", nullable = true)
    private Double precoPromocional;

    @Column(name = "data_inicial", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_final", nullable = false)
    private LocalDate dataFim;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;
}
