package com.example.demo.detalle_reserva_asientos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.detalle_reserva_asientos.entity.DetalleReservaAsientos;

public interface DetalleReservaAsientosRepository extends JpaRepository<DetalleReservaAsientos, Integer> {
}

