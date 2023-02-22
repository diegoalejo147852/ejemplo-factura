package com.distribuida.principal;

import java.util.ArrayList;
import java.util.List;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;


public class FacturaDetalleFactory {
	
	private List<FacturaDetalle> facturaDetalleVOs = new ArrayList<FacturaDetalle>();
	
	private int i = 1;
	
	public void add(Producto producto, int cantidad){					
		FacturaDetalle facturaDetalle1 = new FacturaDetalle(producto);
		facturaDetalle1.setIdFacturaDetalle(i);
		facturaDetalle1.setCantidad(cantidad);
		facturaDetalle1.setSubtotal(facturaDetalle1.getCantidad()*facturaDetalle1.getProducto().getPrecio());
		facturaDetalle1.getProducto().setStock(facturaDetalle1.getProducto().getStock()-facturaDetalle1.getCantidad());
		facturaDetalleVOs.add(facturaDetalle1);
		i++;			
	}
	
	public List<FacturaDetalle> findAll(){
		return facturaDetalleVOs;
	}

	@Override
	public String toString() {
		return "FacturaDetalleFactory [facturaDetalleVOs=" + facturaDetalleVOs + ", i=" + i + "]";
	} 
	
	
	
}
