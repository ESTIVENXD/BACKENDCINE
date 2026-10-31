package com.example.demo.usuario.entity;


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
@Table (name = "Usuario")

public class Usuario implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Usuario")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idUsuario;
	
	@Column (name ="Nombres")
	private String nombres;
	
	@Column (name ="Apellidos")
	private String apellidos;
	
	@Column (name ="Email")
	private String email;
	
	@Column (name ="Telefono")
	private String telefono;
	
	@Column (name ="Nombre_Usuario")
	private String nombreUsuario;
	
	@Column (name ="Password")
	private String password;
	
	@Column (name ="Id_Rol")
	 private int idRol;
	
	@Lob
	@Column (name ="Fotografia")
	private String fotografia;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
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
