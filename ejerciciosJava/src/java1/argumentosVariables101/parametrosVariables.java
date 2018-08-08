package java1.argumentosVariables101;

public class parametrosVariables {

	public static void main(String[] args) {

		System.out.println( suma(2, 4, 6, 8, 10) );
		
		imprimirNumeros("IMPARES", true, 3, 5, 7, 11);
		
	}

	/**
	 * Metodo que recibe un numero variable de parametros y devuelve su suma
	 * @param numeros numero variable de parámetros
	 * @return total
	 */
	public static int suma(int... numeros) {
		
		int total = 0;
		
		for(int numero: numeros) {
			total += numero;
		}
		
		return total;
	}
	
	
	/**
	 * Metodo que recibe un numero variable de parametros y los muestra.
	 * El parametro variable ha de ser SIEMPRE el ultimo de los parametros de un metodo
	 * @param nombre
	 * @param valido
	 * @param numeros numero variable de parámetros
	 * @return total
	 */
	public static void imprimirNumeros(String nombre, boolean valido, int... numeros) {
		
		System.out.println("Tipo de números: " + nombre);
		
		System.out.println("Valores validos? " + valido);
		
		for(int numero: numeros) {
			System.out.println("El número es: " + numero);
		}
	}
}
