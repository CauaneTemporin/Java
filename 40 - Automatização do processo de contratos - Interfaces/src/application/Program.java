package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Contract contract = new Contract();
		contract.setNumber(sc.nextInt());
		System.out.print("Data (dd/MM/yyyy): ");
		contract.setDate(LocalDate.parse(sc.next(),fmt)); 
		System.out.print("Valor do contrato: ");
		contract.setTotalValue(sc.nextDouble());
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		sc.close();
		
	}

}