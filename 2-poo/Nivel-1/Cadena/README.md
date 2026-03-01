<div align="center">

# 🔤 Proyecto: Cadena - Manejo de Strings

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Proyecto para manipular y analizar cadenas de texto en Java*

</div>

---

## 📌 Descripción del Proyecto

**Cadena** es un proyecto desarrollado en Java que permite **manipular y analizar una cadena de texto** ingresada por el usuario mediante un menú interactivo en consola.

El programa aplica conceptos fundamentales de **Programación Orientada a Objetos (POO)** y manejo de cadenas de caracteres, ofreciendo funcionalidades básicas como:
- ✅ Conteo de vocales
- ✅ Conteo de palabras

Este proyecto forma parte de mis prácticas académicas para fortalecer la lógica de programación y el uso de POO en Java.

---

## 🎯 Objetivos del Proyecto

| # | Objetivo |
|---|----------|
| 🏗️ | Aplicar los principios básicos de POO |
| 🔤 | Manipular cadenas de texto usando clases estándar de Java |
| 📋 | Implementar menús interactivos en consola |
| ⚠️ | Manejar excepciones y validar entradas del usuario |

---

## 📚 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Manejo de Strings y Menús | ✅ |
| Uso correcto de clases y métodos | ✅ |
| Lógica estructurada y clara | ✅ |

</div>

---

## 🧠 Tecnologías y Conceptos Utilizados

### 🔧 Lenguaje y Herramientas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **Scanner** | Entrada de datos |
| 🔤 **String, StringTokenizer** | Manejo de cadenas |
| 🔄 **switch, while, for** | Control de flujo |
| ⚠️ **try-catch, InputMismatchException** | Manejo de errores |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────┐     ┌───────────────────┐
│     Cadena      │────▶│   Principal       │
├─────────────────┤     ├───────────────────┤
│ - cadena: String│     │ - Scanner         │
│ + getCadena()   │     │ + menu()          │
│ + setCadena()   │     │ + contarVocales() │
│ + toString()    │     │ + contarPalabras()│
└─────────────────┘     └───────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Clase: Cadena

| Tipo | Descripción |
|------|-------------|
| **Responsabilidad** | Representar una cadena de texto y encapsular su manejo |
| **Atributo** | `String cadena` |
| **Métodos** | Constructor vacío, Constructor con parámetro, getCadena(), setCadena(String cad) |

### 🔹 Clase: Principal.java

| Tipo | Descripción |
|------|-------------|
| **Responsabilidad** | Gestionar la interacción con el usuario |
| **Funciones** | Mostrar menú, solicitar entrada, contar vocales/palabras, controlar errores |

---

## 📋 Menú del Programa

| Opción | Función |
|--------|---------|
| 1️⃣ | Ingresar una cadena de texto |
| 2️⃣ | Contar vocales (a, e, i, o, u) |
| 3️⃣ | Contar palabras |
| 4️⃣ | Salir del programa |

---

## ✅ Validaciones Implementadas

| Validación | Descripción |
|------------|-------------|
| ⚠️ | Control de errores al ingresar datos |
| 🔄 | Conversión de la cadena a minúsculas |
| 🛡️ | Manejo de excepciones con InputMismatchException |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📝 | Permitir frases con espacios usando nextLine() |
| 📊 | Mostrar resultados detallados |
| 🧪 | Añadir pruebas unitarias |
| 🧩 | Separar lógica de negocio y presentación |

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
