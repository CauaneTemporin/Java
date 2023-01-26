package model.entities;

public class Account {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limite_retirada;
	
	public Account() {
		
	}

	public Account(Integer numero, String nome, Double saldo, Double limite_retirada) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite_retirada = limite_retirada;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite_retirada() {
		return limite_retirada;
	}

	public void setLimite_retirada(Double limite_retirada) {
		this.limite_retirada = limite_retirada;
	}
	
	public void deposito(Double quantia) {
		this.saldo = this.saldo + quantia; 
	}
	
	
	
}
