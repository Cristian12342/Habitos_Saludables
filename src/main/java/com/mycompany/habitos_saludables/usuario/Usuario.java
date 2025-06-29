package com.mycompany.habitos_saludables.usuario;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.habitos_saludables.usuario.Habito;
public class Usuario {

    private int id;
    private String nombre;
    private String correoElectronico;
    private String password;
    private List<Habito> habitos; // Lista de hábitos

    // Constructor
    public Usuario(int id, String nombre, String correoElectronico, String password) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.habitos = new ArrayList<>();
    }

    // Agregar hábito
    public void agregarHabito(Habito habito) {
        habitos.add(habito);
    }

    // Eliminar hábito por id
    public void eliminarHabito(int idHabito) {
        habitos.removeIf(h -> h.getId() == idHabito);
    }

    // Obtener lista de hábitos
    public List<Habito> getHabitos() {
        return habitos;
    }

    // Getters y Setters
    public void iniciarSesion(String correoElectronico, String password) {
        if (this.correoElectronico.equals(correoElectronico) && this.password.equals(password)) {
            System.out.println("Inicio de sesión exitoso para " + nombre);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
    public void actualizarPerfil(String nuevoNombre, String nuevoCorreoElectronico) {
        this.nombre = nuevoNombre;
        this.correoElectronico = nuevoCorreoElectronico;
        System.out.println("Perfil actualizado: " + nombre + ", " + correoElectronico);
    }

    public int getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getCorreoElectronico() { 
        return correoElectronico; 
    }
    public boolean validarPassword(String password) { 
        return this.password.equals(password); 
    }
}
