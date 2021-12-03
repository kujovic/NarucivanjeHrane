package com.hcs.narucivanjehrane.entity;

import javax.persistence.*;

@Entity
@Table(name = "osoba")
public class Osoba {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ime",nullable=false)
	private String ime;
	
	@Column(name = "narucivanje")
	private String narucivanje;
	
	public Osoba() {
	
	}
	public Osoba(String ime, String narucivanje) {
		super();
		this.ime = ime;
		this.narucivanje = narucivanje;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getNarucivanje() {
		return narucivanje;
	}
	public void setNarucivanje(String narucivanje) {
		this.narucivanje = narucivanje;
	}
	
	
	
}
