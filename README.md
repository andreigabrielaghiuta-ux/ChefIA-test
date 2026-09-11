# ChefIA - Asistente Nutricional Personalizado con IA

> **Estado del Proyecto:** *En Construcción / En Desarrollo*
>
> **ChefIA** es una aplicación web diseñada para la gestión de nutrición personalizada, planificación de menús y generación de recetas adaptadas a los objetivos, alergias y condiciones de salud de cada usuario mediante Inteligencia Artificial.

---

## Tecnologías y Arquitectura

El proyecto está diseñado bajo una arquitectura desacoplada con **Backend** y **Frontend**:

### **Backend**
- **Lenguaje / Framework:** Java 17+ | Spring Boot
- **Persistencia & ORM:** Spring Data JPA / Hibernate
- **Base de Datos:** SQLite (`chefia.db`)
- **Seguridad:** Spring Security (Encriptado de contraseñas)
- **Gestión de dependencias:** Maven

### **Frontend**
- **Librería / Tooling:** React + Vite
- **Calidad de código:** Oxlint / ESLint
- **Gestión de paquetes:** npm

---

## Estructura del Proyecto

```text
ChefIA/
├── DATABASE/       # Base de datos SQLite (chefia.db)
├── DOCS/           # Documentación y diagramas del proyecto
├── backend/        # Proyecto Spring Boot (Entidades, DTOs, Repositorios, Servicios...)
└── frontend/       # Aplicación React + Vite
