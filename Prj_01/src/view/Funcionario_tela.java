package view;

import javax.swing.JOptionPane;
import java.text.DecimalFormat; 
import model.Funcionario;

public class Funcionario_tela extends javax.swing.JFrame {

    public Funcionario_tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlcracha = new javax.swing.JLabel();
        jlcargo = new javax.swing.JLabel();
        jlanos = new javax.swing.JLabel();
        jlsalario = new javax.swing.JLabel();
        tfcracha = new javax.swing.JTextField();
        tfsalario = new javax.swing.JTextField();
        tfcargo = new javax.swing.JTextField();
        tfanos = new javax.swing.JTextField();
        botao = new javax.swing.JButton();
        jlporcen = new javax.swing.JLabel();
        tfporcen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlcracha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlcracha.setText("Crachá:");

        jlcargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlcargo.setText("Cargo:");

        jlanos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlanos.setText("Anos trabalhados:");

        jlsalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlsalario.setText("Salário:");

        tfcracha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfcracha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcrachaActionPerformed(evt);
            }
        });

        tfsalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsalarioActionPerformed(evt);
            }
        });

        tfcargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcargoActionPerformed(evt);
            }
        });

        tfanos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        botao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao.setText("Enviar");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jlporcen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlporcen.setText("Porcentagem aumento:");

        tfporcen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcracha, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlanos)
                    .addComponent(jlporcen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfcracha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfanos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfporcen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcracha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tfcracha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jlcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfanos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlporcen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfporcen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcargoActionPerformed

    private void tfsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsalarioActionPerformed

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        int cr = Integer.parseInt(tfcracha.getText());
        float s = Float.parseFloat(tfsalario.getText());
        String ca = tfcargo.getText();
        int anos = Integer.parseInt(tfanos.getText());
        float p = Float.parseFloat(tfporcen.getText());
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        Funcionario f1 = new Funcionario(cr, s, ca);
        
        JOptionPane.showMessageDialog(null, "Dados do Funcionário:\n" + "\nCrachá:     " + f1.getCracha() + "\n"
                                    + "Salário inserido:    " + df.format(f1.getSalario()) + "\n"
                                    + "Cargo:   " + f1.getCargo() + "\n"
                                    + "Anos trabalhados:    " + anos + "\n"
                                    + "Aumento por porcentagem:     " + df.format(f1.calculaAumento(p)) + "\n"
                                    + "Aumento por anos trabalhados:    " + df.format(f1.calculaAumento(anos)) + "\n"
                                    + "Salário final: " + df.format(f1.calculaAumento(p) + f1.calculaAumento(anos) + s));        
    }//GEN-LAST:event_botaoActionPerformed

    private void tfcrachaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcrachaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcrachaActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Funcionario_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionario_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionario_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionario_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionario_tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JLabel jlanos;
    private javax.swing.JLabel jlcargo;
    private javax.swing.JLabel jlcracha;
    private javax.swing.JLabel jlporcen;
    private javax.swing.JLabel jlsalario;
    private javax.swing.JTextField tfanos;
    private javax.swing.JTextField tfcargo;
    private javax.swing.JTextField tfcracha;
    private javax.swing.JTextField tfporcen;
    private javax.swing.JTextField tfsalario;
    // End of variables declaration//GEN-END:variables
}
