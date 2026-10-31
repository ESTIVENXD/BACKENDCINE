package com.example.demo.examen.service;
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

import com.example.demo.examen.entity.Examen;
import com.example.demo.examen.repository.ExamenRepository;


@Service
@RestController
@RequestMapping("/examen")
@CrossOrigin (origins = "http://localhost:4200")
public class ExamenService{
	@Autowired
	ExamenRepository examenRepository;

	@GetMapping (path = "/buscar")
	@CrossOrigin (origins = "http://localhost:4200")
	public List <Examen> buscar(){
		return examenRepository.findAll();
		
	}
	@PostMapping
	@CrossOrigin (origins = "http://localhost:4200")
	public Examen guardar (@RequestBody Examen examen) {
		return examenRepository.save(examen);
	}
	@CrossOrigin (origins = "http://localhost:4200")
	@DeleteMapping ("/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		examenRepository.deleteById(id);	
	}
	
	@CrossOrigin (origins = "http://localhost:4200")
	@GetMapping(path = "/buscar/{carnet}")
	public List<Examen> buscarPorCarnet(@PathVariable ("carnet") Integer carnet){
		
		return examenRepository.findByCarnet(carnet);
}
}

