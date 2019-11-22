package ejercicioTicTac;

public class Tic extends Thread {
	
	@SuppressWarnings("unused")
	private int hilo;

	// Constructor
	public Tic(int hilo) {
		this.hilo = hilo;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("TIC");
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
