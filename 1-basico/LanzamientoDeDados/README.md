# 🎲 Lanzamiento de Dados

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![NetBeans IDE](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)](https://netbeans.apache.org/)
[![Platform](https://img.shields.io/badge/Platform-Java%20Console-blue?style=for-the-badge&logo=linux&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge&logo=open-source-initiative&logoColor=white)](https://opensource.org/licenses/MIT)
[![Author](https://img.shields.io/badge/Author-Juddy%20Tatiana%20Vargas-purple?style=for-the-badge&logo=github&logoColor=white)](https://github.com/tatiana1104)

---

## 📌 Descripción del Proyecto

El proyecto **Lanzamiento de Dados** es una aplicación Java de consola que simula N lanzamientos de un dado, donde el número de lanzamientos es ingresado por el usuario. El programa calcula el promedio de los valores obtenidos y determina cuáles y cuántos lanzamientos estuvieron por encima del promedio.

Los resultados se muestran directamente en la consola de manera clara y organizada.

---

## ✨ Características

- 🎯 **Simulación de dados**: Genera valores aleatorios entre 1 y 6
- 📊 **Cálculo de promedio**: Calcula automáticamente el promedio de los lanzamientos
- 🔍 **Análisis estadístico**: Identifica y cuenta los lanzamientos superiores al promedio
- 💻 **Interfaz de consola**: Interacción simple y directa con el usuario
- 🧠 **Ejercicio académico**: Ideal para practicar conceptos básicos de programación en Java

---

## 🛠️ Requisitos Previos

| Requisito | Versión Mínima |
|-----------|----------------|
| Java JDK  | 8 o superior   |
| IDE       | NetBeans, VS Code o cualquier editor de texto |
| Sistema Operativo | Windows, Linux o macOS |

---

## 📥 Instalación y Ejecución

### Opción 1: Usando NetBeans

1. Abre **NetBeans IDE**
2. Ve a `File` → `Open Project`
3. Navega a la carpeta `lanzamientodedados`
4. Presiona **F6** o haz clic en `Run Project`

### Opción 2: Compilación Manual

```bash
# Compilar el proyecto
cd lanzamientodedados
javac src/lanzamientodedados/LanzamientoDeDados.java -d build/classes

# Ejecutar el programa
java -cp build/classes lanzamientodedados.LanzamientoDeDados
```

### Opción 3: Con Ant (NetBeans)

```bash
ant run
```

---

## 💡 Ejemplo de Uso

```
Ingrese numero de lanzamientos: 5
Promedio de lanzamientos: 3.0
Lanzamientos por encima del promedio
Cuales: 
4
5
Cuantos: 
2
```

---

## 🎓 Objetivos Académicos

| Objetivo | Descripción |
|----------|-------------|
| ✅ Arreglos unidimensionales | Practicar el uso de arrays en Java |
| 🔄 Ciclos | Aplicar estructuras repetitivas (for) |
| ⚡ Condicionales | Implementar estructuras de decisión (if) |
| 🎲 Números aleatorios | Utilizar generación aleatoria de valores |
| 📈 Cálculo de promedio | Realizar operaciones matemáticas con datos |
| 🧩 Pensamiento lógico | Desarrollar análisis de datos básico |

---

## 🔧 Funcionamiento del Programa

1. 📥 El usuario ingresa el número de lanzamientos (N)
2. 📦 Se crea un arreglo para almacenar los resultados
3. 🎲 Se generan valores aleatorios entre 1 y 6
4. 📊 Se calcula el promedio de los lanzamientos
5. 🔎 Se identifican los valores superiores al promedio
6. 📤 Se muestran los resultados en consola

---

## 🧰 Tecnologías Utilizadas

- **Lenguaje**: Java
- **IDE**: Apache NetBeans
- **Build Tool**: Ant
- **Plataforma**: Java Virtual Machine (JVM)

---

## 👩‍💻 Autora

**Juddy Tatiana Vargas Santofimio**

*Ingeniera de Sistemas – Desarrolladora Junior*

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=flat-square&logo=github&logoColor=white)](https://github.com/tatiana1104)

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor crea un fork del repositorio y envía un pull request.

---

📌 *Proyecto desarrollado con fines educativos y académicos.*

📅 *Fecha de elaboración: 24-11-2020*
