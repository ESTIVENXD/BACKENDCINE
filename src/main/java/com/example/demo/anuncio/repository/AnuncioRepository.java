package com.example.demo.anuncio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.anuncio.entity.Anuncio;
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {
	
}

