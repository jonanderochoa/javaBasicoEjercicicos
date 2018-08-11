package java1.generics142.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		//INTEGER
		//Creamos una instancia de la ClaseGenerica para Integer
		ClaseGenerica<Integer> cgInt = new ClaseGenerica<Integer>(15);
		
		//Obtenemos el tipo
		cgInt.obtenerTipo();
		
		//STRING
		/*
		 * Creamos una instancia de la ClaseGenerica para String
		 * Podemos no indicar el tipo de la clase Generica en la parte derecha ya que lo contiene 
		 * la parte izquierda. Como se indica al momento de declarar la variable no es necesario 
		 * al momento de instanciarla ya que se guarda en la variable declarada como tipo String.
		 * A esto se denomina INFERENCIA
		 */
		ClaseGenerica<String> cgString = new ClaseGenerica<>("Esto es un String");
		
		//Obtenemos el tipo
		cgString.obtenerTipo();
		
		/*
		 * Los genericos no pueden ser aplicados a tipos primitivos ya que provocarian un error de compilacion.
		 * ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int>(88); MAAAAL
		 */
	}

}
