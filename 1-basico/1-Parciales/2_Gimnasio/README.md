<!-- badges -->
<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-1.0.0-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-Academic-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

</div>

---

# 🏋️‍♂️ Ejercicio 2 – Gimnasio "Forma tu Cuerpo"

<div align="center">

📅 **Fecha de elaboración:** 28-01-2021  
🎓 **Tipo:** Ejercicio académico de Programación en Java  
⚡ **Nivel:** Básico

</div>


---

## 📌 Descripción

Este ejercicio corresponde al **Ejercicio 2 de un parcial de Programación en Java**.  
El objetivo es desarrollar una solución que permita al gimnasio **"Forma tu Cuerpo"** calcular el **valor final a pagar por un cliente**, teniendo en cuenta:

- 📦 El **plan** seleccionado
- 🏃 El **servicio** elegido
- 💰 Un **descuento aplicado** según el Índice de Masa Corporal (IMC)

---

## 🧾 Planes Disponibles

| Plan | Descripción | Precio Base |
| :--- | :--- | :--- |
| 🧑‍🤝‍🧑 **Individual** | 1 persona | `$140.000` |
| 👫 **Pareja** | 2 personas | `$250.000` |
| 👥 **Amigos** | 4 personas | `$480.000` |

---

## 🏷️ Servicios Ofrecidos

| Servicio | Descripción | Recargo |
| :--- | :--- | :--- |
| 🏃 **Cross Training** | Entrenamiento funcional | 💵 Precio base |
| 🏋️ **Maquinaria** | Uso completo de maquinaria + Cross Training | ➕ **7%** |
| 🌟 **Todo Incluido** | Maquinaria + Cross Training + turco especial | ➕ **15%** |

---

## ⚖️ Descuentos por IMC

El descuento se aplica según el **Índice de Masa Corporal (IMC)** calculado con la fórmula:

```
📐 IMC = Peso / (Altura²)
```

| IMC | Clasificación | Descuento |
| :--- | :--- | :--- |
| < 18.4 | ⚖️ Bajo peso | **5%** |
| 18.5 – 24.9 | ✅ Normal | **2%** |
| 30 – 40 | ⚠️ Sobrepeso | **10%** |

> 📌 **Nota:** Para los planes Pareja y Amigos, el IMC se calcula usando una sola persona del grupo.

---

## 🔄 Proceso de Cálculo

1. ✅ Se selecciona el **plan**
2. ✅ Se selecciona el **servicio**
3. ✅ Se calcula el **valor base + recargo del servicio**
4. ✅ Se calcula el **IMC**
5. ✅ Se aplica el **descuento correspondiente**
6. ✅ Se muestra el **valor final a pagar**

---

## 💻 Instalación

### 📝 Requisitos Previos

- ☕ **Java JDK 8** o superior instalado
- 📦 Un IDE como **NetBeans**, **IntelliJ IDEA** o **VS Code**

### 📥 Clonar el Repositorio

```bash
git clone https://github.com/tatiana1104/java-practicas
cd /1-basico/1-parciales/2_gimnasio
```

### 🏗️ Compilar el Proyecto

```bash
# Si usas NetBeans
ant clean build

# O manualmente
cd src
javac gimnasio/Gimnasio.java
```

---

## 🚀 Cómo Ejecutar

### ▶️ Desde la Línea de Comandos

```bash
cd build/classes
java gimnasio.Gimnasio
```

### ▶️ Desde NetBeans

1. Abre el proyecto en NetBeans
2. Presiona **F6** o haz clic en "Run Project"
3. Sigue las instrucciones en consola

### ▶️ Desde VS Code

1. Abre la carpeta del proyecto
2. Ejecuta `Gimnasio.java`
3. Sigue las instrucciones en consola

---

## 📊 Ejemplos de Ejecución

### ✅ Ejemplo 1

**Entrada:**

- Plan: `Amigos`
- Servicio: `Todo Incluido`
- Peso: `70 kg`
- Altura: `1.85 m`

**Salida:**

```
Valor a pagar: 540960
```

---

### ✅ Ejemplo 2

**Entrada:**

- Plan: `Pareja`
- Servicio: `Maquinaria`
- Peso: `85 kg`
- Altura: `1.65 m`

**Salida:**

```
Valor a pagar: 240750
```

---

### ✅ Ejemplo 3

**Entrada:**

- Plan: `Individual`
- Servicio: `Cross Training`
- Peso: `50 kg`
- Altura: `1.70 m`

**Salida:**

```
Valor a pagar: 133000
```

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
| :--- | :--- |
| ☕ **Java** | Lenguaje de programación principal |
| 📖 **BufferedReader** | Entrada de datos por consola |
| 🔢 **Operaciones matemáticas** | Cálculos de valores y descuentos |
| 🔀 **Condicionales** | Lógica de negocio |

---

## 🎯 Objetivo Académico

Evaluar el manejo de:

- 🔀 **Condicionales** (`if / else`)
- 🔢 **Operaciones matemáticas**
- 📥 **Entrada y salida de datos**
- 🧠 **Lógica de negocio** aplicada a un caso real

---

## 📄 Licencia

Este proyecto es de uso académico.  
✍️ *Ejercicio desarrollado como parte de un parcial de Programación en Java.*