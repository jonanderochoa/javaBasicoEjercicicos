package java1.javaBeans131.beans;

import java.io.Serializable;

/**
 * No hay que confundir Java Beans con Enterprise Java Beans (EJB).
 * 
 * Para ser un Java bean debe cumplir unas condiciones:
 * 
 * 1º Ha de implementar la interfaz Serializable.
 * 2º Todas sus propiedades han de ser private.
 * 3º Ha de tener un constructor vacio independientemente que tenga otros.
 * 4º Ha de tener los metodos setter/getter/is que necesitemos
 * 
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class PersonaBean implements Serializable {

	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = 1L;
	
	//Propiedades. En un java bean son privadas
	private String nombre;
	private int edad;
	
	/**
	 * Un bean siempre tiene que tener un constructor vacio.
	 * Otros constructores son opcionales
	 */
	public PersonaBean() {
	}
	
	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param edad
	 */
	public PersonaBean(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	//Ha de tener los setter/getter/is que necesite
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
