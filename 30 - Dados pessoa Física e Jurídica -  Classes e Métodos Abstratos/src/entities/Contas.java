package entities;

public abstract class Contas {

	private String nome;
	protected Double rendimento_anual;
	
	public Contas() {
		
	}
	
	public Contas(String nome, Double rendimento_anual) {
		super();
		this.nome = nome;
		this.rendimento_anual = rendimento_anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimento_anual() {
		return rendimento_anual;
	}

	public void setRendimento_anual(Double rendimento_anual) {
		this.rendimento_anual = rendimento_anual;
	}

	public abstract double imposto();
}
