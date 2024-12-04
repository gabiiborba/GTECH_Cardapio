package com.gtech.cardapio.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ProdutoPromocaoDto {
    private Long id;
    private BigDecimal preco;
    private BigDecimal precoPromocional;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ProdutoPromocaoDto(Long id, BigDecimal preco, BigDecimal precoPromocional, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.preco = preco;
        this.precoPromocional = precoPromocional;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
