package com.productos;

public class Producto {
	private int idProduct;
	private String name;
	private String description;
	private int sportEventId;
	private int hotelId;
	private int transportId;
	private double price;
	private int vat;
	private String itemsAvailable;
	private String itemsBooked;

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSportEventId() {
		return sportEventId;
	}

	public void setSportEventId(int sportEventId) {
		this.sportEventId = sportEventId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getTransportId() {
		return transportId;
	}

	public void setTransportId(int transportId) {
		this.transportId = transportId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public String getItemsAvailable() {
		return itemsAvailable;
	}

	public void setItemsAvailable(String itemsAvailable) {
		this.itemsAvailable = itemsAvailable;
	}

	public String getItemsBooked() {
		return itemsBooked;
	}

	public void setItemsBooked(String itemsBooked) {
		this.itemsBooked = itemsBooked;
	}
}
