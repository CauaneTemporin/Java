package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		System.out.print("Digite seu nome: ");
		product.nome = sc.next();
		System.out.print("Digite seu salário bruto: ");
		product.salario_bruto = sc.nextDouble();
		System.out.print("Digite o imposto: ");
		product.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + product);
		System.out.println();
		System.out.print("Informe a porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		product.aumento_salario(porcentagem);
		System.out.println("Funcionário: " + product);
		sc.close();
	}

}
