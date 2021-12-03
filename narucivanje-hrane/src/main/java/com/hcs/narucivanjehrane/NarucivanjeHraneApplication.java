package com.hcs.narucivanjehrane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcs.narucivanjehrane.entity.Osoba;
import com.hcs.narucivanjehrane.repository.OsobaRepository;

@SpringBootApplication
public class NarucivanjeHraneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NarucivanjeHraneApplication.class, args);
	}
	@Autowired
	private OsobaRepository osobaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*Osoba osoba1 = new Osoba("Stefan","burger");
		osobaRepository.save(osoba1);
		
		Osoba osoba2 = new Osoba("Aca","pizza");
		osobaRepository.save(osoba2);
		
		Osoba osoba3 = new Osoba("Sara","salata");
		osobaRepository.save(osoba3);*/
		
	}

}
