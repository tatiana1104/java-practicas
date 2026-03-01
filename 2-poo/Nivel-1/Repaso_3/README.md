<div align="center">

# 💊 Sistema de Productos Farmacéuticos

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Nivel](https://img.shields.io/badge/Nivel-Básico-yellow?style=for-the-badge)]()
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Sistema de gestión de productos farmacéuticos en Java*

</div>

---

## 📌 Descripción del Proyecto

Sistema de gestión de productos farmacéuticos que permite:
- ✅ Registrar medicamentos con nombre, precio y contenido
- ✅ Calcular precios con recargos
- ✅ Manejar fechas de elaboración y vencimiento
- ✅ Utilizar programación orientada a objetos

---

## 🎯 Objetivos Académicos

| # | Objetivo |
|---|----------|
| 🏗️ | Aplicar conceptos de clases y objetos |
| 🔒 | Implementar encapsulamiento con getters y setters |
| 📝 | Practicar el método toString() |
| 🧮 | Realizar cálculos matemáticos (porcentajes) |

---

## 🧠 Nivel del Proyecto

<div align="center">

### 🟡 Nivel: Básico

| Concepto | Estado |
|----------|--------|
| Clases y objetos | ✅ |
| Encapsulamiento | ✅ |
| Getters y setters | ✅ |
| Método toString() | ✅ |
| Constructores | ✅ |
| Cálculos matemáticos | ✅ |

</div>

---

## 🛠️ Tecnologías

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación |
| 🏗️ **POO** | Paradigma de programación |

---

## 🏗️ Arquitectura del Proyecto

```
┌─────────────────────────────┐     ┌─────────────────┐
│    Prod_Farmaceutico        │────▶│    Repaso_3     │
├─────────────────────────────┤     ├─────────────────┤
│ - Nombre_Medicamento        │     │ + main()        │
│ - Nombre_Gerenerico         │     └─────────────────┘
│ - Precio                    │
│ - Contenido                 │
│ - Fec_Elaboracion           │
│ - Fec_Vencimiento           │
│ + getters()                 │
│ + setters()                 │
│ + Precio_RE()               │
│ + toString()                │
└─────────────────────────────┘
```

---

## 🏫 Clase: Prod_Farmaceutico

| Tipo | Atributos/ Métodos |
|------|-------------------|
| **Atributos** | Nombre_Medicamento, Nombre_Gerenerico, Precio, Contenido, Fec_Elaboracion, Fec_Vencimiento |
| **Constructor** | Prod_Farmaceutico(String, String, int, int, int, int) |
| **Getters** | getNombre_Medicamento(), getNombre_Gerenerico(), getPrecio(), etc. |
| **Setters** | setNombre_Medicamento(), setNombre_Gerenerico(), setPrecio(), etc. |
| **Método** | Precio_RE() - Calcula el 20% de recargo |
| **Método** | toString() - Representación textual del producto |

---

## 📋 Funcionalidades

| # | Función |
|---|---------|
| 1️⃣ | Crear productos farmacéuticos |
| 2️⃣ | Calcular recargo del 20% sobre el precio |
| 3️⃣ | Gestionar fechas de elaboración y vencimiento |
| 4️⃣ | Mostrar información formateada |

---

## 📈 Posibles Mejoras Futuras

| Mejora | Descripción |
|--------|-------------|
| 📦 | Usar ArrayList para múltiples productos |
| 🔍 | Buscar productos por nombre |
| 📅 | Validar fechas de vencimiento |
| 🖥️ | Implementar menú interactivo |

---

## 👩‍💻 Autora

<div align="center">

**Juddy Tatiana Vargas Santofimio**  
*Ingeniera de Sistemas – Desarrolladora Junior*

</div>

---

<div align="center">

📝 *Ejercicio de repaso - Programación en Java*

</div>
