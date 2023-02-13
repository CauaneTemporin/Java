package entities;

public class OrderItem extends Product {

	protected Integer quantity;
	protected Double price;
	
	protected Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal()
	{
		return quantity * priceprod;
	}
	
	@Override
	public String toString() {
		return  "\nRESUMO DO PEDIDO:\n"
				+ "\nCliente: " + this.nome +" (" + super.birthDate + ") - " + this.email 
				+ "\nOrder items:"
				+ "\n" + nomeprod + ", $" + priceprod + ", Quantidade: " + quantity + ", Subtotal: $" + subTotal() ;
	}
}
