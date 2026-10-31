package com.example.demo.pelicula.service;

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

import com.example.demo.pelicula.entity.Pelicula;
import com.example.demo.pelicula.repository.PeliculaRepository;

@Service
@RestController
@RequestMapping("/pelicula")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class PeliculaService {
	@Autowired
	PeliculaRepository peliculaRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Pelicula> buscar(){
		return peliculaRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Pelicula guardar (@RequestBody Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		peliculaRepository.deleteById(id);	
	}
}



