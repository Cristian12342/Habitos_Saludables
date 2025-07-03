/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.habitos_saludables.vista;

import com.mycompany.habitos_saludables.usuario.Usuario;
import java.util.List;

public class RegistroVista extends javax.swing.JFrame {

    private Usuario usuarioActivo;
    private List<Usuario> usuarios;

    public RegistroVista(Usuario usuarioActivo, List<Usuario> usuarios) {
        this.usuarioActivo = usuarioActivo;
        this.usuarios = usuarios;
        initComponents();
        setLocationRelativeTo(null);
        mostrarHabitos();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonLunes = new javax.swing.JButton();
        jButtonMartes = new javax.swing.JButton();
        jButtonMiercoles = new javax.swing.JButton();
        jButtonJueves = new javax.swing.JButton();
        jButtonViernes = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca los hábitos que lograste cumplir hoy y mantén un control constante de tus avances personales.");

        jButtonLunes.setText("LUNES");
        jButtonMartes.setText("MARTES");
        jButtonMiercoles.setText("MIERCOLES");
        jButtonJueves.setText("JUEVES");
        jButtonViernes.setText("VIERNES");

        jCheckBox1.setText("Hábito 1");
        jCheckBox2.setText("Hábito 2");
        jCheckBox3.setText("Hábito 3");
        jCheckBox4.setText("Hábito 4");

        jLabel2.setText("Nota sobre tu experiencia");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnVolver.setText("Volver al menú");
        btnVolver.addActionListener(evt -> {
            new HomeVista(usuarioActivo, usuarios).setVisible(true);
            this.dispose();
        });

        jButtonLunes.addActionListener(evt -> registrarHabitosDia("Lunes"));
        jButtonMartes.addActionListener(evt -> registrarHabitosDia("Martes"));
        jButtonMiercoles.addActionListener(evt -> registrarHabitosDia("Miércoles"));
        jButtonJueves.addActionListener(evt -> registrarHabitosDia("Jueves"));
        jButtonViernes.addActionListener(evt -> registrarHabitosDia("Viernes"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButtonLunes)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonMartes)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMiercoles)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonJueves)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonViernes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLunes)
                    .addComponent(jButtonMartes)
                    .addComponent(jButtonMiercoles)
                    .addComponent(jButtonJueves)
                    .addComponent(jButtonViernes))
                .addGap(39, 39, 39)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void registrarHabitosDia(String dia) {
        com.mycompany.habitos_saludables.registro.RegistroDiario registro = new com.mycompany.habitos_saludables.registro.RegistroDiario(dia);
        java.util.List<com.mycompany.habitos_saludables.habito.Habito> habitos = usuarioActivo.getHabitos();
        if (habitos.size() > 0) {
            registro.setHabito(habitos.get(0).getNombre(), jCheckBox1.isSelected());
        }
        if (habitos.size() > 1) {
            registro.setHabito(habitos.get(1).getNombre(), jCheckBox2.isSelected());
        }
        if (habitos.size() > 2) {
            registro.setHabito(habitos.get(2).getNombre(), jCheckBox3.isSelected());
        }
        if (habitos.size() > 3) {
            registro.setHabito(habitos.get(3).getNombre(), jCheckBox4.isSelected());
        }

        usuarioActivo.getRegistros().add(registro);

        javax.swing.JOptionPane.showMessageDialog(this, "Registro guardado para " + dia, "Registro", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButtonJueves;
    private javax.swing.JButton jButtonLunes;
    private javax.swing.JButton jButtonMartes;
    private javax.swing.JButton jButtonMiercoles;
    private javax.swing.JButton jButtonViernes;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}
