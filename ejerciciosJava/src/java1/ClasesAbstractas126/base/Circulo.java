package java1.ClasesAbstractas126.base;

public class Circulo extends FiguraGeometrica {

	/*
	 * Constructor de la clase Circulo que recoge el parametro tipoFigura para pasarselo
	 * al constructor de la clase abstracta FiguraGeometrica
	 */
	public Circulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	@Override
	public void dibujar() {
		//Devuelve el nombre de la clase
		System.out.println("Aqui deberia dibujar un: "+ this.getClass().getSimpleName());
	}

}
