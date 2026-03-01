<div align="center">

# 📊 Calculadora de Nota Final

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de cálculo de notas ponderadas en Java*

</div>

---

## 📌 Descripción del Proyecto

**NotaFinal** es un proyecto desarrollado en Java que permite calcular la **nota final de un estudiante** a partir de cinco calificaciones ponderadas según su porcentaje (70% y 30%).

El programa:
- ✅ Solicita el código del estudiante
- ✅ Valida las notas ingresadas
- ✅ Muestra los promedios parciales y el promedio final

Este proyecto refuerza conceptos de POO, validación de datos y manejo de entrada por consola.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 📊 | Calcular promedios ponderados en Java |
| 🔒 | Aplicar encapsulación mediante clases |
| ✅ | Validar entradas numéricas del usuario |
| 📡 | Utilizar entrada de datos con BufferedReader |
| 🧠 | Practicar lógica matemática y control de flujo |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Cálculos con pesos porcentuales | ✅ |
| Validación de entradas | ✅ |
| Uso correcto de clases y métodos | ✅ |

</div>

---

## 🛠️ Tecnologías y Conceptos

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |
| 📡 **BufferedReader** | Entrada de datos |
| ⚠️ **IOException** | Manejo de errores |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────┐     ┌─────────────────┐
│    Estudiante   │────▶│    NotaFinal   │
├─────────────────┤     ├─────────────────┤
│ - codigo        │     │ - objeto: Est   │
│ - notas[]       │     │ + main()        │
│ - br            │     └─────────────────┘
│ + Ingresa()     │     
│ + Promedio70()  │     
│ + Promedio30()  │     
│ + Final()       │     
└─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Estudiante

| Tipo | Descripción |
|------|-------------|
| **Atributos** | nota1-5, código, BufferedReader |
| **Métodos** | IngreseCodigo(), IngresaNotas70/30(), Promedio70/30(), PromedioFinal() |

### 🔹 NotaFinal

| Tipo | Descripción |
|------|-------------|
| **Función** | Clase principal |
| **Responsabilidad** | Crear objeto, solicitar datos, mostrar resultados |

---

## 📊 Ponderación de Notas

| Porcentaje | Nota | Peso |
|------------|------|------|
| 70% | Nota 1 | 30% |
| 70% | Nota 2 | 25% |
| 70% | Nota 3 | 15% |
| 30% | Nota 4 | 20% |
| 30% | Nota 5 | 10% |

---

## ✅ Validaciones Implementadas

| Validación | Descripción |
|------------|-------------|
| 📝 | Notas entre 0.0 y 5.0 |
| 🔄 | Reingreso automático si la nota es inválida |
| ⚠️ | Control de errores mediante IOException |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📡 | Usar Scanner o nextLine() para mayor flexibilidad |
| ✅ | Mostrar estado del estudiante (Aprobado/Reprobado) |
| 🔒 | Encapsular atributos con private |
| 🧪 | Implementar pruebas unitarias |

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
