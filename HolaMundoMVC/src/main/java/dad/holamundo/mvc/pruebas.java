package dad.holamundo.mvc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class pruebas {

	public static void main(String[] args) {
		String file = "usuarios.csv";
		
		String usuario = "Joel";
		String password = "1234";
		FileInputStream mifile;
		try {
			mifile = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(mifile);
			BufferedReader buff = new BufferedReader(in);
			
			String line = buff.readLine();
			
			String datos[] = line.split(",");
			
			/*System.out.println(datos[0]);
			System.out.println(datos[1]);*/
			
			System.out.println(line);
			
			if(usuario.equals(datos[0]) && password.equals(datos[1])) {
				System.out.println("por fin maquina");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
