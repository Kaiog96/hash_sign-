/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author a120065
 */
public class TelaJogador extends javax.swing.JFrame {
    
    Velha velha;
    String jogar;
    String jogador1;
    String jogador2;
    String simbolo1;
    String simbolo2;
    String venceu;
    /**
     * Creates new form TelaJogador
     */
    public TelaJogador() {
        initComponents();
       velha = new Velha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        botaoIniciar = new javax.swing.JButton();
        campoJogador2 = new javax.swing.JTextField();
        campoJogador1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        campoSimbolo1 = new javax.swing.JTextField();
        campoSimbolo2 = new javax.swing.JTextField();
        a12 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("Jogador1:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setText("Jogador2:");

        botaoIniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoIniciar.setText("Iniciar");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setText("Simbolo1:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setText("Simbolo2:");

        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });

        a33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33ActionPerformed(evt);
            }
        });

        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });

        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoJogador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(campoJogador2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoSimbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoSimbolo2))))
                    .addComponent(botaoIniciar))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a31)
                        .addGap(18, 18, 18)
                        .addComponent(a32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a21)
                        .addGap(18, 18, 18)
                        .addComponent(a22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a11)
                        .addGap(18, 18, 18)
                        .addComponent(a12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a23)
                    .addComponent(a13)
                    .addComponent(a33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSimbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSimbolo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoIniciar)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
            jogador1 = campoJogador1.getText();
            jogador2 = campoJogador2.getText();
            simbolo1 = campoSimbolo1.getText();
            simbolo2 = campoSimbolo2.getText();
            
            velha.IniciarJogo();
            
            jogar = simbolo1;
            
            campoJogador1.setEnabled(false);
            campoJogador2.setEnabled(false);
            campoSimbolo1.setEnabled(false);
            campoSimbolo2.setEnabled(false);
            botaoIniciar.setEnabled(false);
        
       
        
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
       velha.tabuleiro[1][1] = jogar;
        
        a11.setEnabled(false);
        
        
        
        a11.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        velha.tabuleiro[1][2] = jogar;
        
        a12.setEnabled(false);
        
        
        
        a12.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a12ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        velha.tabuleiro[1][3] = jogar;
        
        a13.setEnabled(false);
        
        
        
        a13.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a13ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
       velha.tabuleiro[2][1] = jogar;
        
        a21.setEnabled(false);
        
        
        
        a21.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a21ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        velha.tabuleiro[2][2] = jogar;
        
        a22.setEnabled(false);
        
        
        
        a22.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a22ActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
       velha.tabuleiro[2][3] = jogar;
        
        a23.setEnabled(false);
        
        
        
        a23.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a23ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
        velha.tabuleiro[3][1] = jogar;
        
        a31.setEnabled(false);
        
        
        
        a31.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a31ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
        velha.tabuleiro[3][2] = jogar;
        
        a32.setEnabled(false);
        
        
        
        a32.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
            }
            else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
            }            
            JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
        
        }
    }//GEN-LAST:event_a32ActionPerformed

    private void a33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33ActionPerformed
         velha.tabuleiro[3][3] = jogar;
        
        a33.setEnabled(false);
        
        
        
        a33.setText(jogar);
        
        if(jogar.equals(simbolo1)){
             jogar = simbolo2;
        }
        else if( jogar.equals(simbolo2)){
             jogar = simbolo1;
        }
        
        venceu = velha.verificar();
        
        if(!"-1".equals(venceu)){
            if(venceu.equals(simbolo1)){
                venceu = jogador1;
                JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
            }
            else if(venceu.equals(simbolo2)){
                venceu = jogador2;
                JOptionPane.showMessageDialog(null, "VENCEDOR: " + venceu);
            }
             else if(venceu.equals("velha")){
                JOptionPane.showMessageDialog(null, "VELHA");
                
            }           
            
        
        }    
        
    }//GEN-LAST:event_a33ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton a23;
    private javax.swing.JButton a31;
    private javax.swing.JButton a32;
    private javax.swing.JButton a33;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JTextField campoJogador1;
    private javax.swing.JTextField campoJogador2;
    private javax.swing.JTextField campoSimbolo1;
    private javax.swing.JTextField campoSimbolo2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
