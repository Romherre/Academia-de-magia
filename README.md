# Academia de Magia

Este proyecto es una simulación de una Academia de Magia, desarrollado en Java con Programación Orientada a Objetos. Está pensado como ejercicio práctico de modelado de clases, manejo de excepciones y aplicación del patrón Singleton.

---

## 📌 Objetivos del sistema

- Registrar un **director único** para la academia (Singleton).
- Cargar múltiples **hechizos** con nombre, dificultad y elemento.
- Registrar **estudiantes** con nombre, edad y nivel de habilidad.
- Validar el aprendizaje de hechizos:
  - ⚠️ El estudiante **no puede aprender el mismo hechizo dos veces**.
  - 🔒 El estudiante debe tener **el nivel adecuado** para aprender un hechizo.
- Mostrar un **reporte final** de los aprendizajes registrados.

---

## 🧱 Clases implementadas

- `Director` → patrón Singleton
- `Hechizo` → contiene nombre, dificultad y elemento
- `Estudiante` → contiene nombre, edad, nivel y lista de hechizos aprendidos
- `AprendizajeDeHechizos` → vínculo entre estudiante y hechizo
- `Academia` → núcleo del sistema, gestiona los registros y validaciones
- `Main` → ejecución del flujo principal

---

## ⚠️ Excepciones personalizadas

- `NivelInsuficienteException`: si el estudiante intenta aprender un hechizo para el que no tiene nivel suficiente.
- `HechizoYaAprendidoException`: si el estudiante intenta aprender un hechizo que ya aprendió.


