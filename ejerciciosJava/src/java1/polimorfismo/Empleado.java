package java1.polimorfismo;

public class Empleado {

	protected String nombre;
	
	protected String dni;
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Empleado [ nombre: "+ nombre + " DNI: " + dni + " ]";
	}
}
