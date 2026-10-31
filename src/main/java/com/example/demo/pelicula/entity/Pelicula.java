package com.example.demo.pelicula.entity;
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
@Table (name = "Pelicula")
public class Pelicula implements Serializable{
	private static final long serialVersionUID = -381911220526712832L;

	@Id
	@Column(name = "id_Pelicula")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Basic (optional=false)
	private int idPelicula;
	
	@Column (name ="Titulo")
	private String titulo;
	
	@Column(name = "Sinopsis", columnDefinition = "TEXT")
	private String sinopsis;
	
	@Column(name = "Duracion_Minutos")
	private int duracionMinutos;

	@Column (name ="Id_Genero")
	private int idGenero;
	
	@Column (name ="Id_Clasificacion")
	private int idClasificacion;

	@Lob
	@Column(name = "Imagen_Promocional")
	private String imagenPromocional;

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getImagenPromocional() {
		return imagenPromocional;
	}

	public void setImagenPromocional(String imagenPromocional) {
		this.imagenPromocional = imagenPromocional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
