package entities;

public class Produtos {

	//Atributos
	private String nome;
	private double preco;
	
	
	//constructor 
	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	//Get
	public String getNome() {
		return nome;
	}

	//Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Get
	public double getPreco() {
		return preco;
	}

	//Set
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
