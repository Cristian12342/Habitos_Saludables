package com.mycompany.habitos_saludables.estadisticas;

    public class Estadisticas {
    private int totalHabitos;
    private int habitosCompletados;
    private int porcentajeCompletados;

    public Estadisticas(int totalHabitos, int habitosCompletados) {
        this.totalHabitos = totalHabitos;
        this.habitosCompletados = habitosCompletados;
        this.porcentajeCompletados = calcularPorcentajeCompletados();
    }

    private int calcularPorcentajeCompletados() {
        if (totalHabitos == 0) {
            return 0;
        }
        return (habitosCompletados * 100) / totalHabitos;
    }

    public int getTotalHabitos() {
        return totalHabitos;
    }

    public int getHabitosCompletados() {
        return habitosCompletados;
    }

    public int getPorcentajeCompletados() {
        return porcentajeCompletados;
    }

    public void mostrarResumen() {
        System.out.println("Total de hábitos: " + totalHabitos);
        System.out.println("Hábitos completados: " + habitosCompletados);
        System.out.println("Porcentaje de hábitos completados: " + porcentajeCompletados + "%");
    }
}
