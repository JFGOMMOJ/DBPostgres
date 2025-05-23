package com.example.DBPostgres;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbPostgresApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(DbPostgresApplication.class, args);
	}

	private static void loadEnv() {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("BD_URL", dotenv.get("BD_URL"));
		System.setProperty("BD_USERNAME", dotenv.get("BD_USERNAME"));
		System.setProperty("BD_PASSWORD", dotenv.get("BD_PASSWORD"));
	}

}
