package com.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonProperty for making match with the exact name in json response
public class ProductoBasico {
	private String id;
	private String productName;
	private String productDescription;
	private String price;
	private String vat;
	private String itemsAvailable;
	private String itemsBooked;
	private String isCampain;
	private String startDate;
	private String expirationDate;
	private String campainDiscount;
	private String imagePath1;
	private String imagePath2;
	private String imagePath3;
	private String totalValue;
	private String productCode;
	private String hotelId;
	private String sportEventId;
	private String transportId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
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

	public String getIsCampain() {
		return isCampain;
	}

	public void setIsCampain(String isCampain) {
		this.isCampain = isCampain;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCampainDiscount() {
		return campainDiscount;
	}

	public void setCampainDiscount(String campainDiscount) {
		this.campainDiscount = campainDiscount;
	}

	public String getImagePath1() {
		return imagePath1;
	}

	public void setImagePath1(String imagePath1) {
		this.imagePath1 = imagePath1;
	}

	public String getImagePath2() {
		return imagePath2;
	}

	public void setImagePath2(String imagePath2) {
		this.imagePath2 = imagePath2;
	}

	public String getImagePath3() {
		return imagePath3;
	}

	public void setImagePath3(String imagePath3) {
		this.imagePath3 = imagePath3;
	}

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getSportEventId() {
		return sportEventId;
	}

	public void setSportEventId(String sportEventId) {
		this.sportEventId = sportEventId;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
}