<div align="center">

# 🏋️ Sistema de Gestión de Gimnasio

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/downloads/)
[![Licencia](https://img.shields.io/badge/Licencia-MIT-green?style=for-the-badge&logo=open-source-initiative&logoColor=white)](LICENSE)
[![NetBeans](https://img.shields.io/badge/IDE-NetBeans-blue?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![Nivel](https://img.shields.io/badge/Nivel-Básico-red?style=for-the-badge&logo=level-up&logoColor=white)]()
[![Última Actualización](https://img.shields.io/badge/Última_Actualización-Feb_2021-lightgrey?style=for-the-badge&logo=calendar&logoColor=white)]()

*Sistema de gestión de clientes para gimnasio con cálculo de IMC y descuentos automáticos*

---

[📋](#-enunciado-del-problema) • [🚀](#-funcionalidades) • [🛠️](#-tecnologías) • [📊](#-estructura-del-proyecto) • [▶️](#-cómo-ejecutar-el-proyecto) • [🎯](#-objetivos-del-proyecto) • [👩‍💻](#-autora)

</div>

---

## 📝 Descripción del Proyecto

| | |
|:--|:--|
| **Nombre del Proyecto** | Sistema de Gestión de Gimnasio "Forma tu Cuerpo" |
| **Fecha de Elaboración** | 📅 13-02-2021 |
| **Lenguaje** | ☕ Java |
| **Nivel** | 🔰 Básico |
| **Institución** | Lógica y Algoritmos |

> 🎓 *Proyecto desarrollado en Java como ejercicio académico, aplicando estructuras de control FOR, WHILE y DO-WHILE, manejo de condicionales y cálculos matemáticos.*

---

## 📋 Enunciado del Problema

El gimnasio **"Forma tu Cuerpo"** ofrece 3 tipos de planes que se relacionan a continuación:

| 📦 Plan | 👥 Personas | 💰 Precio Base |
|:--------|:----------:|:-------------:|
| 🧍 Individual | 1 | $140.000 |
| 👫 Pareja | 2 | $250.000 |
| 👬 Amigos | 4 | $480.000 |

Adicionalmente **"Forma tu Cuerpo"** tiene 3 grandes servicios para ofrecerles a sus clientes:

| 🎯 Servicio | 📖 Descripción | 📈 Incremento |
|:-----------|:---------------|:------------:|
| 🏃 Cross Training | Entrenamiento funcional | Precio base |
| 🏋️ Maquinaria | Uso total de maquinaria + Cross Training | +7% |
| 🌟 Todo Incluido | Maquinaria + Cross Training + 2 horas de turco semanal | +15% |

Así mismo, para incentivar la actividad física y la suscripción al gimnasio, **"Forma tu Cuerpo"** realiza los siguientes descuentos dependiendo del **Índice de Masa Corporal (IMC)**. Para los planes Pareja y Amigos se selecciona una persona para realizar el cálculo.

> 📐 **IMC = Peso / Altura²**

| ⚖️ IMC | 🏷️ Condición | 💵 Descuento |
|:------|:------------|:-----------:|
| < 18.4 | ⚠️ Bajo peso | 5% |
| 18.5 – 24.9 | ✅ Normal | 2% |
| 30 – 40 | ⚠️ Sobrepeso | 10% |

---

## 🚀 Funcionalidades

|编号| Funcionalidad | Descripción |
|:--|:--------------|:------------|
| 🧍 | **Registro de Clientes** | Registro de múltiples clientes en un mismo día |
| 🏷️ | **Selección de Plan** | Individual, Pareja o Amigos |
| 🏋️ | **Servicios Adicionales** | Cross Training, Maquinaria, Todo Incluido |
| ⚖️ | **Datos del Cliente** | Ingreso de peso y altura |
| 🧮 | **Cálculo de IMC** | Índice de Masa Corporal automático |
| 🎯 | **Descuentos Automáticos** | Aplicación según IMC del cliente |
| 💵 | **Pago Final** | Cálculo del valor a pagar |
| 📊 | **Estadísticas** | Resumen diario de ventas |

---

## 🛠️ Tecnologías Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JDK](https://img.shields.io/badge/JDK-11%2B-007396?style=flat-square&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

| Tecnología | Versión | Uso |
|:-----------|:-------:|:----|
| ☕ Java | 11+ | Lenguaje principal |
| 🖥️ NetBeans IDE | 8.2+ | Entorno de desarrollo |
| 📦 JDK | 11+ | Kit de desarrollo |

</div>

---

## 🧱 Estructura del Proyecto

```
📁 GIMNASIO/
├── 📂 src/
│   └── 📂 gimnasio/
│       └── 📄 Gimnasio.java          # Código principal
├── 📂 build/
│   └── 📂 classes/
│       └── 📄 Gimnasio.class         # Archivo compilado
├── 📂 nbproject/                      # Archivos de NetBeans
├── 📄 build.xml                       # Script de construcción
├── 📄 manifest.mf                     # Manifiesto
└── 📄 README.md                       # Este archivo
```

---

## ▶️ Cómo Ejecutar el Proyecto

### 📋 Requisitos Previos

| Requisito | Versión Mínima |
|:----------|:---------------|
| ☕ Java JDK | 11 o superior |
| 🖥️ Sistema Operativo | Windows, Linux o macOS |

### 🚀 Pasos de Instalación

```bash
# 1. Clonar el repositorio
git clone https://github.com/tatiana1104/java-practicas.git

# 2. Acceder a la carpeta del proyecto
cd java-practicas/1-basico/gimnasio

# 3. Compilar el archivo
javac src/gimnasio/Gimnasio.java

# 4. Ejecutar el programa
java -cp src gimnasio.Gimnasio
```

### 🖥️ Ejecución con NetBeans

1. Abre **NetBeans IDE**
2. Selecciona `File` → `Open Project`
3. Navega a la carpeta `gimnasio`
4. Presiona `F6` o haz clic en **Run Project**

---

## 📊 Ejemplo de Uso

```
========================================
🏋️ GIMNASIO "FORMA TU CUERPO"
========================================

CLIENTE 1
----------
PLANES:
* Individual (1)  
* Pareja (2)      
* Amigos (4)      

Ingrese Plan: individual

SERVICIOS:
* CROSS TRAINNING - Entrenamiento funcional
* MAQUINARIA - Toda la maquinaria del gimnasio
* TODO INCLUIDO - Servicio completo

Ingrese servicio: maquinaria

Ingrese Peso: 75
Ingrese Altura: 1.75

✅ CLIENTE 1, Valor a Pagar: $147,140

Nuevo cliente: 
1. SI
2. NO
→ 2

========================================
📊 RESUMEN DIARIO
========================================
👤 Planes Individual: 1
👫 Planes Pareja: 0
👬 Planes Amigos: 0
🏃 Cross Training: 0
🏋️ Maquinaria: 1
🌟 Todo Incluido: 0
💰 Total Recaudado: $147,140
========================================
```

---

## 🎯 Objetivos del Proyecto

| 🎯 | Objetivo |
|:--|:---------|
| 🔄 | Aplicar estructuras repetitivas (while) y condicionales (if-else) |
| 🧠 | Resolver un problema basado en un caso real |
| 🧮 | Practicar cálculos matemáticos en Java |
| 👥 | Desarrollar lógica de control para múltiples usuarios |
| 📱 | Implementar interacción con usuario por consola |

---

## 📈 Características del Código

| Característica | Estado |
|:--------------|:------:|
| Estructuras de Control | ✅ WHILE |
| Condicionales | ✅ IF-ELSE |
| Cálculos Matemáticos | ✅ IMC |
| Manejo de Variables | ✅ Enteros, Dobles, Strings |
| Entrada por Consola | ✅ BufferedReader |

---

## 🤝 Cómo Contribuir

¡Las contribuciones son bienvenidas! 🚀

1. 🍴 Haz un **Fork** del proyecto
2. 🔧 Crea una rama (`git checkout -b feature/nueva-funcionalidad`)
3. ✅ Realiza tus **Commits** (`git commit -m 'Agregar nueva funcionalidad'`)
4. 📤 Haz **Push** a la rama (`git push origin feature/nueva-funcionalidad`)
5. 🔗 Abre un **Pull Request**

---

## 📝 Licencia

Este proyecto está bajo la Licencia **MIT**. Consulta el archivo [LICENSE](LICENSE) para más detalles.

[![Licencia](https://img.shields.io/badge/Licencia-MIT-blue?style=for-the-badge&logo=open-source-initiative&logoColor=white)](LICENSE)

---

## 👩‍💻 Autora

<div align="center">

| | |
|:--|:--|
| **👤 Nombre** | Juddy Tatiana Vargas Santofimio |
| **🎓 Profesión** | Ingeniera de Sistemas – Desarrolladora Junior |
| **🐙 GitHub** | [tatiana1104](https://github.com/tatiana1104) |

</div>

---

<div align="center">

⭐️ *Si este proyecto te fue útil, no olvides给它 una estrella en GitHub!* ⭐️

---

📌 *Proyecto desarrollado con fines educativos y académicos.*  
🕐 *Última actualización: Febrero 2021*

</div>
