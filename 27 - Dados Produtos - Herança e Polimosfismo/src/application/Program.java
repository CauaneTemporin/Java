package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			Product product = new Product();
			System.out.println("Product: #" + i + ": ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			product.setName(sc.next());
			System.out.println("Price: ");
			product.setPrice(sc.nextDouble());
			if( ch == 'i') {
				ImportedProduct importedProduct = new ImportedProduct();
				System.out.println("Customs fee: ");
				importedProduct.setCustomsFree(sc.nextDouble());
			}
			
			else{
				UsedProduct usedProduct = new UsedProduct();
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				usedProduct.setManufacture(sc.next());
				
			}
		}
		
		sc.close();
	}

}
