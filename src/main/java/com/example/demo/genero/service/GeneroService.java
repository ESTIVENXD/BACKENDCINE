package com.example.demo.genero.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.genero.entity.Genero;
import com.example.demo.genero.repository.GeneroRepository;

@Service
@RestController
@RequestMapping("/genero")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class GeneroService {
	@Autowired
	GeneroRepository generoRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public  List<Genero> buscar(){
		return generoRepository.findAll();
	}
	@PostMapping 
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Genero guardar (@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		generoRepository.deleteById(id);
	}
	
	
	
}
