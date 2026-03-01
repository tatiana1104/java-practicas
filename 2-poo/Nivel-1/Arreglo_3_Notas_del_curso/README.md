<div align="center">

# 📘 Sistema de Gestión de Notas del Curso

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Intermedio-orange?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema académico para gestionar notas de estudiantes en Java*

</div>

---

## 📌 Descripción del Proyecto

Este proyecto implementa un **sistema académico en Java** que permite gestionar las notas de un curso, utilizando arreglos y **Programación Orientada a Objetos (POO)**.

El sistema funciona mediante un **menú interactivo por consola**, donde el usuario puede:
- ✅ Crear un curso
- ✅ Registrar estudiantes
- ✅ Ingresar sus notas
- ✅ Obtener diferentes estadísticas académicas

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 📦 | Aplicar arreglos de objetos |
| 🏗️ | Usar Programación Orientada a Objetos |
| ✅ | Implementar validaciones de datos |
| 📊 | Calcular promedios y estadísticas académicas |
| ⌨️ | Manejar entrada de datos por consola |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico – Intermedio

| Tecnología | Nivel |
|------------|-------|
| POO | 🟡 Básico |
| Arreglos | 🟡 Básico |

</div>

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **BufferedReader** | Entrada de datos |
| 🖥️ **IDE** | Apache NetBeans / IntelliJ IDEA |

---

## 🧩 Arquitectura del Proyecto

### 📋 Diagrama de Clases

```
┌─────────────────┐     ┌─────────────────┐
│    Estudiante   │────▶│      Curso     │
├─────────────────┤     ├─────────────────┤
│ - nombre        │     │ - estudiantes[] │
│ - codigo        │     │ + agregar()     │
│ - notas[]       │     │ + mostrar()     │
│ + calcular()    │     │ + promedio()    │
└─────────────────┘     └─────────────────┘
         │                      ▲
         │                      │
         ▼                      │
┌─────────────────┐     ┌─────────────────┐
│    CapDatos     │     │    Principal    │
├─────────────────┤     ├─────────────────┤
│ + leer()        │     │ + main()        │
│ + validar()     │     │ + menu()        │
└─────────────────┘     └─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Estudiante

| Tipo | Atributos/ Métodos |
|------|-------------------|
| **Almacena** | Nombre, Código, Cinco notas |
| **Calcula** | Nota del 70%, Nota del 30%, Nota final |
| **Valida** | Notas entre 0 y 5 |

### 🔹 Curso

| Tipo | Métodos |
|------|---------|
| **Administra** | Arreglo de estudiantes |
| **Permite** | Mostrar, contar aprobados/reprobados, calcular promedio |

### 🔹 CapDatos

- ✅ Encapsula la entrada de datos desde consola
- ✅ Evita repetición de código

### 🔹 Principal

- ✅ Clase principal del sistema
- ✅ Controla menús y flujo del programa

---

## 📋 Funcionalidades del Sistema

<div align="center">

| ✅ | Funcionalidad |
|----|---------------|
| ✔ | Crear un curso con N estudiantes |
| ✔ | Ingresar datos de estudiantes |
| ✔ | Registrar notas del 70% y 30% |
| ✔ | Mostrar todos los estudiantes |
| ✔ | Contar estudiantes aprobados |
| ✔ | Contar estudiantes reprobados |
| ✔ | Mostrar mejor nota del curso |
| ✔ | Mostrar peor nota del curso |
| ✔ | Calcular promedio general del curso |

</div>

---

## ⚠️ Consideraciones Importantes

| Nota | Descripción |
|------|-------------|
| 📊 | La nota final se calcula sobre 100% |
| 📝 | El rango válido de notas es 0.0 a 5.0 |
| ⌨️ | Sistema funciona por consola |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📦 | Uso de ArrayList en lugar de arreglos |
| 🔒 | Encapsulación completa (private, getters y setters) |
| ✅ | Corrección de duplicación de validaciones |
| 🖥️ | Interfaz gráfica (Swing o JavaFX) |
| 💾 | Persistencia de datos (archivos o base de datos) |

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
