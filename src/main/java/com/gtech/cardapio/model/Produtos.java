package com.gtech.cardapio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "view_produtos_cardapio")
@Getter
@Setter
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAOPDV", nullable = false)
    private String name;

    @Column(name = "OBS", nullable = false)
    private String description;

    @Column(name = "preco", nullable = false)
    private BigDecimal price;

    // Relacionamento com o Grupo via id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo grupo;

    @Lob //Aplicada a atributos que armazenam grandes volumes de dados
    @Column(name = "IMAGEM", nullable = false)
    private byte[] imagem;

    @OneToMany(mappedBy = "produto")
    @JsonBackReference
    private List<ProdutoPromocao> promocoes;
}

