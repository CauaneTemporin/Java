package applicarion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrdemStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			
		Client client = new Client();
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		client.setNome(sc.nextLine());
		System.out.print("Email: ");
		client.setEmail(sc.next());
		System.out.print("Informe a data de aniversário(DD/MM/YYYY): ");
		client.setBirthDate(sdf.parse(sc.next()));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		System.out.print("Quantos itens para este pedido? ");
		
		int num = sc.nextInt();
		Order order = new Order();
		order.setClient(client);
		order.setStatus(status);
		order.setBirthDate(client.getBirthDate());
		for(int i = 1; i<=num; i++) {
			OrderItem orderitem = new OrderItem();
			orderitem.setNome(client.getNome());
			orderitem.setBirthDate(client.getBirthDate());
			orderitem.setEmail(client.getEmail());
			System.out.println("Digite os dados do item nº "+ i +":");
			System.out.print( "Nome do produto: ");
			orderitem.setNomeProd(sc.next());
			System.out.print( "Preço: ");
			orderitem.setPriceProd(sc.nextDouble());
			System.out.print("Quantidade: ");
			orderitem.setQuantity(sc.nextInt());
			order.addItem(orderitem);
		}
		
		System.out.println(order.toString());
		
		sc.close();
		
	}
}
