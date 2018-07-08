package java1.ejemploenumeraciones;

import java.util.Scanner;

public class EjemplosEnumeraciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String stringDia = "";
		do {
			
			System.out.println("Introduce el nombre del dia: ");
			
			try {
				//Recogemos el valor introducido por teclado y lo ponemos en mayuscula
				stringDia = entrada.nextLine().toUpperCase();
				
				//Transformamos el String a Enum si es posible. Sino excepcion
				Dias dia = Dias.valueOf(stringDia);
				
				//Le pasamos el valor enum al metodo
				indicarDia(dia);
				
			}catch(Exception e) {
				
				e.getMessage();
			}
		}while(!"fin".equals(stringDia));	
		entrada.close();
		
	}
	
	public static void indicarDia(Dias dia) {
		
		switch (dia) {
		case LUNES:
			System.out.println("Primer día de la semana");
			break;
		case MARTES:
			System.out.println("Segundo dia de la semana");
			break;
		case MIERCOLES:
			System.out.println("Tercer dia de la semana");
			break;
		case JUEVES:
			System.out.println("Cuarto dia de la semana");
			break;
		case VIERNES:
			System.out.println("quinto dia de la semana");
			break;
		case SABADO: 
			System.out.println("Sexto dia de la semana");
			break;
		case DOMINGO:
			System.out.println("Septimo dia de la semana");
			break;
		default:
			System.out.println("No es ningun dia de la semana");
			break;
		}
	}
}
