package com.example.demo.rol.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table (name = "Rol")
public class Rol implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	@Id
	@Column(name = "Id_Rol")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idRol;
	
	@Column (name ="Nombre")
	private String nombre;

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
