package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//Lista não aceita o tipo primitivo apenas Wrapper class
		
		//Declarando lista e instanciadno
		List <String> list = new ArrayList<>();
		
		// Add na lista
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("João");
		list.add("Marcela");
		list.add("Tais");
		list.add("Isa");
		list.add("Jose");

		// Add na lista com posição
		list.add(2, "Marco");
		
		//Tamanho da lista
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		//Remover da lista
		list.remove("João");
		//Remover da lista posição
		list.remove(1);
		//Remover todos que for igual ao definido
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		//Mostrando a posição
		System.out.println("Posição do Bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------------");
		
		//Filtra lista para ficar só o que definido
		//.collect(Collectors.toList()) serve para converte o steam para um tipo List
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String y : result) {
			System.out.println(y);
		}
		
		System.out.println("------------------------");


		//Encontra 1º elemento definido na posição
		String elemento = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
		System.out.println(elemento);

	}

}
