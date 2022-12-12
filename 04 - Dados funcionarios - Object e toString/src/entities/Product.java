package entities;

public class Product {
	public String nome;
	public double salario_bruto;
	public double imposto;

	public double salario_liquido() {
		return salario_bruto - imposto;
	}

	public void aumento_salario(double porcentagem) {
		 //O this faz referência prós atributos e métodos da classe em que ele tá sendo usado
		  this.salario_bruto += salario_bruto * porcentagem /100.0;
	}

	public String toString() {
		return nome + ", salário líquido: $ " + salario_liquido()
		;
	}
}

		