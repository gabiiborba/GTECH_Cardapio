package com.gtech.cardapio.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DatabaseConfig {

    @Value("${DB_HOST}")
    private String dbHost;

    @Value("${DB_PORT}")
    private String dbPort;

    @Value("${DB_USERNAME}")
    private String dbUsername;

    @Value("${DB_PASSWORD}")
    private String dbPassword;

    @Value("${DB_NAME}")
    private String dbName;

    // Método para mostrar as variáveis
    public void printDatabaseConfig() {
        System.out.println(getFormattedDatabaseConfig());
    }

    // Extrai a lógica de formatação em um método separado
    public String getFormattedDatabaseConfig() {
        return String.format(
                "DB_HOST: %s%nDB_PORT: %s%nDB_USERNAME: %s%nDB_PASSWORD: %s%nDB_NAME: %s",
                dbHost, dbPort, dbUsername, dbPassword, dbName
        );
    }
}