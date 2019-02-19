package com.productos;

import java.util.List;

public class Orquestador {
	/**
	 * Método para devolver producto por id de Producto
	 * 
	 * @param idProducto
	 * @return
	 */
	public Producto buscarProductoPorCodigo(int idProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * Para devolver listado de productos por nombre con comodín
	 * 
	 * @return
	 */
	public List<Producto> buscarProductosPorNombre(String nombreProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * Método para devolver listado de productos por descripción con comodín
	 * 
	 * @return
	 */
	public List<Producto> buscarProductosPorDescripcion(String descripcionProducto) {
		recibirConexionBD();
		return null;
	}

	/**
	 * Método que invoca servicio rest de conexión con la base de datos SQL Server
	 */
	public void recibirConexionBD() {

	}
}
