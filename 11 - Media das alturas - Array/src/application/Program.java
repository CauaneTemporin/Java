package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas alturas serão calculadas: ");
		int n = sc.nextInt();
		
		//Sintaxe: Tipo + "[]" indicando que está declarando um vetor + nome + recebendo a instanciação 
		//+ tipos de elementos + tamanho do vetor
		double [] vect = new double [n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite a altura: ");
			vect[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for(int i = 0; i<n; i++) {
			soma+= vect[i];
		}
		
		double alturas = soma / n;
		
		System.out.printf("A média das alturas: %.2f%n" , alturas);
		
		sc.close();
		

	}

}
