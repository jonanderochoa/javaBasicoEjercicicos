package java0.laboratoriofinal.mundopc;

public class Orden {

	private final int idOrden;
	
	private static int contadorOrdenes;
	
	private final Producto[] productos;
	
	private final int maxProductos = 10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		
		productos = new Producto[maxProductos];
	}
	
	public boolean agregaProducto(Producto producto) {
		boolean bandera = false;
		//Recorro el array buscando el valor que sea null(Ya que es un array de objetos)
		//En ese indice introduzco
		for(int i = 0; i < productos.length; i++) {
			if(productos[i] == null) {
				productos[i] = producto;
				bandera = true;
				break;
			}
		}
		return bandera;
	}
	
	public double calcularTotal() {
		double total = 0.0;
		
		//Hacemos un bucle de todo el array y los sumamos
		for(int i = 0; i < productos.length; i++) {
			if(productos[i] != null) {
				total += productos[i].getPrecio();
			}
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("  Orden: "+ idOrden);
		System.out.println("Productos: ");
		for(int i = 0; i < productos.length; i++) {
			if(productos[i] != null) {
				System.out.println(productos[i]);
			}
		}
		System.out.println("Precio total: "+ calcularTotal());
	}
}
