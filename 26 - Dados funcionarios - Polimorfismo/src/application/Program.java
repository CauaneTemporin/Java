package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			Employee employee = new Employee();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			employee.setName(sc.next());
			System.out.print("Hours: ");
			employee.setHours(sc.nextInt());
			System.out.print("Value per hour: ");
			employee.setValuePerHour(sc.nextDouble());
			if(ch == 'y') {
				OutsourcedEmployee osEmployee = new OutsourcedEmployee();
				System.out.println("Addinitional charge: ");
				osEmployee.setAdditionalCharge(sc.nextDouble());
				list.add(employee);
			}
			else {
				list.add(employee);
			}
		}
		
		System.out.println("\nPayments: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() +  " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		

	}

}
