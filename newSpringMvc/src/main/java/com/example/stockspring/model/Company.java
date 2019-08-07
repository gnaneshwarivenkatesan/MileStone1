package com.example.stockspring.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private int companyCode;
	private String companyName;
	private float turnOver;
	private String ceo;
	private String boardOfDirectors;
	private List<StockExchange> stockExchange;
	private int sector;
	private String briefWriteup;
	private int stockCode;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(float turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoard() {
		return boardOfDirectors;
	}
	public void setBoard(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	
	public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	
}
