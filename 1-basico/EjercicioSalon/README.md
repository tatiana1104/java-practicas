# 🏫 Sistema de Gestión de Colegio

Fecha de elaboracion: 03-03-2021

Proyecto desarrollado en **Java** como práctica académica, enfocado en el uso de la **Programación Orientada a Objetos (POO)**, arreglos unidimensionales y bidimensionales, y la interacción entre múltiples clases.

El sistema modela la estructura de uno o más **colegios**, cada uno con cursos (salones), profesores y estudiantes, permitiendo visualizar la información y **trasladar estudiantes entre colegios**.

---

## 🚀 Funcionalidades

* 🏫 Creación de colegios con rector y cursos
* 📚 Gestión de salones por grado
* 👨‍🏫 Asignación de profesores a cada salón
* 👩‍🎓 Ingreso automático de estudiantes en los salones
* 🔍 Búsqueda de estudiantes por **nombre o identificación**
* 🔁 Traslado de estudiantes entre colegios
* 📋 Visualización gráfica y detallada de los salones
* 🧾 Impresión completa de la información por consola

---

## 🧱 Estructura del proyecto

```
COLEGIO
├── Principal.java
├── Colegio.java
├── Salon.java
├── Persona.java
└── README.md
```

---

## 🛠️ Tecnologías utilizadas

* Java
* Programación Orientada a Objetos (POO)
* Arreglos y matrices
* Métodos y sobrecarga
* Salida por consola

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tatiana1104/java-practicas.git
   ```
2. Accede a la carpeta del proyecto:

   ```bash
   cd java-practicas/1-basico/COLEGIO
   ```
3. Compila los archivos:

   ```bash
   javac *.java
   ```
4. Ejecuta el programa:

   ```bash
   java Principal
   ```

---

## 🧩 Descripción de las clases

### 👤 Persona

Representa a una persona del sistema (rector, profesor o estudiante).

* Atributos: id, nombre, sexo

### 🏫 Colegio

Representa una institución educativa.

* Contiene un rector y un arreglo de salones
* Permite trasladar estudiantes a otro colegio

### 📚 Salon

Representa un curso o grado.

* Contiene un profesor y una matriz de estudiantes
* Permite ingresar, eliminar y buscar estudiantes

### ▶️ Principal

Clase principal que ejecuta el programa.

* Crea dos colegios
* Llena salones con estudiantes
* Muestra la información
* Realiza el traslado de un estudiante

---

## 🎯 Objetivo del proyecto

* Aplicar conceptos de POO en Java
* Comprender la relación entre clases
* Manejar estructuras de datos bidimensionales
* Simular un sistema real de gestión educativa

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**
Ingeniera de Sistemas – Desarrolladora Junior
GitHub: [https://github.com/tatiana1104](https://github.com/tatiana1104)

---

📌 *Proyecto desarrollado con fines educativos y de aprendizaje en Java.*
