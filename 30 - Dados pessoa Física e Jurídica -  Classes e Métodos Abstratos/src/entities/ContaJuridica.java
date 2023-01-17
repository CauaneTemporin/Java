package entities;

public class ContaJuridica extends Contas{
	
	private Integer num_Funcionario;
	
	public ContaJuridica() {
		super();
	}

	public ContaJuridica(String nome, Double rendimento_anual, Integer num_Funcionario) {
		super(nome, rendimento_anual);
		this.num_Funcionario = num_Funcionario;
	}
	
	public Integer getNum_Funcionario() {
		return num_Funcionario;
	}

	public void setNum_Funcionario(Integer num_Funcionario) {
		this.num_Funcionario = num_Funcionario;
	}

	@Override
	public double imposto() {
		double imp;
		
		if(num_Funcionario <= 10) {
			imp = (rendimento_anual * 0.16);
			
			
		}
		else {
			imp = (rendimento_anual * 0.14);
		}
		return imp;
	}
}
