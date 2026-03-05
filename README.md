# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## 1️⃣ Identificación de Tareas Repetitivas

Responder:

- ¿Qué partes del código pueden convertirse en métodos?
- ¿Qué bloques de código se repiten?
- ¿Qué responsabilidades pueden separarse?

Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

Explicar por qué dividir estas tareas mejora el programa.

---

## 2️⃣ Variables Locales vs Globales

Responder:

- ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
- ¿Cuáles deberían ser locales dentro de un método?
- ¿Por qué?

Reflexionar sobre:

- Alcance (scope)
- Tiempo de vida de la variable
- Riesgos de modificar datos globales accidentalmente

---

# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir.
- Qué validaciones implementaron.
- Por qué son importantes.

---

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Reflexionar sobre:

- Organización
- Reutilización
- Mantenimiento
- Claridad

---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

Reflexionar sobre:

- Posibilidad de errores inesperados
- Dificultad para depurar
- Dependencia entre métodos

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?

---

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos** |

--------------------------------------------------------

## Parte 2 – Modularización del Programa
- Cada funcionalidad está en su propio método (`agregarEstudiante`, `mostrarEstudiantes`, `calcularPromedio`, `mostrarMayor`).
- Todos los métodos son llamados desde `main`.
- Cada método tiene una sola responsabilidad, facilitando la comprensión y mantenimiento del código.

## Parte 3 – Validaciones y Manejo de Excepciones
- **Errores que podrían ocurrir:**
  - Usuario ingresa texto en lugar de números.
  - Calificaciones fuera del rango 0-100.
- **Validaciones implementadas:**
  - Uso de `try-catch` para entradas no numéricas.
  - Verificación de que las calificaciones estén entre 0 y 100.
- **Por qué son importantes:**
  - Evitan cierres inesperados del programa.
  - Garantizan que los cálculos (promedio y mayor nota) sean correctos.
  - Mejoran la experiencia del usuario al mostrar mensajes claros de error.

## Parte 4 – Preguntas de Reflexión
1. **Ventajas de dividir el código en métodos:**
   - Organización del código.
   - Reutilización de funciones.
   - Facilita el mantenimiento y la corrección de errores.
   - Claridad al leer el programa.

2. **Por qué no es recomendable usar muchas variables globales:**
   - Riesgo de errores inesperados.
   - Dificulta la depuración.
   - Crea dependencias entre métodos que complican la modularización.

3. **Cómo mejora la modularización la legibilidad del código:**
   - Cada método tiene una sola responsabilidad.
   - El código es más limpio y fácil de entender.
   - Permite modificaciones futuras de manera más simple.
