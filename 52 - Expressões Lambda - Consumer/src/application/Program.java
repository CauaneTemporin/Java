package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
		//list.forEach(new PriceUpdate());

		//Opção 2
		//list.forEach(Product::staticPriceUpdate);
		
		//Opção 3
		//list.forEach(Product::nonStaticPriceUpdate);

		//Opção 4
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

		//Opção 5
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);
		 
	}

} 
