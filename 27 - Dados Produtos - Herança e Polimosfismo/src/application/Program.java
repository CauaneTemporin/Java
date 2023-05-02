package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			System.out.println("Datos do produto #" + i + ": ");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			
			
			if( ch == 'i') {
				System.out.print("Taxa de importacao: ");
				Double customsFree = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFree));
			}
			
			else if(ch == 'u'){
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(sc.next());
				productList.add(new UsedProduct(name, price, manufacture));
			}
			else {
				productList.add(new Product(name, price));
			}
		}
		System.out.println("\nETIQUETAS DE PREÇO:");
		for (Product prod : productList) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
