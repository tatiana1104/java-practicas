# 🎬 CINEFLIX

Fecha de elaboracion: 03-01-2021

Proyecto básico desarrollado en **Java** como práctica académica, basado en un **enunciado de caso real** sobre una empresa ficticia llamada **CINEFLIX**, dedicada a la exhibición y distribución de cine en Colombia.

El programa simula el **proceso de venta de boletas**, donde se registran datos del cliente, tipo de función, tipo de película y cantidad de entradas, aplicando tarifas específicas según el día y un **descuento especial del 25%** cuando se cumple una condición definida en el enunciado.

---

## 🚀 Funcionalidades

* 📅 Ingreso de **fecha de nacimiento** del cliente
* 🔢 Generación automática de **código de factura aleatorio**
* 🎟️ Selección de **tarifa**:

  * Entre semana
  * Miércoles
  * Fines de semana y festivos
* 🎬 Selección de tipo de película:

  * 2D
  * 3D
* 💳 Elección de tarifa:

  * Tarjeta CINEFLIX
  * Tarifa plena
* ➕ Ingreso de cantidad de boletas
* 🧮 Cálculo del valor total
* 🎉 Aplicación de **descuento del 25%** si el código coincide con la fecha de nacimiento
* 🧾 Impresión de **factura detallada por consola**

---

## 💰 Tabla de tarifas

| Días de la semana          | Tipo de película | Tarjeta CINEFLIX | Tarifa plena |
| -------------------------- | ---------------- | ---------------- | ------------ |
| Entre semana               | 2D               | $20.000          | $23.000      |
| Entre semana               | 3D               | $23.000          | $26.000      |
| Miércoles                  | 2D               | $10.000          | $11.500      |
| Miércoles                  | 3D               | $11.500          | $13.000      |
| Fines de semana y festivos | 2D               | $23.000          | $26.000      |
| Fines de semana y festivos | 3D               | $25.000          | $28.500      |

📌 *Las tarifas aplican según el día de la función y el tipo de película seleccionado.*

---

## 🛠️ Tecnologías utilizadas

* Java
* Entrada y salida por consola (`BufferedReader`)
* Estructuras condicionales (`if`, `switch`)
* Operaciones matemáticas

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tatiana1104/java-practicas.git
   ```
2. Accede a la carpeta del proyecto:

   ```bash
   cd java-practicas/1-basico/CINEFLIX
   ```
3. Compila el archivo Java:

   ```bash
   javac CINEFLIX.java
   ```
4. Ejecuta el programa:

   ```bash
   java cineflix.CINEFLIX
   ```

> Asegúrate de tener instalado **Java JDK** y de ejecutar el comando desde la ruta correcta.

---

## 📂 Estructura del proyecto

```
CINEFLIX
└── cineflix
    └── CINEFLIX.java
```

---

## 🎯 Objetivo del proyecto

* Practicar lógica de programación en Java
* Reforzar el uso de condicionales y menús
* Trabajar con entrada de datos por consola
* Aplicar cálculos y validaciones básicas

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**
Ingeniera de Sistemas – Desarrolladora Junior
GitHub: [https://github.com/tatiana1104](https://github.com/tatiana1104)

---

📌 *Proyecto desarrollado con fines educativos y de aprendizaje en Java.*
