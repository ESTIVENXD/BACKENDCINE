package com.example.demo.funcion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.funcion.entity.Funcion;

public interface FuncionRepository extends JpaRepository<Funcion, Integer> {
}

