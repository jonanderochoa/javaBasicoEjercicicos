package java0.laboratoriofinal.mundopc;

public class Producto {

	private int idProducto;
	
	private String nombre;
	
	private double precio;
	
	private static int contadorProducto;
	
	/**
	 * CONSTRUCTOR
	 * Asigna un id al producto incrementando la variable statica
	 */
	private Producto() {
		//Incrementa el valor de la variable static antes de asignarle el valor
		this.idProducto = ++contadorProducto;
	}
	
	/**
	 * CONSTRUCTOR
	 * Este constructor implicitamente llamara al constructor privado Producto()
	 * @param nombre Introduce el nombre del producto
	 * @param precio Introduce el precio del producto
	 */
	public Producto(String nombre, double precio) {
		//Llamamos al constructor privado para que al crear un producto se le asigne un id
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
