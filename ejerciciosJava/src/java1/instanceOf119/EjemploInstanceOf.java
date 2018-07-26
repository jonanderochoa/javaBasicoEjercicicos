package java1.instanceOf119;

public class EjemploInstanceOf {

	public static void main(String[] args) {
		FiguraGeometrica figura;
		
		figura = new Elipse();
		
		System.out.println("Determina el tipo: ");
		determinaTipo(figura);
		
		System.out.println();
		System.out.println("Determina todos los tipos: ");
		determinaTodosTipos(figura);
		
	}
	
	public static void determinaTodosTipos(FiguraGeometrica figura) {
		if(figura instanceof Elipse) {
			System.out.println("Es una elipse");
		}if(figura instanceof Circulo) {
			System.out.println("Es una circulo");
		}if(figura instanceof Rectangulo) {
			System.out.println("Es una rectangulo");
		}if (figura instanceof Triangulo) {
			System.out.println("Es un triangulo");
		}if(figura instanceof FiguraGeometrica) {
			System.out.println("Es una Figura geometrica");
		}
	}
	public static void determinaTipo(FiguraGeometrica figura) {
		if(figura instanceof Elipse) {
			System.out.println("Es una elipse");
		}else if(figura instanceof Circulo) {
			System.out.println("Es una circulo");
		}else if(figura instanceof Rectangulo) {
			System.out.println("Es una rectangulo");
		}else if(figura instanceof Triangulo) {
			System.out.println("Es un triangulo");
		}else if(figura instanceof FiguraGeometrica) {
			System.out.println("Es una Figura geometrica");
		}
	}
}
