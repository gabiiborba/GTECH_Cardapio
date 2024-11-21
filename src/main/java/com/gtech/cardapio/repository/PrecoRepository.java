package com.gtech.cardapio.repository;

import com.gtech.cardapio.model.Precos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoRepository extends JpaRepository<Precos, Integer> {
}