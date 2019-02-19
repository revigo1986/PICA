package com.productos;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorServicios {

	@RequestMapping(path = "/BuscarProductos/codigo/{idProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Producto buscarProductoPorCodigo(@PathVariable("idProducto") int idProducto) {
		return new Orquestador().buscarProductoPorCodigo(idProducto);
	}

	@RequestMapping(path = "/BuscarProductos/nombre/{nombreProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Producto> buscarProductoPorNombre(@PathVariable("nombreProducto") String nombreProducto) {
		return new Orquestador().buscarProductosPorNombre(nombreProducto);
	}

	@RequestMapping(path = "/BuscarProductos/descripcion/{descripcionProducto}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Producto> buscarProductoPorDescripcion(
			@PathVariable("descripcionProducto") String descripcionProducto) {
		return new Orquestador().buscarProductosPorDescripcion(descripcionProducto);
	}
}
