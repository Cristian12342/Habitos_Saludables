package com.mycompany.habitos_saludables.registrohabito;

public class RegistroHabito {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean completado;

    // Constructor
    public RegistroHabito(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completado = false; // Por defecto, el hábito no está completado
    }

    // Getters y Setters
    public void agregarRegistro(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void modificarRegistro(String nuevoNombre, String nuevaDescripcion) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
    }
}
