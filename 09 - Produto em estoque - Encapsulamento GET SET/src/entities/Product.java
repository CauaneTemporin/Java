package entities;

//Classe
public class Product {
	
	//Atributo privado
	private String nome;
	//Atributo privado
	private double preco;
	//Atributo privado
	private int quantidade;
	
	//Construtor Sobrecarga 0 Parâmetros
	public Product() {
	}
	
	//Construtor Sobrecarga  - 2 Parâmetros
	public Product(String nome,double preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Construtor Sobrecarga - 3 Parâmetros
		public Product(String nome,double preco) {
			this.nome = nome;
			this.preco = preco;
		}
		
	//Encapsulamento 
	//Get serve para recuperar o valor e deixar público para pode ser acessado.
	public String getNome() {
		return nome;
		}
		
	//Encapsulamento 
	//Serve para realizar funções e atribuições .
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//Encapsulamento 
	//Comando para pegar o preço 
	public Double getPreco() {
		return preco;
				}
	
	//Encapsulamento 
	//Alterar o valor do preço
	public void setPreco(double preco) {
		this.preco = preco;
		}
	//Encapsumento 
	//Comando para pegar a quantidade 
	public int getQuantidade() {
		return quantidade;
				}
		
		
	//Metodo
	public double totalvalor_estoque() {
		return preco*quantidade;
	}
	
	//Metodo
	public void addProduto(int quantidade) {
		//this é usado para chamar o atributo da class (é autoreferencia para o objeto)
		//Comando para somar o quantidade (argumento) + (atributo)
		this.quantidade += quantidade;
	}
	
	//Metodo
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//Comando que mostra que esta sendo sobreescrevendo uma função, para retornar de outra maneira
    @Override
    //Metodo
    //toString é para retornar em forma de String um objeto
	public String toString() {
		return nome 
			+ ", $ " 
			+ String.format("%.2f", preco) 
			+ ", "
			+ quantidade 
			+ " unidades, Total: $ " 
			+ String.format("%.2f", totalvalor_estoque());
		
	}
}
