package com.mycompany.habitos_saludables.aplicacion;

import com.mycompany.habitos_saludables.usuario.Usuario;
import com.mycompany.habitos_saludables.registrohabito.RegistroHabito;
import com.mycompany.habitos_saludables.habito.Habito;
import com.mycompany.habitos_saludables.notificacion.Notificacion;

public class Aplicacion {

    private Usuario usuario;
    private Habito habito;
    private RegistroHabito registro;
    private Notificacion notificacion;

    // Constructor
    public Aplicacion(Usuario usuario, Habito habito, RegistroHabito registro, Notificacion notificacion) {
        this.usuario = usuario;
        this.habito = habito;
        this.registro = registro;
        this.notificacion = notificacion;
    }

    // Métodos
    public void registrarHabito(int id, String nombre, String descripcion) {
        habito = new Habito(id, nombre, descripcion);
        // Suponiendo que tienes un método para agregar hábitos al usuario o registro
        // usuario.agregarHabito(habito);
    }

    public void registrarNotificacion(int id, String mensaje, String fechaEnvio) {
        notificacion = new Notificacion(id, mensaje, fechaEnvio);
        // Suponiendo que tienes un método para agregar notificaciones al usuario
        // usuario.agregarNotificacion(notificacion);
    }

    public void enviarNotificacion(String mensaje, String fechaEnvio) {
        notificacion.enviarNotificacion(mensaje, fechaEnvio);
    }
}
