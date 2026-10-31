package com.example.demo.pelicula.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.pelicula.entity.Pelicula;

public interface PeliculaRepository  extends JpaRepository<Pelicula, Integer> {
}
