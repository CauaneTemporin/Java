package entities;

public class Product {
	public double largura;
	public double altura;
	
	public double area() {
		return largura*altura;
	}
	
	public double perimetro () {
		return (largura+altura)*2;
	}
	
	@Override
	public String toString() {
		return area()
			+ " Perímetro "
		    + String.format("%.2f", perimetro());

	}
	
}
