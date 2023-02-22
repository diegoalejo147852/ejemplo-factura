package com.distribuida.entities;

public class Cliente {
	
		//atributos
	private int idCliente;
	private long cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	
	
	public Cliente () { }
	
	
	public Cliente(int idCliente, long cedula, String nombre, String direccion, String telefono, String correo) {		
		this.idCliente = idCliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public long getCedula() {
		return cedula;
	}


	public void setCedula(long cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
			
	
	
}
