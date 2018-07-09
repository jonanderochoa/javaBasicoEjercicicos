package java1.polimorfismo;

public class Gerente extends Empleado {

	private int empleadosACargo;
	
	public Gerente(String nombre, String dni, int empleadosACargo) {
		super(nombre, dni);
		this.empleadosACargo = empleadosACargo;
	}

	public int getEmpleadosACargo() {
		return empleadosACargo;
	}

	public void setEmpleadosACargo(int empleadosACargo) {
		this.empleadosACargo = empleadosACargo;
	}
	
	@Override
	public String toString() {
		return "Gerente[ " + super.toString() + " empleados a cargo: " + empleadosACargo + " ]";
	}

}
