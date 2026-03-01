<div align="center">

# 📊 Calculadora de Promedio de Edades

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Aplicación para calcular el promedio de edades en Java*

</div>

---

## 📌 Descripción del Proyecto

El proyecto **PromedioEdad** es una aplicación de consola desarrollada en Java que permite ingresar la **edad de cinco personas** y calcular el promedio de edades.

Este ejercicio refuerza:
- ✅ Uso de estructuras repetitivas
- ✅ Acumuladores
- ✅ Entrada por consola
- ✅ Organización del código usando POO

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 👥 | Solicitar la edad de 5 personas |
| ➕ | Acumular los valores ingresados |
| 📊 | Calcular el promedio de edad |
| 📺 | Mostrar el resultado en consola |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico – Ciclos y acumuladores

| Concepto | Estado |
|----------|--------|
| Ciclo for | ✅ |
| Variables acumuladoras | ✅ |
| Entrada de datos repetitiva | ✅ |
| Separación de lógica en clases | ✅ |

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
| 🔄 | Ciclo for |
| ➕ | Variables acumuladoras |
| ➕ | Operaciones aritméticas |
| 🏗️ | Clases y métodos |
| 🏗️ | POO básica |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────────┐     ┌─────────────────────┐
│    PromedioClass    │────▶│   PromedioEdad     │
├─────────────────────┤     ├─────────────────────┤
│ - acum: int         │     │ - objeto: PromClass │
│ - edad: int         │     │ + main()            │
│ - prom: double      │     └─────────────────────┘
│ + IngresaDatos()    │     
│ + CalculaProm()     │     
│ + MuestraDatos()    │     
└─────────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 PromedioClass

| Tipo | Descripción |
|------|-------------|
| **Atributos** | acum (acumulador), edad, prom (promedio) |
| **Métodos** | IngresaDatos(), CalculaProm(), MuestraDatos() |

### 🔹 PromedioEdad

| Tipo | Descripción |
|------|-------------|
| **Función** | Clase principal |
| **Responsabilidad** | Crear objeto, ejecutar métodos |

---

## ▶️ Funcionamiento del Programa

```
java
1. Sistema solicita la edad de 5 personas
2. Las edades se suman en un acumulador
3. Se calcula el promedio dividiendo entre 5
4. Resultado se muestra en consola
```

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 👥 | Permitir ingresar un número variable de personas |
| ✅ | Validar que las edades sean mayores que cero |
| 🔢 | Calcular promedio usando double |
| 📊 | Mostrar el promedio con decimales |

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
