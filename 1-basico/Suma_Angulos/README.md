# 📐 Suma de Ángulos en Java

Proyecto desarrollado en **Java** como ejercicio académico de **Lógica y Algoritmos**.

Este programa en Java permite realizar la suma de dos ángulos, expresados en grados, minutos y segundos, aplicando validaciones y conversiones automáticas cuando los valores superan los límites permitidos.

El sistema solicita al usuario los datos de dos ángulos, valida que estén dentro del rango correcto y muestra el resultado final normalizado.
---

## 📋 Descripción del problema

- Los grados no pueden ser mayores a 90
- Los minutos y segundos no pueden ser mayores a 60
- Si los segundos superan 60, se convierten en minutos
- Si los minutos superan 60, se convierten en grados

| Entrada | Salida |
|--------|--------|
| Primer ángulo: <br> Grados: 30 <br> Minutos: 45 <br> Segundos: 50 | El resultado de la suma es: 51° 16' 10'' |
| Segundo ángulo: <br> Grados: 20 <br> Minutos: 30 <br> Segundos: 20 | El resultado de la suma es:     |

---

## 🛠️ Tecnologías utilizadas

* Java SE
* BufferedReader
* InputStreamReader
* Estructuras de control (if, while)

---

## 🧱 Estructura del proyecto

```
suma_angulos/
├── src/
│   └── suma_angulos/
│       └── Suma_Angulos.java
├── README.md
```

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tatiana1104/java-practicas.git
   ```
2. Accede a la carpeta del proyecto:

   ```bash
   cd java-practicas/1-basico/SUMA_ANGULOS
   ```
3. Compila el archivo:

   ```bash
   javac Suma_Angulos.java
   ```
4. Ejecuta el programa:

   ```bash
   java suma_angulos.Suma_Angulos
   ```

---

## 🧩 Lógica del programa

1. Solicita los datos del primer ángulo
2. Valida grados, minutos y segundos
3. Solicita los datos del segundo ángulo
4. Valida nuevamente los datos
5. Realiza la suma
6. Ajusta valores excedentes
7. Se muestran los resultados por consola

---

## 🎯 Objetivo del proyecto

* Practicar entrada de datos por consola
* Aplicar estructuras de control (while, if)
* Realizar validaciones
* Trabajar con operaciones aritméticas y conversiones

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**
Ingeniera de Sistemas – Desarrolladora Junior
GitHub: [https://github.com/tatiana1104](https://github.com/tatiana1104)

---

📌 *Proyecto desarrollado con fines educativos y académicos.*