package java1.ClasesAbstractas126.Principal;
import java1.ClasesAbstractas126.base.Rectangulo;
import java1.ClasesAbstractas126.base.Triangulo;
import java1.ClasesAbstractas126.base.FiguraGeometrica;
import java1.ClasesAbstractas126.base.Circulo;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {
		
		//Creacion de objetos hijo de la clase abstracta FiguraGeometrica
		FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
		FiguraGeometrica triangulo = new Triangulo("Triangulo");
		FiguraGeometrica circulo = new Circulo("Circulo");
		
		//Imprime los datos del metodo toString de FiguraGeometrica
		System.out.println(rectangulo);
		//Ejecuta el metodo que indica la clase
		rectangulo.dibujar();
		
		System.out.println("");
		//Imprime los datos del metodo toString de FiguraGeometrica
		System.out.println(triangulo);
		//Ejecuta el metodo que indica la clase
		triangulo.dibujar();
		
		System.out.println("");
		//Imprime los datos del metodo toString de FiguraGeometrica
		System.out.println(circulo);
		//Ejecuta el metodo que indica la clase
		circulo.dibujar();

	}

}
