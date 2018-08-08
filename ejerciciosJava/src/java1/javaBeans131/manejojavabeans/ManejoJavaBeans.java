package java1.javaBeans131.manejojavabeans;

import java1.javaBeans131.beans.PersonaBean;

/**
 * En esta clase haremos uso del java bean
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class ManejoJavaBeans {

	public static void main(String[] args) {
		PersonaBean bean = new PersonaBean();
		bean.setNombre("Jon");
		bean.setEdad(33);
		
		System.out.println("Nombre: " + bean.getNombre());
		System.out.println("Edad: "+ bean.getEdad());
	}
}
