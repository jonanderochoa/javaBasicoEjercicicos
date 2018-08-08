package java1.excepciones133.manejoexcepciones1.domain;

/*
 * Vamos a crear nuestra propia excepcion.
 * Clase que hereda de la clase Exception
 */
public class OperationException extends Exception {

	private static final long serialVersionUID = 1L;

	public OperationException(String mensaje) {
		//Inicializamos el mensajede error de la clasepadre
		super(mensaje);
	}
}
