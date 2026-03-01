<div align="center">

# ⚖️ Calculadora de Índice de Masa Corporal (IMC)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Aplicación para calcular y clasificar el IMC en Java*

</div>

---

## 📌 Descripción del Proyecto

El proyecto **MasaCorporal** es una aplicación de consola desarrollada en Java que permite calcular el **Índice de Masa Corporal (IMC)** de una persona a partir de su peso y estatura, y clasificar el resultado según rangos establecidos.

Este ejercicio refuerza conceptos básicos de:
- ✅ Programación Orientada a Objetos (POO)
- ✅ Entrada de datos por consola
- ✅ Estructuras condicionales

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| ⚖️ | Calcular el Índice de Masa Corporal (IMC) |
| 📊 | Clasificar el estado corporal del usuario |
| 🏗️ | Practicar el uso de clases y métodos |
| ⚖️ | Aplicar condicionales (if – else) |
| 🧠 | Reforzar la lógica matemática en Java |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Clases y métodos | ✅ |
| Lógica condicional | ✅ |
| Interacción por consola | ✅ |
| Cálculos matemáticos | ✅ |

</div>

---

## 🛠️ Tecnologías y Conceptos

### 🔧 Lenguaje y Herramientas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 📡 **Scanner** | Entrada de datos |

### 💡 Conceptos Clave

| Concepto | Descripción |
|----------|-------------|
| 🏗️ | Clases y objetos |
| 📝 | Métodos |
| ⚖️ | Condicionales |
| ➕ | Operaciones matemáticas |
| 🏗️ | POO básica |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────┐     ┌─────────────────┐
│    Persona      │────▶│  MasaCorporal   │
├─────────────────┤     ├─────────────────┤
│ - peso          │     │ - scanner       │
│ - altura        │     │ + main()        │
│ + setPeso()     │     │ + iniciar()     │
│ + setAltura()   │     └─────────────────┘
│ + calcularIMC() │     
│ + clasificar()  │     
└─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Persona

| Tipo | Descripción |
|------|-------------|
| **Atributos** | peso, altura |
| **Métodos** | IngresePeso(), IngreseAltura(), CalculaMasa(), IMC() |

### 🔹 MasaCorporal

| Tipo | Descripción |
|------|-------------|
| **Función** | Clase principal |
| **Responsabilidad** | Solicitar datos, ejecutar cálculo, mostrar resultado |

---

## ▶️ Funcionamiento del Programa

```java
1. Usuario ingresa su altura en metros
2. Usuario ingresa su peso en kilogramos
3. Sistema calcula el IMC (peso / altura²)
4. Se muestra:
   - El valor del IMC
   - La clasificación correspondiente
```

### 📊 Clasificación del IMC

| IMC | Clasificación |
|-----|---------------|
| < 18.5 | Bajo peso |
| 18.5 - 24.9 | Peso normal |
| 25 - 29.9 | Sobrepeso |
| ≥ 30 | Obesidad |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| ✅ | Corrección de rangos IMC |
| ✅ | Validación de datos |
| 🧩 | Separar lógica de entrada y cálculo |
| 🧪 | Implementar pruebas unitarias |
| 🖥️ | Crear versión con interfaz gráfica (JavaFX) |

---

## 👩‍💻 Autora

<div align="center">

**Juddy Tatiana Vargas Santofimio**  
*Ingeniera de Sistemas – Desarrolladora Junior*

</div>

---

<div align="center">

📝 *Ejercicio desarrollado como parte de un parcial académico de Programación en Java*

</div>
