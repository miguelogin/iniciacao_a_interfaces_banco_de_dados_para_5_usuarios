package interfaces;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public Cadastrar call_cadastrar;
    public Editar call_editar;
    public Consulta call_consulta;
    public Excluir call_excluir;
    public static int x = 1;

    public home() {
        initComponents();
        setIcon();
        this.call_cadastrar = new Cadastrar(this, true);
        this.call_editar = new Editar(this, true);
        this.call_consulta = new Consulta(this, true);
        this.call_excluir = new Excluir(this, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAdicionar = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercício com Interface");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Mars Attacks [1996].mp4_002450698.jpg"))); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-490, -40, 1880, 620);

        jMenu1.setText("Ferramentas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuAdicionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/new.png"))); // NOI18N
        menuAdicionar.setText("     Adicionar");
        menuAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdicionarActionPerformed(evt);
            }
        });
        jMenu1.add(menuAdicionar);

        menuEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/edit.png"))); // NOI18N
        menuEdit.setText("     Editar");
        menuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditActionPerformed(evt);
            }
        });
        jMenu1.add(menuEdit);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/delete.png"))); // NOI18N
        jMenuItem3.setText("     Excluir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Banco de Dados");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu2MouseReleased(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/search.png"))); // NOI18N
        jMenuItem1.setText("     Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(914, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditActionPerformed
        this.call_editar.setVisible(true);
    }//GEN-LAST:event_menuEditActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdicionarActionPerformed
        if (x <= 5) {
            this.call_cadastrar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "O Banco de Dados esta lotado. Para poder cadastrar novos usuários será necessário excluir um usuário antigo.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuAdicionarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseReleased

    }//GEN-LAST:event_jMenu2MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.call_consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown

    }//GEN-LAST:event_jLabel1ComponentShown

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.call_excluir.setVisible(true);
        JOptionPane.showMessageDialog(null, "Usuário excluído!", "Aviso", JOptionPane.INFORMATION_MESSAGE);  
        x = x - 1;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuAdicionar;
    private javax.swing.JMenuItem menuEdit;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

}
