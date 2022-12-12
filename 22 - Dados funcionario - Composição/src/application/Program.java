package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Departamento;
import entities.Trabalho;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Departamento departamento = new Departamento();
		Trabalho trabalho = new Trabalho();

		System.out.println("Informe o departamento: ");
		departamento.setNome(sc.next());
		System.out.println("Informe os dados do trabalhador: ");
		System.out.print("Informe o nome: ");
		trabalho.setNome(sc.next());
		System.out.print("Informe o Nível: ");
		// trabalho.setNivel(sc.next());
		System.out.print("Informe o salário base: ");
		trabalho.setSalario_base(sc.nextDouble());
		System.out.print("Informe a quantidade de contratos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			Contratos contratos = new Contratos();
			//DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Informe a data (DD/MM/YYYY): ");
			DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			contratos.setDate(new SimpleDateFormat());
			System.out.print("Informe Valor por hora: ");
			contratos.setHoras(sc.nextInt());
			System.out.print("Informe quantas horas trabalhadas: ");
			contratos.setValor_hora(sc.nextDouble());
		}

		System.out.print("Digite o mês e o ano para calcular o rendimento (MM/AAAA): ");
		

		sc.close();

	}

}
