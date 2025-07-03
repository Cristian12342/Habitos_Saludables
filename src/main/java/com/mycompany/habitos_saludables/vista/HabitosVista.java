/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.habitos_saludables.vista;

import com.mycompany.habitos_saludables.usuario.Usuario;
import java.util.List;

public class HabitosVista extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    private List<Usuario> usuarios;

    public HabitosVista(Usuario usuarioActivo, List<Usuario> usuarios) {
        this.usuarioActivo = usuarioActivo;
        this.usuarios = usuarios;
        initComponents();
        setLocationRelativeTo(null);
        mostrarHabitos();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ESTOS SON TUS HABITOS");

        jCheckBox1.setText("Hábito 1");
        jCheckBox2.setText("Hábito 2");
        jCheckBox3.setText("Hábito 3");
        jCheckBox4.setText("Hábito 4");

        jButton1.setText("+ Añadir Nuevo Hábito");
        jButton1.addActionListener(evt -> {
            String nombre = javax.swing.JOptionPane.showInputDialog(this, "Nombre del nuevo hábito:");
            if (nombre != null && !nombre.trim().isEmpty()) {
                String descripcion = javax.swing.JOptionPane.showInputDialog(this, "Descripción del hábito:");
                if (descripcion != null && !descripcion.trim().isEmpty()) {
                    int nuevoId = usuarioActivo.getHabitos().size() + 1;
                    com.mycompany.habitos_saludables.habito.Habito nuevoHabito =
                        new com.mycompany.habitos_saludables.habito.Habito(nuevoId, nombre, descripcion);
                    usuarioActivo.agregarHabito(nuevoHabito);
                    mostrarHabitos();
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Hábito agregado!");
                }
            }
        });

        jLabel2.setText("“Tu salud es una inversión, no un gasto”");

        btnVolver.setText("Volver al menú");
        btnVolver.addActionListener(evt -> {
            new HomeVista(usuarioActivo, usuarios).setVisible(true);
            this.dispose();
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnVolver))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void mostrarHabitos() {
        java.util.List<com.mycompany.habitos_saludables.habito.Habito> habitos = usuarioActivo.getHabitos();
        if (habitos.size() > 0) {
            jCheckBox1.setText(habitos.get(0).getNombre());
            jCheckBox1.setSelected(habitos.get(0).estaCompletado());
        } else {
            jCheckBox1.setText("Sin hábitos");
            jCheckBox1.setSelected(false);
        }
        if (habitos.size() > 1) {
            jCheckBox2.setText(habitos.get(1).getNombre());
            jCheckBox2.setSelected(habitos.get(1).estaCompletado());
        } else {
            jCheckBox2.setText("");
            jCheckBox2.setSelected(false);
        }
        if (habitos.size() > 2) {
            jCheckBox3.setText(habitos.get(2).getNombre());
            jCheckBox3.setSelected(habitos.get(2).estaCompletado());
        } else {
            jCheckBox3.setText("");
            jCheckBox3.setSelected(false);
        }
        if (habitos.size() > 3) {
            jCheckBox4.setText(habitos.get(3).getNombre());
            jCheckBox4.setSelected(habitos.get(3).estaCompletado());
        } else {
            jCheckBox4.setText("");
            jCheckBox4.setSelected(false);
        }
    }

    public javax.swing.JCheckBox getjCheckBox1() { return jCheckBox1; }
    public javax.swing.JCheckBox getjCheckBox2() { return jCheckBox2; }
    public javax.swing.JCheckBox getjCheckBox3() { return jCheckBox3; }
    public javax.swing.JCheckBox getjCheckBox4() { return jCheckBox4; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
