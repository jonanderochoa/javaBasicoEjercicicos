package java1.manejoColecciones141;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {

	public static void main(String[] args) {
		
		//En todas las colecciones, si no indicamos el tipo de valor o clave, por defecto es de tipo Object
		//Por jemplo, Cada elemento de la lista es un elemento de tipo object
		
		//LISTA --> List es una interface que la implementa ArrayList
		List miLista = new ArrayList();
		miLista.add("1");
		miLista.add("2");
		miLista.add("3");
		miLista.add("4");
		//Elemento repetido
		miLista.add("4");
		imprimir(miLista);
		
		//SET --> Set es una interface que la implementa HashSet
		//HashSet no permite elementos duplicados
		Set miSet = new HashSet();
		miSet.add("100");
		miSet.add("200");
		miSet.add("300");
		//No permite elementos repetidos, lo ignora
		miSet.add("300");
		imprimir(miSet);
		
		//MAPA --> Map es una interface que la implementa HashMap
		Map miMapa = new HashMap();
		miMapa.put("1", "Juan");
		miMapa.put("2", "Carlos");
		miMapa.put("3", "Rosario");
		miMapa.put("4", "Esperanza");
		//Se imprimen todas las llaves
		imprimir(miMapa.keySet());
		//Se imprimen todos los valores
		imprimir(miMapa.values());
	}
	
	public static void imprimir(Collection coleccion) {
		//Como no hemos indicado el tipo, son de tipo Object por defecto
		for(Object elemento: coleccion) {
			System.out.println(elemento + " ");
		}
		System.out.println("");
	}
}
