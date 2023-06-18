package com.gbsouza.projectrestkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ProjectRestKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectRestKafkaApplication.class, args);
	}

}
