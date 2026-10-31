package com.example.demo.telefono.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.telefono.entity.Telefono;


public interface TelefonoRepository extends JpaRepository<Telefono, Integer>{
	
	public List<Telefono> findByIdUsuario(Integer idUsuario);
}


