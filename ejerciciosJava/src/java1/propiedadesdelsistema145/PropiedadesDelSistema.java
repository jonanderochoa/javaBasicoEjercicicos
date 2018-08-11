package java1.propiedadesdelsistema145;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesDelSistema {

	public static void main(String[] args) {
		
		//Nos devuelve las propiedades del sistema en el cual estamos trabajando
		Properties propiedades = System.getProperties();
		
		//Enumeracion de los nombre de propiedades
		Enumeration nombrePropiedades = propiedades.propertyNames();
		
		//Mientras existan mas elementos...
		while(nombrePropiedades.hasMoreElements()) {
			//Recogemos el nombre de la propiedad
			String nombrePropiedad = (String) nombrePropiedades.nextElement();
			//Recogemos el valor asociado a esa propiedad
			String valorPropiedad = propiedades.getProperty(nombrePropiedad);
			
			System.out.println("Llave: " + nombrePropiedad + " = " + valorPropiedad);
		}
	}
}
