import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class EjercicioRepaso {

	public static void main(String[] args) {

		try {
			int suma = 0, mayor, menor;
			int media;
			int[] numeros;
			File miFichero = new File("D:\\Users\\Alumno\\Desktop\\numeros.txt");
			FileReader miLector = new FileReader(miFichero);
			BufferedReader lectorDefinitivo = new BufferedReader(miLector);
			String linea = lectorDefinitivo.readLine();
			while (lectorDefinitivo.read() != -1) {
				linea += lectorDefinitivo.readLine();
			}

			miLector.close();

			if (linea.length() > 19) {
				System.out.println("Solo puedes meter hasta 20 numeros");
			} else {
				numeros = new int[linea.length()];

				for (int i = 0; i < linea.length(); i++) {
					numeros[i] = Integer.parseInt(linea.substring(i, i + 1));
					suma += numeros[i];
				}

				mayor = numeros[0];
				menor = numeros[0];
				for (int i = 1; i < numeros.length - 1; i++) {
					mayor = numMayor(mayor, numeros[i + 1]);
					menor = numMenor(menor, numeros[i + 1]);

				}

				arrayOrdenadoBurbuja(numeros);

				for (int i = 0; i < numeros.length; i++) {
					System.out.print("[" + numeros[i] + "] ");
				}

				media = suma / numeros.length;

				System.out.println("\nEl mayor es: " + mayor);
				System.out.println("El menor es: " + menor);
				System.out.println("La media es: " + media);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int numMayor(int num1, int num2) {
		int comparacion;
		if (num1 > num2) {
			comparacion = num1;
		} else if (num2 > num1) {
			comparacion = num2;
		} else {
			comparacion = num1;
		}

		return comparacion;
	}

	public static int numMenor(int num1, int num2) {
		int comparacion;
		if (num1 < num2) {
			comparacion = num1;
		} else if (num2 < num1) {
			comparacion = num2;
		} else {
			// esto por si son iguales pra que me devuelva cualquiera ya que da igual
			comparacion = num1;
		}
		return comparacion;
	}

	public static void arrayOrdenadoBurbuja(int[] numeros) {
		int aux;
		for (int i = 1; i < numeros.length; i++) {

			for (int j = 0; j < numeros.length - 1; j++) {

				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
	}

	public static String datosPorTeclado() {
		Scanner entrada = new Scanner(System.in);
		int numeroIntroducido;
		int[] tablaNumeros = new int[20];
		int countNum = 0;
		int suma = 0, numeroMayor, numeroMenor;
		double media;

		System.out.println("Introduce numeros hasta meter '-1'(MAX 20 NUM)");
		numeroIntroducido = entrada.nextInt();

		numeroMayor = numeroIntroducido;
		numeroMenor = numeroIntroducido;

		while (numeroIntroducido != -1) {
			tablaNumeros[countNum] = numeroIntroducido;
			countNum++;

			suma += numeroIntroducido;

			System.out.println("Introduce otro numero");
			numeroIntroducido = entrada.nextInt();

			if (numeroIntroducido != -1) {
				numeroMayor = numMayor(numeroMayor, numeroIntroducido);
				numeroMenor = numMenor(numeroMenor, numeroIntroducido);
			}
		}

		entrada.close();

		if (countNum > 0) {
			media = suma / countNum;

			return ("El numero mas grande es: " + numeroMayor + "\nEl numero mas pequeño es: " + numeroMenor
					+ "\nLa media de numeros introducidos es: " + media);

		} else
			return "No se ha introducido ningun dato valido";
	}

}
