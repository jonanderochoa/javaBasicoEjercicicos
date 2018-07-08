package java0.laboratoriofinal.mundopcAmpliado;

public class Principal {

	public static void main(String[] args) {
		
		Raton r1 = new Raton("USB", "Logitech");
		Raton r2 = new Raton("USB", "Genius");
		
		Teclado t1 = new Teclado("USB", "newSkills");
		Teclado t2 = new Teclado("PS2", "Corsair");
		
		Monitor m1 = new Monitor("ASUS", 22.00);
		Monitor m2 = new Monitor("SAMSUNG", 26.00);
		
		Computadora c1 = new Computadora("MSI", m1, t1, r1);
		Computadora c2 = new Computadora("HP", m2, t2, r2);
		
		Orden orden1 = new Orden();
		orden1.agregaProducto(c1);
		orden1.agregaProducto(c2);
		
		System.out.println("");
		orden1.mostrarOrden();
		
		c1.pruebaVar(12, 13, 11, 14, 23, 132, 23, 45);
	}
}
