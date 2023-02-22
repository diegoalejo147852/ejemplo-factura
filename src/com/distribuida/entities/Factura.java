package com.distribuida.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Factura {
	
	private int idFactura;
	private Date fecha;
	private Double totalNeto = 0.0;
	private Double iva;
	private Double total;
	private Cliente cliente;
	
	
	public Factura (Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public Factura () {}
	
	
	public Factura(int idFactura, Date fecha, Double totalNeto, Double iva, Double total) {	
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
	}
	
	

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	public void setTotalNeto(Double subtotal, boolean bool) {		
		this.totalNeto = totalNeto +  subtotal;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		return "Factura [idFactura=" + idFactura + ", fecha=" + formato.format(fecha) + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", total=" + total + ", cliente=" + cliente + "]";
	}	
	
	
	
	
	
	

}
