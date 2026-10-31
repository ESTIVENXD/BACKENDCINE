package com.example.demo.cliente.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.cliente.entity.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
