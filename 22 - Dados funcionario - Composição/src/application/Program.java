package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Departamento;
import entities.Trabalho;
import entities.enums.NivelTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Trabalho trabalho = new Trabalho();
		
		trabalho.setDepartamento(new Departamento());

		System.out.print("Informe o departamento: ");
		trabalho.getDepartamento().setNome(sc.next());
		System.out.println("Informe os dados do trabalhador: ");
		System.out.print("Informe o nome: ");
		trabalho.setNome(sc.next());
		System.out.print("Informe o Nível: ");
		NivelTrabalho.valueOf(sc.next());
		System.out.print("Informe o salário base: ");
		trabalho.setSalario_base(sc.nextDouble());
		System.out.print("Informe a quantidade de contratos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Contratos contratos = new Contratos();
			System.out.print("Informe a data (DD/MM/YYYY): ");
			try {
				contratos.setDate(sdf.parse(sc.next()));
			} catch (ParseException e) {
				System.out.print("A data informada não respeita a formato valido");
			}
			System.out.print("Informe Valor por hora: ");
			contratos.setValor_hora(sc.nextDouble());
			System.out.print("Informe quantas horas trabalhadas: ");
			contratos.setHoras(sc.nextInt());
			trabalho.addContrato(contratos);
		}

		System.out.print("Digite o mês e o ano para calcular o rendimento (MM/AAAA): ");
		String contractDate = sc.next();
		int month = Integer.parseInt(contractDate.substring(0, 2));
		int year = Integer.parseInt(contractDate.substring(3));
		
		System.out.println("Nome : " + trabalho.getNome());
		System.out.println("Departamento: " + trabalho.getDepartamento().getNome() );
		System.out.println("Renda: " + month + "/" + year + ": " +trabalho.valorTotal(year, month) );

	

		sc.close();

	}

}
