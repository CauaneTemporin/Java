package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Insira a largura do retângulo: ");
		product.largura = sc.nextDouble();
		System.out.println("Insira a altura do retângulo: ");
		product.altura = sc.nextDouble();
		System.out.println("Area: " + product.toString());

		
		sc.close();
	
	}

}
