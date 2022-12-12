package util;

public class Calculator {

	//Método final não pode ser sobrescrito nas subclasses
	//Constante que não depende de qualquer obejto deo tipo "Calculator"
	public static final double PI = 3.14159;
	
	//Static que não depende de qualquer obejto deo tipo "Calculator"
	public static double circumference(double radius) {
	return 2.0 * PI * radius;
	}
	
	//Static que não depende de qualquer obejto deo tipo "Calculator"
	public static double volume(double radius) {
	return 4.0 * PI * radius * radius * radius / 3.0;
	} 
	
}
