package com.gtech.cardapio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define a estratégia de geração automática de valores para uma chave primária
    private Long id;

    @Column(name = "DESCRICAOPDV", nullable = false) //Nullable é se aceita campo null ou não
    private String name;

    @Column(name = "OBS", nullable = false)
    private String description;

    // Relacionamento com o Grupo via id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo grupo;

    @Lob //Aplicada a atributos que armazenam grandes volumes de dados
    @Column(name = "IMAGEM", nullable = false)
    private byte[] imagem;
}

