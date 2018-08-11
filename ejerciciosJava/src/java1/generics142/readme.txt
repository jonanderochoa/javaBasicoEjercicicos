Se usa el operador diamante <>
Cada Tipo Generico tiene su significado
	E	Element		Se utiliza por el framework de collecciones Java
	K	Key			Llave utilizada en mapas
	N	Number		Utilizado para numeros
	T	Type		Representa un tipo, una clase
	V	Value		Representa un valor, tambien se usa en mapas
	
Existen mas:
	S, U, V, etc
	
	
Para que sirve esto?
Si creamos una coleccion de elementos sin indicarle el tipo de la coleccion, cualquier elemento
que añadamos (sea del tipo que sea) se almacena como Object. Esto tiene un problema si queremos
queremos convertir los tipo Object a un tipo determinado. 

Por ejemplo, si queremos convertir los Object a enteros haciendo un casting, todos los Object 
se pasan a enteros, pero si alguno de estos Object no es entero dara un error.

Para evitar esto, se usan los genericos.

#Sin Generics
//Lista que acepta cualquier tipo de valor y lo convierte a tipo Object
List lista = new ArrayList();
//Se añade un Integer de valor 100
lista.add(new Integer(100));
//Como no se indica el tipo de la lista hay que hacer un casting de Object a Integer
Integer i = (Integer)lista.get(0);

#Con Generics
//Lista que unicamente acepta valores de tipo Integer
List<Integer> lista = new ArrayList<Integer>();
//Se añade un Integer de valor 100
lista.add(new Integer(100));
//Como la lista es de Integers no hay que hacer el casting
Integer i = lista.get(0);

Los tipos genericos no pueden ser aplicados a tipos primitivos. Provocaria un error de compilacion.
