package application;

import java.util.Locale;
import java.util.Scanner;

import util.CotacaoDolar;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CotacaoDolar cotacao_dolar = new CotacaoDolar();
		
		System.out.print("Qual a cotação do dolar: ");
		cotacao_dolar.dolar = sc.nextDouble();
		System.out.print("Qual valor de dolares para será comparado: ");
		cotacao_dolar.total_dolar = sc.nextDouble();
		System.out.println(cotacao_dolar);
		
		sc.close();
	}

}
