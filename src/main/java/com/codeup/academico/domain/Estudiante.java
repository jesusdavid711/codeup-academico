package com.codeup.academico.domain;

// Esta clase representa un estudiante
public class Estudiante {
    private final String id;     // Identificador único del estudiante
    private String nombre;       // Nombre del estudiante

    // Constructor: crea un estudiante con id y nombre
    public Estudiante(String id, String nombre) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id requerido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre requerido");
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos para obtener los datos del estudiante
    public String getId() { return id; }
    public String getNombre() { return nombre; }
}