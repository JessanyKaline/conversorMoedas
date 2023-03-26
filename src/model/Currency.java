package model;

public abstract class Currency {
	    protected String name;
	    protected String symbol;
	    protected double exchangeRate;

		public Currency(String name, String symbol, double exchangeRate) {
	        this.name = name;
	        this.symbol = symbol;
	        this.exchangeRate = exchangeRate;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getSymbol() {
	        return symbol;
	    }
	    
	    public double getExchangeRate() {
	        return exchangeRate;
	    }
	    
	    public double convertToReais(double value) {
	        return value * exchangeRate ;
	    }
	    
	    
	}


