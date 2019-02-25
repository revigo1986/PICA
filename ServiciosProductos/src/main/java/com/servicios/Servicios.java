package com.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entidad.Producto;

@Service
public class Servicios implements IServicios{
	public Producto buscarProductoPorCodigo(int codigoProducto) {
		//Implementación lógica de negocio
		//Comunicación con servicio REST Datasource
		//Para obtener json con data del producto
		return null;
	}
	
	public List<Producto> buscarProductosPorNombre(String nombre){
		//Manejo de comodín, para enviar a servicio datasource
		return null;
	}
	
	public List<Producto> buscarProductosPorDescripcion(String descripcion){
		//Manejo de comodín, para enviar a servicio datasource		
		return null;
	}
}
