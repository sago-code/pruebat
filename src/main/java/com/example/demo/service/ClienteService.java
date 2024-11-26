package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.enums.TipoDocumento;
import org.springframework.stereotype.Service;

/**
 * Servicio que maneja la lógica de negocio relacionada con clientes.
 */
@Service
public class ClienteService {
    
    /**
     * Obtiene un cliente según su tipo y número de documento.
     * @param tipoDocumento tipo de documento del cliente
     * @param numeroDocumento número de documento del cliente
     * @return Cliente encontrado según los criterios de búsqueda
     */
    public Cliente obtenerClientePorDocumento(TipoDocumento tipoDocumento, String numeroDocumento) {
        // Validar que el documento existe (simulado)
        if (tipoDocumento == TipoDocumento.C && !numeroDocumento.equals("79856321")) {
            throw new RuntimeException("Cédula no encontrada");
        }
        if (tipoDocumento == TipoDocumento.P && !numeroDocumento.equals("99876567")) {
            throw new RuntimeException("Pasaporte no encontrado");
        }

        // Retornar siempre los mismos datos según el requerimiento
        Cliente cliente = new Cliente();
        cliente.setPrimerNombre("José");
        cliente.setSegundoNombre("Luis");
        cliente.setPrimerApellido("Pérez");
        cliente.setSegundoApellido("González");
        cliente.setTelefono("123456789");
        cliente.setDireccion("Calle Falsa 123");
        cliente.setCiudadResidencia("Bogotá");
        return cliente;
    }
} 