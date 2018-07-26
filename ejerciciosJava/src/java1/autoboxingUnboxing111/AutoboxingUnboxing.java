package java1.autoboxingUnboxing111;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		//Autoboxing de tipos primitivos a objetos
		Integer enteroObj = 10;
		Float flotanteObj = 15.4F;
		Double doubleObj = 40.2;
		
		System.out.println("Autoboxing");
		System.out.println("Entero Objeto: " + enteroObj.intValue() );
		System.out.println("Flotante Objeto: " + flotanteObj.floatValue() );
		System.out.println("Double Objeto: " + doubleObj.doubleValue() );
		
		//Unboxing de tipo Objeto a primitivos (LO HACE DE FORMA AUTOMATICA)
		int entero = enteroObj;
		float flotante = flotanteObj;
		double doble = doubleObj;
		
		System.out.println("Unboxing");
		System.out.println("Entero: " + entero );
		System.out.println("Flotante: " + flotante );
		System.out.println("Double: " + doble );

	}
}
