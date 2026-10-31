package com.example.demo.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.usuario.entity.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public List<Usuario> findByPasswordAndEmail(String password, String email);
	
	public List<Usuario> findByEmailAndPassword(String email, String password);
	
}
