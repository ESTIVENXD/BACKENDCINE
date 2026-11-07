package com.example.demo.cliente.service;

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

import com.example.demo.cliente.entity.Cliente;
import com.example.demo.cliente.repository.ClienteRepository;
import com.example.demo.usuario.entity.Usuario;

@Service
@RestController
@RequestMapping("/cliente")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Cliente> buscar(){
		return clienteRepository.findAll();
	}
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Cliente guardar (@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		clienteRepository.deleteById(id);	
	}
	
	@PostMapping (path ="/login")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Cliente login(@RequestBody Cliente cliente) {

		List<Cliente> clientes = clienteRepository.findByEmailAndPassword(cliente.getEmail(), cliente.getPassword());
		
		if (clientes.isEmpty()) {
			return null;
			
		}
		return clientes.get(0);
	}

}