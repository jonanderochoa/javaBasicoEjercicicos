package java1.entradaSalida147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {

	public static void main(String[] args) {
		
		String captura;
		//Creamos una variable de tipo InputStreamReader que recoge la entrada
		InputStreamReader input = new InputStreamReader(System.in);
		//Creamos un buffer para leer lineas completas
		BufferedReader bInput = new BufferedReader(input);
		
		try {
			System.out.println("Introduce dato:");
			//guarda en la variable la primera linea
			captura = bInput.readLine();
			//Mientras la captura sea diferente de null...
			while(captura != null) {
				System.out.println("Dato introducido: " + captura);
				captura = bInput.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
