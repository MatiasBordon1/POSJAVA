package ProyectoPOS;


import ProyectoPOS.Persistence.cPersistenceController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JavaSections extends javax.swing.JFrame {
    private int mesaActual; 
    private EntityManagerFactory emf; 

    public JavaSections(EntityManagerFactory emf) {
        initComponents();
        mesaActual = -1;
        emf = Persistence.createEntityManagerFactory("POSPU"); 

    }
private void abrirPuntoDeVenta() {
    
    JavaPOS puntoDeVenta = new JavaPOS();

    
    puntoDeVenta.configurarMesa(mesaActual);

    
    puntoDeVenta.setVisible(true);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnTable2 = new javax.swing.JButton();
        jbtnTable1 = new javax.swing.JButton();
        jbtnTable3 = new javax.swing.JButton();
        jbtnTable4 = new javax.swing.JButton();
        jbtnTable5 = new javax.swing.JButton();
        jbtnTable6 = new javax.swing.JButton();
        jbtnTable9 = new javax.swing.JButton();
        jbtnTable7 = new javax.swing.JButton();
        jbtnTable8 = new javax.swing.JButton();
        jbtnTable10 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTable2.setText("TABLE 2");
        jbtnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, 110));

        jbtnTable1.setText("TABLE 1");
        jbtnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 110, 110));

        jbtnTable3.setText("TABLE 3");
        jbtnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 110));

        jbtnTable4.setText("TABLE 4");
        jbtnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable4ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 110, 110));

        jbtnTable5.setText("TABLE 5");
        jbtnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable5ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, 110));

        jbtnTable6.setText("TABLE 6");
        jbtnTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable6ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, 110));

        jbtnTable9.setText("TABLE 9");
        jbtnTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable9ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 110, 110));

        jbtnTable7.setText("TABLE 7");
        jbtnTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable7ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 110, 110));

        jbtnTable8.setText("TABLE 8");
        jbtnTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable8ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 110, 110));

        jbtnTable10.setText("TABLE 10");
        jbtnTable10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTable10ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnTable10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 110, 110));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 390, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 410, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 64, 840, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable2ActionPerformed
        mesaActual = 2; 
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable2ActionPerformed

    private void jbtnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable1ActionPerformed
       mesaActual = 1;
        abrirPuntoDeVenta();
    
    }//GEN-LAST:event_jbtnTable1ActionPerformed

    private void jbtnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable3ActionPerformed
        mesaActual = 3; 
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable3ActionPerformed

    private void jbtnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable4ActionPerformed
        mesaActual = 4;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable4ActionPerformed

    private void jbtnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable5ActionPerformed
        mesaActual = 5;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable5ActionPerformed

    private void jbtnTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable6ActionPerformed
        mesaActual = 6;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable6ActionPerformed

    private void jbtnTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable9ActionPerformed
        mesaActual = 9;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable9ActionPerformed

    private void jbtnTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable7ActionPerformed
        mesaActual = 7;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable7ActionPerformed

    private void jbtnTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable8ActionPerformed
        mesaActual = 8;
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable8ActionPerformed

    private void jbtnTable10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTable10ActionPerformed
        mesaActual = 10; 
        abrirPuntoDeVenta();
    }//GEN-LAST:event_jbtnTable10ActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed

        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Sections",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jbtnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
       //cPersistenceController persisControll = new cPersistenceController();
       
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("POSPU"); // Crea EntityManagerFactory
            JavaSections javaSections = new JavaSections(emf); // Pasa emf como parámetro
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
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSections(emf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnTable1;
    private javax.swing.JButton jbtnTable10;
    private javax.swing.JButton jbtnTable2;
    private javax.swing.JButton jbtnTable3;
    private javax.swing.JButton jbtnTable4;
    private javax.swing.JButton jbtnTable5;
    private javax.swing.JButton jbtnTable6;
    private javax.swing.JButton jbtnTable7;
    private javax.swing.JButton jbtnTable8;
    private javax.swing.JButton jbtnTable9;
    // End of variables declaration//GEN-END:variables
}
