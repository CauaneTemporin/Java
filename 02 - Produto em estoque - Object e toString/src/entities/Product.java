package entities;

//Classe
public class Product {
	
	//Atributo
	public String nome;
	//Atributo
	public double preco;
	//Atributo
	public int quantidade;
	
	
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
