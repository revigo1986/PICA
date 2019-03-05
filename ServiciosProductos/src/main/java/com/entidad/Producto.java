package com.entidad;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonProperty for making match with the exact name in json response
public class Producto {
	private int id;
	private String productName;
	private String productDescription;
	private SportEvent sportEvent;
	private Hotel hotel;
	private Transport transport;
	private double price;
	private double vat;
	private int itemsAvailable;
	private int itemsBooked;
	private String type;
	private Boolean isCampaign;
	private Date startDate;
	private Date expirationDate;
	private BigDecimal campaignDiscount;
	private String imagePath1;
	private String imagePath2;
	private String imagePath3;
	private BigDecimal totalValue;
	private int productCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public SportEvent getSportEvent() {
		return sportEvent;
	}

	public void setSportEvent(SportEvent sportEvent) {
		this.sportEvent = sportEvent;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public int getItemsAvailable() {
		return itemsAvailable;
	}

	public void setItemsAvailable(int itemsAvailable) {
		this.itemsAvailable = itemsAvailable;
	}

	public int getItemsBooked() {
		return itemsBooked;
	}

	public void setItemsBooked(int itemsBooked) {
		this.itemsBooked = itemsBooked;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsCampaign() {
		return isCampaign;
	}

	public void setIsCampaign(Boolean isCampaign) {
		this.isCampaign = isCampaign;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public BigDecimal getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(BigDecimal campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
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

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
}
