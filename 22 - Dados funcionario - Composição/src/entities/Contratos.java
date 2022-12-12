package entities;

import java.util.Date;

public class Contratos {

	private Date date;
	private Double valor_hora;
	private Integer horas;

	public Contratos() {
	}

	public Contratos(Date date, Double valor_hora, Integer horas) {
		this.date = date;
		this.valor_hora = valor_hora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date simpleDateFormat) {
		this.date = simpleDateFormat;
	}

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double totalHora() {
		return valor_hora + horas;
	}
	
}
