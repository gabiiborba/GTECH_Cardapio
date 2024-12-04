package com.gtech.cardapio.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class ProdutosDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imagem;
    private List<ProdutoPromocaoDto> promocoes;

    public ProdutosDto(Long id, String name, String description, BigDecimal price, String imagem, List<ProdutoPromocaoDto> promocoes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagem = imagem;
        /*this.promocoes = produtos.getPromocoes().stream()
                .map(ProdutoPromocaoDto::new)  // Converte cada ProdutoPromocao para ProdutoPromocaoDTO
                .collect(Collectors.toList());*/
    }
}
