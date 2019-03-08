package edu.eci.arsw.LybraryAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "edu.eci.arsw.LybraryAPI")

public class  LibraryApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

}