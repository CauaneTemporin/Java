package util;

public class CotacaoDolar {

	public double dolar;
	public double total_dolar;
	
	public static double imposto = 0.06;
	
	public double valor_imposto() {
		return total_dolar * dolar * imposto;
	}
	
	public double total_real() {
		return total_dolar * dolar + valor_imposto();
	}
	
	public String toString() {
		return
				"Valor comparativo será R$: " + String.format("%.2f",total_real())
			;
	}
	
	
}
