package com.servicios;

import java.util.List;

import com.entidad.Item;

public interface IServicios {
	public List<Item> buscarItemsIdOrden(int idOrden);
}
