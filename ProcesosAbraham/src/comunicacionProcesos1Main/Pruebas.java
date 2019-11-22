package comunicacionProcesos1Main;

import java.io.IOException;

public class Pruebas {

	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec("D://Users//Alumno//Desktop//hijoAleatorios.c");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
