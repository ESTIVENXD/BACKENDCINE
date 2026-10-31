package com.example.demo.cliente.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




@Entity
@Table (name = "Cliente")

public class Cliente implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Cliente")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idCliente;
	
	@Column (name ="Nit")
	private String nit;
	
	@Column (name ="Nombres")
	private String nombres;
	
	@Column (name ="Apellidos")
	private String apellidos;
	
	@Column (name ="Correo")
	private String correo;
	
	@Column (name ="Telefono")
	private String telefono;
	
	@Column (name ="Contrasena")
	private String contrasena;
	
	@Lob
	@Column (name ="Fotografia")
	private String fotografia;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
