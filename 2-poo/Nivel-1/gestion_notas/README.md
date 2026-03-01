<div align="center">

# 📚 Gestión de Notas de Estudiantes

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de gestión académica con POO en Java*

</div>

---

## 📌 Descripción del Proyecto

Este proyecto implementa un **sistema básico de gestión académica** utilizando **Programación Orientada a Objetos (POO)** en Java.

Permite:
- ✅ Registrar estudiantes
- ✅ Almacenar sus notas
- ✅ Calcular estadísticas del curso

Estadísticas disponibles:
- 📊 Aprobados y reprobados
- 📈 Promedio general
- 🏆 Mejor y peor nota

El programa funciona mediante un **menú interactivo por consola**.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 🏗️ | Aplicar los fundamentos de POO |
| 📦 | Usar arreglos de objetos |
| 🧩 | Separar responsabilidades entre clases |
| 📊 | Realizar cálculos académicos básicos |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| POO básica | ✅ |
| Arreglos de objetos | ✅ |
| Separación de responsabilidades | ✅ |

</div>

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **BufferedReader** | Entrada de datos |
| 🖥️ **IDE** | Apache NetBeans |

---

## 🏫 Arquitectura del Proyecto

```
┌─────────────────┐     ┌─────────────────┐
│    Estudiantes  │────▶│      Curso      │
├─────────────────┤     ├─────────────────┤
│ - nombre        │     │ - estudiantes[] │
│ - codigo        │     │ + agregar()     │
│ - notas[]       │     │ + calcular()    │
│ + promedio()    │     │ + mejores()     │
└─────────────────┘     └─────────────────┘
         │                      ▲
         │                      │
         ▼                      │
┌─────────────────┐     ┌─────────────────┐
│ CapturarDatos   │     │   Arreglos2     │
├─────────────────┤     ├─────────────────┤
│ + leer()        │     │ + main()        │
│ + validar()     │     │ + menu()        │
└─────────────────┘     └─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Estudiantes

| Tipo | Descripción |
|------|-------------|
| **Almacena** | Datos del estudiante |
| **Calcula** | Promedio del 70%, Promedio del 30%, Nota final |

### 🔹 Curso

| Tipo | Descripción |
|------|-------------|
| **Administra** | Arreglo de estudiantes |
| **Calcula** | Aprobados, Reprobados, Promedio del curso, Mejor/peor nota |

### 🔹 CapturarDatos

- ✅ Facilita la captura de datos desde consola

### 🔹 Arreglos2

- ✅ Clase principal con el menú interactivo

---

## 📋 Funcionalidades del Sistema

| ✅ | Funcionalidad |
|----|---------------|
| 📥 | Registrar estudiantes y sus notas |
| ✔ | Contar estudiantes aprobados |
| ❌ | Contar estudiantes reprobados |
| 📊 | Calcular el promedio general del curso |
| 🏆 | Identificar la mejor nota |
| ⚠️ | Identificar la peor nota |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📦 | Uso de ArrayList en lugar de arreglos |
| 🔒 | Mejor encapsulación (private + getters/setters) |
| ✅ | Validaciones de entrada |
| 🖥️ | Interfaz gráfica |
| 🧬 | Aplicar herencia e interfaces (Nivel intermedio) |

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
