package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<Funcionario>();

		System.out.println("Digite a quantidade de funcionários: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			Funcionario funcionarioCadastro = new Funcionario();
			System.out.println("Funcionário " + i + ": ");
			System.out.println("Informe o ID do funcionário: ");
			int id = sc.nextInt();
			if (existeID(list, id)) {
				System.out.println("ID ja existente!\nRepita o processo com outro ID.\n");
				i--;
			} else {
				funcionarioCadastro.setId(id);
				System.out.println("Informe o nome do funcionário: ");
				funcionarioCadastro.setNome(sc.next());
				System.out.println("Informe o salário do funcionário: ");
				funcionarioCadastro.setSalario(sc.nextDouble());
				list.add(funcionarioCadastro);

			}

		}

		boolean porcentagem = true;
		String salarios = "";

		while (porcentagem) {
			System.out.println("Informe o ID que ira receber o aumento de salário: ");
			int id = sc.nextInt();

			if (existeID(list, id)) {
				for (Funcionario x : list) {
					if (x.getId() == id) {
						System.out.println("Informe a porcetagem: ");
						x.setAumento(sc.nextDouble());
						// System.out.println(x.getSalario());
						porcentagem = false;
					}
					salarios += "Nome: " + x.getNome() + " salário: " +  String.format("%.2f", x.getSalario()) + "\n";
				}

				System.out.println(salarios);

			} else {
				System.out.println("ID não cadatrado!\nRepita o processo com outro ID.\n");
				porcentagem = true;
			}

		}
		sc.close();
	}

	public static boolean existeID(List<Funcionario> list, int id) {
		Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}

}