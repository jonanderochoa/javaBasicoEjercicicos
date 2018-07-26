package java1.polimorfismo117;

public class Main {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado("Jon " , "16080781-D");
		Gerente ge = new Gerente("Laura", "1111111-q", 3);
		
		//Podemos pasar como parametro del metodo tanto un atributo Empleado como Gerente
		mostrarEmpleado(emp);
		mostrarEmpleado(ge);
	}
	
	/**
	 * Metodo que prueba el polimorfismo. Ejecutara empleado.toString del tipo que se introduzca
	 * @param empleado
	 */
	public static void mostrarEmpleado(Empleado empleado) {
		System.out.println(empleado.toString());
		
	}
	
	
}
