package java1.excepciones133.manejoexcepciones2.datos;

import java1.excepciones133.manejoexcepciones2.excepciones.AccesoDatosEx;

/**
 * Interfaz con los metodos que seran implementados por diferentes clases
 * @author Jon Ander Ochoa Ruiz
 *
 */
public interface AccesoDatos {

	//Creamos los metodos abstractos de insertar y de listar que pueden lanzar 
	//excepciones de tipo AccesoDatosEx e hijas de la misma
	public abstract void insertar() throws AccesoDatosEx;
	
	public abstract void listar() throws AccesoDatosEx;
	
	/**
	 * Permite cambiar el estado de la variable simularError
	 * @param simularError
	 */
	public abstract void simularError(boolean simularError);
}
