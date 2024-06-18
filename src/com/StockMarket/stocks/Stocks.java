package com.StockMarket.stocks;

public class Stocks {
	String symbol;
	String compName;
	double pricepershare;
	int numofshares;
	
	public Stocks(String symbol,String compName,double pricepershare,int numofshares) {
		this.symbol=symbol;
		this.compName=compName;
		this.pricepershare=pricepershare;
		this.numofshares=numofshares;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public double getPricepershare() {
		return pricepershare;
	}

	public void setPricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}

	public int getNumofshares() {
		return numofshares;
	}

	public void setNumofshares(int numofshares) {
		this.numofshares = numofshares;
	}

	@Override
	public String toString() {
		return "Stocks [symbol=" + symbol + ", compName=" + compName + ", pricepershare=" + pricepershare
				+ ", numofshares=" + numofshares + ", getSymbol()=" + getSymbol() + ", getCompName()=" + getCompName()
				+ ", getPricepershare()=" + getPricepershare() + ", getNumofshares()=" + getNumofshares()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
