package java1.ClaseObject124;

public class ClaseObject {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Juan", 10000);
		Empleado emp2 = new Empleado("Juan", 10000);
		Empleado emp3 = new Empleado("Pepe", 30000);
		
		//Comparamos el mismo objeto con la misma referencia
		compararObjetos(emp1, emp1);
		//Comparamos dos objetos iguales pero no el mismo (diferente ref)
		compararObjetos(emp1, emp2);
		//Comparamos 2 objetos diferentes
		compararObjetos(emp2, emp3);
		

	}
	public static void compararObjetos(Empleado empleado1, Empleado empleado2) {
		//Hacemos uso de toString para ver el contenido del objeto
		System.out.println("Contenido del empleado 1: " + empleado1);
		//Hacemos uso de toString para ver el contenido del objeto 2
		System.out.println("Contenido del empleado 1: " + empleado2);
		System.out.println();
		//COMPROBAMOS SI LA DIRECCION DE MEMORIA ES LA MISMA (REF)
		//Comprobamos si la referencia a memoria es la misma
		if(empleado1 == empleado2) {
			System.out.println("Los objetos tienen la misma direccion de memoria");
		}else {
			System.out.println("Los objetos tienen diferentes direcciones de memoria");
		}
		System.out.println();
		//COMPROBAMOS MEDIANTE EQUALS
		if(empleado1.equals(empleado2)) {
			System.out.println("Los objetos tienen el mismo contenido");
		}else {
			System.out.println("Los objetoso no tienen el mismo contenido");
		}
		System.out.println();
		//COMPROBAMOS MEDIANTE HASHCODE
		if(empleado1.hashCode() == empleado2.hashCode()) {
			System.out.println("Los objetos tienen el mismo codigo hash");
		}else {
			System.out.println("Los objetos NO tienen el mismo codigo hash");
		}
		
	}

}
