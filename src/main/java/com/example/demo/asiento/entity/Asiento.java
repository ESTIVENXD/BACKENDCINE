package com.example.demo.asiento.entity;


import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Asiento")

public class Asiento implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Asiento")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idAsiento;
	
	@Column (name ="Id_Sala")
	private int idSala;
	
	@Column (name ="Fila")
	private String fila;
	
	@Column (name ="Numero")
	private int numero;

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
