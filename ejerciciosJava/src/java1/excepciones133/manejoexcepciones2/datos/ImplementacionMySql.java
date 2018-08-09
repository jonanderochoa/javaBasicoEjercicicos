package java1.excepciones133.manejoexcepciones2.datos;

import java1.excepciones133.manejoexcepciones2.excepciones.AccesoDatosEx;
import java1.excepciones133.manejoexcepciones2.excepciones.EscrituraDatosEx;
import java1.excepciones133.manejoexcepciones2.excepciones.LecturaDatosEx;

/**
 * Clase que implementa los metodos de la interfaz AccesoDatos
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class ImplementacionMySql implements AccesoDatos{

	//Propiedad
	private boolean simularError;
	
	@Override
	public void insertar() throws AccesoDatosEx {
		if(simularError) {
			//Lanza la excepcion EscrituraDatosEx
			throw new EscrituraDatosEx("Error de escritura de datos");
		}else {
			System.out.println("Insertar desde MySql");
		}
		
	}

	@Override
	public void listar() throws AccesoDatosEx {
		
		if(simularError) {
			//Lanza la excepcion EscrituraDatosEx
			throw new LecturaDatosEx("Error de lectura de datos");
		}else {
			System.out.println("Listar desde MySql");
		}
	}

	@Override
	public void simularError(boolean simularError) {
		this.simularError = simularError;
	}
	
	public boolean isSimularError() {
		return simularError;
	}

}
