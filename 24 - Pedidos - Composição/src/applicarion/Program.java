package applicarion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrdemStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client client = new Client();
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		client.setNome(sc.next());
		System.out.print("Email: ");
		client.setEmail(sc.next());
		System.out.print("Informe a data de aniversário(DD/MM/YYYY): ");
		client.setBirthDate(sdf.parse(sc.next()));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrdemStatus.valueOf(sc.next());
		System.out.print("Quantos itens para este pedido? ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
		Product product = new Product();
		System.out.println("Digite os dados do item nº "+ i +":");
		System.out.print( "Nome do produto: ");
		product.setNome(sc.next());
		System.out.print( "Preço: ");
		product.setPrice(sc.nextDouble());
		OrderItem orderItem = new OrderItem();
		System.out.println("Quantidade: ");
		orderItem.setQuantity(sc.nextInt());
		}			
		
		sc.close();
		
	}
}
