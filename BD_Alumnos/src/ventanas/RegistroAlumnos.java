/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import javax.swing.JOptionPane;
//Programa Demostracion de trabajo con base de datos Mysql

/**
 *
 * .
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Tel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 20));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel3.setText("Ingresa el código del alumno: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 104, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 450, -1, -1));

        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, -1));

        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 130, -1));

        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 20));
        getContentPane().add(txt_Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 140, -1));

        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        jLabel8.setText("Estado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 20));
        getContentPane().add(txt_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_estudiantes", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into Estudiantes values(?,?,?,?,?,?)");

          
            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_Direccion.getText().trim());
            pst.setString(4, txt_Tel.getText().trim());

            pst.setString(5, txt_Correo.getText().trim());
            pst.setString(6, txt_Estado.getText().trim());
           
            pst.executeUpdate();
            txt_ID.setText("");
            txt_nombre.setText("");
            txt_Direccion.setText("");
            txt_Tel.setText("");
            txt_Correo.setText("");
            txt_Estado.setText("");
           
            
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_estudiantes", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from Estudiantes where CodigoCarnet = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                 txt_ID.setText(rs.getString("CodigoCarnet"));
                 
                txt_nombre.setText(rs.getString("NombreEstudiante"));
                txt_Direccion.setText(rs.getString("DireccionEstudiante"));
                txt_Tel.setText(rs.getString("TelefonoEstudiante"));
                 txt_Correo.setText(rs.getString("CorreoEstudiante"));
                 txt_Estado.setText(rs.getString("EstadoEstudiante"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_estudiantes", "root", "");
            PreparedStatement pst = cn.prepareStatement("update Estudiantes set NombreEstudiante = ?, DireccionEstudiante = ?, TelefonoEstudiante =?, CorreoEstudiante =?, EstadoEstudiante =? where CodigoCarnet = " + ID);
            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_Direccion.getText().trim());
             pst.setString(4, txt_Tel.getText().trim());
              pst.setString(5, txt_Correo.getText().trim());
               pst.setString(6, txt_Estado.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_estudiantes", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Estudiantes where CodigoCarnet = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

       
           
            txt_ID.setText("");
            txt_nombre.setText("");
            txt_Direccion.setText("");

            txt_Tel.setText("");
            txt_Correo.setText("");
            txt_Estado.setText("");
             txt_buscar.setText("");
            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Tel;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
