package java1.interfaces128.manejointerfaces;

import java1.interfaces128.datos.AccesoDatos;
import java1.interfaces128.datos.ImplementacionMySql;
import java1.interfaces128.datos.ImplementacionOracle;

public class ManejoInterfaces {

	public static void main(String[] args) {
		
		//Creamos una variable de tipo AccesoDatos que almacene la interfaz
		AccesoDatos datos = new ImplementacionOracle();
		ejecutar(datos, "listar");
		
		//Reescribimos la variable datos con la interfaz
		datos = new ImplementacionMySql();
		ejecutar(datos, "insertar");

	}
	
	/**
	 * Metodo encargado de ejecutar la accion de la interfaz
	 * @param datos 
	 * @param accion
	 */
	public static void ejecutar(AccesoDatos datos, String accion) {
		if("listar".equals(accion)) {
			datos.listar();
		}else if("insertar".equals(accion)) {
			datos.insertar();
		}
	}

}
