package com.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entidad.Producto;

@Service
public class Servicios implements IServicios{
	public Producto buscarProductoPorCodigo(int codigoProducto) {
		//Implementaci�n l�gica de negocio
		//Comunicaci�n con servicio REST Datasource
		//Para obtener json con data del producto
		RestTemplate restTemplate = new RestTemplate();
		//URL del servicio
        Producto producto = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Producto.class);
        return producto;
	}
	
	public List<Producto> buscarProductosPorNombre(String nombre){
		//Manejo de comod�n, para enviar a servicio datasource
		return null;
	}
	
	public List<Producto> buscarProductosPorDescripcion(String descripcion){
		//Manejo de comod�n, para enviar a servicio datasource		
		return null;
	}
}
