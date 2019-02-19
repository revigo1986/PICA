package com.productos;

import java.util.List;

public class Orquestador {
	/**
	 * M�todo para devolver producto por id de Producto
	 * 
	 * @param idProducto
	 * @return
	 */
	public Producto buscarProductoPorCodigo(int idProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * Para devolver listado de productos por nombre con comod�n
	 * 
	 * @return
	 */
	public List<Producto> buscarProductosPorNombre(String nombreProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * M�todo para devolver listado de productos por descripci�n con comod�n
	 * 
	 * @return
	 */
	public List<Producto> buscarProductosPorDescripcion(String descripcionProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * M�todo que invoca servicio rest de conexi�n con la base de datos SQL Server
	 */
	public void recibirConexionBD() {

	}
}
