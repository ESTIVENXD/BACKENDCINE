package com.example.demo.rol.service;

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

import com.example.demo.rol.entity.Rol;
import com.example.demo.rol.repository.RolRepository;

@Service
@RestController
@RequestMapping("/rol")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class RolService {
	@Autowired
	RolRepository rolRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List<Rol>buscar(){
		return rolRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Rol guardar(@RequestBody Rol rol) {
		return rolRepository.save(rol);
	}
	@DeleteMapping("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		rolRepository.deleteById(id);
	}
}