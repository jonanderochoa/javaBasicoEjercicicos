package java1.entradaSalida147.calculadoraEntradaDatos;

import java.util.Scanner;

import java1.entradaSalida147.calculadoraEntradaDatos.calculadora.Operaciones;

public class CalculadoraEntradaDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		int valor1 = entrada.nextInt();
		System.out.println("Introduce otro n�mero: ");
		int valor2 = entrada.nextInt();
		
		int resultado = Operaciones.sumar(valor1, valor2);

		System.out.println("El resultado de la suma es: " + resultado);
		
		entrada.close();
	}

}
