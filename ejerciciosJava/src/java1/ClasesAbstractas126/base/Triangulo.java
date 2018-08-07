package java1.ClasesAbstractas126.base;

public class Triangulo extends FiguraGeometrica {

	/*
	 * Constructor de la clase Triangulo que recoge el parametro tipoFigura para pasarselo
	 * al constructor de la clase abstracta FiguraGeometrica
	 */
	public Triangulo(String tipoFigura) {
		super(tipoFigura);
	}

	@Override
	public void dibujar() {
		//Devuelve el nombre de la clase
		System.out.println("Aqui deberia dibujar un: "+ this.getClass().getSimpleName());
	}
}
