package com.example.demo.anuncio.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Anuncio")

public class Anuncio implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;
	
	@Id
	@Column(name = "Id_Anuncio")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idAnuncio;
	
	@Column (name= "Titulo")
	private String titulo;
	
	@Column(name = "Descripcion", columnDefinition = "TEXT")
	private String descripcion;
	
	@Column(name = "Fecha_Publicacion")
	private LocalDateTime fechaPublicacion;
	
	@Lob
	@Column(name = "Imagen")
	private String imagen;
	
	@Column(name = "Tipo")
	private String tipo;

	public int getIdAnuncio() {
		return idAnuncio;
	}

	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
