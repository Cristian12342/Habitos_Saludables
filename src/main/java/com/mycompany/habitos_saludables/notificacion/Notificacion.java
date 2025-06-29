package com.mycompany.habitos_saludables.notificacion;

public class Notificacion implements INotificaciones {

    private int id;
    private String mensaje;
    private String fechaEnvio;

    // Constructor
    public Notificacion(int id, String mensaje, String fechaEnvio) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public void enviarNotificacion(String mensaje, String fechaEnvio) {
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        System.out.println("Notificación enviada: " + mensaje + " en " + fechaEnvio);
    }
}
