# 📝 Palabras con Más Caracteres

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Java-blue.svg)]()
[![Version](https://img.shields.io/badge/Version-1.0-orange.svg)]()
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

---

## 📋 Descripción del Proyecto

**Fecha de elaboración:** 06-02-2021

Proyecto desarrollado en **Java** como ejercicio académico de **Lógica y Algoritmos**, enfocado en el **manejo de cadenas de texto**, uso de ciclos y análisis de palabras dentro de un párrafo.

El programa permite ingresar un texto por consola y determina cuál es la **palabra con mayor cantidad de caracteres**, mostrando también el número total de letras de dicha palabra.

---

## 🎯 Objetivo del Proyecto

* ✅ Practicar el manejo de cadenas en Java
* ✅ Aplicar ciclos y comparaciones
* ✅ Analizar texto ingresado por el usuario
* ✅ Fortalecer la lógica de programación

---

## 📥 Problema a Resolver

Realice un algoritmo que le permita al usuario digitar un párrafo y se le informe cual es la palabra con más caracteres y cuántos la componen.

### 📊 Ejemplos de Entrada y Salida

| Entrada | Salida |
|---------|--------|
| **Párrafo:**<br>La Santa Iglesia Catedral de la Asunción de la Virgen es la catedral renacentista de Jaén, sede del obispado de Jaén, en la comunidad autónoma de Andalucía, España. La catedral actual fue concebida en el siglo XVI para sustituir al anterior templo gótico del siglo XV. La construcción se prolongó durante varios siglos, a pesar de lo cual la idea original permaneció intacta. Destacan la sala capitular y la sacristía, que son la obra cumbre de Andrés de Vandelvira, y una de las obras más importantes del renacimiento español. También es sobresaliente su fachada principal, una de las principales obras del barroco español, construida tras la consagración del templo en 1660. Igualmente, destaca el coro neoclásico debido a su belleza y al gran número de sitiales que lo convierten en uno de los más grandes de España. Una vez finalizadas las obras del edificio, las mismas continuaron en los siglos siguientes principalmente en la decoración interior y de las capillas. | **La palabra más larga es:** principalmente<br>**Número de letras:** 14 |
| **Párrafo:**<br>Además, a consecuencia del terremoto de Lisboa de 1755 fueron necesarias obras de consolidación en la fachada norte, así como la construcción de la Iglesia del Sagrario. | **La palabra más larga es:** consolidación<br>**Número de letras:** 13 |

---

## 🚀 Funcionalidades

| Funcionalidad | Descripción |
|---------------|-------------|
| 🧾 | Ingreso de un párrafo por consola |
| ✂️ | Separación del texto en palabras |
| 🔄 | Recorrido de palabras mediante ciclo `for` |
| 📏 | Comparación de longitudes de palabras |
| 🏆 | Identificación de la palabra más larga |
| 📊 | Visualización del resultado final |

---

## 🛠️ Tecnologías Utilizadas

<div align="center">

| Tecnología | Badge |
|------------|-------|
| Java | ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white) |
| String | ![String](https://img.shields.io/badge/String-Manejo-blue?style=flat-square) |
| StringTokenizer | ![StringTokenizer](https://img.shields.io/badge/StringTokenizer-Utils-green?style=flat-square) |
| BufferedReader | ![BufferedReader](https://img.shields.io/badge/BufferedReader-IO-red?style=flat-square) |

</div>

---

## 🧱 Estructura del Proyecto

```
PALABRASCONMASCARACTERES/
├── 📂 src/
│   └── 📂 palabrasconmascaracteres/
│       └── PalabrasConMasCaracteres.java
├── 📂 build/
│   └── 📂 classes/
├── 📂 nbproject/
├── 📂 test/
├── build.xml
├── manifest.mf
└── README.md
```

---

## ⚡ Cómo Ejecutar el Proyecto

### Opción 1: Usando NetBeans IDE

1. Abre **NetBeans IDE**
2. Selecciona `File` → `Open Project`
3. Navega a la carpeta `palabrasconmascaracteres`
4. Haz clic en **Open**
5. Presiona `F6` o clic en **Run Project**

### Opción 2: Usando Línea de Comandos

```bash
# 1. Clona el repositorio
git clone https://github.com/tatiana1104/java-practicas.git

# 2. Accede a la carpeta del proyecto
cd java-practicas/1-basico/palabrasconmascaracteres

# 3. Compila el archivo
javac src/palabrasconmascaracteres/PalabrasConMasCaracteres.java

# 4. Ejecuta el programa
java -cp src palabrasconmascaracteres.PalabrasConMasCaracteres
```

### Opción 3: Usando Ant (NetBeans)

```bash
# Compilar
ant build

# Ejecutar
ant run
```

---

## 🔧 Lógica del Programa

```
1. 📝 Solicitar un párrafo al usuario
2. 🔀 Dividir el texto en palabras usando StringTokenizer
3. 🔁 Recorrer las palabras una a una
4. ⚖️ Comparar la longitud de cada palabra
5. 💾 Almacenar la palabra con más caracteres
6. 📤 Mostrar los resultados por consola
```

---

## 📦 Requisitos del Sistema

| Requisito | Versión Mínima |
|-----------|----------------|
| Java JDK | 8 o superior |
| Sistema Operativo | Windows / macOS / Linux |
| Memoria RAM | 512 MB |
| Espacio en Disco | 50 MB |

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto:

1. Haz un **fork** del repositorio
2. Crea una rama (`git checkout -b feature/nueva-funcionalidad`)
3. Realiza tus cambios
4. Haz commit (`git commit -m 'Agrega nueva funcionalidad'`)
5. Sube tus cambios (`git push origin feature/nueva-funcionalidad`)
6. Abre un **Pull Request**

---

## 📝 Licencia

Este proyecto está bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## 👩‍💻 Autora

<div align="center">

**Juddy Tatiana Vargas Santofimio**

| | |
|:---:|:---|
| 💼 | Ingeniera de Sistemas – Desarrolladora Junior |
| 🐙 | [GitHub](https://github.com/tatiana1104) |


</div>

---

<div align="center">

⭐️ *Proyecto desarrollado con fines educativos y académicos.* ⭐️

</div>
