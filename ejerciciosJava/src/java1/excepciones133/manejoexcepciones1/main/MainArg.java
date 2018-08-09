package java1.excepciones133.manejoexcepciones1.main;

import java1.excepciones133.manejoexcepciones1.domain.Division;
import java1.excepciones133.manejoexcepciones1.domain.OperationException;

public class MainArg {

	//Le pasamos al metodo main un arreglo de String
	public static void main(String args[]) {
		
		//Asignamos a variables los valores del arreglo de String
		int op1 = Integer.parseInt(args[0]);
		int op2 = Integer.parseInt(args[1]);
		
		/*
		 * Controlaremos varias excepciones:
		 * Que el array este fuera de rango
		 * Que el numero no tenga el formato correcto
		 * Que el denominador sea 0
		 * Excepcion general
		 */
		try {
			
			Division div = new Division(op1, op2);
			div.visualizarOperacion();
			
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
			aie.getStackTrace();
		}catch(NumberFormatException ne) {
			System.out.println(ne.getMessage());
			ne.getStackTrace();
		}catch (OperationException oe) {
			System.out.println(oe.getMessage());
			oe.getStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}finally {
			System.out.println("Excepciones revisadas");
		}
	}
}
