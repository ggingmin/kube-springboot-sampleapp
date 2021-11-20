package com.ggingmin.waitinglist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@SpringBootApplication
public class WaitinglistApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaitinglistApplication.class, args);
	}

}