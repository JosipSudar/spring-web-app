package com.webaplikacije.oglasi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webaplikacije.oglasi.model.Oglas;
import com.webaplikacije.oglasi.repository.OglasRepository;

@Service
public class OglasiServiceImpl implements OglasService{

	@Autowired
	private OglasRepository oglasRepository;
	
	@Override
	public List<Oglas> getAllOglasi() {
		return oglasRepository.findAll();
	}
	
	@Override
	public void saveOglas(Oglas oglas) {
		this.oglasRepository.save(oglas);
	}
	
	@Override
	public Oglas getOglasById(long id) {
		Optional<Oglas> optional = oglasRepository.findById(id);
		Oglas oglas = null;
		if (optional.isPresent()) {
			oglas = optional.get();
		} else {
			throw new RuntimeException("Oglas nije pronađen");
		}
		return oglas;
	}
	
	@Override
	public void deleteOglasById(long id) {
		this.oglasRepository.deleteById(id);
	}
}
