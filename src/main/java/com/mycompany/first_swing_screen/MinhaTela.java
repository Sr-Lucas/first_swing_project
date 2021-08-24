/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.first_swing_screen;

import java.awt.Color;

/**
 *
 * @author 71124
 */
public class MinhaTela extends javax.swing.JFrame {
    public MinhaTela() {
        initComponents();
    }
    
    public void updateDeclaracao() {
          String declaracao = "";
          
          if(femininoRad.isSelected()) {
              declaracao += "A senhora";
          } else {
              declaracao += "O senhor";
          }
          
          declaracao += " (" + profiessaoComb.getSelectedItem().toString() + ")";
          
          declaracao += " " + nameField.getText() + "\n";
          
          declaracao += "declara que concorda com o conteúdo\ne seu nível de interesse é de " + interesseSlide.getValue() + "%.\n";
          
          declaracao += "As notificações poderão ser feitas através de: ";
          
          int qtdSelected = 0;
          
          if(ligacaoTelChk.isSelected()) {
              declaracao += "ligações telefónicas";
              qtdSelected++;
          }
          
          if(smsChk.isSelected()) {
              if(qtdSelected > 0) declaracao += ", ";
              declaracao += "mensâgens de texto sms"; 
              qtdSelected++;
          }
          
          if(whatsChk.isSelected()) {
              if(qtdSelected > 0) declaracao += ", ";
              declaracao += "whatsapp"; 
              qtdSelected++;
          }
          
          if(emailChk.isSelected()) {
              if(qtdSelected > 0) declaracao += ", ";
              declaracao += "correio eletrónico";
              qtdSelected++;
          }
          
          if(qtdSelected == 0) {
              declaracao += "Não deseja receber notificação";
          }
          
          declaracao += ".";
          
          declaracaoTxt.setText(declaracao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameLbl1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        masculidoRad = new javax.swing.JRadioButton();
        femininoRad = new javax.swing.JRadioButton();
        nameLbl2 = new javax.swing.JLabel();
        profiessaoComb = new javax.swing.JComboBox<>();
        interesseSlide = new javax.swing.JSlider();
        nameLbl3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ligacaoTelChk = new javax.swing.JCheckBox();
        emailChk = new javax.swing.JCheckBox();
        smsChk = new javax.swing.JCheckBox();
        whatsChk = new javax.swing.JCheckBox();
        nameLbl4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        declaracaoTxt = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        nameLbl5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        interesseTxt = new javax.swing.JLabel();
        telefoneField = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Declaração de aceite de conteúdo"));

        nameLbl.setText("Digite seu nome");

        nameField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nameFieldCaretUpdate(evt);
            }
        });
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameFieldMouseExited(evt);
            }
        });

        nameLbl1.setText("Digite seu telefone");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informe seu sexo"));

        masculidoRad.setText("Masculino");
        masculidoRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculidoRadActionPerformed(evt);
            }
        });

        femininoRad.setText("Feminino");
        femininoRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femininoRadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masculidoRad)
                    .addComponent(femininoRad))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masculidoRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femininoRad)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        nameLbl2.setText("Informe sua profissão");

        profiessaoComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESSOR", "DESENVOLVEDOR", "OUTRO" }));
        profiessaoComb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                profiessaoCombItemStateChanged(evt);
            }
        });

        interesseSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                interesseSlideStateChanged(evt);
            }
        });

        nameLbl3.setText("Informe seu nível de interesse");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Como deseja receber notificações..."));

        ligacaoTelChk.setText("Ligações telefônicas");
        ligacaoTelChk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ligacaoTelChkItemStateChanged(evt);
            }
        });

        emailChk.setText("Correio eletrônico");
        emailChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                emailChkStateChanged(evt);
            }
        });

        smsChk.setText("Mensagens de SMS");
        smsChk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                smsChkItemStateChanged(evt);
            }
        });

        whatsChk.setText("WhatsApp");
        whatsChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                whatsChkStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ligacaoTelChk)
                    .addComponent(emailChk)
                    .addComponent(smsChk)
                    .addComponent(whatsChk))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ligacaoTelChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smsChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whatsChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailChk)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        nameLbl4.setText("Declaração");

        declaracaoTxt.setEditable(false);
        declaracaoTxt.setColumns(20);
        declaracaoTxt.setRows(5);
        jScrollPane1.setViewportView(declaracaoTxt);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirmação"));

        nameLbl5.setText("Você está de acordo com a delaração contratual?");

        jButton1.setText("Sim");

        jButton2.setText("Não");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        interesseTxt.setText("50%");

        try {
            telefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telefoneFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefoneFieldMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl4)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profiessaoComb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl2)))
                            .addComponent(nameLbl)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(interesseSlide, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(nameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(interesseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl2)
                            .addComponent(nameLbl3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profiessaoComb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interesseSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interesseTxt))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Declaração", jPanel2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Contratao", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femininoRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoRadActionPerformed
        masculidoRad.setSelected(false);
        updateDeclaracao();
    }//GEN-LAST:event_femininoRadActionPerformed

    private void nameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseEntered
        nameField.setBackground(Color.YELLOW);
    }//GEN-LAST:event_nameFieldMouseEntered

    private void nameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseExited
       nameField.setBackground(Color.WHITE);
    }//GEN-LAST:event_nameFieldMouseExited

    private void telefoneFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefoneFieldMouseEntered
       telefoneField.setBackground(Color.YELLOW);
    }//GEN-LAST:event_telefoneFieldMouseEntered

    private void telefoneFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefoneFieldMouseExited
       telefoneField.setBackground(Color.WHITE);
    }//GEN-LAST:event_telefoneFieldMouseExited

    private void interesseSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_interesseSlideStateChanged
        interesseTxt.setText(Integer.toString(interesseSlide.getValue()) + "%");
        updateDeclaracao();
    }//GEN-LAST:event_interesseSlideStateChanged

    private void masculidoRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculidoRadActionPerformed
        femininoRad.setSelected(false);
        updateDeclaracao();
    }//GEN-LAST:event_masculidoRadActionPerformed

    private void nameFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nameFieldCaretUpdate
        updateDeclaracao();
    }//GEN-LAST:event_nameFieldCaretUpdate

    private void profiessaoCombItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_profiessaoCombItemStateChanged
        updateDeclaracao();
    }//GEN-LAST:event_profiessaoCombItemStateChanged

    private void ligacaoTelChkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ligacaoTelChkItemStateChanged
        updateDeclaracao();
    }//GEN-LAST:event_ligacaoTelChkItemStateChanged

    private void smsChkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_smsChkItemStateChanged
        updateDeclaracao();
    }//GEN-LAST:event_smsChkItemStateChanged

    private void whatsChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_whatsChkStateChanged
        updateDeclaracao();
    }//GEN-LAST:event_whatsChkStateChanged

    private void emailChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_emailChkStateChanged
        updateDeclaracao();
    }//GEN-LAST:event_emailChkStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea declaracaoTxt;
    private javax.swing.JCheckBox emailChk;
    private javax.swing.JRadioButton femininoRad;
    private javax.swing.JSlider interesseSlide;
    private javax.swing.JLabel interesseTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox ligacaoTelChk;
    private javax.swing.JRadioButton masculidoRad;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JComboBox<String> profiessaoComb;
    private javax.swing.JCheckBox smsChk;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JCheckBox whatsChk;
    // End of variables declaration//GEN-END:variables
}
