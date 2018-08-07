package java1.conversionDeObjetos122;

public class EjemploConversionObjetos {

	public static void main(String[] args) {
		
		Empleado empleado;
		//UPCASTING -> ASIGNAMOS UNA VARIABLE DE MENOR JERARQUIA A UNA DE MAYOR
		//El problema es que de esta forma no podemos usar los metodos propios de
		//la clase Escritor ya que la variable es de tipo empleado.
		empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);
		imprimirDetalles(empleado);
		
		empleado = new Gerente("Laura", 18000, "Sistemas");
		imprimirDetalles(empleado);
		
		

	}
	
	//A este metodo le pasamos la variable de mayor jerarquia. Se encarga de ver su tipo
	//y mostrar el resultado en funcion del mismo
	private static void imprimirDetalles(Empleado empleado) {
		
		String resultado = null;
		
		System.out.println("\nDetalle:" + empleado.toString());
		
		//Si la variable empleado es de tipo escritor
		if(empleado instanceof Escritor) {
			//DOWNCASTING para poder usar los metodos de escritor
			Escritor escritor = (Escritor) empleado;
			resultado = escritor.getTipoDeEscrituraEnTexto();
			resultado = ((Escritor) empleado).tipoEscritura.getDescription();
			System.out.println("resultado departamento: "+ resultado);
			
		}else if(empleado instanceof Gerente) {
			//DOWNCASTING para usar el metodo getDepartamente de gerente
			resultado = ((Gerente) empleado).getDepartamento();
			System.out.println("resultado departamento: "+ resultado);
		}
	}

}
