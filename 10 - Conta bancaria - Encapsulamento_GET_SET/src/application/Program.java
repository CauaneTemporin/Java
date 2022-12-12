package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contaBancaria = new ContaBancaria();
		
		System.out.print("Digite o número da conta: ");
		contaBancaria.setNum_conta_bancaria(sc.nextInt());
		System.out.print("Digite o titular da conta: ");
 		contaBancaria.setNome(sc.next());
 		
 		Boolean Continua = true;
 		
 		while(Continua == true) {
		System.out.print("\nExiste uma ação para ser realizada (Sim/Nao): ");  
		String deposito_inicial = sc.next();
		
		if(deposito_inicial.equals("Sim")) {
			System.out.print("\nÍndice: \n -Depósito(Deposito)\n -Saque(Saque)\n -Alterar Nome(Nome)"
					+ "\nQual será ação realizada: ");
			String acao = sc.next();
			if(acao.equals("Deposito")) {
				System.out.print("\nInsira o valor do depósito: ");
				contaBancaria.deposito(sc.nextDouble());
				System.out.println(contaBancaria.toString());
				continue;
			}
			
			else if(acao.equals("Saque")) {
				System.out.print("\nInsira o valor do saque: ");
				contaBancaria.saque(sc.nextDouble());
				System.out.println(contaBancaria.toString());
				continue;
			}
			
			else {
				System.out.print("\nInsira o novo nome: ");
				contaBancaria.nome_alterar(sc.next());
				System.out.println(contaBancaria.toString());
				continue;
			}
			
		}
		else{
			Continua = false;
			System.out.println("Operação encerrada! ");
		   }
			
		}
		
		sc.close();
		
	}

}
