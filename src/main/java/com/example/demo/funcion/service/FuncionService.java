package com.example.demo.funcion.service;

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

import com.example.demo.funcion.entity.Funcion;
import com.example.demo.funcion.repository.FuncionRepository;

@Service
@RestController
@RequestMapping("/funcion")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class FuncionService {
	@Autowired
	FuncionRepository funcionRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Funcion> buscar(){
		return funcionRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Funcion guardar (@RequestBody Funcion funcion) {
		return funcionRepository.save(funcion);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		funcionRepository.deleteById(id);	
	}
	
	@GetMapping (path = "/buscar/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Funcion buscarPorId(@PathVariable("id") Integer id) {
	return funcionRepository.findById(id).orElse(null);
	}
}

