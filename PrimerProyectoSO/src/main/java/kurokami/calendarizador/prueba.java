/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurokami.calendarizador;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author marcos
 */
public class prueba extends javax.swing.JFrame {
    private JPanel submenu;
    private Calendarizador cal;
    private int contador;
    /**
     * Creates new form prueba
     */
    public prueba() {
        initComponents();
        this.inicializar();
        contador = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boto = new javax.swing.JButton();
        frameinterno = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boto.setText("jButton1");
        boto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoActionPerformed(evt);
            }
        });
        getContentPane().add(boto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 60));

        frameinterno.setVisible(true);

        javax.swing.GroupLayout frameinternoLayout = new javax.swing.GroupLayout(frameinterno.getContentPane());
        frameinterno.getContentPane().setLayout(frameinternoLayout);
        frameinternoLayout.setHorizontalGroup(
            frameinternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frameinternoLayout.setVerticalGroup(
            frameinternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(frameinterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoActionPerformed
        // TODO add your handling code here:
        cal.nuevoProceso("holis"+ contador);
        contador++ ;
    }//GEN-LAST:event_botoActionPerformed

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }
    public void inicializar(){
        this.setSize(1500, 900);
        Dimension dm = new Dimension();
        dm.setSize(1500, 900);
        this.setMinimumSize(dm);
        submenu = new estadisticaCalendarizador();
        this.frameinterno.setContentPane(submenu);
        
        submenu.setLocation(15, 15);
        submenu.setVisible(true);
//        submenu.add(this.boto);
        cal = new Calendarizador();
        cal.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boto;
    private javax.swing.JInternalFrame frameinterno;
    // End of variables declaration//GEN-END:variables
}
