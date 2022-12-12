package entities;

public class ContaBancaria {

	//Atributo
	private int num_conta_bancaria;
	private String nome;
	private double valor_deposito;
	
	//Construtor 1
	public ContaBancaria() {
	}
	
	//Construtor 2
	public ContaBancaria(int num_conta_bancaria, String nome, double valor_deposito) {
		this.num_conta_bancaria = num_conta_bancaria;
		this.nome = nome;
		this.valor_deposito = valor_deposito;
	}



	//GET
	public int getNum_conta_bancaria() {
		return num_conta_bancaria;
	}

	public void setNum_conta_bancaria(int num_conta_bancaria) {
		this.num_conta_bancaria = num_conta_bancaria;
	}

	//GET
	public String getNome() {
		return nome;
	}

	//SET
	public void setNome(String nome) {
		this.nome = nome;
	}

	//GET
	public double getValor_deposito() {
		return valor_deposito;
	}

	//SET
	public void setValor_deposito(double valor_deposito) {
		this.valor_deposito = valor_deposito;
	}
	
	//Metodo
	public void deposito(double deposito) {
		this.valor_deposito += deposito;
	}
	
	//Metodo
	public void saque(double saque) {
		this.valor_deposito -= (saque + 5);
	}
	
	//Metodo
	public void nome_alterar(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		
		return "\n"
		+ "Dados atualizados: \n" 
		+ "Conta: " 
		+ num_conta_bancaria 
		+ ", Titular: " 
		+ nome 
		+ ", Saldo: $ "
		+ String.format("%.2f", valor_deposito);  
	}
	
	
	
		
	
}
