package com.gtech.cardapio.service;

import com.gtech.cardapio.config.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private DatabaseConfig databaseConfig;

    public void printDatabaseConfig() {
        System.out.println(databaseConfig.getFormattedDatabaseConfig());
    }
}
