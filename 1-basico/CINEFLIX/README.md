# 🎬 CINEFLIX

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Java%20Console-blue.svg)]()
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

> Sistema de venta de boletas para cine - Práctica académica en Java

📅 **Fecha de elaboración:** 03-01-2021

---

## 📋 Descripción

Proyecto básico desarrollado en **Java** como práctica académica, basado en un **enunciado de caso real** sobre una empresa ficticia llamada **CINEFLIX**, dedicada a la exhibición y distribución de cine en Colombia.

El programa simula el **proceso de venta de boletas**, donde se registran datos del cliente, tipo de función, tipo de película y cantidad de entradas, aplicando tarifas específicas según el día y un **descuento especial del 25%** cuando se cumple una condición definida en el enunciado.

---

## ✨ Características

| Icono | Funcionalidad |
|:------:|---------------|
| 📅 | Ingreso de **fecha de nacimiento** del cliente |
| 🔢 | Generación automática de **código de factura aleatorio** |
| 🎟️ | Selección de **tarifa** (Entre semana, Miércoles, Fines de semana) |
| 🎬 | Selección de tipo de película (**2D** / **3D**) |
| 💳 | Elección de tarifa (Tarjeta CINEFLIX / Tarifa plena) |
| ➕ | Ingreso de cantidad de boletas |
| 🧮 | Cálculo del valor total |
| 🎉 | **Descuento del 25%** si el código coincide con la fecha de nacimiento |
| 🧾 | Impresión de **factura detallada** por consola |

---

## 💰 Tabla de Tarifas

| Día de la semana | Película | Tarjeta CINEFLIX | Tarifa Plena |
|------------------|----------|------------------|--------------|
| Entre semana     | 2D       | $20.000          | $23.000      |
| Entre semana     | 3D       | $23.000          | $26.000      |
| Miércoles        | 2D       | $10.000          | $11.500      |
| Miércoles        | 3D       | $11.500          | $13.000      |
| Fines/Festivos   | 2D       | $23.000          | $26.000      |
| Fines/Festivos   | 3D       | $25.000          | $28.500      |

> 📌 *Las tarifas aplican según el día de la función y el tipo de película seleccionado.*

---

## 🛠️ Tecnologías

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación principal |
| 📀 **JDBC** | Conexión a base de datos (configuración) |
| 🖥️ **Console I/O** | Entrada y salida por consola (`BufferedReader`) |
| 🔀 **Control Flow** | Estructuras condicionales (`if`, `switch`) |
| ➕ **Math Operations** | Operaciones matemáticas |

---

## 🚀 Cómo Ejecutar

### Prerrequisitos

- ☕ **Java JDK 8** o superior instalado
- 🖥️ Terminal o línea de comandos

### Pasos

```
bash
# 1. Clonar el repositorio
git clone https://github.com/tatiana1104/java-practicas.git

# 2. Acceder al directorio del proyecto
cd java-practicas/1-basico/cineflix

# 3. Compilar el proyecto (usando NetBeans o comando)
# Con javac directamente:
cd src
javac cineflix/CINEFLIX.java

# 4. Ejecutar el programa
java cineflix.CINEFLIX
```

### Ejecución con NetBeans

```
bash
# Abrir proyecto en NetBeans
# Presionar F6 o clic en "Run Project"
```

---

## 📂 Estructura del Proyecto

```
CINEFLIX/
├── 📁 src/
│   └── 📁 cineflix/
│       └── 📄 CINEFLIX.java      # Código principal
├── 📁 build/
│   └── 📁 classes/
│       └── 📁 cineflix/
│           └── ⚙️ CINEFLIX.class # Compilado
├── 📁 nbproject/                  # Proyecto NetBeans
├── 📁 test/                       # Pruebas unitarias
├── 📄 build.xml
├── 📄 manifest.mf
└── 📄 README.md
```

---

## 🎯 Objetivos de Aprendizaje

- ✅ Practicar **lógica de programación** en Java
- ✅ Reforzar el uso de **condicionales** y **menús**
- ✅ Trabajar con **entrada de datos por consola**
- ✅ Aplicar **cálculos** y **validaciones** básicas

---

## 💡 Ejemplo de Uso

```
Fecha de nacimiento (DD-MM-YYYY): 15-03-1995

TARIFAS
 1. Entre semana
 2. Miércoles
 3. Fines de semana y Festivos
2

Película
 1. 2D
 2. 3D
1

 1. Tarjeta CINEFLIX $10.000
 2. Tarifa Plena $11.500
2

Cantidad de boletas: 3

Nombre de la película: Avengers

--------------------
FACTURA
Código: 48275621
Fecha de Nacimiento: 15031995
Película 
  Nombre: Avengers
  Tipo: 2D
Valor de boleta: 11500
Cantidad: 3
Valor a pagar: 34500
Descuento: 25%
Total descuento: 8625
Valor total: 25875
```

---

## 👩‍💻 Autora

| | |
|:---:|:---|
| **Nombre** | Juddy Tatiana Vargas Santofimio |
| **Perfil** | Ingeniera de Sistemas – Desarrolladora Junior |
| **GitHub** | [tatiana1104](https://github.com/tatiana1104) |

---

## 📄 Licencia

Este proyecto está bajo la Licencia **MIT**. Puedes usarlo libremente para fines educativos.

---

<div align="center">

⭐️ *Proyecto desarrollado con fines educativos y de aprendizaje en Java* ⭐️

</div>
