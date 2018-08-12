package java1.proyectofinal153.peliculas.negocio;

public class AccesoDatosEx extends Exception  {

	String mensaje;
	
	public AccesoDatosEx(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}
}
