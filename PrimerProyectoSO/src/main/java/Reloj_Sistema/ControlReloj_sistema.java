/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj_Sistema;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tito88
 */
public class ControlReloj_sistema extends javax.swing.JPanel {
 public ControlReloj_Sistema hilo = new ControlReloj_Sistema();
    /**
     * Creates new form RELOJ
     */
    public ControlReloj_sistema() {
        initComponents();
        hilo.start();
    }

    public class ControlReloj_Sistema extends Thread {

        private String hora_sistema = "";
        private Boolean bandera_hilo = true;
        public Reloj_Sistema reloj = new Reloj_Sistema();
        
        public void run() {
          Reloj_Sistema.setHora_sistema();
          hora_sistema = Reloj_Sistema.Hora_sistema;
           while(bandera_hilo==true){
               try {
                 
                   jLabel3.setText(hora_sistema);
                   Thread.sleep(200);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ControlReloj_sistema.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel3)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("hora");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
