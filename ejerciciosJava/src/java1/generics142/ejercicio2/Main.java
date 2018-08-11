package java1.generics142.ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//Creamos una instancia de la clase ArrayList que implementa la interfaz List
		List<String> miLista = new ArrayList<>();
		miLista.add("1");
		miLista.add("2");
		miLista.add("3");
		miLista.add("4");
		miLista.add("4");
		imprimir(miLista);
		
		//Valores duplicados no se muestran (300)
		Set<String> miSet = new HashSet<>();
		miSet.add("100");
		miSet.add("200");
		miSet.add("300");
		miSet.add("300");
		imprimir(miSet);
		
		Map<String, String> miMapa = new HashMap<>();
		miMapa.put("1", "Jon");
		miMapa.put("2", "Thor");
		miMapa.put("3", "pepe");
		miMapa.put("4", "Laura");
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
	}
	
	public static void imprimir(Collection<String> coleccion) {
		
		for(String elemento: coleccion) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}

}
