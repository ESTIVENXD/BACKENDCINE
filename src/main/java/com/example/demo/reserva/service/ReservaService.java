package com.example.demo.reserva.service;

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

import com.example.demo.reserva.entity.Reserva;
import com.example.demo.reserva.repository.ReservaRepository;
import com.example.demo.telefono.entity.Telefono;

@Service
@RestController
@RequestMapping("/reserva")
@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
public class ReservaService {
	@Autowired
	ReservaRepository reservaRepository;
	
	@GetMapping (path = "/buscar")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List <Reserva> buscar(){
		return reservaRepository.findAll();
	}
	
	
	@GetMapping(path = "/buscar/{idFuncion}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public List<Reserva> buscarPorReserva(@PathVariable ("idFuncion") Integer idFuncion){
		
		return reservaRepository.findByIdFuncion(idFuncion);
	}
	
	
	@PostMapping
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public Reserva guardar (@RequestBody Reserva reserva) {
		return reservaRepository.save(reserva);
	}
	@DeleteMapping ("/{id}")
	@CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	public void eliminar (@PathVariable ("id") Integer id) {
		reservaRepository.deleteById(id);	
	}
}
