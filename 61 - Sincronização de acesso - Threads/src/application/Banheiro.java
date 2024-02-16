package application;

public class Banheiro {

	private boolean banheiroSujo = true;

	public void fazNumero1() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			while (banheiroSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " fazendo coisa rapida");

			dormeUmPouco(5000);

			this.banheiroSujo = true;

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
		}
	}

	public void fazNumero2() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			while (banheiroSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " fazendo coisa demorada");

			dormeUmPouco(10000);

			this.banheiroSujo = true;

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
		}
	}

	private void dormeUmPouco(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void limpa() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			if (!banheiroSujo) {
				System.out.println(nome + " banheiro não esta sujo, vou sair");
				return;
			}
			System.out.println(nome + " limpando o banheiro");

			this.banheiroSujo = false;

			dormeUmPouco(10000);
			this.notifyAll();
			System.out.println(nome + " saindo do banheiro");
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + " ,eca, banheiro está sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}