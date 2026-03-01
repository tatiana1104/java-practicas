# 📐 Suma de Ángulos en Java

![Java](https://img.shields.io/badge/Java-SE-blue?style=for-the-badge&logo=java)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Version](https://img.shields.io/badge/Version-1.0-orange?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)

> Proyecto desarrollado en **Java** como ejercicio académico de **Lógica y Algoritmos**.

Este programa en Java permite realizar la suma de dos ángulos, expresados en grados, minutos y segundos, aplicando validaciones y conversiones automáticas cuando los valores superan los límites permitidos.

---

## ✨ Características

- ✅ Validación de grados (máximo 90°)
- ✅ Validación de minutos y segundos (máximo 60)
- ✅ Conversión automática de segundos a minutos
- ✅ Conversión automática de minutos a grados
- ✅ Interfaz por consola interactiva

---

## 📋 Descripción del Problema

- Los grados no pueden ser mayores a 90
- Los minutos y segundos no pueden ser mayores a 60
- Si los segundos superan 60, se convierten en minutos
- Si los minutos superan 60, se convierten en grados

### 📊 Tabla de Ejemplo

| Entrada | Salida |
|---------|--------|
| Primer ángulo: <br> 🎓 Grados: 30 <br> ⏱️ Minutos: 45 <br> ⏲️ Segundos: 50 | El resultado de la suma es: **51° 16' 10''** |
| Segundo ángulo: <br> 🎓 Grados: 20 <br> ⏱️ Minutos: 30 <br> ⏲️ Segundos: 20 | El resultado de la suma es: **51° 16' 10''** |

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| ☕ **Java SE** | Lenguaje de programación orientado a objetos |
| 📖 **BufferedReader** | Lectura de entrada por consola |
| 🔄 **InputStreamReader** | Flujo de entrada de datos |
| 🔀 **Estructuras de control** | If, While para validaciones |

---

## 🏗️ Estructura del Proyecto

```
📂 suma_angulos/
├── 📄 src/
│   └── 📄 suma_angulos/
│       └── 📄 Suma_Angulos.java    # Código principal
├── 📄 build.xml                     # Configuración de build
├── 📄 manifest.mf                  # Manifiesto de la aplicación
└── 📄 README.md                     # Documentación
```

---

## ▶️ Cómo Ejecutar el Proyecto

### Prerrequisitos

| Requisito | Versión Mínima |
|-----------|----------------|
| ☕ Java Development Kit (JDK) | 8 o superior |
| 💻 Sistema Operativo | Windows / Linux / macOS |

### Pasos de Ejecución

1. **Clona el repositorio:**

   
```bash
   git clone https://github.com/tatiana1104/java-practicas.git   
```

2. **Accede a la carpeta del proyecto:**

   
```bash
   cd java-practicas/1-basico/suma_angulos   
```

3. **Compila el archivo:**

   
```bash
   javac src/suma_angulos/Suma_Angulos.java
```

4. **Ejecuta el programa:**

   
```bash
   java -cp src suma_angulos.Suma_Angulos   
```

---

## 🧩 Lógica del Programa

```
┌─────────────────────────────────────┐
│ 1. Solicita datos del primer ángulo │
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 2. Valida grados, minutos, segundos │
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 3. Solicita datos del segundo ángulo│
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 4. Valida los datos ingresados      │
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 5. Realiza la suma de ángulos       │
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 6. Ajusta valores excedentes        │
└──────────────────┬──────────────────┘
                   ▼
┌─────────────────────────────────────┐
│ 7. Muestra el resultado final       │
└─────────────────────────────────────┘
```

---

## 🎯 Objetivos del Proyecto

- 📚 Practicar entrada de datos por consola
- 🔀 Aplicar estructuras de control (while, if)
- ✅ Realizar validaciones de datos
- 🧮 Trabajar con operaciones aritméticas y conversiones
- 🔧 Familiarizarse con herramientas de desarrollo (NetBeans)

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto:

1. 🍴 Haz un fork del repositorio
2. 🌿 Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. ✏️ Realiza tus cambios y haz commit (`git commit -m 'Agregar nueva funcionalidad'`)
4. 📤 Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. 🔃 Abre un Pull Request

---

## 📝 Licencia

Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más detalles.

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**

🎓 Ingeniera de Sistemas – Desarrolladora Junior

---

## 🙏 Agradecimientos

- ⭐ A los profesores de Lógica y Algoritmos
- 📚 A la comunidad de desarrolladores Java
- 🌟 A todos los que visitan y contribuyen al proyecto

---

<div align="center">

📌 *Proyecto desarrollado con fines educativos y académicos.*

⭐ *¡No olvides dar una estrella si te fue útil!*

</div>
