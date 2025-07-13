package br.com.murilo.javaSpring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Classe principal para inicialização da aplicação Spring Boot.
 *
 * Ativa o uso de clientes para consumo de APIs externas
 *
 * Módulos utilizados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * Autor: Murilo
 */
@EnableFeignClients
@SpringBootApplication
public class AppApi {

    public static void main(String[] args) {
        SpringApplication.run(AppApi.class, args);
    }
}
