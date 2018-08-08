package java1.excepciones133.manejoexcepciones1.main;
import java1.excepciones133.manejoexcepciones1.domain.*;
public class Main {

	public static void main(String[] args) {
		
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
