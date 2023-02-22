package com.distribuida.entities;

public class Producto {
	
		// atributos
	private int idProducto;
	private String nombre;
	private Double precio;
	private int stock;
	
	public Producto () {}
	
	public Producto(int idProducto, String nombre, Double precio, int stock) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	

	
	
}
