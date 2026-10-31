package com.example.demo.asiento.service;

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

import com.example.demo.asiento.entity.Asiento;
import com.example.demo.asiento.repository.AsientoRepository;
import com.example.demo.telefono.entity.Telefono;

@Service
@RestController
@RequestMapping("/asiento")
@CrossOrigin (origins = "http://localhost:4200")
public class AsientoService {
	@Autowired
	AsientoRepository asientoRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin (origins = "http://localhost:4200")
	public List <Asiento> buscar(){
		return asientoRepository.findAll();
	}
	
	@GetMapping(path = "/buscar/{idSala}")
	@CrossOrigin (origins = "http://localhost:4200")
	public List<Asiento> buscarPorAsiento(@PathVariable ("idSala") Integer idSala){
		
		return asientoRepository.findByIdSala(idSala);
	}
	
	@PostMapping
	@CrossOrigin (origins = "http://localhost:4200")
	public Asiento guardar (@RequestBody Asiento asiento) {
		return asientoRepository.save(asiento);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin (origins = "http://localhost:4200")
	public void eliminar (@PathVariable ("id") Integer id) {
		asientoRepository.deleteById(id);	
	}
}
