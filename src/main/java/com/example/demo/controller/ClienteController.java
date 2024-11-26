package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import com.example.demo.enums.TipoDocumento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST que maneja las operaciones relacionadas con clientes.
 */
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    private ClienteService clienteService;

    /**
     * Obtiene la información de un cliente por su tipo y número de documento.
     *
     * @param tipoDocumento tipo de documento (C: Cédula, P: Pasaporte)
     * @param numeroDocumento número del documento
     * @return ResponseEntity con la información del cliente o mensaje de error
     */
    @GetMapping
    public ResponseEntity<?> obtenerCliente(
            @RequestParam(required = true) String tipoDocumento,
            @RequestParam(required = true) String numeroDocumento) {
        
        logger.info("Iniciando consulta de cliente - Tipo: {}, Número: {}", tipoDocumento, numeroDocumento);
        
        try {
            // Validar tipo documento
            if (tipoDocumento == null || tipoDocumento.trim().isEmpty()) {
                logger.error("Tipo de documento vacío");
                return ResponseEntity.badRequest().body("El tipo de documento es obligatorio");
            }
            if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
                logger.error("Tipo de documento inválido: {}", tipoDocumento);
                return ResponseEntity.badRequest()
                    .body("Tipo de documento inválido. Solo se permite 'C' (Cédula de ciudadanía) o 'P' (Pasaporte)");
            }

            // Validar número documento
            if (numeroDocumento == null || numeroDocumento.trim().isEmpty()) {
                logger.error("Número de documento vacío");
                return ResponseEntity.badRequest().body("El número de documento es obligatorio");
            }

            // Obtener cliente
            Cliente cliente = clienteService.obtenerClientePorDocumento(
                TipoDocumento.valueOf(tipoDocumento), numeroDocumento);
            logger.info("Cliente encontrado exitosamente");
            return ResponseEntity.ok(cliente);
            
        } catch (Exception e) {
            logger.error("Error al consultar cliente: {}", e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
} 