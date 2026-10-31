package com.example.demo.asiento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.asiento.entity.Asiento;
import com.example.demo.telefono.entity.Telefono;
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {

	public List<Asiento> findByIdSala(Integer idSala);
}

