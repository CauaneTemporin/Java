package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		//comando para fazer leitura do Nome e guarda no variavel product no campo "nome"
		//product.nome = sc.next();
		String nome = sc.next();
		System.out.print("Preço: ");
		//comando para fazer leitura do Preço e guarda no variavel product no campo "preco"
		//product.preco = sc.nextDouble();
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		//comando para fazer leitura do Quantidade em estoque e guarda no variavel product no campo "quantidade"
		//product.quantidade = sc.nextInt();
		int quantidade = sc.nextInt();
		
		Product product = new Product(nome, preco);
		
		//Comando para alterar chamando o método set passando como argumento o novo valor
		product.setNome("Computador");
		//Comando para retornar o nome
		System.out.println("Nome atualizado" + product.getNome());
		
		//Comando para alterar chamando o método set passando como argumento o novo valor
		product.setPreco(1200);
		//Comando para retornar o preço
		System.out.println("Valor atualizado" + product.getPreco());
		
		System.out.println();
		System.out.println("Produto: " + product);
		System.out.println();
		System.out.println("Você deseja fazer uma operação? ");
		String operacao = sc.next();
		
		if (operacao.equals("Adicionar")) {
			System.out.print("Adicione o número de produtos que será adicionado no estoque: ");
			 quantidade = sc.nextInt();
			//Atualização da quantidade dentro do objeto product
			product.addProduto(quantidade);
			System.out.print("Atualização dos produtos inseridos" + product);
			System.out.println();
		}
		else if (operacao.equals("Remover")) {
			System.out.print("Adicione o número de produtos que será removido no estoque: ");
			 quantidade = sc.nextInt();
			//Atualização da quantidade dentro do objeto product
			product.removeProduto(quantidade);
			System.out.print("Atualização dos produtos removidos" + product);
		}
		
		sc.close();

	}

}