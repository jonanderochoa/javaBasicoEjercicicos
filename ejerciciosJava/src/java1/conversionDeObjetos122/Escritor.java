package java1.conversionDeObjetos122;

public class Escritor extends Empleado {

	final TipoEscritura tipoEscritura;

	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	}

	/**
	 * Devolvemos el tipo de escritura seleccionado
	 * @return
	 */
	public TipoEscritura getTipoEscritura() {
		return tipoEscritura;
	}

	/**
	 * Devolvemos la descripcion del tipo de escritura
	 * @return
	 */
	public String getTipoDeEscrituraEnTexto() {
		return tipoEscritura.getDescription();
	}
	
	@Override
	public String toString() {
		return "Escritor [tipoEscritura=" + tipoEscritura + ", toString()=" + super.toString() + "]";
	}
}
