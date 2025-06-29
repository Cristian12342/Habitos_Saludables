/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.habitos_saludables.principal;

import com.mycompany.habitos_saludables.aplicacion.Aplicacion;
import com.mycompany.habitos_saludables.usuario.Usuario;
import com.mycompany.habitos_saludables.usuario.Habito;
import com.mycompany.habitos_saludables.registrohabito.RegistroHabito;
import com.mycompany.habitos_saludables.notificacion.Notificacion;
import com.mycompany.habitos_saludables.estadisticas.Estadisticas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Calavera
 */
public class Habitos_Saludables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "Juan", "juan@email.com", "1234"));
        usuarios.add(new Usuario(2, "Ana", "ana@email.com", "abcd"));

        // Agregar hábitos iniciales a cada usuario
        usuarios.get(0).agregarHabito(new Habito(1, "Beber agua", "Beber 2 litros de agua al día"));
        usuarios.get(1).agregarHabito(new Habito(1, "Leer", "Leer 20 minutos diarios"));

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- INICIO DE SESIÓN ---");
            System.out.print("Correo: ");
            String correo = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            Usuario usuario = null;
            for (Usuario u : usuarios) {
                if (u.getCorreoElectronico().equals(correo) && u.validarPassword(pass)) {
                    usuario = u;
                    break;
                }
            }

            if (usuario != null) {
                System.out.println("ID: " + usuario.getId());
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Correo: " + usuario.getCorreoElectronico());

                boolean continuar = true;
                while (continuar) {
                    // Mostrar hábitos actuales
                    System.out.println("\nHábitos actuales:");
                    int completados = 0;
                    for (Habito h : usuario.getHabitos()) {
                        String estado = h.estaCompletado() ? "Completado" : "Pendiente";
                        if (h.estaCompletado()) completados++;
                        System.out.println("- ID: " + h.getId() + " | " + h.getNombre() + ": " + h.getDescripcion() + " [" + estado + "]");
                    }

                    // Mostrar estadísticas
                    Estadisticas estadisticas = new Estadisticas(usuario.getHabitos().size(), completados);
                    estadisticas.mostrarResumen();

                    // Opciones para el usuario
                    System.out.println("\nOpciones:");
                    System.out.println("a) Agregar hábito");
                    System.out.println("e) Eliminar hábito");
                    System.out.println("c) Marcar hábito como completado");
                    System.out.println("s) Cerrar sesión");
                    System.out.println("x) Salir del programa");
                    System.out.print("Seleccione una opción: ");
                    String opcion = sc.nextLine();

                    switch (opcion.toLowerCase()) {
                        case "a":
                            System.out.print("Nombre del nuevo hábito: ");
                            String nombreHabito = sc.nextLine();
                            System.out.print("Descripción: ");
                            String descHabito = sc.nextLine();
                            int nuevoId = usuario.getHabitos().size() + 1;
                            usuario.agregarHabito(new Habito(nuevoId, nombreHabito, descHabito));
                            System.out.println("Hábito agregado.");
                            break;
                        case "e":
                            System.out.print("Ingrese el ID del hábito a eliminar: ");
                            int idEliminar = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            usuario.eliminarHabito(idEliminar);
                            System.out.println("Hábito eliminado.");
                            break;
                        case "c":
                            System.out.print("Ingrese el ID del hábito que completó: ");
                            int idCompletar = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            boolean encontrado = false;
                            for (Habito h : usuario.getHabitos()) {
                                if (h.getId() == idCompletar) {
                                    h.marcarComoCompletado();
                                    System.out.println("¡Felicidades! Hábito marcado como completado.");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No se encontró un hábito con ese ID.");
                            }
                            break;
                        case "s":
                            continuar = false; // Cierra sesión, vuelve al login
                            break;
                        case "x":
                            continuar = false;
                            salir = true; // Sale del programa
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }

                    // Enviar notificación después de cada acción (opcional)
                    Notificacion notificacion = new Notificacion(1, "¡Sigue cumpliendo tus hábitos!", "2025-06-29");
                    notificacion.enviarNotificacion("¡Sigue cumpliendo tus hábitos!", "2025-06-29");
                }
            } else {
                System.out.println("Correo o contraseña incorrectos.");
            }
        }
        System.out.println("Programa finalizado.");
    }
}


