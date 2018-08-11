package java1.manejoarchivos151.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

	public static void main(String[] args) {

		//Creamos una instancia del archivo que queremos usar
		File archivo = new File("C:\\Users\\jonan\\git\\javaBasicoEjercicios\\ejerciciosJava\\src\\java1\\manejoarchivos151\\log.txt");
		
		try {
			//Creamos el archivo
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
		System.out.println("El archivo se ha creado correctamente");
	}

}
