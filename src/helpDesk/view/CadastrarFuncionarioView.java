package helpDesk.view;

import helpDesk.DAO.funcionarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import helpDesk.model.funcionario;
import helpDesk.util.Limitador;

public class CadastrarFuncionarioView extends javax.swing.JFrame {

    funcionario func = new funcionario();
    
    public CadastrarFuncionarioView() throws SQLException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableFuncionario.getModel();
        jTableFuncionario.setRowSorter(new TableRowSorter(modelo));
        jTextFieldUsuario.setDocument(new Limitador(50, Limitador.TipoEntrada.TEXTO));
        jTextFieldEmail.setDocument(new Limitador(100, Limitador.TipoEntrada.TEXTO));
        jTextFieldTelefone.setDocument(new Limitador(11, Limitador.TipoEntrada.TEXTO));
        jTextFieldSenha.setDocument(new Limitador(20, Limitador.TipoEntrada.TEXTO));
        readJTable();
    }

    public void readJTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) jTableFuncionario.getModel();
        modelo.setNumRows(0);
        funcionarioDAO fdao = new funcionarioDAO();
        
        for(funcionario f : fdao.read()){
            modelo.addRow(new Object[]{
                f.getFun_id(),
                f.getFun_usuario(),
                f.getFun_email(),
                f.getFun_telefone(),
                f.getFun_senha()
            });
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        setResizable(false);
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

        jTextFieldUsuario.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 202, 310, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setBorder(null);
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 253, 320, 30));

        jTextFieldTelefone.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTelefone.setBorder(null);
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 305, 250, 30));

        jTextFieldSenha.setBackground(new java.awt.Color(234, 234, 234));
        jTextFieldSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldSenha.setBorder(null);
        getContentPane().add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 356, 320, 30));

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 715, 130, 40));

        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 715, 130, 40));

        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 715, 130, 40));

        jScrollPane2.setBackground(new java.awt.Color(234, 234, 234));
        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTableFuncionario.setBackground(new java.awt.Color(234, 234, 234));
        jTableFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "EMAIL", "TELEFONE", "SENHA       "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jTableFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableFuncionarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFuncionario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 430, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cadastro_funcionario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MenuAtendenteView tela = new MenuAtendenteView();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            funcionario f = new funcionario();
            funcionarioDAO dao = new funcionarioDAO();
            
            f.setFun_usuario(jTextFieldUsuario.getText());
            f.setFun_email(jTextFieldEmail.getText());
            f.setFun_telefone(jTextFieldTelefone.getText());
            f.setFun_senha(jTextFieldSenha.getText());
            dao.create(f);
            
            jTextFieldUsuario.setText("");
            jTextFieldEmail.setText("");
            jTextFieldTelefone.setText("");
            jTextFieldSenha.setText("");
            
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTableFuncionario.getSelectedRow() != -1){
            try {
                funcionario f = new funcionario();
                funcionarioDAO dao = new funcionarioDAO();
                
                f.setFun_id((int)jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 0));
                dao.delete(f);
                
                jTextFieldUsuario.setText("");
                jTextFieldEmail.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldSenha.setText("");

                readJTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um funcionario para excluir!");
        }
   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTableFuncionario.getSelectedRow() != -1){
            
            try {
                funcionario f = new funcionario();
                funcionarioDAO dao = new funcionarioDAO();
                
                f.setFun_usuario(jTextFieldUsuario.getText());
                f.setFun_email(jTextFieldEmail.getText());
                f.setFun_telefone(jTextFieldTelefone.getText());
                f.setFun_senha(jTextFieldSenha.getText());
                f.setFun_id((int)jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 0));
                dao.update(f);
                
                
                jTextFieldUsuario.setText("");
                jTextFieldEmail.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldSenha.setText("");
                
                readJTable();
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um funcionario para atualizar!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        if(jTableFuncionario.getSelectedRow() != -1){
            
            jTextFieldUsuario.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1).toString());
            jTextFieldEmail.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 2).toString());
            jTextFieldTelefone.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 3).toString());
            jTextFieldSenha.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 4).toString());           
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void jTableFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFuncionarioKeyReleased
        if(jTableFuncionario.getSelectedRow() != -1){
            
            jTextFieldUsuario.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1).toString());
            jTextFieldEmail.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 2).toString());
            jTextFieldTelefone.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 3).toString());
            jTextFieldSenha.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 4).toString());           
        }
    }//GEN-LAST:event_jTableFuncionarioKeyReleased

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastrarFuncionarioView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
