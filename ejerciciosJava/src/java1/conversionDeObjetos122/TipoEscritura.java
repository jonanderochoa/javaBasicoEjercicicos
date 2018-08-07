package java1.conversionDeObjetos122;

public enum TipoEscritura {

	CLASICO("Escritura a Mano"),
	MODERNO("Escritura digital");
	
	private final String descripcion;
	
	private TipoEscritura(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescription() {
		return descripcion;
	}
}
