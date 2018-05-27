package com.drugstore.demo.modelo;
// Generated 15/05/2018 12:39:00 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private String idusuario;
	private Tipousuario tipousuario;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private String telefono;
	private Set ventas = new HashSet(0);

	public Usuario() {
	}

	public Usuario(String idusuario, Tipousuario tipousuario) {
		this.idusuario = idusuario;
		this.tipousuario = tipousuario;
	}

	public Usuario(String idusuario, Tipousuario tipousuario, String nombre, String apellido, String email,
			String direccion, String telefono, Set ventas) {
		this.idusuario = idusuario;
		this.tipousuario = tipousuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ventas = ventas;
	}

	public String getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public Tipousuario getTipousuario() {
		return this.tipousuario;
	}

	public void setTipousuario(Tipousuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Set getVentas() {
		return this.ventas;
	}

	public void setVentas(Set ventas) {
		this.ventas = ventas;
	}

}
