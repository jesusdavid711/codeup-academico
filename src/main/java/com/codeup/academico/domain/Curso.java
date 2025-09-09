package com.codeup.academico.domain;

public class Curso {
    private final String codigo;
    private String nombre;

    public Curso(String codigo, String nombre) {
        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("código requerido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre requerido");
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}
