Se realiza a traves de fujos de entrada y salida estandar

System.in	 	Entrada estandar y es de tipo Input String (Por ejemplo leer datos de teclado)
System.out 		Salida standar y es de tipo Print String (por ejemplo mostrar datos por consola)
System.err		Escribe a la salida estandar de errores es de tipo Print String (muestra datos de error por pantalla)


API DE ENTRADA EN JAVA
----------------------

Dos tipos:
-Tipo char ->	Reader
-Tipo byte ->	InputStream


API DE SALIDA EN JAVA
---------------------

Dos tipos:
-Tipo char ->	Writer
-Tipo byte ->	OutputStream



DIFERENCIAS ENTRE FLUJOS BYTE Y CHAR
------------------------------------
Depende del tipo de dato con el que estamos trabajando.
Los flujos(streams) se usan para procesar un byte cada vez.
Los flujos de tipo bytes se usan para: archivos binarios (word, excel, pdf, o cualquier formato mas complejo que un archivo de texto)
Los flujos de tipo char se usan para: Para procesar un carater cada vez. recomendadas para textos con juegos de caracteres de tipo ASCI, ...

Los Buffers sirven para procesar mas de un caracter o byte a la vez

La clase escanner se creo para simplificar la lectura


