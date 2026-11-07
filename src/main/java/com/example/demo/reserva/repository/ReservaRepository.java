package com.example.demo.reserva.repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.reserva.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
	public List<Reserva> findByIdFuncion(Integer idFuncion);
	

    public List<Reserva> findByFechaReservaBetween(LocalDateTime inicio, LocalDateTime fin);
}


