package helpDesk.view;

import helpDesk.DAO.patrimonioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import helpDesk.model.Patrimonio;
import helpDesk.util.Limitador;


public class CadastrarPatrimonioView extends javax.swing.JFrame {

    Patrimonio Pat = new Patrimonio();
    
    public CadastrarPatrimonioView() throws SQLException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTablePatrimonio.getModel();
        jTablePatrimonio.setRowSorter(new TableRowSorter(modelo));
        jTextFieldNome.setDocument(new Limitador(50, Limitador.TipoEntrada.TEXTO));
        jTextFieldPreco.setDocument(new Limitador(8, Limitador.TipoEntrada.NUMERO));
        jTextFieldIdFuncionario.setDocument(new Limitador(20, Limitador.TipoEntrada.NUMERO));
        readJTable();
    }

    public void readJTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) jTablePatrimonio.getModel();
        modelo.setNumRows(0);
        patrimonioDAO pdao = new patrimonioDAO();
        
        for(Patrimonio p : pdao.read()){
            modelo.addRow(new Object[]{
                p.getFun_id(),
                p.getPat_id(),
                p.getPat_nome(),
                p.getPat_preco()
            });
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

        jButton1 = new javax.swing.JButton();
        jTextFieldIdFuncionario = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatrimonio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro De Patrimonio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        jTextFieldIdFuncionario.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIdFuncionario.setBorder(null);
        jTextFieldIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 207, 220, 30));

        jTextFieldNome.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNome.setBorder(null);
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 282, 200, 30));

        jTextFieldPreco.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldPreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPreco.setBorder(null);
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 358, 80, 30));

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 722, 120, 40));

        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 720, 120, 40));

        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 722, 120, 40));

        jTablePatrimonio.setBackground(new java.awt.Color(234, 234, 234));
        jTablePatrimonio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTablePatrimonio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_FUNC", "ID_PAT", "NOME", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePatrimonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePatrimonioMouseClicked(evt);
            }
        });
        jTablePatrimonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTablePatrimonioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePatrimonio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 430, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cadastro_patrimonio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MenuAtendenteView tela = new MenuAtendenteView();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try {                                         
            
            Patrimonio p = new Patrimonio();
            patrimonioDAO dao = new patrimonioDAO();
            
            p.setFun_id(Integer.parseInt(jTextFieldIdFuncionario.getText()));
            p.setPat_nome(jTextFieldNome.getText());
            p.setPat_preco(Double.parseDouble(jTextFieldPreco.getText()));
            dao.create(p);
                      
            jTextFieldIdFuncionario.setText("");
            jTextFieldNome.setText("");
            jTextFieldPreco.setText("");
            
            readJTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTablePatrimonio.getSelectedRow() != -1){
            
            try {
                Patrimonio p = new Patrimonio();
                patrimonioDAO dao = new patrimonioDAO();
                
                p.setPat_nome(jTextFieldNome.getText());
                p.setPat_preco(Double.parseDouble(jTextFieldPreco.getText()));
                p.setPat_id((int)jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 1));
                dao.update(p);
                
                jTextFieldIdFuncionario.setText("");
                jTextFieldNome.setText("");
                jTextFieldPreco.setText("");
                        
                readJTable();
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um patrimonio para atualizar!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTablePatrimonioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePatrimonioMouseClicked
        if(jTablePatrimonio.getSelectedRow() != -1){
            
            jTextFieldIdFuncionario.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 0).toString());
            jTextFieldNome.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 2).toString());
            jTextFieldPreco.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 3).toString());         
        }
    }//GEN-LAST:event_jTablePatrimonioMouseClicked

    private void jTablePatrimonioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePatrimonioKeyReleased
        if(jTablePatrimonio.getSelectedRow() != -1){
            
            jTextFieldIdFuncionario.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 0).toString());
            jTextFieldNome.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 2).toString());
            jTextFieldPreco.setText(jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 3).toString());         
        }
    }//GEN-LAST:event_jTablePatrimonioKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(jTablePatrimonio.getSelectedRow() != -1){  
        try {
            Patrimonio p = new Patrimonio();
            patrimonioDAO dao = new patrimonioDAO();
                
            p.setPat_id((int)jTablePatrimonio.getValueAt(jTablePatrimonio.getSelectedRow(), 1));
            dao.delete(p);
                
            jTextFieldIdFuncionario.setText("");
            jTextFieldNome.setText("");
            jTextFieldPreco.setText("");

            readJTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um patrimonio para excluir!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdFuncionarioActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void tela(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastrarPatrimonioView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarPatrimonioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatrimonio;
    private javax.swing.JTextField jTextFieldIdFuncionario;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}
