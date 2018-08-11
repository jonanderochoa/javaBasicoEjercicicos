package java1.manejoarchivos151.ejercicio2;

public class ManejoArchivos {

	//Nota:El archivo sobre el que se trabajara debe de existir y en caso necesario se
	//deberan asignar los permisos necesarios
	private static final String NOMBRE_ARCHIVO = "C:\\Users\\jonan\\git\\javaBasicoEjercicios\\ejerciciosJava\\src\\java1\\manejoarchivos151\\log.txt";
			
	public static void main(String[] args) {
		
		//Creamos un archivo
		Archivos.crearArchivo(NOMBRE_ARCHIVO);
		
		//Escribir a un archivo
		Archivos.escribirArchivo(NOMBRE_ARCHIVO);
		
		//Leer de un archivo
		Archivos.leerArchivo(NOMBRE_ARCHIVO);
		
		//Anexar
		Archivos.anexarArchivo(NOMBRE_ARCHIVO);

		//Leer de nuevo
		Archivos.leerArchivo(NOMBRE_ARCHIVO);
	}

}
