package com.example.demo.reserva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.reserva.entity.Reserva;
import com.example.demo.telefono.entity.Telefono;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
	public List<Reserva> findByIdFuncion(Integer idFuncion);
}

