package com.example.demo.controller;

import com.example.pruebat.PruebatApplication;
import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(ClienteController.class)
@ContextConfiguration(classes = PruebatApplication.class)
@Import(ClienteService.class)
public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ClienteService clienteService;

    @Test
    public void cuandoDocumentoValido_entoncesRetornaCliente() throws Exception {
        // Given
        Cliente clienteMock = new Cliente();
        clienteMock.setPrimerNombre("José");
        when(clienteService.obtenerClientePorDocumento(any(), any())).thenReturn(clienteMock);

        // When & Then
        mockMvc.perform(get("/api/clientes")
                .param("tipoDocumento", "C")
                .param("numeroDocumento", "79856321"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.primerNombre").value("José"));
    }

    @Test
    public void cuandoTipoDocumentoInvalido_entoncesRetornaError() throws Exception {
        mockMvc.perform(get("/api/clientes")
                .param("tipoDocumento", "X")
                .param("numeroDocumento", "79856321"))
                .andExpect(status().isBadRequest());
    }
} 