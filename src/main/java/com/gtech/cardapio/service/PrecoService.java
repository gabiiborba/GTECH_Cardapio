package com.gtech.cardapio.service;

import com.gtech.cardapio.model.Precos;
import com.gtech.cardapio.repository.PrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecoService {
    private final PrecoRepository precoRepository;

    @Autowired
    public PrecoService(PrecoRepository precoRepository) {
        this.precoRepository = precoRepository;
    }

    public List<Precos> findAllPrecos() {
        List<Precos> precos = precoRepository.findAll();
        if (precos.isEmpty()) {
            throw new IllegalStateException("Nenhum preço encontrado no sistema.");
        }
        return precos;
    }
}
