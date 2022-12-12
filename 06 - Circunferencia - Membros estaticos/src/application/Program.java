package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
        //Por se tratar de um método estático ele é chamado por meio da classe "Calculator" 
		//e não do objeto, sendo possível  executar alguma função sem a 
		//depender do conteúdo de um objeto ou da instanciação  da classe
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();

	}

}
