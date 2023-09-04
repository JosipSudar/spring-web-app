package com.webaplikacije.oglasi.service;

import java.util.List;

import com.webaplikacije.oglasi.model.Oglas;

public interface OglasService {
	List<Oglas> getAllOglasi();
	void saveOglas(Oglas oglas);
	Oglas getOglasById(long id);
	void deleteOglasById(long id);
} 
