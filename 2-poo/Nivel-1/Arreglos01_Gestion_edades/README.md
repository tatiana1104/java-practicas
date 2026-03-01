<div align="center">

# 📊 Proyecto: Gestión de Edades

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de gestión y análisis de edades con estadísticas*

</div>

---

## 📌 Descripción del Proyecto

**Arreglos01** es un proyecto desarrollado en Java que trabaja con un **arreglo de edades** generado aleatoriamente y permite realizar distintos análisis mediante un **menú interactivo en consola**.

El programa calcula:
- ✅ El promedio de edad
- ✅ La posición de la edad mayor y menor
- ✅ Cuántas personas están por encima del promedio

Reforzando el uso de arreglos, ciclos y **Programación Orientada a Objetos (POO)**.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 📦 | Practicar el uso de arreglos en Java |
| 📋 | Implementar menús interactivos con switch |
| 📊 | Aplicar lógica para cálculos estadísticos básicos |
| 🧩 | Separar responsabilidades usando clases |
| 🏗️ | Reforzar el paradigma de POO |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Arreglos | ✅ |
| Menú interactivo | ✅ |
| Ciclos y condicionales | ✅ |
| POO básica | ✅ |

</div>

---

## 🛠️ Tecnologías y Conceptos

### 🔧 Lenguaje y Herramientas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **BufferedReader** | Entrada de datos |
| 📊 **Arreglos (int[])** | Estructuras de datos |
| 🔄 **while, for, switch** | Control de flujo |
| 🎲 **Math.random()** | Generación de datos |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────┐     ┌─────────────────┐      ┌─────────────────┐
│   Arreglos01    │────▶│     Edad        │────▶│    CapDatos     │
├─────────────────┤     ├─────────────────┤      ├─────────────────┤
│ - menu()        │     │ - edades: int[] │      │ - leer()        │
│ + ejecutar()    │     │ + generar()     │      │ + validar()     │
│ + mostrarMenu() │     │ + promedio()    │      └─────────────────┘
└─────────────────┘     │ + mayorMenor()  │
                        │ + encimaProm()  │
                        └─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Arreglos01 (Clase Principal)

| Opción | Función |
|--------|---------|
| 1️⃣ | Mostrar edades |
| 2️⃣ | Calcular el promedio de edad |
| 3️⃣ | Identificar la posición de la edad menor |
| 4️⃣ | Identificar la posición de la edad mayor |
| 5️⃣ | Contar personas por encima del promedio |
| 6️⃣ | Salir |

### 🔹 Edad (Lógica del Negocio)

| Tipo | Métodos |
|------|---------|
| **Generar** | Edades aleatorias |
| **Mostrar** | Las edades almacenadas |
| **Calcular** | Promedio de edad |
| **Buscar** | Posición de edad mayor y menor |
| **Contar** | Cuántas edades están por encima del promedio |

**Atributo:** `int[] edad` → Almacena las edades

### 🔹 CapDatos

- ✅ Clase auxiliar para capturar datos desde la consola
- ✅ Facilita la reutilización del código de entrada

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📊 | Mostrar todas las edades en una sola salida formateada |
| ✅ | Validar correctamente los índices del arreglo |
| ⌨️ | Permitir ingreso manual de edades |
| 📦 | Usar ArrayList en lugar de arreglos |
| 🧩 | Separar la lógica del menú y la lógica de negocio |

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
