package com.webaplikacije.oglasi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oglasi")
public class Oglas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "ime_vozila")
	private String imeVozila;
	
	@Column(name = "cijena")
	private long cijena;
	
	@Column(name = "godina")
	private long godina;
	
	@Column(name = "ime_oglasivaca")
	private String imeOglasivaca;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImeVozila() {
		return imeVozila;
	}
	public void setImeVozila(String imeVozila) {
		this.imeVozila = imeVozila;
	}
	public long getCijena() {
		return cijena;
	}
	public void setCijena(long cijena) {
		this.cijena = cijena;
	}
	public long getGodina() {
		return godina;
	}
	public void setGodina(long godina) {
		this.godina = godina;
	}
	public String getImeOglasivaca() {
		return imeOglasivaca;
	}
	public void setImeOglasivaca(String imeOglasivaca) {
		this.imeOglasivaca = imeOglasivaca;
	}
	
}
