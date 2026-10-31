package com.example.demo.examen.entity;
import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Examen")

public class Examen implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "IdExamen")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idExamen;
	
	@Column (name= "Fecha_Examen")
	private LocalDate fechaExamen;
	
	@Column (name= "Nota")
	private String nota;
	
	@Column (name= "Carnet")
	private String carnet;

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public LocalDate getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(LocalDate fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
