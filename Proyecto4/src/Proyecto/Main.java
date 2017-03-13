/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import TDA.TDAQueue;
import TDA.TDAVSArray;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TFK
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        m = new Graph();
        restaurantes = m.getRestaurantes();
        for (int i = 0; i < restaurantes.size(); i++) {
            System.out.println(((Restaurante)restaurantes.get(i)).getNombre());
            for (int j = 0; j < ((Restaurante)restaurantes.get(i)).getRepartidores().size(); j++) {
                System.out.println(((Restaurante)restaurantes.get(i)).getRepartidores().get(j).getNombre());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JDialog();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        vistaRestaurantes = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRestaurantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRepartidores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crearOrden = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sp_CantidadPizza = new javax.swing.JSpinner();
        cb_tipoPizza = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        bt_Alitas = new javax.swing.JButton();
        bt_Palitroques = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_Cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        label_costoTotal = new javax.swing.JLabel();
        crearRepartidor = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cb_AsignarRestaurante = new javax.swing.JComboBox<>();
        txtf_NombreRepartidor = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jToggleButton1.setText("Crear Orden");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Repartidor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Lista de restaurantes");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Retirar Orden");

        jButton6.setText("Ver Rutas");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu.getContentPane());
        mainMenu.getContentPane().setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jButton6))
                .addGap(108, 108, 108))
        );

        listaRestaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaRestaurantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaRestaurantes);

        jScrollPane2.setViewportView(listaRepartidores);

        jLabel2.setText("Restaurantes");

        jLabel3.setText("Repartidore Disponible");

        javax.swing.GroupLayout vistaRestaurantesLayout = new javax.swing.GroupLayout(vistaRestaurantes.getContentPane());
        vistaRestaurantes.getContentPane().setLayout(vistaRestaurantesLayout);
        vistaRestaurantesLayout.setHorizontalGroup(
            vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vistaRestaurantesLayout.createSequentialGroup()
                .addGroup(vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaRestaurantesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vistaRestaurantesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)))
                .addGroup(vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        vistaRestaurantesLayout.setVerticalGroup(
            vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaRestaurantesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vistaRestaurantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel4.setText("Crear Orden");

        sp_CantidadPizza.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_tipoPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BACON CHEESEBURGER PIZZA", "6 QUESOS", "4 ESTACIONES", "CANADIENSE", "SUPREMA", "JAMON LOVER´S" }));
        cb_tipoPizza.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoPizzaItemStateChanged(evt);
            }
        });
        cb_tipoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoPizzaActionPerformed(evt);
            }
        });

        jButton5.setText("Crear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bt_Alitas.setText("Hot Wings");
        bt_Alitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlitasActionPerformed(evt);
            }
        });

        bt_Palitroques.setText("Palitroques");
        bt_Palitroques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PalitroquesActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        jLabel6.setText("Cantidad");

        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Costo Total:");

        label_costoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_costoTotal.setText("00.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(label_costoTotal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sp_CantidadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(cb_tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_Alitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_Palitroques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_CantidadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addComponent(bt_Alitas)
                .addGap(18, 18, 18)
                .addComponent(bt_Palitroques)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_costoTotal))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(bt_Cancelar))
                .addGap(25, 25, 25))
        );

        label_costoTotal.getAccessibleContext().setAccessibleParent(jButton4);

        javax.swing.GroupLayout crearOrdenLayout = new javax.swing.GroupLayout(crearOrden.getContentPane());
        crearOrden.getContentPane().setLayout(crearOrdenLayout);
        crearOrdenLayout.setHorizontalGroup(
            crearOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        crearOrdenLayout.setVerticalGroup(
            crearOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nombre");

        cb_AsignarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AsignarRestauranteActionPerformed(evt);
            }
        });

        jButton7.setText("Registrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_AsignarRestaurante, 0, 142, Short.MAX_VALUE)
                            .addComponent(txtf_NombreRepartidor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton7)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtf_NombreRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(cb_AsignarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout crearRepartidorLayout = new javax.swing.GroupLayout(crearRepartidor.getContentPane());
        crearRepartidor.getContentPane().setLayout(crearRepartidorLayout);
        crearRepartidorLayout.setHorizontalGroup(
            crearRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        crearRepartidorLayout.setVerticalGroup(
            crearRepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pizza Delivery");

        jButton1.setText("Salir");

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < restaurantes.size(); i++) {
            modelo.addElement(restaurantes.get(i));
        }
        listaRestaurantes.setModel(modelo);
        vistaRestaurantes.pack();
        vistaRestaurantes.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void listaRestaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaRestaurantesMouseClicked
        DefaultListModel modelo2 = new DefaultListModel();
        ArrayList<Repartidor> reps= ((Restaurante)restaurantes.get(listaRestaurantes.getSelectedIndex())).getRepartidores();
        for (int i = 0; i < reps.size(); i++) {
            modelo2.addElement(reps.get(i));
        }
        listaRepartidores.setModel(modelo2);
    }//GEN-LAST:event_listaRestaurantesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainMenu.pack();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        crearOrden.pack();
        crearOrden.setVisible(true);
        costo = 0;
        costo_pizza = 0;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        // TODO add your handling code here:
        costo = 0;
        label_costoTotal.setText(Double.toString(costo));
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_AlitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlitasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Las alitas fueron agregadas.");
        costo += 130;
        cont_Alitas ++;
        label_costoTotal.setText(Double.toString(costo));
    }//GEN-LAST:event_bt_AlitasActionPerformed

    private void bt_PalitroquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PalitroquesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Los Palitroques fueron agregadas.");
        costo += 59;
        cont_Palitroques ++;
        label_costoTotal.setText(Double.toString(costo));
    }//GEN-LAST:event_bt_PalitroquesActionPerformed

    private void cb_tipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoPizzaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_tipoPizzaActionPerformed

    private void cb_tipoPizzaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoPizzaItemStateChanged
        // TODO add your handling code here:
        costo = 0;
        int pizza_selection = cb_tipoPizza.getSelectedIndex();
        if (pizza_selection == 0) {
            costo_pizza = 290;
        }
        if (pizza_selection == 1) {
            costo_pizza = 280;
        }
        if (pizza_selection == 2) {
            costo_pizza = 318;
        }
        if (pizza_selection == 3) {
            costo_pizza = 280;
        }
        if (pizza_selection == 4) {
            costo_pizza = 263;
        }
        if (pizza_selection == 5) {
            costo_pizza = 263;
        }
        
        costo += costo_pizza * (int)sp_CantidadPizza.getValue();
        label_costoTotal.setText(Double.toString(costo));
    }//GEN-LAST:event_cb_tipoPizzaItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String texto = "";
        texto = cb_tipoPizza.getSelectedItem().toString() + "\t" 
                + (int)sp_CantidadPizza.getValue() + " Lps."
                + costo_pizza * (int)sp_CantidadPizza.getValue();
        if (cont_Alitas >0) {
            texto += "\tHot Wings\t" + cont_Alitas*6 + "Lps." + cont_Alitas * 129;
        }
        if (cont_Palitroques >0) {
            texto += "\tHot Palitroques\t" + cont_Palitroques*6 + "Lps." + cont_Palitroques * 59;
        }
        Orden orden = new Orden(codigo_orden, texto, Double.parseDouble(label_costoTotal.getText()));
        codigo_orden ++;
        lista_ordenes.Queue(orden);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cb_AsignarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_AsignarRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_AsignarRestauranteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        crearRepartidor.pack();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < restaurantes.size(); i++) {
            modelo.addElement(restaurantes.get(i));
        }
        cb_AsignarRestaurante.setModel(modelo);
        crearRepartidor.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0; i < restaurantes.size(); i++) {
            if (((Restaurante)restaurantes.get(i)).getNombre().equals(cb_AsignarRestaurante.getSelectedItem().toString())) {
                Repartidor nuevo_repartidor = new Repartidor(txtf_NombreRepartidor.getText(), cb_AsignarRestaurante.getSelectedItem().toString());
                ((Restaurante)restaurantes.get(i)).addRepartidores(nuevo_repartidor);
                JOptionPane.showMessageDialog(null, "Repartidor Registrado");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Alitas;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Palitroques;
    private javax.swing.JComboBox<String> cb_AsignarRestaurante;
    private javax.swing.JComboBox<String> cb_tipoPizza;
    private javax.swing.JDialog crearOrden;
    private javax.swing.JDialog crearRepartidor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel label_costoTotal;
    private javax.swing.JList<String> listaRepartidores;
    private javax.swing.JList<String> listaRestaurantes;
    private javax.swing.JDialog mainMenu;
    private javax.swing.JSpinner sp_CantidadPizza;
    private javax.swing.JTextField txtf_NombreRepartidor;
    private javax.swing.JDialog vistaRestaurantes;
    // End of variables declaration//GEN-END:variables
    Graph m;
    TDAVSArray colonias;
    TDAVSArray restaurantes;
    double costo;
    double costo_pizza;
    int cont_Alitas = 0;
    int cont_Palitroques = 0;
    TDAQueue lista_ordenes = new TDAQueue();
    int codigo_orden = 0;
}
