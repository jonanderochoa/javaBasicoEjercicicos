package java1.excepciones133.manejoexcepciones1.main;
import java1.excepciones133.manejoexcepciones1.domain.*;
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Si el metodo no atrapa la excepcion no se captura mediante try/catch se ha 
		 * de lanzar mediante la clausula throws para lanzarla hacia arriba
		 */
		//Al capturar la excepcion no se para el programa
		try {
			
			Division division = new Division(10, 0);
			division.visualizarOperacion();
			
		} catch (OperationException e) {
			//Muestra la pila de errores
			e.printStackTrace();
		}
		System.out.println("El programa sigue");
		
		
		Division division2;
		try {
			
			division2 = new Division(10, 2);
			division2.visualizarOperacion();
			
		} catch (OperationException e) {	
			//Muestra la pila de errores
			e.printStackTrace();
		}
		
		
		
	}
}
