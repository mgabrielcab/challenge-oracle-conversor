/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor.gui;

import conversor.clases.ConvertidorMoneda;
import conversor.clases.ConvertidorTemperatura;

/**
 *
 * @author mgabb
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        convMoneda = new ConvertidorMoneda();
        convTemperatura = new ConvertidorTemperatura();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lista.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Convertidor de Monedas", "Convertidor de Temperatura" }));
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione un Convertidor");

        boton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton.setText("Seleccionar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(74, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(72, 72, 72))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(61, 61, 61))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(179, 179, 179)
                                                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(114, 114, 114)
                                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(lista)
                                .addGap(59, 59, 59)
                                .addComponent(boton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(icono)
                                .addGap(25, 25, 25)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>                        

    // Accion de la lista
    private void listaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    // Accion Boton
    private void botonActionPerformed(java.awt.event.ActionEvent evt) {
        switch (lista.getSelectedIndex()) {
            case 0:
                System.out.println("Caso 0");
                dispose();
                ConversorMonedaGui convMoneda =new ConversorMonedaGui();
                convMoneda.setVisible(true);
                convMoneda.setLocationRelativeTo(null);
                break;
            case 1:
                System.out.println("Caso 1");
                dispose();
                break;
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton boton;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lista;
    private ConvertidorMoneda convMoneda;
    private ConvertidorTemperatura convTemperatura;
}
