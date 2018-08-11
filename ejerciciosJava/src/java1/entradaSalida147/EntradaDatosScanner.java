package java1.entradaSalida147;

import java.util.Scanner;

/**
 * El metodo Scanner simplifica la lectura de entrada
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class EntradaDatosScanner {

	public static void main(String[] args) {
		
		String captura = null;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un dato:");
		//Lee una linea
		captura = entrada.nextLine();
		
		while(entrada != null) {
			System.out.println("Dato introducido: " + captura);
			captura = entrada.nextLine();
		}
	}
}
