# Getting Started

## Proyecto HotelRest

Sistema de gestión de hotel usando Spring Boot y REST API.

### Endpoints disponibles

- `GET /api/habitaciones` - Listar todas las habitaciones
- `GET /api/habitaciones/{id}` - Obtener habitación por ID
- `POST /api/habitaciones` - Crear nueva habitación
- `DELETE /api/habitaciones/{id}` - Eliminar habitación

### Ejemplo de habitación (JSON)

```json
{
  "numero": "101",
  "tipo": "SIMPLE",
  "precioPorNoche": 75.00,
  "disponible": true
}
```

### Requisitos

- Java 17+
- MySQL 8.x
- Maven 3.6+

### Configuración de base de datos

Crea la base de datos antes de arrancar:
```sql
CREATE DATABASE IF NOT EXISTS db_hotel;
```

### Arrancar el proyecto

```bash
mvn spring-boot:run
```
