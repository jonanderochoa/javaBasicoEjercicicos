package java1.manejoarchivos151.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivo {

	public static void main(String[] args) {
		
		File archivo = new File("C:\\Users\\jonan\\git\\javaBasicoEjercicios\\ejerciciosJava\\src\\java1\\manejoarchivos151\\log.txt");
		
		try {
			/*
			 * Se prepara la escritura del fichero
			 * Al ser true se añade a los datos que ya existen. Si fuera false sesobreescribe
			 */
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			//Se escribe en el archivo
			String contenido = "Anexando informacion al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de anexar");
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se ha introducido la informacion correctamente");
	}

}
