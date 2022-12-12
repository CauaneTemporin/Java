package entities;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private double aumento;
	
	public Funcionario() {

	}
	
	public Funcionario(int id, String nome, double salario, double aumento) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.aumento = aumento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}

    
	public static boolean teste(){
		return false;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		//this.aumento = salario+=(aumento*100/salario);
		this.aumento = salario +=((aumento/100)*salario);
	}

	public String toString() {
		return "Lista dos funcionários: \n"
		+", " 
		+ nome
		+", "
		+ String.format("%.2f\n", salario)
		+"\nLista dos funcionarios:"
		+this.id
		+this.nome
		+this.salario;
	}
	
}
