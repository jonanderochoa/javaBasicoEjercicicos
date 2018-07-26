package java1.ejemploenumeraciones104;

import java.util.Scanner;


public class EjemplosEnumeraciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		mostrarTodosContinentes();
		
		mostrarEnum(entrada, 1);
		
		mostrarEnum(entrada, 2);
		
		
	}
	
	/**
	 * Metodo que muestra los valores del enum en funcion del valor introducido
	 * @param entrada Scanner de entrada
	 */
	public static void mostrarEnum(Scanner entrada, int tipo) {
		
		String cadena = "";
		do {
			if(tipo == 1) {
				System.out.println("Introduce el nombre del dia: ");
			}else {
				System.out.println("Introduce el nombre del Continente: ");
			}
			
			try {
				//Recogemos el valor introducido por teclado y lo ponemos en mayuscula
				cadena = entrada.nextLine().toUpperCase();
				
				//Transformamos el String a Enum si es posible. Sino excepcion
				if(tipo == 1) {
					Dias dia = Dias.valueOf(cadena);
					indicarDia(dia);
				}else {
					Continentes continente = Continentes.valueOf(cadena);
					numeroPaises(continente);
				}				
				
			}catch(Exception e) {
				
				e.getMessage();
			}
		}while(!"fin".equalsIgnoreCase(cadena));	
	}
	
	/**
	 * Le indicamos el dia del enum y nos devuelve el numero de dia de la semana que es
	 * @param dia Enum
	 */
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
	
	/**
	 * Metodo que devuelve el numero de paises que contiene un continente al indicarle el continente
	 * @param continente Continente que pertenece a la enumeracion
	 */
	public static void numeroPaises(Continentes continente) {
		System.out.println("Número de paises: ");
		switch (continente) {
		case AMERICA:
			System.out.println(Continentes.AMERICA.getPaises());
			break;
		case EUROPA:
			System.out.println(Continentes.EUROPA.getPaises());
			break;
		case AFRICA:
			System.out.println(Continentes.AFRICA.getPaises());
			break;
		case ASIA:
			System.out.println(Continentes.ASIA.getPaises());
			break;
		case OCEANIA:
			System.out.println(Continentes.OCEANIA.getPaises());
			break;
		}
	}
	
	/**
	 * muestra el continente y sus paises
	 */
	public static void mostrarTodosContinentes() {
		
		//Contienentes.values() devuelve una lista de los continentes
		for(Continentes continente: Continentes.values()) {
			System.out.println("El continente de nombre: " + continente + " tiene " + continente.getPaises() + " paises.");
		}
		System.out.println();
	}
}
