# 🛍️ Tienda de Ropa "Macarena" 

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![NetBeans IDE](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)
[![Version](https://img.shields.io/badge/Version-1.0-blue?style=for-the-badge)](https://github.com)
[![Status](https://img.shields.io/badge/Status-Activo-success?style=for-the-badge)](https://github.com)

---

> 📝 **Ejercicio 1** — Proyecto de programación en Java desarrollado como parcial académico.

**Fecha de elaboración:** 28-01-2021  
**Autora:** Juddy Tatiana Vargas Santofimio


---

## 📌 Descripción

Este programa corresponde al **Ejercicio 1 de un parcial de programación en Java**. La aplicación permite determinar la **talla** de una blusa según las medidas de la clienta (busto y cintura) y calcular el **precio final** de la prenda de acuerdo con el **estilo seleccionado** y la **talla obtenida**.

El sistema valida si las medidas ingresadas se encuentran dentro del tallaje manejado por la tienda. En caso contrario, informa que no hay blusas disponibles para esas medidas.

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java** | Lenguaje de programación orientado a objetos |
| 💻 **NetBeans IDE** | Entorno de desarrollo integrado |
| 📊 **Condicionales** | Lógica if/else para validaciones |
| 🧮 **Operaciones Aritméticas** | Cálculos de porcentajes y precios |

---

## 📏 Tabla de Tallas

| Talla | Busto (cm) | Cintura (cm) | Emoji |
| :---: | :--------: | :----------: | :---: |
| **S** | 89 – 94   | 67 – 72     | 👚    |
| **M** | 95 – 100  | 73 – 78     | 👕    |
| **L** | 101 – 105 | 79 – 92     | 👔    |

---

## 👚 Estilos y Precios Base

| Estilo | Precio Base (COP) | Emoji |
| :----: | ----------------: | :---: |
| Camelia | $35.000 | 🌸 |
| Paradise | $40.000 | 🌴 |
| Safari | $48.000 | 🦁 |
| Exotic | $52.000 | 🦋 |

---

## 💲 Incremento Según Talla

| Talla | Incremento | Descripción |
| :---: | :--------: | ----------- |
| **S** | 0% | Precio base del estilo |
| **M** | +3% | Precio base + 3% |
| **L** | +5% | Precio base + 5% |

---

## 🧮 Lógica del Programa

1. 📥 Se ingresan las medidas de **busto** y **cintura**.
2. 📏 El sistema determina la **talla** correspondiente según los rangos definidos.
3. 👗 Se ingresa el **estilo de la blusa**.
4. 💰 Se obtiene el **precio base** según el estilo.
5. 🧾 Se calcula el **precio final** aplicando el incremento correspondiente a la talla.
6. ⚠️ Si las medidas no coinciden con ninguna talla, se muestra un mensaje de error.

---

## ▶️ Ejemplos de Ejecución

### ❌ Caso Sin Talla Válida

**Entrada:**
- Busto: 90 cm
- Cintura: 95 cm
- Estilo: Camelia

**Salida:**
```
Lo sentimos, en "Macarena" no tenemos blusas con esas medidas
```

---

### ✅ Caso Válido

**Entrada:**
- Busto: 98 cm
- Cintura: 75 cm
- Estilo: Safari

**Salida:**
```
Precio Final: 49440
```

> 💡 **Nota:** El precio se calcula así: $48,000 + 3% = $48,000 + $1,440 = **$49,440**

---

## 💾 Instalación y Ejecución

### Prerrequisitos

- ☕ Java JDK 8 o superior instalado
- 💻 NetBeans IDE (opcional) o cualquier IDE de Java

### Pasos para Ejecutar

1. **Clonar el repositorio:**
   
```bash
   git clone https://github.com/tatiana1104/java-practicas
   cd 1-basico/1-parciales/1_tienda_de_ropa
```

2. **Compilar el proyecto:**
   
```bash
   javac src/tienda_de_ropa/Tienda_De_Ropa.java
```

3. **Ejecutar el programa:**
   
```bash
   java -cp src tienda_de_ropa.Tienda_De_Ropa   
```

   O si usas **NetBeans**, simplemente presiona `F6` o el botón de ejecutar.

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---

⭐️ ¡Gracias por visitar este proyecto! ⭐️

**Hecho con ❤️ y Java ☕**

