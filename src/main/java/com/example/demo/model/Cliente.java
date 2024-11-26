package com.example.demo.model;

/**
 * Clase que representa la entidad Cliente en el sistema.
 */
public class Cliente {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;

    /**
     * Constructor por defecto de Cliente.
     */
    public Cliente() {}

    /**
     * Obtiene el primer nombre del cliente.
     * @return primer nombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Establece el primer nombre del cliente.
     * @param primerNombre primer nombre a establecer
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la ciudad de residencia del cliente.
     * @return String con la ciudad de residencia
     */
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    /**
     * Establece la ciudad de residencia del cliente.
     * @param ciudadResidencia nueva ciudad de residencia
     */
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
} 