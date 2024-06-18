package com.StockMarket.stocks;
import java.util.*;
public class StockMarket {
	private  Stocks[] stocks;
	private int stcount;
	
	public StockMarket(int capacity) {
		stocks = new Stocks[capacity];
		stcount = 0;
	}
	
	public void addStock(Stocks stock) {
		if(stcount < stocks.length) {
			stocks[stcount]=stock;
			stcount++;
		}
		else {
			System.out.println("Stock capacity reached");
		}
	}
	
	public Stocks getStock(String symbol) {
		for(int i=0;i<stcount;i++) {
			if(stocks[i].getSymbol()==symbol) {
				return stocks[i];
			}
		}
		System.out.println("Stock not found");
		return null;
	}
	
	public void updateStock(String symbol, Stocks updatedStock) {
        for (int i = 0; i < stcount; i++) {
            if (stocks[i].getSymbol()==symbol) {
                stocks[i] = updatedStock;
                return;
            }
        }
        System.out.println("Stock not found.");
    }
	
	public void deleteStock(String symbol) {
        for (int i = 0; i < stcount; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                for (int j = i; j < stcount - 1; j++) {
                    stocks[j] = stocks[j + 1];
                }
                stocks[stcount] = null;
                stcount--;
                return;
            }
        }
        System.out.println("Stock not found.");
    }
	
	public void listAllStocks() {
        for (int i = 0; i < stcount; i++) {
            System.out.println(stocks[i]);
        }
    }
	
	
}

