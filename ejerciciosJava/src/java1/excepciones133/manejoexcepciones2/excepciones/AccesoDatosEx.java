package java1.excepciones133.manejoexcepciones2.excepciones;

/**
 * Vamos a crear varias clases que controlen excepciones. 
 * AccesoDatosEx hereda directamente de la clase Exception mientras que
 * EscrituraDatosEx y LecturaDatosEx son hijas de esta clase
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class AccesoDatosEx extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AccesoDatosEx(String mensaje) {
		super(mensaje);
	}

}
