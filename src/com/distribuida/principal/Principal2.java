package com.distribuida.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// codigo de prueba para git hub
		// ---  Inyeccion de Dependencias con lista de detalles
		
		Producto producto1 = new Producto(1,"manzana",0.50,26);
		Producto producto2 = new Producto(2,"pera",0.35,50);
		Producto producto3 = new Producto(3,"piña",1.20,100);
		
		Cliente cliente1 = new Cliente(1,1023456789,"Juan Taipe", "Av.por ahi y mas alla", "0987654321", "jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,1023456888,"John Scotch", "Av. Adentro y afuera", "0987611111", "jhstoch@correo.com");
		

		Factura factura1 = new Factura(cliente1);
		
		factura1.setIdFactura(1);
		factura1.setFecha(new Date());
		
		FacturaDetalleFactory facturaDetFactory = new FacturaDetalleFactory();
		
		facturaDetFactory.add( producto1, 6);
		facturaDetFactory.add( producto2, 10);
		facturaDetFactory.add( producto3, 2);		
		
		facturaDetFactory.findAll().forEach( item ->{
			factura1.setTotalNeto(item.getSubtotal(), true);	
		});
		
		factura1.setIva(0.12);
		factura1.setTotal(factura1.getTotalNeto() +  factura1.getTotalNeto()*factura1.getIva());

		
//		System.out.println("producto1.getStock(): " +producto1.getStock());
//		System.out.println("facturaDetFactory....getStock(): " +facturaDetFactory.findAll().get(0).getProducto().getStock());
		
		
		System.out.println(factura1.toString());
		System.out.println(facturaDetFactory.toString());
		

		
		
		
		

	}

}

