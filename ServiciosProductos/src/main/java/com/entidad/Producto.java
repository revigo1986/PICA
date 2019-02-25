package com.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonProperty for making match with the exact name in json response
public class Producto {
	private int codigo;
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//    @Override
//    public String toString() {
//        return "Quote{" +
//                "type='" + type + '\'' +
//                ", value=" + value +
//                '}';
//    }
}
