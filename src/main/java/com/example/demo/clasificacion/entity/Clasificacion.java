package com.example.demo.clasificacion.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table (name = "Clasificacion")
public class Clasificacion implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;

	@Id
	@Column(name = "id_Clasificacion")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idClasificacion;
	
	@Column (name ="Nombre")
	private String nombre;

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
