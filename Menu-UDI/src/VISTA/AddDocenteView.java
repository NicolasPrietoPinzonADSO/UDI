package VISTA;

import CONTROLADOR.ControladorDocente;

public class AddDocenteView extends javax.swing.JDialog {
    
    private ControladorDocente ctrDocente;

    public AddDocenteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(400, 450);
        setLocationRelativeTo(parent);
        
        ctrDocente = new ControladorDocente(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreDocente = new Design.TextField();
        apellidoDocente = new Design.TextField();
        cedulaDocente = new Design.TextField();
        addDocente = new Design.ButtonLogin();
        closeDocente = new Design.ButtonLogin();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreDocente.setLabelText("Nombre");
        jPanel1.add(nombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 216, -1));

        apellidoDocente.setLabelText("Apellido");
        jPanel1.add(apellidoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 216, -1));

        cedulaDocente.setLabelText("Cedula");
        jPanel1.add(cedulaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 216, -1));

        addDocente.setText("Add");
        jPanel1.add(addDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        closeDocente.setText("Close");
        jPanel1.add(closeDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddDocenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDocenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDocenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDocenteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddDocenteView dialog = new AddDocenteView(new javax.swing.JFrame(), true);
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
    public Design.ButtonLogin addDocente;
    public Design.TextField apellidoDocente;
    public Design.TextField cedulaDocente;
    public Design.ButtonLogin closeDocente;
    private javax.swing.JPanel jPanel1;
    public Design.TextField nombreDocente;
    // End of variables declaration//GEN-END:variables
}
