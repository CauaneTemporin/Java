package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Informe seu nome: ");
		product.nome = sc.next();
		System.out.print("Informe a primeira nota: ");
		product.nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		product.nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		product.nota3 = sc.nextDouble();

		if (product.media() >= 60.00) {
			System.out.println("Passou!");
		} else if (product.media() < 60.00) {
			System.out.println("Final Grade " + product.media());
			System.out.println("Não passou");
			double restante = 60.00 - product.media();
			System.out.printf("Faltaram: %.2f", restante, " pontos!");
		}

		sc.close();

	}

}