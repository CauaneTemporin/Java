package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalho {

	private String nome;
	private NivelTrabalho nivel;
	private Double salario_base;
	
	private Departamento departamento;
	private List<Contratos> contratos = new ArrayList<>();
	
	public Trabalho() {
		
	}
	
	public Trabalho(String nome, NivelTrabalho nivel, Double salario_base, Departamento departamento) {

		this.nome = nome;
		this.nivel = nivel;
		this.salario_base = salario_base;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(Double salario_base) {
		this.salario_base = salario_base;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contratos> getContratos() {
		return contratos;
	}
	
	public void addContrato(Contratos contrato) {
		contratos.add(contrato);
	}
	
	public void removeContratos(Contratos contrato) {
		contratos.remove(contrato);
	
	}
	
	public void valorTotal(int ano, int mes) {
		double soma = salario_base;
		Calendar cal = Calendar.getInstance();
		for(Contratos c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 +cal.get(Calendar.MONTH);
			if(ano == c_ano && mes ==c_mes) {
				soma +=c.totalHora(); 
			}
			
		}
		
	}
	
}
 