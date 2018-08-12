package java1.proyectofinal153;

import java.util.Scanner;

import java1.proyectofinal153.peliculas.excepciones.CatalogoPeliculas;

/**
 * Contiene el menu que permite al usuario seleccionar la accion que desea
 * ejecutar
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Main {
	
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static String nombreArchivo = "C:\\Users\\jonan\\git\\javaBasicoEjercicios\\ejerciciosJava\\src\\java1\\proyectofinal153\\peliculas.txt";
	
	public static void main(String[] args) {
		
		//Inicializamos la variable en 0. Si no se introduce nada se sale del programa
		int opcion = 0;
		do {
			//Se muestra el menú de seleccion
			mostrarOpciones();
			//Se recoge la seleccion
			opcion = entrada.nextInt();
			//Se pasa el valor introducido al metodo accion
			accion(opcion);
		}while(opcion != 0);
		
		
	}
	
	public static void accion(int opcion) {
		
		CatalogoPeliculas catalogoPeliculas = null;
		
		switch (opcion) {
		case 1:
			catalogoPeliculas.iniciarArchivo(nombreArchivo);
			break;
		case 2:
			System.out.println();
			System.out.println("Introduce la película que desea agregar: ");
			String nombrePelicula = entrada.nextLine();
			catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
			break;
		case 3:
			catalogoPeliculas.listarPeliculas(nombreArchivo);
			break;
		case 4:
			System.out.println();
			System.out.println("Introduce la película que quieres buscar: ");
			String buscar = entrada.nextLine();
			catalogoPeliculas.buscarPelicula(nombreArchivo, buscar);
			break;
		case 0:
			//No hacemos nada
			break;
		default:
			System.out.println("No es una acción válida");
			break;
		}
	}
	
	public static void mostrarOpciones() {
		System.out.println();
		System.out.println("Elige opción: ");
		System.out.println("1.- Iniciar catalogo peliculas");
		System.out.println("2.- Agregar película");
		System.out.println("3.- Listar películas");
		System.out.println("4.- Buscar película");
		System.out.println("0.- Salir");
		System.out.println();
	}
}
