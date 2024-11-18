package com.gtech.cardapio.data;

import com.gtech.cardapio.model.Produtos;
import com.gtech.cardapio.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataIniciador implements CommandLineRunner {

    @Autowired
    private ProdutosRepository produtosRepository;

    @Override
    public void run(String... args) throws Exception {
        if (produtosRepository.count() == 0) {

            Produtos produto5 = new Produtos();

            Produtos produto6 = new Produtos();

            produtosRepository.save(produto5);
            produtosRepository.save(produto6);

            System.out.println("Produtos inseridos com sucesso!");
        } else {
            System.out.println("Tabela já contém produtos. Nenhuma inserção foi realizada.");
        }
    }
}

