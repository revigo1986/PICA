package com.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entidad.Producto;
import com.entidad.ProductoBasico;
import com.servicios.IServicios;

@RestController
public class Controlador {

	@Autowired
	private IServicios servicios;

	@RequestMapping(path = "/BuscarProductoCompleto/{cadenaGenerica}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Producto> buscarProductoCompleto(@PathVariable("cadenaGenerica") String cadenaGenerica) {
		return servicios.buscarProductoCompleto(cadenaGenerica);
	}

	@RequestMapping(path = "/BuscarProductosBasico/{cadenaGenerica}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<ProductoBasico> buscarProductosBasico(@PathVariable("cadenaGenerica") String cadenaGenerica) {
		return servicios.buscarProductosBasico(cadenaGenerica);
	}
//
//	@RequestMapping(path = "/BuscarProductos/descripcion/{descripcionProducto}", method = RequestMethod.GET, produces = {
//			MediaType.APPLICATION_JSON_VALUE })
//	public List<Producto> buscarProductoPorDescripcion(
//			@PathVariable("descripcionProducto") String descripcionProducto) {
//		return servicios.buscarProductosPorDescripcion(descripcionProducto);
//	}
}
