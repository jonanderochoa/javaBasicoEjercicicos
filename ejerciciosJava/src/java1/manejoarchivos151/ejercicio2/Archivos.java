package java1.manejoarchivos151.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {

	public static void crearArchivo(String nombreArchivo) {
		//Crearemos un nuevo objeto de tipo File
		File archivo = new File(nombreArchivo);
		
		try {
			//Accede al archivo
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("El archivo se ha creado correctamente\n");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void escribirArchivo(String nombreArchivo) {
		
		File archivo = new File(nombreArchivo);
		
		try {
			//Accede al archivo pero en este caso ademas añadimos datos al log
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			//Se escribe en el archivo
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de escritura");
			salida.close();
			System.out.println("Se ha escrito correctamente al archivo\n");
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void anexarArchivo(String nombreArchivo) {
		
		File archivo = new File(nombreArchivo);
		
		try {
			
			/*
			 * Accede al archivo y añade datos sin sobreescribir
			 * Se prepara la escritura del fichero
			 * Al ser true se añade a los datos que ya existen. Si fuera false se sobreescribe
			 */
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); 
			//Se escribe en el archivo
			String contenido = "Anexando informacion al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de anexar");
			salida.close();
			System.out.println("Se ha anexado la informacion correctamente\n");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void leerArchivo(String nombreArchivo) {
		
		File archivo = new File(nombreArchivo);

		try {
			
			/*
			 * Accede al archivo leyendo el contenido del archivo
			 * Creamos un buffer de lectura
			 * La clase FileReader se usa para leer caracteres
			 * La clase bufferReader se usa para leer lineas completas
			 */
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			
			while(lectura != null) {
				System.out.println("Lectura: " + lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
			
		}catch(FileNotFoundException f) {
			
			f.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}
