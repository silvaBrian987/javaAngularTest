package net.bgs.javaAngular.beans;

import java.util.Date;

public class Usuario {
	private String nombre;
	private String apellido;
	private String sexo;
	private Date fechaAlta;
	private boolean tieneGrupo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public boolean isTieneGrupo() {
		return tieneGrupo;
	}
	public void setTieneGrupo(boolean tieneGrupo) {
		this.tieneGrupo = tieneGrupo;
	}
}
