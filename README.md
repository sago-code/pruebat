# 👥 API de Consulta de Cliente - Prueba tecnica Santiago Orjuela Orjuela Vera

API REST que retorna la información de un cliente usando su documento.

## 🎯 Objetivo
Consultar datos de un cliente usando:
- Tipo de documento (C: Cédula, P: Pasaporte)
- Número de documento

## 🚀 Ejecutar proyecto
```

mvn spring-boot:run
```

## 📝 Ejemplo de uso
```
GET http://localhost:8080/api/clientes?tipoDocumento=C&numeroDocumento=79856321

GET http://localhost:8080/api/clientes?tipoDocumento=P&numeroDocumento=AK47891
```

## ✨ Respuesta
```json
{
    "primerNombre": "José",
    "segundoNombre": "Luis",
    "primerApellido": "Pérez",
    "segundoApellido": "González",
    "telefono": "123456789",
    "direccion": "Calle Falsa 123",
    "ciudadResidencia": "Bogotá"
}
```

## 🧪 Datos de prueba
- Cédula: 79856321
- Pasaporte: AK47891

## 📁 Estructura del proyecto
```

src/
├── main/java/com/example/
│   ├── demo/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── service/
│   │   └── enums/
│   └── pruebat/
│       └── PruebatApplication.java
```

## ⚙️ Tecnologías
- Java 23
- Spring Boot 3.4.0-M1
- Maven 3.9.9
```
