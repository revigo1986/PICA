package com.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entidad.Item;
import com.servicios.IServicios;

@RestController
public class Controlador {

	@Autowired
	private IServicios servicios;

	@RequestMapping(path = "/BuscarDetalleOrden/codigoOrden/{idOrden}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Item> buscarItemsIdOrden(@PathVariable("idOrden") int idOrden) {
		return servicios.buscarItemsIdOrden(idOrden);
	}
}
