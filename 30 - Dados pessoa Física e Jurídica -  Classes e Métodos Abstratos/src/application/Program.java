package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ContaFisica;
import entities.ContaJuridica;
import entities.Contas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contas> list = new ArrayList<>();
		System.out.print("Digite o número de funcionário: ");
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			System.out.println("Dados do contribuinte nº " + i +":");
			System.out.print("Sua conta: Pessoa Física (F) ou Pessoa Jurídicia (J): " );
			char ch = sc.next().charAt(0);	
			if(ch == 'F') {
				ContaFisica contaFisica = new ContaFisica();
				System.out.print("Nome completo: ");
				contaFisica.setNome(sc.next());
				System.out.print("Rendimento anual: " );
				contaFisica.setRendimento_anual(sc.nextDouble());
				System.out.print("Despesas com saúde: " );
				contaFisica.setGasto_saudeDouble(sc.nextDouble());
				list.add(contaFisica);
			}
			else {
				ContaJuridica contaJuridica = new ContaJuridica();
				System.out.print("Nome completo: ");
				contaJuridica.setNome(sc.next());
				System.out.print("Rendimento anual: " );
				contaJuridica.setRendimento_anual(sc.nextDouble());
				System.out.print("Número de funcionários: " );
				contaJuridica.setNum_Funcionario(sc.nextInt());
				list.add(contaJuridica);
				}
		
		}
		System.out.println("IMPOSTOS PAGOS: ");
		double total = 0;
		for(Contas contas : list) {
			total += contas.imposto();
			System.out.println(contas.getNome() +": $"+ String.format("%.2f", contas.imposto()));
		}
		System.out.println("\nImpostos Totais: $ " + total);
		sc.close();
	
   }
}
