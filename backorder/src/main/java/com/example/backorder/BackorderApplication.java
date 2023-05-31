package com.example.backorder;

import com.example.backorder.entity.BackorderEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackorderApplication.class, args);
		BackorderEntity backorder=new BackorderEntity();
		backorder.setFirstName("Ally");
		backorder.setLastName("Mush");
		backorder.setEmail("aaa@gmail.com");

	}

}
