package com.example.demo.detalle_reserva_asientos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.detalle_reserva_asientos.entity.DetalleReservaAsientos;
import com.example.demo.detalle_reserva_asientos.repository.DetalleReservaAsientosRepository;

	@Service
	@RestController
	@RequestMapping("/detalleReservaAsientos")
	public class DetalleReservaAsientosService {
		@Autowired
		DetalleReservaAsientosRepository detalleReservaAsientosRepository;
		
		@GetMapping (path = "/buscar")
		public List <DetalleReservaAsientos> buscar(){
			return detalleReservaAsientosRepository.findAll();
		}
		@PostMapping
		public DetalleReservaAsientos guardar (@RequestBody DetalleReservaAsientos detalleReservaAsientos) {
			return detalleReservaAsientosRepository.save(detalleReservaAsientos);
		}
		@DeleteMapping ("/{id}")
		public void eliminar (@PathVariable ("id") Integer id) {
			detalleReservaAsientosRepository.deleteById(id);	
		}
	}

