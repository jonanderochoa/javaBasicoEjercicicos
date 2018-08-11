package java1.manejoarchivos151.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {

	public static void main(String[] args) {
		
		
		File archivo = new File("C:\\Users\\jonan\\git\\javaBasicoEjercicios\\ejerciciosJava\\src\\java1\\manejoarchivos151\\log.txt");

		try {
			/*
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
