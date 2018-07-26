package java1.ejemploenumeraciones104;

public enum Continentes {
	AMERICA(34),
	EUROPA(46),
	AFRICA(53),
	ASIA(44),
	OCEANIA(14);

	//Atributo de la clase enum
	private final int paises;
	
	/**
	 * Constructor de cada elemento del enum
	 * @param paises Numero de paises del continente
	 */
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return paises;
	}
	
}

