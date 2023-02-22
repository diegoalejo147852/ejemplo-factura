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
		
//		Producto producto1 = new Producto(1,"manzana",0.50,26);
//		Producto producto2 = new Producto(2,"pera",0.35,50);
//		
//		Cliente cliente1 = new Cliente(1,1023456789,"Juan Taipe", "Av.por ahi y mas alla", "0987654321", "jtaipe@correo.com");
//		Cliente cliente2 = new Cliente(2,1023456888,"John Scotch", "Av. Adentro y afuera", "0987611111", "jhstoch@correo.com");
//		
////		System.out.println(producto1.toString());
////		System.out.println(cliente1.toString());
//				
//		// Patron de Inyección de Dependencias (DI) , codigo desacoplado
//		
//		Factura factura1 = new Factura(cliente2);
//		
//		factura1.setIdFactura(1);
//		factura1.setFecha(new Date());
//		//factura1.setTotalNeto(365.26);
//		//factura1.setIva(0.12);
//		//factura1.setTotal(factura1.getTotalNeto() +  factura1.getTotalNeto()*factura1.getIva());	
//				
//		//System.out.println(factura1.toString());
//		FacturaDetalle facturaDetalle1 = new FacturaDetalle(producto1);
//		facturaDetalle1.setIdFacturaDetalle(1);
//		facturaDetalle1.setCantidad(6);
//		facturaDetalle1.setSubtotal(facturaDetalle1.getCantidad()*facturaDetalle1.getProducto().getPrecio());
//		facturaDetalle1.getProducto().setStock(facturaDetalle1.getProducto().getStock()-facturaDetalle1.getCantidad());
//		
//		FacturaDetalle facturaDetalle2 = new FacturaDetalle(producto2);
//		facturaDetalle2.setIdFacturaDetalle(2);
//		facturaDetalle2.setCantidad(10);
//		facturaDetalle2.setSubtotal(facturaDetalle2.getCantidad()*facturaDetalle2.getProducto().getPrecio());
//		facturaDetalle2.getProducto().setStock(facturaDetalle2.getProducto().getStock()-facturaDetalle2.getCantidad());
//				
//		factura1.setTotalNeto(facturaDetalle1.getSubtotal(), true);
//		factura1.setTotalNeto(facturaDetalle2.getSubtotal(), true);
//		factura1.setIva(0.12);
//		factura1.setTotal(factura1.getTotalNeto() +  factura1.getTotalNeto()*factura1.getIva());		
//		
//		
//		System.out.println(factura1.toString());
//		
//		System.out.println(facturaDetalle1.toString());
//		System.out.println(facturaDetalle2.toString());
		
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
		

		
		
		
		
		
		
			// Codigo muy acoplado o rigido o estatico
		
//		Factura factura1 = new Factura(
//				1
//				,new Date()
//				,356.36
//				,0.12
//				,356.36+356.36*0.12
//				,1
//				,123456789
//				,"Juan Taipe"
//				);
//		
//		System.out.println(factura1.toString());
		
		
		
//		Factura factura1 = new Factura(
//			1
//			,new Date()
//			,356.36
//			,0.12
//			,356.36+356.36*0.12		
//		);
//
//		System.out.println(factura1.toString());
//		System.out.println(factura1.cliente1.toString());
		
		
		
		
		

	}

}

