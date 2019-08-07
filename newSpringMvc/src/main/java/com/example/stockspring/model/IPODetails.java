package com.example.stockspring.model;

import java.sql.Time;

public class IPODetails {
	private int id;
	private String companyName;
	private int stockExchange;
	private float pricePerShare;
	private int totalNumOfshares;
	private Time openDateTime;
	private String remarks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNumOfshares() {
		return totalNumOfshares;
	}
	public void setTotalNumOfshares(int totalNumOfshares) {
		this.totalNumOfshares = totalNumOfshares;
	}
	public Time getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Time openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
