package com.examjparelations.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.examjparelations.main.repositories.DosenRepository;
import com.examjparelations.main.repositories.MahasiswaRepository;
import com.examjparelations.main.services.ModelMahasiswa;

@Controller
public class HomePage {

	/*
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	*/

	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		/*
		model.addAttribute("mahasiswa", mahasiswaRepository.findAll());
		model.addAttribute("dosen", dosenRepository.findAll());
		model.addAttribute("dedi", "hallo ini pesan dari dedi");
		*/
		
		return "index";
		
	}
	
	/*
	@GetMapping("/dedi")
	//using param
	public String dedi(@RequestParam String pesan, Model model) {
		
		model.addAttribute("pesan", pesan); 
		return "dedi";
	}
	
	@GetMapping("/pesan/{pesan}")
	//using path
	public String dediPath(@PathVariable String pesan, Model model) {
		
		model.addAttribute("pesan", pesan); 
		return "dedi";
	}
	*/
	
}
