/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import bd.AccesoBD;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * In this frame you can delete a reservation.
 *To delete a reservation, you must enter the ID of the person and the id of the reservation.
 *To get the reservation id if you don't remember it, go to 'ver_reservas'.
 * @author Admin
 */
public class Borrar_Reserva extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Borrar_Reserva
     */
    Pantalla_Principal framePrin; //is a first frame

    public Borrar_Reserva() {
        initComponents();

        ImageIcon fondoP = new ImageIcon("src/fondoAPP.png");
        fondo.setIcon(fondoP);

        
        /**
         * Configurated background of button volver
         */
        ImageIcon vol = new ImageIcon("src/volver.png");
        volver.setIcon(vol);
        volver.setBorder(BorderFactory.createEmptyBorder());
        volver.setBackground(new Color(0, 0, 0, 0));
        volver.addActionListener(this);
    }

    
    /**
     * This methond check if DNI is ok.
     * @param dni is a dni
     * @return boolena 
     */
    public boolean compDni(String dni) {
        try {
            Integer.parseInt(dni.substring(0, 8));
            char letra = dni.charAt(8);

            if (letra < 65 || letra > 90) {
                return false;

            } else {
                return true;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }

    /**
     * This methond check if id of reservation is a int.
     * @param num is a id of reservation
     * @return boolena 
     */
    public boolean compNum(String num) {
        try {
            int x = Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            return false;
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

        txtBorrarReserva = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        dniL = new javax.swing.JLabel();
        idReservaL = new javax.swing.JLabel();
        dniF = new javax.swing.JTextField();
        idReserva = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBorrarReserva.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtBorrarReserva.setText("BORRAR RESERVA");
        getContentPane().add(txtBorrarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, -1));

        borrar.setBackground(new java.awt.Color(0, 0, 0));
        borrar.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 30));

        dniL.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dniL.setText("Introduce tu DNI:");
        getContentPane().add(dniL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        idReservaL.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        idReservaL.setText("Introduce el id de la reserva:");
        getContentPane().add(idReservaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(dniF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));
        getContentPane().add(idReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, -1));
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * If you press tis button the reservation will be deleted with 
     * the reservation id and DNI entered on the screen.
     * Clicking the button will access the database.
     * If the reservation is not found in the database or the data 
     * entered is not correct, an error message will be issued
     * @param evt 
     */
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try {

            if (compDni(dniF.getText().toString()) && compNum(idReserva.getText().toString())) {
                AccesoBD abd = new AccesoBD("hotel_interfaces");
                abd.borrarReserva(Integer.parseInt(idReserva.getText().toString()), dniF.getText().toString());
                JOptionPane.showMessageDialog(this, "La reserva se ha borrado");
                idReserva.setText("");
                dniF.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Los datos no son correctos", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Borrar_Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(Borrar_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrar_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrar_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrar_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton borrar;
    public static javax.swing.JTextField dniF;
    private javax.swing.JLabel dniL;
    public static javax.swing.JLabel fondo;
    public static javax.swing.JTextField idReserva;
    private javax.swing.JLabel idReservaL;
    private javax.swing.JLabel txtBorrarReserva;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * If you press this button you can go back to the previous frame.
         */
        if (e.getSource() == volver) {
            try {
                framePrin = new Pantalla_Principal();
                framePrin.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reservar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}