package com.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entidad.Producto;
import com.entidad.ProductoBasico;

@Service
public class Servicios implements IServicios {
	@SuppressWarnings("unchecked")
	public List<Producto> buscarProductoCompleto(String cadenaGenerica) {
		// Comunicación con utilitario REST Datasource
		// Para obtener json con data del producto
		RestTemplate restTemplate = new RestTemplate();
		List<Producto> producto = restTemplate.getForObject(
				"http://localhost:8081/ServiciosProductosDB/getCreditCardElement/" + cadenaGenerica, List.class);
//        Producto producto = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Producto.class);
		return producto;
	}

	@SuppressWarnings("unchecked")
	public List<ProductoBasico> buscarProductosBasico(String cadenaGenerica) {
		RestTemplate restTemplate = new RestTemplate();
		List<ProductoBasico> producto = restTemplate.getForObject(
				"http://localhost:8081/ServiciosProductosDB/getCreditCardElement/" + cadenaGenerica, List.class);
		return producto;
	}
//	
//	public List<Producto> buscarProductosPorDescripcion(String descripcion){
//		//Manejo de comodín, para enviar a servicio datasource		
//		return null;
//	}
}
