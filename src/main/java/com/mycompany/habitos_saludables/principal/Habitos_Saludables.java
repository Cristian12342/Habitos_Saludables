/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.habitos_saludables.principal;

import com.mycompany.habitos_saludables.usuario.Usuario;
import com.mycompany.habitos_saludables.habito.Habito;
import com.mycompany.habitos_saludables.vista.HomeVista;
import com.mycompany.habitos_saludables.vista.HabitosVista;
import com.mycompany.habitos_saludables.vista.RegistroVista;
import com.mycompany.habitos_saludables.vista.EstadisticasVista;
import com.mycompany.habitos_saludables.controlador.ControladorHabitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Habitos_Saludables {

    public static void main(String[] args) {
        java.util.List<com.mycompany.habitos_saludables.usuario.Usuario> usuarios = new java.util.ArrayList<>();
        usuarios.add(new com.mycompany.habitos_saludables.usuario.Usuario(1, "Juan", "juan@email.com", "1234"));
        usuarios.add(new com.mycompany.habitos_saludables.usuario.Usuario(2, "Ana", "ana@email.com", "abcd"));

        usuarios.get(0).agregarHabito(new com.mycompany.habitos_saludables.habito.Habito(1, "Beber agua", "Beber 2 litros de agua al día"));
        usuarios.get(1).agregarHabito(new com.mycompany.habitos_saludables.habito.Habito(1, "Leer", "Leer 20 minutos diarios"));

        new com.mycompany.habitos_saludables.vista.IniciarSecionVista(usuarios).setVisible(true);
    }
}


