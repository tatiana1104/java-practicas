# 📝 Palabras con Más Caracteres

FEcha de eleboracion: 06-02-2021
Proyecto desarrollado en **Java** como ejercicio académico de **Lógica y Algoritmos**, enfocado en el **manejo de cadenas de texto**, uso de ciclos y análisis de palabras dentro de un párrafo.

El programa permite ingresar un texto por consola y determina cuál es la **palabra con mayor cantidad de caracteres**, mostrando también el número total de letras de dicha palabra.

---

## 📋 Descripción del problema

Realice un algoritmo que le permita al usuario digitar un párrafo y se le informe cual es la palabra con más caracteres y cuántos  la componen.

| Entrada | Salida |
|--------|--------|
| **Párrafo**:<br>La Santa Iglesia Catedral de la Asunción de la Virgen es la catedral renacentista de Jaén, sede del obispado de Jaén, en la comunidad autónoma de Andalucía, España. La catedral actual fue concebida en el siglo XVI para sustituir al anterior templo gótico del siglo XV. La construcción se prolongó durante varios siglos, a pesar de lo cual la idea original permaneció intacta. Destacan la sala capitular y la sacristía, que son la obra cumbre de Andrés de Vandelvira, y una de las obras más importantes del renacimiento español. También es sobresaliente su fachada principal, una de las principales obras del barroco español, construida tras la consagración del templo en 1660. Igualmente, destaca el coro neoclásico debido a su belleza y al gran número de sitiales que lo convierten en uno de los más grandes de España. Una vez finalizadas las obras del edificio, las mismas continuaron en los siglos siguientes principalmente en la decoración interior y de las capillas. | **La palabra más larga es:** principalmente<br>**Número de letras:** 14 |
| **Párrafo**:<br>Además, a consecuencia del terremoto de Lisboa de 1755 fueron necesarias obras de consolidación en la fachada norte, así como la construcción de la Iglesia del Sagrario. | **La palabra más larga es:** consolidación<br>**Número de letras:** 13 |

---

## 🚀 Funcionalidades

* 🧾 Ingreso de un párrafo por consola
* ✂️ Separación del texto en palabras
* 🔄 Recorrido de palabras mediante ciclo `for`
* 📏 Comparación de longitudes de palabras
* 🏆 Identificación de la palabra más larga
* 📊 Visualización del resultado final

---

## 🛠️ Tecnologías utilizadas

* Java
* Manejo de cadenas (`String`)
* `StringTokenizer`
* Ciclo `for`
* Entrada y salida por consola (`BufferedReader`)

---

## 🧱 Estructura del proyecto

```
PALABRASCONMASCARACTERES
└── palabrasconmascaracteres
    └── PalabrasConMasCaracteres.java
    └── README.md
```

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tatiana1104/java-practicas.git
   ```
2. Accede a la carpeta del proyecto:

   ```bash
   cd java-practicas/1-basico/PALABRASCONMASCARACTERES
   ```
3. Compila el archivo:

   ```bash
   javac PalabrasConMasCaracteres.java
   ```
4. Ejecuta el programa:

   ```bash
   java palabrasconmascaracteres.PalabrasConMasCaracteres
   ```

---

## 🧩 Lógica del programa

1. Se solicita un párrafo al usuario
2. Se divide el texto en palabras usando `StringTokenizer`
3. Se recorren las palabras una a una
4. Se compara la longitud de cada palabra
5. Se almacena la palabra con más caracteres
6. Se muestran los resultados por consola

---

## 🎯 Objetivo del proyecto

* Practicar el manejo de cadenas en Java
* Aplicar ciclos y comparaciones
* Analizar texto ingresado por el usuario
* Fortalecer la lógica de programación

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**
Ingeniera de Sistemas – Desarrolladora Junior
GitHub: [https://github.com/tatiana1104](https://github.com/tatiana1104)

---

📌 *Proyecto desarrollado con fines educativos y académicos.*
