package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import model.entities.Account;
import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			Account account = new Account();
			System.out.println("Insira os dados da conta:");
			System.out.print("Número da conta: ");
			account.setNumero(sc.nextInt());
			System.out.print("Número do titular da conta: ");
			account.setNome(sc.next());
			System.out.print("Valor inicial: ");
			account.setSaldo(sc.nextDouble());
			
			System.out.print("Limite de saque: ");
			System.out.print("");
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		sc.close();		
	}

}