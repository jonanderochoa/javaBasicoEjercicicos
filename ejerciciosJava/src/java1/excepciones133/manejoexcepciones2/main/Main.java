package java1.excepciones133.manejoexcepciones2.main;

import java1.excepciones133.manejoexcepciones2.datos.AccesoDatos;
import java1.excepciones133.manejoexcepciones2.datos.ImplementacionMySql;
import java1.excepciones133.manejoexcepciones2.excepciones.AccesoDatosEx;
import java1.excepciones133.manejoexcepciones2.excepciones.LecturaDatosEx;

public class Main {

	public static void main(String[] args) {
		
		//Se crea una variable de tipo AccesoDatos(Interfaz) que es implementada con ImplementacionMySql
		AccesoDatos datos = new ImplementacionMySql();
		//cambiamos el estado a simularError a true
		datos.simularError(true);
		ejecutar(datos, "listar");
		
		//Cambiamos el estado a simularError a false
		datos.simularError(true);
		System.out.println("");
		ejecutar(datos, "insertar");
	}
	
	/**
	 * Metodo que en funcion del parametro accion ejecuta un tipo de accion de la interfaz
	 * @param datos interfaz o Implementacion de la interfaz
	 * @param accion Cadena que indica la accion que quiere efectuarse de la interfaz
	 */
	public static void ejecutar(AccesoDatos datos, String accion) {
		
		if("listar".equals(accion)) {
			
			try {
				datos.listar();
			}catch(LecturaDatosEx lde) {
				System.out.println("Error de lectura: Procesa la excepcion mas especifica de lectura de datos");
			}catch(AccesoDatosEx ade) {
				System.out.println("Error Acceso datos. Procesa la excepcion mas generica de acceso a datos");
			}catch (Exception e) {
				System.out.println("Error general");
			}finally {
				System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
			}
		
		}else if("insertar".equals(accion)) {
			
			try {
				datos.insertar();
			}catch (AccesoDatosEx ade) {
				System.out.println("Error acceso datos: Podemos procesar solo la excepcion mas generica");
			}finally {
				System.out.println("Procesar finally es opcional, siemptre se ejecutara sin importar si hubo error o no");
			}
			
		}else {
			
			System.out.println("No se proporciono ninguna accion conocida");
			
		}
	}
}
