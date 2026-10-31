package com.example.demo.funcion.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Funcion")

public class Funcion implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Funcion")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idFuncion;
	
	@Column (name ="Id_Pelicula")
	private int idPelicula;
	
	@Column (name ="Id_Sala")
	private int idSala;
	
	@Column (name ="Fecha")
	private LocalDate fecha;
	
	@Column (name ="Hora")
	private LocalTime hora;
	
	@Column(name = "Precio_Entrada", precision = 8, scale = 2)
	private BigDecimal precioEntrada;

	public int getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public BigDecimal getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(BigDecimal precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
