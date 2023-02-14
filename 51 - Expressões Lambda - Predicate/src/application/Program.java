package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));	
		
		//Opção 1
		//list.removeIf(new ProductPredicate());
		
		//Opção 2
		//list.removeIf(Product::staticProductPredicate);
		
		//Opção 3
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//Opção 4
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);
		
		//Opção 5
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
}
