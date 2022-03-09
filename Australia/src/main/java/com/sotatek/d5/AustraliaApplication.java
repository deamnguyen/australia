package com.sotatek.d5;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sotatek.common.Suburb;
import com.sotatek.d5.repository.SuburbRepository;

@SpringBootApplication
public class AustraliaApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(AustraliaApplication.class, args);
	}
	
	public void run(ApplicationArguments args) {
//		String[] strArray = args.getSourceArgs();
		SuburbRepository.suburbRepository.addAll(Arrays.asList(
				new Suburb("Aarons Pass", "2850"),
				new Suburb("Baan Baa", "2390"),
				new Suburb("Cabarita", "2137"),
				new Suburb("D'aguilar", "4514"),
				new Suburb("Eagle Bay", "6281"),
				new Suburb("Fadden", "2904"),
				new Suburb("Gabalong", "6574"),
				new Suburb("Haasts Bluff", "0872"),
				new Suburb("Iama Island", "4875")
				));
	}

}
