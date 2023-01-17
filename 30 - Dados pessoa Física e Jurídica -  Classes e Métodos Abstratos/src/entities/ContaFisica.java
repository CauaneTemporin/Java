package entities;

public class ContaFisica extends Contas{
	
	private Double gasto_saudeDouble;
	
	public ContaFisica() {
		super();
	}

	public ContaFisica(String nome, Double rendimento_anual, Double gasto_saudeDouble) {
		super(nome, rendimento_anual);
		this.gasto_saudeDouble = gasto_saudeDouble;
	}

	public Double getGasto_saudeDouble() {
		return gasto_saudeDouble;
	}

	public void setGasto_saudeDouble(Double gasto_saudeDouble) {
		this.gasto_saudeDouble = gasto_saudeDouble;
	}

	@Override
	public double imposto() {
		double imp;
		
		if(rendimento_anual < 20000.00) {
			imp = (rendimento_anual * 0.15) - (gasto_saudeDouble / 2);
			
			
		}
		else {
			imp = (rendimento_anual * 0.25) - (gasto_saudeDouble / 2);
		}
		return imp;
	}	
}
