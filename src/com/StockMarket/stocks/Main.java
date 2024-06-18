package com.StockMarket.stocks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket st = new StockMarket(6);
		Stocks st1 = new Stocks("GOOGLE","GOOGLE Corp",620.0,1500);
		Stocks st2 = new Stocks("MICROSOFT","Microsoft Corp",900.0,2000);
		Stocks st3 = new Stocks("TATA","TATA pvt limited",620.0,1500);
		
		st.addStock(st1);
		st.addStock(st2);
		st.addStock(st3);
		
		st.listAllStocks();
		
		
		String s = "GOOGLE";
		Stocks getS = st.getStock(s);
		System.out.println("stock fetched is"+getS);

		Stocks updatedStock = new Stocks("MICROSOFT","Microsoft Corp",900.0,5000);
		System.out.println("stock updated is"+updatedStock);
		st.deleteStock("GOOGLE");

        st.listAllStocks();

		
	}

}
