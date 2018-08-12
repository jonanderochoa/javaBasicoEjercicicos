package java1.proyectofinal153.peliculas.excepciones;

public interface CatalogoPeliculas {

	public void agregarPelicula(String nombrePelicula,String nombreArchivo);
	
	public void listarPeliculas(String nombreArchivo);
	
	public void buscarPelicula(String nombreArchivo, String buscar);
	
	public void iniciarArchivo(String nombreArchivo);
}
