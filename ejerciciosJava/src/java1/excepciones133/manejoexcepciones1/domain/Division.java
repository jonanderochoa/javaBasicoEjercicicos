package java1.excepciones133.manejoexcepciones1.domain;

public class Division {

	//Propiedades
	private int numerador;
	private int denominador;
	
	/**
	 * Constructor de la clase Division
	 * @param numerador 
	 * @param denominador
	 * @throws OperationException Excepcion  que sera lanzada
	 */
	public Division(int numerador, int denominador) throws OperationException {
		
		//Si el denominador es igual a cero se lanzara la excepcion que hemos creado para ello.
		if(denominador == 0) {
			//Lanzamos una nueva excepcion de tipo OperationException con el mensaje incluido entre parentesis
			throw new OperationException("Denominador igual a cero");
		}
		//Si el denominador no es cero guarda los valores
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarOperacion() {
		System.out.println("El resultado de la division de: " + numerador + "/" + denominador + " es: " + (numerador/denominador));
	}
	
	
}
