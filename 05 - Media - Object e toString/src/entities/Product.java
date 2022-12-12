package entities;

public class Product {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public double media() {
		return media = ( (nota1) + (nota2) + (nota3 ));
	}

}