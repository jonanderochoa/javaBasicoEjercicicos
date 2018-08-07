package java1.ClaseObject124;

public class Empleado {
	
	private String nombre;
	
	private double sueldo;

	public Empleado(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	//Calcula el valor entero unico.
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 1;
		hash = prime * hash + ((nombre == null) ? 0 : nombre.hashCode());
		hash = prime * hash + Double.valueOf(this.sueldo).hashCode();
		return hash;
	}

	//Compara que sean iguales
	@Override
	public boolean equals(Object obj) {
		
		boolean valor = false;
		
		//Si el obj no es nulo
		if(obj != null) {	
			//Si el obj es de tipo Empleado
			if(obj instanceof Empleado) {
				//Hacemos un downcasting
				Empleado emp = (Empleado) obj;
				//Comparamos que sus valores sean iguales
				if(nombre.equals(emp.getNombre()) && Double.valueOf(sueldo).equals(emp.sueldo)){
					valor = true;
				}
			}
		}
		return valor;
	}
	
}
