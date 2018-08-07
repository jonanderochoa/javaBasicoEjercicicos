package java1.ClasesAbstractas126.base;

public abstract class FiguraGeometrica {

	//Variable
	protected String tipoFigura;
	
	/*
	 * Constructor que recibe como parametro una cadena con el tipo de fugura
	 */
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	//Metodos getter y setter
	public String getTipoFigura() {
		return tipoFigura;
	}


	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	
	@Override
	public String toString() {
		return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
	}

	//METODO ABSTRACTO
	public abstract void dibujar();
}
