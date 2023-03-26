package controller;
import model.Currency;

public class CurrencyConverter {
    private Currency toCurrency;
	

    public CurrencyConverter( Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double Convert(double value) {
         return toCurrency.convertToReais(value);
    }
}


