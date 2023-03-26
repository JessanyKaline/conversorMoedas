package view;

import java.util.Scanner;

import controller.CurrencyConverter;
import model.Currency;
import model.Euro;
import model.USDollar;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean continuar = true;

			while (continuar) {
				System.out.println("Entre com a moeda para conversão (USD ou EUR):");
				String toCurrencyName = scanner.nextLine();
				Currency toCurrency;
				if (toCurrencyName.equalsIgnoreCase("USD")) {
					toCurrency = new USDollar();
				} else if (toCurrencyName.equalsIgnoreCase("EUR")) {
					toCurrency = new Euro();
				} else {
					System.out.println("Moeda Inválida");
					return;
				}

				System.out.println("Entre com o valor para conversão:");
				double value = scanner.nextDouble();

				CurrencyConverter Converter = new CurrencyConverter(toCurrency);
				double result = Converter.Convert(value);

				System.out.println("R$" + value + " = " + toCurrency.getSymbol() + result);

				System.out.println("Deseja fazer outra conversão? (s/n)");
				String resposta = scanner.next();
				if (resposta.equalsIgnoreCase("n")) {
					continuar = false;
				} else {
					scanner.nextLine();
				}
			}
		}
		System.out.println("Programa finalizado.");
	}
}
