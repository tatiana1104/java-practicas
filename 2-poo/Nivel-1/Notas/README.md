<div align="center">

# 📝 Sistema de Gestión de Notas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de gestión de calificaciones académicas en Java*

</div>

---

## 📌 Descripción del Proyecto

**Notas** es un proyecto desarrollado en Java que simula la **gestión de calificaciones de un curso** académico mediante un menú interactivo por consola.

El programa permite:
- ✅ Trabajar con un conjunto de estudiantes
- ✅ Realizar cálculos estadísticos sobre sus notas
- ✅ Obtener promedio del curso
- ✅ Cantidad de aprobados/desaprobados
- ✅ Mejor nota del curso

Este proyecto refuerza el uso de arreglos, estructuras de control y POO.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 📦 | Gestionar notas de estudiantes usando arreglos |
| 📋 | Implementar un menú interactivo en consola |
| 🏗️ | Practicar el uso de clases y constructores |
| 📡 | Manejar entrada de datos con BufferedReader |
| 🧠 | Aplicar lógica básica de análisis de datos |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Arreglos para almacenamiento | ✅ |
| Diseño básico de clases | ✅ |
| Menús interactivos | ✅ |
| Lógica de análisis | ✅ |

</div>

---

## 🛠️ Tecnologías y Conceptos

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **BufferedReader** | Entrada de datos |
| 📊 **Arreglos (int[])** | Estructuras de datos |
| 🔄 **switch, while** | Control de flujo |
| ⚠️ **IOException** | Manejo de errores |

---

## 🏫 Arquitectura del Proyecto

```
┌─────────────────┐      ┌──────────────────┐      ┌─────────────────┐
│     Notas       │────▶│    Estudiante     │────▶│    capDato      │
├─────────────────┤      ├──────────────────┤      ├─────────────────┤
│ - menu()        │      │ - estu: int[]    │      │ + solicitar()   │
│ + ejecutar()    │      │ + Estudiante()   │      └─────────────────┘
│ + opciones()    │      │ + calcular()     │
└─────────────────┘      └──────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Notas.java

| Opción | Función |
|--------|---------|
| 1️⃣ | Definir cantidad de estudiantes |
| 2️⃣ | Ingresar notas de los estudiantes |
| 3️⃣ | Contar estudiantes aprobados |
| 4️⃣ | Contar estudiantes desaprobados |
| 5️⃣ | Calcular el promedio del curso |
| 6️⃣ | Mostrar la mejor nota |
| 7️⃣ | Contar estudiantes por debajo del promedio |
| 8️⃣ | Salir del programa |

### 🔹 Estudiante

| Tipo | Descripción |
|------|-------------|
| **Atributo** | int[] estu (notas de estudiantes) |
| **Constructor** | Estudiante() - 20 por defecto / Estudiante(int tam) |

### 🔹 capDato

- ✅ Clase auxiliar para capturar datos desde consola
- ✅ Centraliza la entrada de datos

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 🛠️ | Implementar métodos reales para cada opción del menú |
| ✅ | Validar que las notas estén entre 0 y 5 |
| 📦 | Usar ArrayList en lugar de arreglos |
| 🧩 | Separar la lógica de negocio del menú |
| 💬 | Mostrar mensajes más descriptivos |

---

## 👩‍💻 Autora

<div align="center">

**Juddy Tatiana Vargas Santofimio**  
*Ingeniera de Sistemas – Desarrolladora Junior*
</div>

---

<div align="center">

📅 *Fecha de elaboración: 02/06/2019*  
📝 *Ejercicio desarrollado como parte de un parcial académico de Programación en Java*

</div>
