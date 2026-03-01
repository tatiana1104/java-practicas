<div align="center">

# 📘 Taller POO - Sistema de Ventas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de registro de ventas mensuales con POO en Java*

</div>

---

## 📌 Descripción del Proyecto

El proyecto **tallerpoo** permite:
- ✅ Registrar las ventas mensuales de uno o varios vendedores
- ✅ Calcular el total de ventas por cada vendedor
- ✅ Obtener la cantidad total acumulada de ventas

La aplicación funciona mediante interacción por consola y hace uso de **clases, objetos y métodos** para el manejo de la información.

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 🏗️ | Aplicar los principios básicos de POO en Java |
| 🧑 | Modelar una entidad del mundo real (Vendedor) |
| 🏗️ | Utilizar constructores para inicializar objetos |
| 🔒 | Implementar encapsulación con atributos privados y getters/setters |
| 📡 | Practicar la lectura de datos con Scanner |
| ➕ | Calcular totales a partir de múltiples valores |
| 🔄 | Utilizar estructuras de control como ciclos do-while |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Clases y objetos | ✅ |
| Constructores | ✅ |
| Encapsulación | ✅ |
| Getters y setters | ✅ |
| Entrada de datos | ✅ |
| Ciclos | ✅ |

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
| 🔒 | Encapsulación |
| 📝 | Métodos |
| 🔐 | Atributos privados |
| 📡 | Entrada de datos con Scanner |
| 🔄 | Ciclos (do-while) |
| ➕ | Acumuladores |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────┐     ┌─────────────────┐
│    Vendedor     │────▶│    TallerPOO    │
├─────────────────┤     ├─────────────────┤
│ - nombre        │     │ - scanner       │
│ - ventas[]      │     │ + main()        │
│ + totalVentas() │     │ + menu()        │
│ + get/set       │     └─────────────────┘
└─────────────────┘
```

---

## 🏫 Clases y Responsabilidades

### 🔹 TallerPOO

| Función | Descripción |
|---------|-------------|
| 🏗️ | Contiene el método main |
| 👤 | Solicita el nombre del vendedor |
| 📊 | Registra 12 valores de ventas |
| 📺 | Muestra el total de ventas por vendedor |
| ➕ | Acumula la cantidad total de ventas |

### 🔹 Vendedor

| Función | Descripción |
|---------|-------------|
| 🧑 | Representa a un vendedor |
| 📊 | Almacena nombre y 12 valores de ventas |
| ➕ | Implementa sumatoriaporcliente() |
| 🔒 | Aplica encapsulación con private y getters/setters |

---

## ▶️ Funcionamiento del Programa

```java
1. Sistema solicita el nombre del vendedor
2. Se ingresan 12 valores de ventas mensuales
3. Se calcula y muestra el total de ventas del vendedor
4. Sistema pregunta si desea ingresar otro vendedor
5. Al finalizar, muestra la cantidad total acumulada
```

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📦 | Usar arreglos (double[]) en lugar de múltiples variables |
| ✅ | Validar entradas numéricas incorrectas |
| 📊 | Calcular promedios mensuales |
| 💾 | Implementar persistencia de datos en archivos |
| 📋 | Crear un menú interactivo |
| 🧬 | Aplicar herencia para diferentes tipos de vendedores |
| 🧩 | Separar lógica de negocio de la interfaz |

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
