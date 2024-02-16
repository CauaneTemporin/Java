package application;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {

		//List lista = Collections.synchronizedList(new ArrayList<>());
		//ou
		//List <String> lista = new Vector<String>();
		Lista lista = new Lista();
		for (int i = 0; i < 10; i++) {

			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}

		new Thread(new TarefaImprimir(lista)).start(); 
		
	}
}