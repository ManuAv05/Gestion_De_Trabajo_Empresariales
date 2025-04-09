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

- **Usuario**
- **Proyecto**
- **Tarea**
- **Equipo**
- **Rol**

---

## 🏗️ Diagrama de Clases UML

El diseño del sistema incluye:

- ✔ Herencia (por ejemplo, `Usuario` como clase base de `Administrador` y `Colaborador`)
- ✔ Asociación entre `Proyecto` y `Tarea` (1 a muchos)
- ✔ Composición entre `Equipo` y `Usuario`
- ✔ Visibilidad (`+`, `-`, `#`), tipos de datos y métodos definidos

*El diagrama fue creado con MODELIO 5, lo que permitió la generación automática del código base.*

---

## 🧰 Herramienta UML Utilizada

> **MODELIO 5**
> - Permite diseñar diagramas de clases completos.
> - Ofrece generación automática del esqueleto de código.
> - Exporta en formatos estándar para integración en proyectos reales.

---

## 💻 Lenguaje de Programación

El código base ha sido generado en **JAVA**, estructurado en clases siguiendo el modelo UML. Se ha añadido parte de la lógica funcional manualmente para representar comportamientos clave del sistema, como:

- Crear un proyecto con tareas asignadas.
- Asignar usuarios a proyectos o equipos.
- Marcar tareas como completadas.

---

## 📂 Estructura del Repositorio

