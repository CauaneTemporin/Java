package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		//comando para fazer leitura do Nome e guarda no variavel product no campo "nome"
		product.nome = sc.next();
		System.out.print("Preço: ");
		//comando para fazer leitura do Preço e guarda no variavel product no campo "preco"
		product.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		//comando para fazer leitura da quantidade e guarda no variavel product no campo "quantidade"
		product.quantidade = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Produto: " + product);
		System.out.println();
		System.out.println("Você deseja fazer uma operação? ");
		String operacao = sc.next();
		
		if (operacao.equals("Adicionar")) {
			System.out.print("Adicione o número de produtos que será adicionado no estoque: ");
			 int quantidade = sc.nextInt();
			//Atualização da quantidade dentro do objeto product
			product.addProduto(quantidade);
			System.out.print("Atualização dos produtos inseridos" + product);
			System.out.println();
		}
		else if (operacao.equals("Remover")) {
			System.out.print("Adicione o número de produtos que será removido no estoque: ");
			 int quantidade = sc.nextInt();
			//Atualização da quantidade dentro do objeto product
			product.removeProduto(quantidade);
			System.out.print("Atualização dos produtos removidos" + product);
		}
		
		sc.close();

	}

}
