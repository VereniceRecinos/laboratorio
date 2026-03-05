Parte 2 – Modularización del Programa

- Cada funcionalidad está en su propio método (`agregarEstudiante`, `mostrarEstudiantes`, `calcularPromedio`, `mostrarMayor`).
- Todos los métodos son llamados desde `main`.
- Cada método tiene una sola responsabilidad, facilitando la comprensión y mantenimiento del código.

Parte 3 – Validaciones y Manejo de Excepciones

 Errores que podrían ocurrir:
  - Usuario ingresa texto en lugar de números.
  - Calificaciones fuera del rango 0-100.
  
  Validaciones implementadas:
  - Uso de `try-catch` para entradas no numéricas.
  - Verificación de que las calificaciones estén entre 0 y 100.
  
  Por qué son importantes:
  - Evitan cierres inesperados del programa.
  - Garantizan que los cálculos (promedio y mayor nota) sean correctos.
  - Mejoran la experiencia del usuario al mostrar mensajes claros de error.

Parte 4 – Preguntas de Reflexión

1. Ventajas de dividir el código en métodos:
   - Organización del código.
   - Reutilización de funciones.
   - Facilita el mantenimiento y la corrección de errores.
   - Claridad al leer el programa.

2. Por qué no es recomendable usar muchas variables globales:
   - Riesgo de errores inesperados.
   - Dificulta la depuración.
   - Crea dependencias entre métodos que complican la modularización.

3. Cómo mejora la modularización la legibilidad del código:
   - Cada método tiene una sola responsabilidad.
   - El código es más limpio y fácil de entender.
   - Permite modificaciones futuras de manera más simple.
