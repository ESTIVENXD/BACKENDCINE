package com.example.demo.sala.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.sala.entity.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
	public List<Sala> findByFilas(Integer filas);

	
	
	
}



