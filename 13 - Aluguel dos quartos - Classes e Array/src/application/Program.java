package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Quartos [] vect = new Quartos[10];
		
		System.out.println("Informe número de quartos que serão alugados: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			Quartos quartos = new Quartos();
			System.out.println("Aluguel " + i + ": ");
			System.out.println("Digite o nome: ");
			//String nome= sc.next();
			quartos.setNome(sc.next());
			System.out.println("Digite o email: ");
			//String email = sc.next();
			quartos.setEmail(sc.next());
			System.out.println("Digite o quarto: ");
			//int num_quarto = sc.nextInt();
			quartos.setQuarto(sc.nextInt());
			vect[quartos.getQuarto()] = quartos;
		}
		
		System.out.println("\nQuartos ocupados: ");
		
		for(int i = 0; i<vect.length; i++) {
			if(vect[i]!= null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
	
		
		sc.close();
	}

}