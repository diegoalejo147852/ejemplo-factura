package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private Double subtotal;	
	private Producto producto;
	
	public FacturaDetalle() {
		
	}
	
	public FacturaDetalle(Producto producto) {	
		this.producto = producto;
	}
		

	public FacturaDetalle(int idFacturaDetalle, int cantidad, Double subtotal) {		
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}	
	
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}


	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}		
	

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", producto=" + producto + "]";
	}
	
	
	
	
	
	
	
}
