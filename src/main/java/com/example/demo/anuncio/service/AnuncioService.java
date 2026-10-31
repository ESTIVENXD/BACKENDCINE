package com.example.demo.anuncio.service;

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

import com.example.demo.anuncio.entity.Anuncio;
import com.example.demo.anuncio.repository.AnuncioRepository;

@Service
@RestController
@RequestMapping("/anuncio")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class AnuncioService{
	@Autowired
	AnuncioRepository anuncioRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Anuncio> buscar(){
		return anuncioRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Anuncio guardar (@RequestBody Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		anuncioRepository.deleteById(id);	
	}
}
