package com.example.demo.detalle_reserva_asientos.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Detalle_Reserva_Asientos")

public class DetalleReservaAsientos implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Detalle")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idDetalle;
	
	@Column (name ="Id_Reserva")
	private int idReserva;
	
	@Column (name ="Id_Asiento")
	private int idAsiento;

	public int getIdDetalleReservaAsientos() {
		return idDetalle;
	}

	public void setIdDetalleReservaAsientos(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
