<!-- 📚 Proyecto Java - Sistema de Gestión de Colegio -->
<div align="center">

# 🏫 Sistema de Gestión de Colegio

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Author](https://img.shields.io/badge/Author-Juddy_Tatiana_Vargas-blue)](https://github.com/tatiana1104)
[![Platform](https://img.shields.io/badge/Platform-Windows/Linux/Mac-orange)](https://github.com/tatiana1104)

*Sistema de gestión educativa desarrollado en Java con Programación Orientada a Objetos*

</div>


---

## 📖 Descripción

| Información | Detalle |
|-------------|---------|
| **Fecha de elaboración** | 03-03-2021 |
| **Lenguaje** | Java |
| **Paradigma** | Programación Orientada a Objetos (POO) |
| **Nivel** | Básico - Intermedio |

Este proyecto es una **práctica académica** desarrollada en Java que implementa un sistema de gestión educativa completo. El sistema modela la estructura de uno o más **colegios**, cada uno con cursos (salones), profesores y estudiantes, permitiendo visualizar la información y **trasladar estudiantes entre colegios**.

> 🎯 *Objetivo principal: Aplicar conceptos de POO en Java, comprender la relación entre clases y manejar estructuras de datos bidimensionales.*

---

## ✨ Características

| # | Funcionalidad | Descripción |
|---|---------------|-------------|
| 🏫 | **Gestión de Colegios** | Creación de instituciones educativas con rector y múltiples salones |
| 📚 | **Gestión de Salones** | Administración de cursos por grado con capacidad configurable |
| 👨‍🏫 | **Asignación de Profesores** | Cada salón cuenta con un profesor asignado |
| 👩‍🎓 | **Registro de Estudiantes** | Ingreso automático de estudiantes en los salones |
| 🔍 | **Búsqueda Avanzada** | Buscar estudiantes por **nombre o identificación** |
| 🔄 | **Traslado de Estudiantes** | Mover estudiantes entre diferentes colegios |
| 📊 | **Visualización Gráfica** | Representación visual de la disposición de estudiantes |
| 🖨️ | **Reportes** | Impresión completa de información por consola |

---

## 🧱 Estructura del Proyecto

```
📦 ejeciciosalon
├── 📂 src/
│   ├── Principal.java      # 📌 Clase principal (punto de entrada)
│   ├── Colegio.java       # 🏫 Entidad que representa un colegio
│   ├── Salon.java         # 📚 Entidad que representa un salón/grado
│   └── Persona.java       # 👤 Clase base para personas
├── 📂 build/              # 📁 Archivos compilados
├── 📂 nbproject/          # ⚙️ Configuración de NetBeans
├── build.xml              # 🔨 Script de construcción
├── manifest.mf            # 📝 Manifiesto de la aplicación
└── README.md              # 📖 Documentación del proyecto
```

---

## 🛠️ Tecnologías

### Lenguaje y Paradigmas
<div>

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/POO-007396?style=flat-square&logo=java&logoColor=white)

</div>

### Conceptos Aplicados
- ✅ Programación Orientada a Objetos (POO)
- ✅ Arreglos Unidimensionales y Bidimensionales
- ✅ Herencia y Composición de clases
- ✅ Sobrecarga de métodos
- ✅ Encapsulamiento y Modularidad
- ✅ Interfaz de consola

---

## 📦 Requisitos

| Requisito | Versión Mínima |
|-----------|----------------|
| ☕ **Java JDK** | Java 8 o superior |
| 💻 **Sistema Operativo** | Windows / Linux / macOS |
| 🛠️ **IDE** (opcional) | NetBeans, VS Code, IntelliJ IDEA |

---

## 🚀 Instalación y Ejecución

### Clonar el repositorio

```bash
# Usando HTTPS
git clone https://github.com/tatiana1104/java-practicas.git

# O usando SSH
git clone git@github.com:tatiana1104/java-practicas.git
```

### Navegar al proyecto

```bash
cd java-practicas/1-basico/ejerciciosalon
```

### Compilar y ejecutar

#### Opción 1: Línea de comandos

```bash
# Compilar todos los archivos
javac src/*.java

# Ejecutar el programa
java -cp src Principal
```

#### Opción 2: Con Ant (NetBeans)

```bash
# Compilar
ant build

# Ejecutar
ant run

# Limpiar
ant clean
```

#### Opción 3: NetBeans IDE

1. Abre NetBeans IDE
2. Selecciona **File → Open Project**
3. Navega a la carpeta `ejerciciosalon`
4. Presiona **F6** o haz clic en **Run**

---

## 🏗️ Arquitectura del Sistema

### Diagrama de Clases

```
┌─────────────────┐
│    Persona      │  (Clase base)
├─────────────────┤
│ - id: long      │
│ - nombre: String│
│ - sexo: boolean │
├─────────────────┤
│ + getters()     │
│ + setters()     │
│ + toString()    │
└────────┬────────┘
         │
    ┌────┴────┬─────────────┐
    ▼         ▼             ▼
┌───────┐ ┌───────┐    ┌─────────┐
│Rector │ │Profesor│    │Estudiante│
└───────┘ └───────┘    └─────────┘
         │
         ▼
┌─────────────────────────────────┐
│           Colegio               │
├─────────────────────────────────┤
│ - nombre: String                │
│ - rector: Persona               │
│ - bloque: Salon[]               │
├─────────────────────────────────┤
│ + trasladar()                   │
│ + mostrarCursos()               │
│ + getBloque()                   │
└────────────┬────────────────────┘
             │
             ▼
┌─────────────────────────────────┐
│            Salon                │
├─────────────────────────────────┤
│ - grado: String                 │
│ - profesor: Persona             │
│ - estudiantes: Persona[][]      │
├─────────────────────────────────┤
│ + ingresarEstudiante()          │
│ + eliminarEstudiante()          │
│ + buscarEstudiante()            │
│ + mostrarSalon()                │
└─────────────────────────────────┘
```

### Descripción de Clases

| Clase | Descripción | Responsabilidades |
|-------|-------------|-------------------|
| 👤 **Persona** | Clase base del sistema | Representar personas con id, nombre y sexo |
| 🏫 **Colegio** | Entidad principal | Gestionar rector y salones, realizar traslados |
| 📚 **Salon** | Unidad académica | Administrar profesor y matriz de estudiantes |
| ▶️ **Principal** | Punto de entrada | Ejecutar demo del sistema |

---

## 👥 Contribuidores

**Juddy Tatiana Vargas Santofimio**  
Ingeniera de Sistemas - Desarrolladora Junior  
 [@tatiana1104](https://github.com/tatiana1104) 

</div>

---

## 📄 Licencia

<div align="center">

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

**MIT License** - Copyright © 2021 - Juddy Tatiana Vargas Santofimio

*Permiso concedido para usar, copiar, modificar y distribuir este proyecto.*

</div>

---

## ⭐ Agradecimientos

¡Gracias por revisar este proyecto! Si te fue útil, por favor:

- ⭐ Dale una estrella al repositorio
- 🍴 Forkea el proyecto para tus propias prácticas
- 💬 Comparte tus comentarios y sugerencias

---

<div align="center">

📌 *Proyecto desarrollado con fines educativos y de aprendizaje en Java.*

Hecho con ❤️ y ☕

</div>
