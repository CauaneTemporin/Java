package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		
		Order order = new Order(1080, new Date(), OrderStatus.pendente_pagamento);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.entregue;
		OrderStatus os2 = OrderStatus.valueOf("entregue");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
