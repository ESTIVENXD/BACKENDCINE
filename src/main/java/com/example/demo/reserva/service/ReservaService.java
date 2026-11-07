package com.example.demo.reserva.service;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;
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
import com.example.demo.reserva.entity.ReporteVenta;


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
	
	
	 @GetMapping(path = "/reporte")
	    @CrossOrigin ({"http://localhost:8100", "http://localhost:4200"})
	    public List<ReporteVenta> obtenerReporteDeVentas(
	            @RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime inicio,
	            @RequestParam("fin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fin,
	            @RequestParam("tipo") String tipo) { 
	        
	        
	        List<Reserva> reservasDelRango = reservaRepository.findByFechaReservaBetween(inicio, fin);
	        Map<Integer, ReporteVenta> mapaAgrupador = new HashMap<>();
	        for (Reserva r : reservasDelRango) {
	            int claveMapa = r.getIdFuncion(); 
	            String nombreEtiqueta = "Función ID: " + r.getIdFuncion();
	            if (tipo.equalsIgnoreCase("pelicula")) {
	                nombreEtiqueta = "Película de la Función: " + r.getIdFuncion();
	            }
	            if (!mapaAgrupador.containsKey(claveMapa)) {
	                mapaAgrupador.put(claveMapa, new ReporteVenta(nombreEtiqueta, 0, 0.0));
	            }
	            ReporteVenta filaExistente = mapaAgrupador.get(claveMapa);
	            filaExistente.setEntradasVendidas(filaExistente.getEntradasVendidas() + r.getCantidadEntradas());
	            filaExistente.setTotalIngresos(filaExistente.getTotalIngresos() + r.getTotalAPagar());
	        }
	        return new ArrayList<>(mapaAgrupador.values());
	    }
	}

