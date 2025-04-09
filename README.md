# 📁 Gestor de Proyectos - Modelado UML

> Proyecto desarrollado para la asignatura de **Entornos de Desarrollo**  
> 1º Curso del CFGS en Desarrollo de Aplicaciones Multiplataforma

## 🧩 Descripción del Proyecto

Este proyecto tiene como objetivo el **modelado orientado a objetos** de un sistema de gestión de proyectos, usando UML como técnica principal. A partir del análisis del problema, se identificaron las entidades clave, sus relaciones, atributos y comportamientos, permitiendo generar automáticamente la estructura de código base en el lenguaje de programación elegido.

El enfoque ha sido representar cómo diferentes actores pueden gestionar proyectos, tareas y equipos de trabajo dentro de una organización o entorno colaborativo.

---

## 📌 Requisitos del Proyecto

- ✅ Análisis y modelado del problema.
- ✅ Diagrama de clases UML completo (atributos, métodos y relaciones).
- ✅ Uso de herramienta UML con generación automática de código.
- ✅ Código generado en el lenguaje seleccionado.
- ✅ Implementación parcial de la lógica del sistema.
- ✅ Documentación en Markdown.
- ✅ Presentación breve para la exposición.

---

## 🧠 Análisis del Problema

Se planteó un sistema que permita a los usuarios gestionar múltiples proyectos, organizados por tareas, con responsables asignados y fechas de entrega. Las principales entidades identificadas son:

- **Trabajadores** (clase abstracta)
  - **Empleado** (subclase)
- **Proyecto**

Estas entidades permiten organizar los recursos humanos y el seguimiento de los proyectos en desarrollo.

---

## 🏗️ Diagrama de Clases UML

El diseño del sistema incluye:

- ✔ **Herencia**: La clase abstracta `Trabajadores` es la superclase de `Empleado`.
- ✔ **Encapsulamiento**: Uso de atributos `private` y métodos públicos.
- ✔ **Asociación**: La clase `Proyecto` contiene una lista de personas implicadas en forma de array/lista.
- ✔ **Uso de fechas**: Empleo de `Date` para la fecha de ingreso en trabajadores, y `String` para fechas de proyectos (simplificado).
- ✔ **Anotaciones UML**: Anotaciones de Modelio (`@objid`) para representar metadatos de diseño.

---

## 💾 Clases Implementadas

### 🔹 `Trabajadores` (abstracta)
Clase base que representa a cualquier trabajador del sistema.

**Atributos**:
- `String nombre`
- `String apellido`
- `String DNI`
- `int edad`
- `String direccion`
- `Date fecha_Ingreso`
- `int sueldo_base`

**Método**:
- `mostrarInformacion()` – método abstracto para mostrar los datos del trabajador.

---

### 🔹 `Empleado` (hereda de `Trabajadores`)
Representa un empleado con un cargo específico.

**Atributos adicionales**:
- `String cargo`
- `String puesto_trabajo`

**Métodos**:
- Constructor con parámetros.
- Sobrescritura de `mostrarInformacion()`.

---

### 🔹 `Proyecto`
Define un proyecto que puede contener varias personas asignadas.

**Atributos**:
- `String nombre`
- `String descripcion`
- `String[] lista_personas`
- `String estado_proyecto`
- `String fecha_inicio`
- `String fecha_fin`

**Constructor**:
- Recibe todos los parámetros anteriores, incluyendo una lista de personas.

---

## 🧰 Herramienta UML Utilizada

> **MODELIO 5**
> - Permite diseñar diagramas de clases completos.
> - Ofrece generación automática del esqueleto de código.
> - Exporta en formatos estándar para integración en proyectos reales.

---

## 💻 Lenguaje de Programación

El código base ha sido generado en **JAVA**, estructurado en clases siguiendo el modelo UML. Se ha añadido parte de la lógica funcional manualmente para representar comportamientos clave del sistema, como:

- Crear un empleado con cargo y puesto.
- Mostrar información básica de trabajadores.
- Crear un proyecto con personas asignadas y fechas definidas.

---

## 📂 Estructura del Repositorio

