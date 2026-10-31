package com.example.demo.telefono.service;

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

import com.example.demo.telefono.entity.Telefono;
import com.example.demo.telefono.repository.TelefonoRepository;

@Service
@RestController
@RequestMapping("/telefono")
@CrossOrigin (origins = "http://localhost:4200")
public class TelefonoService {
	@Autowired
	TelefonoRepository telefonoRepository;
	
	@GetMapping(path = "/buscar")
	@CrossOrigin (origins = "http://localhost:4200")
	public List <Telefono> buscar(){
	return telefonoRepository.findAll();		
	}
	@GetMapping(path = "/buscar/{idUsuario}")
	@CrossOrigin (origins = "http://localhost:4200")
	public List<Telefono> buscarPorTelefono(@PathVariable ("idUsuario") Integer idUsuario){
		
		return telefonoRepository.findByIdUsuario(idUsuario);
	}
	@PostMapping
	@CrossOrigin (origins = "http://localhost:4200")
	public Telefono guardar(@RequestBody Telefono telefono) {
		return telefonoRepository.save(telefono);
}
	@DeleteMapping("/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		telefonoRepository.deleteById(id);
	}	
}
