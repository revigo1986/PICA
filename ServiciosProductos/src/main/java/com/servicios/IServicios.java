package com.servicios;

import java.util.List;

import com.entidad.Producto;
import com.entidad.ProductoBasico;

public interface IServicios {
	public List<Producto> buscarProductoCompleto(String cadenaGenerica);
	public List<ProductoBasico> buscarProductosBasico(String cadenaGenerica);
//	
//	public List<Producto> buscarProductosPorDescripcion(String descripcion);
}
