package ejercicioTicTac;

public class Tac extends Thread {
	@SuppressWarnings("unused")
	private int hilo;

	public Tac(int hilo) {
		this.hilo = hilo;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("TAC");
				sleep(1000);
				yield();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}