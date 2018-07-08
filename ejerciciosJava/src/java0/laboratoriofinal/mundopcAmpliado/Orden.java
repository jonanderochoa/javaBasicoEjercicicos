package java0.laboratoriofinal.mundopcAmpliado;

public class Orden {

	private final int idOrden;
	
	private static int contadorOrdenes;
	
	private final Computadora[] computadoras;
	
	private final int maxComputadoras = 10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		
		computadoras = new Computadora[maxComputadoras];
	}
	
	public void agregaProducto(Computadora computadora) {

		for(int i = 0; i < computadoras.length; i++) {
			if(computadoras[i] == null) {
				computadoras[i] = computadora;
				break;
			}
		}
	}
	
	public void mostrarOrden() {
		System.out.println("  Orden: "+ idOrden);
		System.out.println("Computadoras: ");
		for(int i = 0; i < computadoras.length; i++) {
			if(computadoras[i] != null) {
				System.out.println(computadoras[i]);
			}
		}
	}
}
