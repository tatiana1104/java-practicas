<div align="center">

# 🧾 VendedorApp - Sistema de Gestión de Ventas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Aplicación de modelado de vendedor con POO en Java*

</div>

---

## 📌 Descripción del Proyecto

El proyecto **VendedorApp** es una aplicación básica desarrollada en Java que permite:
- ✅ Modelar un vendedor
- ✅ Registrar múltiples valores de ventas individuales
- ✅ Calcular el total vendido

Este proyecto está orientado a reforzar los **fundamentos de la POO**.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 🏗️ | Comprender el uso de clases y objetos |
| 🏗️ | Aplicar constructores con múltiples parámetros |
| ✏️ | Manipular atributos mediante métodos set |
| ➕ | Implementar métodos que realicen cálculos |
| 🧑 | Modelar una entidad del mundo real (Vendedor) |
| 🧠 | Reforzar la lógica básica de programación |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Clases y objetos | ✅ |
| Atributos y métodos | ✅ |
| Constructores | ✅ |
| Métodos para cálculos | ✅ |
| Modelado de caso real | ✅ |

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
| 🏗️ | Constructores |
| ✏️ | Métodos set |
| ➕ | Métodos para cálculos |
| 🧑 | Modelado de entidad |

---

## 🏗️ Arquitectura del Proyecto

```
┌──────────────────┐     ┌─────────────────┐
│    Vendedor      │────▶│  VendedorApp    │
├──────────────────┤     ├─────────────────┤
│ - nombre         │     │ + main()        │
│ - venta1-10      │     │ + iniciar()     │
│ + calcularVenta()│    └─────────────────┘
│ + get/set        │
└──────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 Vendedor

| Tipo | Descripción |
|------|-------------|
| **Atributos** | nombre, venta1 a venta10 |
| **Método** | calcularVenta() → retorna suma total |
| **Responsabilidad** | Almacenar y calcular ventas |

### 🔹 VendedorApp

| Tipo | Descripción |
|------|-------------|
| **Función** | Clase principal (main) |
| **Responsabilidad** | Punto de entrada de la aplicación |

---

## ▶️ Funcionamiento del Programa

```java
1. Se crea un objeto de tipo Vendedor usando el constructor
2. Se registran las ventas individuales
3. Se invoca el método calcularVenta()
4. Se obtiene el total de ventas realizadas
```

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 🔒 | Encapsular atributos usando private |
| 🔍 | Implementar getters para consultar datos |
| 📦 | Reemplazar ventas individuales por un arreglo o lista |
| ✅ | Agregar validaciones de datos |
| 📡 | Implementar entrada de datos por consola |
| 📊 | Mostrar reportes detallados de ventas |
| 📈 | Calcular promedios y estadísticas |
| 🖥️ | Añadir interfaz gráfica (GUI) |
| 🧬 | Integrar herencia o interfaces |

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
