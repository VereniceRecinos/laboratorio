PARTE I - ANÁLISIS DEL PROGRAMA ORIGINAL

1. IDENTIFICACIÓN DE TAREAS REPETITIVAS


- ¿Qué partes del código pueden convertirse en métodos?

En el código original, toda la lógica del programa se encontraba dentro del método main(), incluyendo:

* Agregar estudiante.
* Mostrar lista de estudiantes.
* Calcular promedio.
* Mostrar estudiante con mayor calificación.

Éstas responsabilidades fueron separadas en métodos independientes:

* agregarEstuddiante()
* mostrarEstudiate()
* calcularPromedio()
* mostrarMayor()

Esto permite que el método main() únicamente controle el flujo del menú.


- ¿Qué bloques de código se repiten?

En el código original se repiten:

* Validaciones como isEmpty() antes de operar con listas.
* Estructuras de impresión.
* Procesos de recorrido de listas(for).


- ¿Qué responsabilidades pueden separarse?

* main(): Controla el menú y el flujo del programa.
* Métodos específicos: Ejecutan cada funcionalidad.
* Manejo de excepciones: Se encarga de validar datos ingresados por el usuario.


- ¿Por qué dividir estas tareas mejora el programa?

Porque aumenta la legibilidad, facilita el mantenimiento, hace que el programa sea más ordenado, reduce el riesgo de errores y permite trabajar en equipo más fácilmente. Además, si se necesita modificar una funcionalidad, solo se edita el método correspondiente sin afectar todo el programa.


2. VARIABLES LOCALES VS GLOBALES



- ¿Qué variables deberían declararse como globales (atributos static de la clase)?

* static List<String> estudiantes
* static List<Double> calificaciones
* static Scanner scanner


- ¿Cuáles deberían ser locales dentro de un método?

* opcion
* nombre
* calificacion
* suma
* promedio
* maxCalificacion
* estudianteMax


- ¿Por qué? (Reflexionar sobre: alcance (scope), tiempo de vida de la variable, riesgos de modificar datos globales accidentalmente)

* Alcance (Scope): 

	- Las variables globales pueden ser usadas por todos los métodos de la clase.
	- Las variables locales solo pueden utilizarse dentro del método donde fueron declaradas.

Limitar el alcance ayuda a evitar errores y hace el código más seguro.

* Tiempo de vida de la variable:

	- Variables globales: Existen durante toda la ejecución del programa.
	- Variables locales: Existen solo mientras el método se está ejecutando.

Esto reduce el consumo innecesario de memoria.

* Riesgos de modificar datos globales accidentalmente: 

Puede provocar cambios inesperados en los datos, errores difíciles de detectar y problemas en trabajo colaborativo. Por eso, solo se deben declarar como globales aquellas variables que realmente necesiten ser compartidas.
