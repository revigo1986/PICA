package com.servicios;

import java.util.List;

import com.entidad.Producto;

public interface IServicios {
	public Producto buscarProductoPorCodigo(int codigoProducto);
	
	public List<Producto> buscarProductosPorNombre(String nombre);
	
	public List<Producto> buscarProductosPorDescripcion(String descripcion);
}
