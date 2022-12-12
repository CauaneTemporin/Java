//Pacote da class
package entities;

//Declarando uma classe, uma estrutura que pode conter membros(atributos e metodos)
//Nome da class
public class Triangulo {
	
	//O "public" indica que o atributo ou metodo pode ser usado em outros arquivos
	
	//Declarando um atributo da classe
	public double a;
	public double b;
	public double c;
	
	//Criando um metodo(Função)
	//Nome do metodo com lista de parâmetros do método
	public double area() {
		//Corpo do metodo
		double p = (a + b + c)/2.0;
		/*double result = Math.sqrt(p * (p - a) * (p - b) *(p - c));
		return result;
		*/
		return Math.sqrt(p * (p - a) * (p - b) *(p - c));
	}
	
}
