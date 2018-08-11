package java1.generics142.ejercicio1;

//Definimos la clase generica con el operador diamante <>
public class ClaseGenerica<T> {

	//Definimos una variable de tipo generico
	T objeto;
	
	//Constructor que inicializa el tipo a usar
	public ClaseGenerica(T objeto) {
		this.objeto = objeto;
	}
	
	public void obtenerTipo() {
		//Cual es su clase y el nombre de esta
		System.out.println("El tipo T es: " + objeto.getClass().getName());
	}
}
