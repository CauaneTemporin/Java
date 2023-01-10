package entities;

public class Product extends Client{

	protected String nomeprod;
	protected Double priceprod = 0.0;
	
	public Product() {
		
	}

	public Product(String nomeprod, Double priceprod) {
		this.nomeprod = nomeprod;
		this.priceprod = priceprod;
	}

	public String getNomeProd() {
		return nomeprod;
	}

	public void setNomeProd(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public Double getPriceProd() {
		return priceprod;
	}

	public void setPriceProd(Double price) {
		this.priceprod = price;
	}
	
	@Override
	public String toString() {
		return  "\nRESUMO DO PEDIDO:\n"
				+ "\nCliente: " + this.nome +" (" + super.birthDate + ") - " + this.email 
				+ "\nOrder items:"
				+ "\n" + nomeprod + ", $" + priceprod + ", Quantidade: " ;
	}
	
}
