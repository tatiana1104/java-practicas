# 🏋️ Sistema de Gestión de Gimnasio

Fecha de elaboracion: 13-02-2021

Proyecto desarrollado en **Java** como ejercicio académico de **Lógica y Algoritmos**, aplicando estructuras de control **FOR, WHILE y DO-WHILE**, manejo de condicionales y cálculos matemáticos.

El sistema simula el proceso de **registro de clientes en un gimnasio**, permitiendo seleccionar planes, servicios adicionales, calcular el **IMC (Índice de Masa Corporal)**, aplicar descuentos y mostrar un **resumen diario** de ventas y estadísticas.

---

## 📋 Enunciado del problema

El gimnasio “Forma tu Cuerpo” ofrece 3 tipos de planes que se relacionan a continuación: 

| Plan       | Personas | Precio base |
| ---------- | -------- | ----------- |
| Individual | 1        | $140.000    |
| Pareja     | 2        | $250.000    |
| Amigos     | 4        | $480.000    |

Adicionalmente “Forma tu Cuerpo” tiene 3 grandes servicios para ofrecerles a sus clientes. A 
continuación se describen sus beneficios y precios: 

| Servicio       | Descripción                                            | Incremento  |
| -------------- | ------------------------------------------------------ | ----------- |
| Cross Training | Entrenamiento funcional                                | Precio base |
| Maquinaria     | Uso total de maquinaria + Cross Training               | +7%         |
| Todo Incluido  | Maquinaria + Cross Training + 2 horas de turco semanal | +15%        |

Así mismo, para incentivar la actividad física y la suscripción al gimnasio, “Forma tu cuerpo” realiza 
los siguientes descuentos dependiendo del Índice de Masa Corporal (IMC). Para los planes pareja y 
Amigos se selecciona una persona para realizar el cálculo. 
**IMC = Peso / Altura²**

| IMC          | Condición | Descuento |
| ------------ | --------- | --------- |
| Menor a 18.4 | Bajo peso | 5%        |
| 18.5 – 24.9  | Normal    | 2%        |
| 30 – 40      | Sobrepeso | 10%       |

De acuerdo a lo anteriormente descrito, usted ha sido seleccionado para desarrollar una solución 
que le permita al gimnasio llevar un control sobre los pagos diarios. De esta manera, este debe 
implementar un menú en el cual le permita al usuario seleccionar el plan y el servicio a suscribir, así 
mismo, solicitar el peso y la altura del cliente seleccionado para el cálculo del IMC, para conocer el 
valor a pagar. Cuando el gimnasio cierre, el sistema debe finalizar y mostrar la siguiente información:

-  Valor a pagar por cada usuario. 
-  Cantidad de planes suscritos en individual, pareja y amigos. 
-  Cantidad de servicios suscritos en cross training, maquinaria y todo incluido. 
-  Cantidad de plan pareja acreedores al 10% de descuento. 
-  Total recaudado a lo largo del día.

---

## 🚀 Funcionalidades

* 🧍 Registro de múltiples clientes en un mismo día
* 🏷️ Selección de plan (Individual, Pareja o Amigos)
* 🏋️ Selección de servicio adicional
* ⚖️ Ingreso de peso y altura
* 🧮 Cálculo automático del IMC
* 🎯 Aplicación de descuentos según IMC
* 💵 Cálculo del valor final a pagar
* 📈 Estadísticas finales del día

---

## 🧱 Estructura del proyecto

```
GIMNASIO
└── gimnasio
    └── Gimnasio.java
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
   cd java-practicas/1-basico/GIMNASIO
   ```
3. Compila el archivo:

   ```bash
   javac Gimnasio.java
   ```
4. Ejecuta el programa:

   ```bash
   java gimnasio.Gimnasio
   ```

---

## 🎯 Objetivo del proyecto

* Aplicar estructuras repetitivas y condicionales
* Resolver un problema basado en un caso real
* Practicar cálculos matemáticos en Java
* Desarrollar lógica de control para múltiples usuarios

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**
Ingeniera de Sistemas – Desarrolladora Junior
GitHub: [https://github.com/tatiana1104](https://github.com/tatiana1104)

---

📌 *Proyecto desarrollado con fines educativos y académicos.*
