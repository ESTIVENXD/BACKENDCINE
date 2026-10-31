package com.example.demo.clasificacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.clasificacion.entity.Clasificacion;

public interface ClasificacionRepository extends JpaRepository <Clasificacion, Integer> {

}
