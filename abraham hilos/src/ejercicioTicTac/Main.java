package ejercicioTicTac;

public class Main {

	public static void main(String[] args) {
		Tic tic = new Tic(4);
		Tac tac = new Tac(2);
		
		tic.start();
		tac.start();
	}
}
