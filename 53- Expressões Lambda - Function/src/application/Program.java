package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));	
		
		//Opção 1
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
				
		//Opção 2
		//List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
				
		//Opção 3
		//List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());

		//Opção 4
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());


		//Opção 5
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		 names.forEach(System.out::println);
	}

} 
