package com.gtech.cardapio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutosDto {
    // Campos relacionados à produtos
    private String name;
    private String description;
    private double price;
    private int promocao;
    private byte[] imagem;

    // Campos relacionados à grupo
    private String descricao;

    // Campos relacionados à promoção
    private boolean emPromocao;  // Indica se o produto está em promoção
    private double precoPromocional;  // Preço promocional, caso esteja em promoção
    private String descricaoPromocao;  // Descrição da promoção
    private String dataInicioPromocao;  // Data de início da promoção (formatada como String ou LocalDate)
    private String dataFimPromocao;  // Data de fim da promoção (formatada como String ou LocalDate)

}
