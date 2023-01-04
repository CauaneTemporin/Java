package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrdemStatus;

public class Order extends Client{

	private Date moment;
	private OrdemStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrdemStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem (OrderItem item){
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
				
	@Override
	public String retorno() {
		return  "RESUMO DO PEDIDO:\n"
				+ "Momento do pedido: "
				+ "\nStatus do pedido: " + status
				+ "\nCliente: " + this.nome +"(" + super.birthDate + ") - " + this.email ;
	}
}
