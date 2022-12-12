package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantidade de produtos: ");
		int n = sc.nextInt();
		Produtos[] vect = new Produtos[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.println("Digite nome do produtos: ");
			String nome = sc.next();
			System.out.println("Digite preço do produtos: ");
			double preco = sc.nextDouble();
			vect[i]= new Produtos(nome, preco);
		}
		
		double soma = 0;
		for(int i =0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma/vect.length;
		
		System.out.printf("A média do preço dos produtos é: %.2f%n", media);
		
		sc.close();
		
	}

}




