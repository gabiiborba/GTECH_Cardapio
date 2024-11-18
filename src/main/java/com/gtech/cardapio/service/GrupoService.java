package com.gtech.cardapio.service;

import com.gtech.cardapio.model.Grupo;
import com.gtech.cardapio.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public List<Grupo> getAllGrupos() {
        return grupoRepository.findAll();
    }
}
