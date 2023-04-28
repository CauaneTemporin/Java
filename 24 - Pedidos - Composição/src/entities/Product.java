package entities;

public class Product extends Client{

	protected String nomeprod;
	protected Double priceprod;
	
	public Product() {
		super();
	}

	public Product(String nomeprod, Double priceprod) {
		super();
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
		return  "\nCliente: " + this.nome +" (" + super.birthDate + ") - " + this.email 
				+ "\nOrder items:"
				+ "\n" + nomeprod + ", $" + priceprod + ", Quantidade: " ;
	}
	
}
