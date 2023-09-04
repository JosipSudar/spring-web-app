package com.webaplikacije.oglasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.webaplikacije.oglasi.model.Oglas;
import com.webaplikacije.oglasi.service.OglasService;

@Controller
public class OglasContoller {
	
	@Autowired
	private OglasService oglasService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listOglasi", oglasService.getAllOglasi());
		return "index";
	}
	
	@GetMapping("/noviOglas")
	private String noviOglas(Model model) {
		Oglas oglas = new Oglas();
		model.addAttribute("oglas", oglas);
		return "novi_oglas";
	}
	
	@PostMapping("/saveOglas")
	public String saveOglas(@ModelAttribute("oglas") Oglas oglas) {
		oglasService.saveOglas(oglas);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
		Oglas oglas = oglasService.getOglasById(id);
		model.addAttribute("oglas", oglas);
		return "izmijeni_oglas";
	}
	
	@GetMapping("/deleteOglas/{id}")
	public String deleteOglas(@PathVariable(value="id") long id){
		this.oglasService.deleteOglasById(id);
		return "redirect:/";
	}
}
