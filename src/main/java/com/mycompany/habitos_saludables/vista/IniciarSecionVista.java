/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.habitos_saludables.vista;

/**
 *
 * @author Calavera
 */
public class IniciarSecionVista extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSecionVista
     */
    private java.util.List<com.mycompany.habitos_saludables.usuario.Usuario> usuarios;

    public IniciarSecionVista(java.util.List<com.mycompany.habitos_saludables.usuario.Usuario> usuarios) {
        this.usuarios = usuarios;
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtCorreopersonal = new javax.swing.JTextField();
        txtContraseñausuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Correo");
        jLabel2.setText("Contraseña");

        btnIniciar.setText("Iniciar Sesión");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreopersonal)
                            .addComponent(txtContraseñausuario, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnIniciar)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCorreopersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseñausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnIniciar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String correo = txtCorreopersonal.getText();
        String pass = new String(txtContraseñausuario.getPassword());
        com.mycompany.habitos_saludables.usuario.Usuario usuarioActivo = null;
        for (com.mycompany.habitos_saludables.usuario.Usuario u : usuarios) {
            if (u.getCorreoElectronico().equals(correo) && u.validarPassword(pass)) {
                usuarioActivo = u;
                break;
            }
        }
        if (usuarioActivo != null) {
            System.out.println("Login correcto");
            this.dispose();
            new com.mycompany.habitos_saludables.vista.HomeVista(usuarioActivo, usuarios).setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
        }
    }

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContraseñausuario;
    private javax.swing.JTextField txtCorreopersonal;
    // End of variables declaration//GEN-END:variables
}
