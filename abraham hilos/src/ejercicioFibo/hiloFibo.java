package ejercicioFibo;

public class hiloFibo extends Thread {

	private int N;

	public hiloFibo(int N) {
		super();
		this.N = N;
	}

	public void run() {

		for (int i = 0; i < N; i++) {

			System.out.println(fibonacciRecursivo(i));
		}
	}

	private int fibonacciRecursivo(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		}

	}

}
