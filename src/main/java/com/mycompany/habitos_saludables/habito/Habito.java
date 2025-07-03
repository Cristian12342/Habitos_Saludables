package com.mycompany.habitos_saludables.habito;

public class Habito {

    private int id;
    private String nombre;
    private String descripcion;
    private boolean completado;

    // Constructor
    public Habito(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completado = false; // Por defecto, el hábito no está completado
    }

    // Modificar hábito
    public void modificarHabito(String nuevoNombre, String nuevaDescripcion) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
    }

    // Marcar como completado
    public void marcarComoCompletado() {
        this.completado = true;
    }

    // Eliminar hábito (opcional: puedes eliminarlo desde Usuario)
    public void eliminarHabito() {
        this.nombre = null;
        this.descripcion = null;
        this.completado = false; // Resetea el estado del hábito
    }

    // Getters
    public int getId() {   
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getDescripcion() { 
        return descripcion; 
    }
    public boolean estaCompletado() { 
        return completado; 
    }
}
