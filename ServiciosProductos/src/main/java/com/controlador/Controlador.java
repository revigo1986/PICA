package com.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entidad.Producto;
import com.servicios.IServicios;

@RestController
public class Controlador {

	@Autowired
	private IServicios servicios;

	@RequestMapping(path = "/BuscarProductos/codigo/{idProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Producto buscarProductoPorCodigo(@PathVariable("idProducto") int idProducto) {
		return servicios.buscarProductoPorCodigo(idProducto);
	}

	@RequestMapping(path = "/BuscarProductos/nombre/{nombreProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Producto> buscarProductoPorNombre(@PathVariable("nombreProducto") String nombreProducto) {
		return servicios.buscarProductosPorNombre(nombreProducto);
	}

	@RequestMapping(path = "/BuscarProductos/descripcion/{descripcionProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Producto> buscarProductoPorDescripcion(
			@PathVariable("descripcionProducto") String descripcionProducto) {
		return servicios.buscarProductosPorDescripcion(descripcionProducto);
	}
}
