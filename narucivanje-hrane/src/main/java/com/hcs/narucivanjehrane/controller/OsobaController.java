package com.hcs.narucivanjehrane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcs.narucivanjehrane.entity.Osoba;
import com.hcs.narucivanjehrane.service.OsobaService;

@Controller
public class OsobaController {
	
	private OsobaService osobaService;

	public OsobaController(OsobaService osobaService) {
		super();
		this.osobaService = osobaService;
	}
	
	//handler method za vracanje liste osoba i vraca model and view
	@GetMapping("/osoba")
	public String listaOsoba(Model model) {
		
		model.addAttribute("osoba",osobaService.vratiSveOsobe());
		return "osoba";
	}
	
	@GetMapping("/osoba/new")
	public String createOsobaForm(Model model) {
		//u njega ubacujemo vrednosti koje uzimamo od korisnika
		Osoba osoba = new Osoba();
		
		model.addAttribute("osoba",osoba);
		return "dodaj_osobu";
	}
	
	@PostMapping("/osoba")
	public String saveOsoba(@ModelAttribute("osoba") Osoba osoba) { //podatke sa forme povezati sa objektom
		osobaService.sacuvajOsobu(osoba);
		return "redirect:/osoba"; //vraca se na /osoba
	}
	
	@GetMapping("/osoba/edit/{id}")
	public String editOsobaForm(@PathVariable Long id, Model model) { //da bi dobili Id,zato koristimo ID
		model.addAttribute("osoba",osobaService.vratiOsobuPoID(id));
		return "edit_osoba";
	}
	
	@PostMapping("/osoba/{id}")
	public String updateOsoba(@PathVariable Long id, @ModelAttribute("osoba") Osoba osoba, Model model) {
		//sacuvati u osobi
		
		//uzeti iz baze osobu sa id-em
		Osoba postojecaOsoba = osobaService.vratiOsobuPoID(id);
		postojecaOsoba.setId(id);
		postojecaOsoba.setIme(osoba.getIme());
		postojecaOsoba.setNarucivanje(osoba.getNarucivanje());
		
		//sacuvati izmenjenu osobu
		osobaService.izmeniOsobu(postojecaOsoba);
		return "redirect:/osoba";
	}
	
	//handler method za brisanje
	
	@GetMapping("/osoba/{id}")
	public String deleteOsoba(@PathVariable Long id) {
		osobaService.izbrisiOsobuPoID(id);
		return "redirect:/osoba";
	}
	
}
