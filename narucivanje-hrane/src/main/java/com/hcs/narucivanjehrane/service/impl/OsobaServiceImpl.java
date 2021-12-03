package com.hcs.narucivanjehrane.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcs.narucivanjehrane.entity.Osoba;
import com.hcs.narucivanjehrane.repository.OsobaRepository;
import com.hcs.narucivanjehrane.service.OsobaService;

@Service
public class OsobaServiceImpl implements OsobaService {
	
	private OsobaRepository osobaRepository;
	
	
	public OsobaServiceImpl(OsobaRepository osobaRepository) {
		super();
		this.osobaRepository = osobaRepository;
	}

	@Override
	public List<Osoba> vratiSveOsobe() {
		return osobaRepository.findAll();
	}
	
	@Override
	public Osoba sacuvajOsobu(Osoba osoba) {
		
		return osobaRepository.save(osoba);
	}

	@Override
	public Osoba vratiOsobuPoID(Long id) {
		return osobaRepository.findById(id).get();
	}

	@Override
	public Osoba izmeniOsobu(Osoba osoba) {
		return osobaRepository.save(osoba);
	}

	@Override
	public void izbrisiOsobuPoID(Long id) {
		osobaRepository.deleteById(id);
	}

}
