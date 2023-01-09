package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int num = sc.nextInt();
	
		for(int i = 1; i<=num; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (R/C)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color.valueOf(sc.next());
			if( ch == 'R') {
				entities.Rectangle rec = new entities.Rectangle();
				System.out.print("Width: ");
			    rec.setWidth(sc.nextDouble());
				System.out.print("Height: ");
				rec.setHeight( sc.nextDouble());
				list.add(rec);
			}
			else {
				entities.Circle circle = new entities.Circle();
				System.out.print("Radius: ");
				circle.setRadius(sc.nextDouble());
				list.add(circle);
			}
		}
		
		System.out.println("\nSHAPE AREAS:");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();

	}

}
