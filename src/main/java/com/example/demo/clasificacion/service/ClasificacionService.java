package com.example.demo.clasificacion.service;
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


import com.example.demo.clasificacion.entity.Clasificacion;
import com.example.demo.clasificacion.repository.ClasificacionRepository;

@Service
@RestController
@RequestMapping("/clasificacion")
@CrossOrigin (origins = "http://localhost:4200")
public class ClasificacionService {
	@Autowired
	ClasificacionRepository clasificacionRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin (origins = "http://localhost:4200")
	public  List<Clasificacion> buscar(){
		return clasificacionRepository.findAll();
	}
	@PostMapping 
	@CrossOrigin (origins = "http://localhost:4200")
	public Clasificacion guardar (@RequestBody Clasificacion clasificacion) {
		return clasificacionRepository.save(clasificacion);
	}
	@DeleteMapping ("/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		clasificacionRepository.deleteById(id);
	}
	
	
	
}
