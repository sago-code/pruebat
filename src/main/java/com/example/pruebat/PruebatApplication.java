package com.example.pruebat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Clase principal de la aplicación Spring Boot.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.pruebat"})
public class PruebatApplication {

	/**
	 * Método principal que inicia la aplicación Spring Boot.
	 * @param args argumentos de línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(PruebatApplication.class, args);
	}

}
