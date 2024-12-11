package com.gtech.cardapio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-db")
    public String testDatabaseConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return "Conexão com o banco de dados bem-sucedida!";
        } catch (Exception e) {
            return "Falha na conexão com o banco de dados: " + e.getMessage();
        }
    }
}
