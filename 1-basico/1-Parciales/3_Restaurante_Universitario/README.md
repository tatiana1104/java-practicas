# 🍽️ Restaurante Universitario

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Version](https://img.shields.io/badge/Version-1.0-orange?style=for-the-badge)

</div>

> Programa en Java para calcular el valor a pagar por un estudiante en el restaurante universitario, con descuentos académicos basados en el promedio.

---

## 📌 Descripción

Este programa en **Java** permite calcular el **valor a pagar** por un estudiante en el restaurante universitario, según:

- El **combo seleccionado** 🍱
- La **cantidad de días** 📅
- El **promedio académico** 📊 del estudiante

El sistema aplica **descuentos académicos** y valida los datos ingresados.

---

## 🍱 Combos Disponibles

| Combo | Descripción | 3 Días | 5 Días |
|:-----:|-------------|-------:|-------:|
| 🥇 **Combo 1** | Desayuno, almuerzo, cena y 2 snacks | $220.000 | $360.000 |
| 🥈 **Combo 2** | Desayuno y almuerzo | $145.000 | $240.000 |
| 🥉 **Combo 3** | Desayuno, almuerzo y cena | $180.000 | $300.000 |

---

## 🎓 Descuentos por Promedio Académico

| Rango de Promedio | Descuento | Status |
|:-----------------:|:---------:|:------:|
| 0.0 – 3.2 | ❌ Sin descuento | - |
| 3.3 – 3.8 | ✅ 5% | Bronze |
| 3.9 – 4.3 | ✅ 8% | Silver |
| 4.4 – 5.0 | ✅ 15% | Gold |

> ⚠️ **Importante:** Los promedios mayores a **5.0** son **inválidos** y generan un mensaje de error.

---

## ⚙️ Lógica del Programa

### Pasos de Ejecución:

1. ✅ El usuario selecciona el **combo** (1, 2 o 3)
2. ✅ Selecciona la **cantidad de días** (3 o 5)
3. ✅ Ingresa su **promedio académico**
4. ✅ El sistema:
   - Determina el **valor base** según combo y días
   - Calcula el **descuento** según el promedio
   - Muestra el **valor final a pagar**

---

## 🚀 Cómo Ejecutar

### Requisitos Previos

- ☕ **Java JDK** 8 o superior
- 🟠 **NetBeans IDE** (o cualquier IDE de Java)

### Pasos para Ejecutar

1. **Abrir en NetBeans:**
   - File → Open Project → Seleccionar carpeta `3_restaurante_universitario`

2. **Ejecutar el proyecto:**
   - Presionar `F6` o clic en el botón **Run**

3. **Ingresar los datos:**
   - Selecciona el combo (1-3)
   - Selecciona la cantidad de días (1-2)
   - Ingresa tu promedio académico

---

## 🧪 Ejemplos de Ejecución

### ✔️ Ejemplo 1: Descuento Bronze

| Campo | Valor |
|-------|-------|
| Combo | Combo 1 |
| Días | 5 |
| Promedio | 3.5 (5% descuento) |

**Salida:**
```
Valor a Pagar: 342000
```

---

### ✔️ Ejemplo 2: Descuento Gold

| Campo | Valor |
|-------|-------|
| Combo | Combo 2 |
| Días | 3 |
| Promedio | 4.6 (15% descuento) |

**Salida:**
```
Valor a Pagar: 123250
```

---

### ❌ Ejemplo 3: Error por Promedio Inválido

| Campo | Valor |
|-------|-------|
| Combo | Combo 3 |
| Días | 5 |
| Promedio | 8.2 |

**Salida:**
```
Los sentimos, existe errores en los valores de entrada
```

---

## 🧠 Conceptos Aplicados

- 🔀 Condicionales `if – else`
- ✅ Validación de datos
- ➗ Cálculo de porcentajes
- ⌨️ Entrada de datos con `BufferedReader`
- 🔄 Estructuras de control anidadas

---

## 👩‍💻 Autora

<div align="center">

**Juddy Tatiana Vargas Santofimio**  
📧 Ingeniería de Sistemas  
💼 Prácticas en Java  

---

⭐️ Thanks for viewing this project!

</div>
