package com.mycompany.habitos_saludables.registro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RegistroDiario implements Serializable {
    private String dia;
    private Map<String, Boolean> habitosCompletados; // nombre del hábito y si se completó

    public RegistroDiario(String dia) {
        this.dia = dia;
        this.habitosCompletados = new HashMap<>();
    }

    public String getDia() { return dia; }

    public void setHabito(String nombreHabito, boolean completado) {
        habitosCompletados.put(nombreHabito, completado);
    }

    public Map<String, Boolean> getHabitosCompletados() {
        return habitosCompletados;
    }
}