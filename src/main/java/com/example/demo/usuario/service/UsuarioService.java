package com.example.demo.usuario.service;

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

import com.example.demo.usuario.entity.Usuario;
import com.example.demo.usuario.repository.UsuarioRepository;

@Service
@RestController
@RequestMapping("/usuario")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Usuario> buscar(){
		return usuarioRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Usuario guardar (@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		usuarioRepository.deleteById(id);	
	}
	
	@PostMapping (path ="/login")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Usuario login(@RequestBody Usuario usuario) {

		List<Usuario> usuarios = usuarioRepository.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
		
		if (usuarios.isEmpty()) {
			return null;
			
		}
		return usuarios.get(0);
	}
}
