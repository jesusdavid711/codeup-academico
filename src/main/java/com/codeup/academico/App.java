package com.codeup.academico;

import com.codeup.academico.domain.Curso;
import com.codeup.academico.domain.Estudiante;

// Esta clase es el punto de inicio del programa
public class App {
    public static void main(String[] args) {
        System.out.println("Sistema Académico CodeUp iniciado correctamente");
        // ...dentro del método main en App.java...
        Estudiante estudiante = new Estudiante("1", "Ana Pérez");
        Curso curso = new Curso("101", "Programación Java");

        System.out.println("Estudiante: " + estudiante.getNombre() + " (ID: " + estudiante.getId() + ")");
        System.out.println("Curso: " + curso.getNombre() + " (Código: " + curso.getCodigo() + ")");
    }
}