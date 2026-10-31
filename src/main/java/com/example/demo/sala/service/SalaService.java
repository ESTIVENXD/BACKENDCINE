package com.example.demo.sala.service;

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

import com.example.demo.sala.entity.Sala;
import com.example.demo.sala.repository.SalaRepository;

@Service
@RestController
@RequestMapping("/sala")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class SalaService {
	@Autowired
	SalaRepository salaRepository;
			
		@GetMapping(path = "/buscar")
		@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
		public List <Sala> buscar(){
		return salaRepository.findAll();		
		}
		@GetMapping(path = "/buscar/{filas}")
		@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
		public List<Sala> buscarPorFilas(@PathVariable ("filas") Integer filas){
			
			return salaRepository.findByFilas(filas);
		}
		@PostMapping
		@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
		public Sala guardar(@RequestBody Sala sala) {
			return salaRepository.save(sala);
		}
		@DeleteMapping("/{id}")
		@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
		public void eliminar (@PathVariable ("id") Integer id) {
			salaRepository.deleteById(id);
		}	
}

	

