package com.example.demo.cliente.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.cliente.entity.Cliente;
import com.example.demo.usuario.entity.Usuario;
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	public List<Cliente> findByPasswordAndEmail(String password, String email);
	
	public List<Cliente> findByEmailAndPassword(String email, String password);
}
