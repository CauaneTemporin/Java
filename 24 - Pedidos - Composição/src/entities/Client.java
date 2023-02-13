package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Client {

	protected String nome;
	protected String email;
	protected Date birthDate;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	LocalDateTime dateTime = LocalDateTime.now();
	
	public Client() {
		
	}

	public Client(String nome, String email, Date birthDate) {
		super();
		this.nome = nome;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String toString() {
		return "\nRESUMO DO PEDIDO:\n"
				+ "Cliente: " + this.nome +" (" + this.birthDate +") - " + this.email ;
	}
	
}
