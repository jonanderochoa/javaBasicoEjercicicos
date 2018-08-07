package java1.interfaces128.datos;

public interface AccesoDatos {

	//Constante. Solo se pueden tener un maximo de 10 registros
	public static int MAX_REGISTROS = 10;
	
	public abstract void insertar();
	
	public abstract void listar();
}
