package com.mycompany.habitos_saludables.controlador;

import com.mycompany.habitos_saludables.usuario.Usuario;
import com.mycompany.habitos_saludables.habito.Habito;
import com.mycompany.habitos_saludables.vista.HabitosVista;
import java.util.List;

public class ControladorHabitos {
    private Usuario usuario;
    private List<Usuario> usuarios;
    private HabitosVista vista;

    public ControladorHabitos(Usuario usuario, List<Usuario> usuarios) {
        this.usuario = usuario;
        this.usuarios = usuarios;
        this.vista = new HabitosVista(usuario, usuarios); // <-- ahora pasas ambos
        vista.setVisible(true);
    }

    private void actualizarVista() {
        java.util.List<Habito> habitos = usuario.getHabitos();
        if (habitos.size() > 0) {
            vista.getjCheckBox1().setText(habitos.get(0).getNombre());
            vista.getjCheckBox1().setSelected(habitos.get(0).estaCompletado());
        }
        if (habitos.size() > 1) {
            vista.getjCheckBox2().setText(habitos.get(1).getNombre());
            vista.getjCheckBox2().setSelected(habitos.get(1).estaCompletado());
        }
    }
}
