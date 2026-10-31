package com.example.demo.sala.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table (name = "Sala")
public class Sala implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "id_Sala")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idSala;
	
	@Column (name ="Nombre")
	private String nombre;
	
	@Column (name ="Filas")
	private int filas;
	
	@Column (name ="Asientos_Por_Fila")
	private int asientosPorFila;

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getAsientosPorFila() {
		return asientosPorFila;
	}

	public void setAsientosPorFila(int asientosPorFila) {
		this.asientosPorFila = asientosPorFila;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
	

