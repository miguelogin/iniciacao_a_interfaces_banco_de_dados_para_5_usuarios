package interfaces;

public class Consulta extends javax.swing.JDialog {

    /**
     * Creates new form Editar
     *
     * @param parent
     * @param modal
     *
     */
    public Consulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        area.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                areaComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(367, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        area.setEditable(false);
        if (Cadastrar.id[5] == 5) {
            area.setText("ID: " + Cadastrar.id[1] + "\nNome: " + Cadastrar.nome[1] + "\nIdade: " + Cadastrar.idade[1] + "\nSexo: " + Cadastrar.Sexo[1] + "\nNascimento: " + Cadastrar.nasc[1]
                    + "\n\nID: " + Cadastrar.id[2] + "\nNome: " + Cadastrar.nome[2] + "\nIdade: " + Cadastrar.idade[2] + "\nSexo: " + Cadastrar.Sexo[2] + "\nNascimento: " + Cadastrar.nasc[2]
                    + "\n\nID: " + Cadastrar.id[3] + "\nNome: " + Cadastrar.nome[3] + "\nIdade: " + Cadastrar.idade[3] + "\nSexo: " + Cadastrar.Sexo[3] + "\nNascimento: " + Cadastrar.nasc[3]
                    + "\n\nID: " + Cadastrar.id[4] + "\nNome: " + Cadastrar.nome[4] + "\nIdade: " + Cadastrar.idade[4] + "\nSexo: " + Cadastrar.Sexo[4] + "\nNascimento: " + Cadastrar.nasc[4]
                    + "\n\nID: " + Cadastrar.id[5] + "\nNome: " + Cadastrar.nome[5] + "\nIdade: " + Cadastrar.idade[5] + "\nSexo: " + Cadastrar.Sexo[5] + "\nNascimento: " + Cadastrar.nasc[5]);
        } else {
            if (Cadastrar.id[4] == 4) {
                area.setText("ID: " + Cadastrar.id[1] + "\nNome: " + Cadastrar.nome[1] + "\nIdade: " + Cadastrar.idade[1] + "\nSexo: " + Cadastrar.Sexo[1] + "\nNascimento: " + Cadastrar.nasc[1]
                        + "\n\nID: " + Cadastrar.id[2] + "\nNome: " + Cadastrar.nome[2] + "\nIdade: " + Cadastrar.idade[2] + "\nSexo: " + Cadastrar.Sexo[2] + "\nNascimento: " + Cadastrar.nasc[2]
                        + "\n\nID: " + Cadastrar.id[3] + "\nNome: " + Cadastrar.nome[3] + "\nIdade: " + Cadastrar.idade[3] + "\nSexo: " + Cadastrar.Sexo[3] + "\nNascimento: " + Cadastrar.nasc[3]
                        + "\n\nID: " + Cadastrar.id[4] + "\nNome: " + Cadastrar.nome[4] + "\nIdade: " + Cadastrar.idade[4] + "\nSexo: " + Cadastrar.Sexo[4] + "\nNascimento: " + Cadastrar.nasc[4]);
            } else {
                if (Cadastrar.id[3] == 3) {
                    area.setText("ID: " + Cadastrar.id[1] + "\nNome: " + Cadastrar.nome[1] + "\nIdade: " + Cadastrar.idade[1] + "\nSexo: " + Cadastrar.Sexo[1] + "\nNascimento: " + Cadastrar.nasc[1]
                            + "\n\nID: " + Cadastrar.id[2] + "\nNome: " + Cadastrar.nome[2] + "\nIdade: " + Cadastrar.idade[2] + "\nSexo: " + Cadastrar.Sexo[2] + "\nNascimento: " + Cadastrar.nasc[2]
                            + "\n\nID: " + Cadastrar.id[3] + "\nNome: " + Cadastrar.nome[3] + "\nIdade: " + Cadastrar.idade[3] + "\nSexo: " + Cadastrar.Sexo[3] + "\nNascimento: " + Cadastrar.nasc[3]);
                } else {
                    if (Cadastrar.id[2] == 2) {
                        area.setText("ID: " + Cadastrar.id[1] + "\nNome: " + Cadastrar.nome[1] + "\nIdade: " + Cadastrar.idade[1] + "\nSexo: " + Cadastrar.Sexo[1] + "\nNascimento: " + Cadastrar.nasc[1]
                                + "\n\nID: " + Cadastrar.id[2] + "\nNome: " + Cadastrar.nome[2] + "\nIdade: " + Cadastrar.idade[2] + "\nSexo: " + Cadastrar.Sexo[2] + "\nNascimento: " + Cadastrar.nasc[2]);
                    } else {
                        if (Cadastrar.id[1] == 1) {
                            area.setText("ID: " + Cadastrar.id[1] + "\nNome: " + Cadastrar.nome[1] + "\nIdade: " + Cadastrar.idade[1] + "\nSexo: " + Cadastrar.Sexo[1] + "\nNascimento: " + Cadastrar.nasc[1]);
                        } else {
                            area.setText("Nenhum usuário registrado até o momento");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void areaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_areaComponentHidden

    }//GEN-LAST:event_areaComponentHidden

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consulta dialog = new Consulta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
