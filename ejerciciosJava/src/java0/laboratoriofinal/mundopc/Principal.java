package java0.laboratoriofinal.mundopc;

public class Principal {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Teclado gaming", 99.99);
		Producto producto2 = new Producto("Raton logitech",  45.50);
		Producto producto3 = new Producto("Portatil toshiba",  989.90);
		Producto producto4 = new Producto("televisor samsung",  340.25);
		
		System.out.println(producto1);
		System.out.println(producto2);
		System.out.println(producto3);
		System.out.println(producto4);
		
		
		Orden orden1 = new Orden();
		orden1.agregaProducto(producto1);
		orden1.agregaProducto(producto2);
		orden1.agregaProducto(producto3);
		orden1.agregaProducto(producto4);
		
		System.out.println("");
		orden1.mostrarOrden();
		
		
		//Creamos una segunda orden
		Orden orden2 =new Orden();
		//Creamos nuevos productos
		Producto producto5 =new Producto("Blusa", 90);
		//Agregamos productos a la orden 2
		orden2.agregaProducto(producto1);
		orden2.agregaProducto(producto4);
		orden2.agregaProducto(producto5);
		orden2.agregaProducto(producto3);
		//Imprimimos la orden 2
		System.out.println("");
		orden2.mostrarOrden();
	}
}
