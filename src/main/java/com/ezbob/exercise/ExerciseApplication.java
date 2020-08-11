package com.ezbob.exercise;

import com.sun.jdi.Bootstrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ExerciseApplication {
	@Bean
	public Logger getLogger(){
		Logger logger= LoggerFactory.getLogger(SpringBootApplication.class);
		return  logger;
	}
	public static void main(String[] args) {

		SpringApplication.run(ExerciseApplication.class, args);


	}

}
