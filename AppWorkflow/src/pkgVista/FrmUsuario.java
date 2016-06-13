/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pkgControlador.clsConecta;

/**
 *
 * @author YUMI
 */
public class FrmUsuario extends javax.swing.JFrame {
DefaultTableModel model;
Connection Conn;
Statement sent;

    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario() {
        initComponents();
        Llenar();
        Deshabilitar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_Cargo = new javax.swing.JComboBox();
        txt_Contraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_NombApellidos = new javax.swing.JTextField();
        btn_NuevoUsuario = new javax.swing.JButton();
        btn_GuardarUsuario = new javax.swing.JButton();
        btn_ModificarUsuario = new javax.swing.JButton();
        btn_EliminarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Usuario = new javax.swing.JTable();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cargo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 45, 44, -1));

        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 68, 161, -1));

        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 74, -1, -1));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 109, -1, -1));

        cbo_Cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Encargado Mesa Partes", "Modelador", "Gerente" }));
        getContentPane().add(cbo_Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 39, 160, -1));
        getContentPane().add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 103, 160, -1));

        jLabel4.setText("Nombre y Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 146, -1, -1));
        getContentPane().add(txt_NombApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 143, 160, -1));

        btn_NuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_NuevoUsuario.setText("Nuevo");
        btn_NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_NuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 27, 120, -1));

        btn_GuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarUsuario.setText("Grabar");
        btn_GuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_GuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 59, 120, -1));

        btn_ModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_ModificarUsuario.setText("Modificar");
        btn_ModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 97, 120, -1));

        btn_EliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_delete_shred.png"))); // NOI18N
        btn_EliminarUsuario.setText("Eliminar");
        btn_EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 129, 120, -1));

        tabla_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_UsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Usuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 219, 484, 131));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/stop.png"))); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 161, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void Deshabilitar(){
        txt_Usuario.setEditable(false);
        txt_Contraseña.setEditable(false);
        txt_NombApellidos.setEditable(false);
    }
    void Limpiar(){
        txt_Usuario.setText("");
        txt_Contraseña.setText("");
        txt_NombApellidos.setText("");
    }
    void Habilitar(){
        txt_Usuario.setEditable(true);
        txt_Contraseña.setEditable(true);
        txt_NombApellidos.setEditable(true);
    }
    void Llenar() {
        try {
            Conn = clsConecta.getConnection();
            String[] titulos = {"Usuario", "Contraseña", "NombreyApellidos", "Cargo"};
            String sql = "select nombre_usuario,clave_usuario,nombre_completo, cargo from usuario";
            model = new DefaultTableModel(null, titulos);
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            String fila[] = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("nombre_usuario");
                fila[1] = rs.getString("clave_usuario");
                fila[2] = rs.getString("nombre_completo");
                fila[3] = rs.getString("cargo");

                model.addRow(fila);

            }
            tabla_Usuario.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btn_NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoUsuarioActionPerformed
        // TODO add your handling code here:
        Limpiar();
        Habilitar();
    }//GEN-LAST:event_btn_NuevoUsuarioActionPerformed

    private void btn_EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarUsuarioActionPerformed
        // TODO add your handling code here:
        try{
            int n=0;
            int fila=tabla_Usuario.getSelectedRow();
            fila++;
            //JOptionPane.showMessageDialog(null, fila);
            String sql="delete from usuario where nombre_usuario= '"+tabla_Usuario.getValueAt(fila - 1,0).toString().trim() + "'";
            //JOptionPane.showMessageDialog(null, tabla_Usuario.getValueAt(fila - 1,0));
            //JOptionPane.showMessageDialog(null, sql);
            sent=Conn.createStatement();
            n=sent.executeUpdate(sql);
           
            if(n>0){
                
                Llenar();
                JOptionPane.showMessageDialog(null, "datos eliminados");
                Limpiar();
            }
            fila = 0;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+e.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarUsuarioActionPerformed

    private void btn_GuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarUsuarioActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "insert into usuario (nombre_usuario, clave_usuario, nombre_completo, cargo)"
                    + "Values (?,?,?,?) ";
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement ps = Conn.prepareCall(sql);
            ps.setString(1, txt_Usuario.getText().trim());
            ps.setString(2, txt_Contraseña.getText().trim());
            ps.setString(3, txt_NombApellidos.getText().trim());
            ps.setString(4, cbo_Cargo.getSelectedItem().toString().trim());

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "datos guardados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
        Llenar();
        Limpiar();
    }//GEN-LAST:event_btn_GuardarUsuarioActionPerformed

    private void tabla_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_UsuarioMouseClicked
        // TODO add your handling code here:
        Limpiar();
        int i = tabla_Usuario.getSelectedRow();
        Habilitar();
        TableModel model = tabla_Usuario.getModel();
         cbo_Cargo.getSelectedItem().toString();
         txt_Usuario.setText(model.getValueAt(i,0).toString().trim());
         txt_Contraseña.setText(model.getValueAt(i,1).toString().trim());
         txt_NombApellidos.setText(model.getValueAt(i,2).toString().trim());
//        if(evt.getButton()==1){
//            int fila=tabla_Usuario.getSelectedRow();
//            try{
//                Habilitar();
//                 
//                 String sql="select * from usuario where id_usuario="+tabla_Usuario.getValueAt(fila,0);
//                 sent=Conn.createStatement();
//                 ResultSet rs=sent.executeQuery(sql);
//                 rs.next();
//                 cbo_Cargo.getSelectedItem().toString();
//                 txt_Usuario.setText(rs.getString("nombre_usuario"));
//                 txt_Contraseña.setText(rs.getString("clave_usuario"));
//                 txt_NombApellidos.setText(rs.getString("nombre_completo"));
//                 
//
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
    }//GEN-LAST:event_tabla_UsuarioMouseClicked

    private void btn_ModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarUsuarioActionPerformed
        // TODO add your handling code here:
        try{
            String sql="Update usuario set nombre_usuario=?, clave_usuario=?, nombre_completo=?, cargo=?"+
                    "where nombre_usuario=?";
            int fila=tabla_Usuario.getSelectedRow();
            String dao=(String)tabla_Usuario.getValueAt(fila,0);
            PreparedStatement ps=Conn.prepareCall(sql);
            ps.setString(1, txt_Usuario.getText().trim());
            ps.setString(2, txt_Contraseña.getText().trim());
            ps.setString(3, txt_NombApellidos.getText().trim());
            ps.setString(4, cbo_Cargo.getSelectedItem().toString().trim());

           ps.setString(5,dao);
            int n=ps.executeUpdate();
            if(n>0){
                Limpiar();
                Llenar();
                JOptionPane.showMessageDialog(null, "datos modificados");

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarUsuarioActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarUsuario;
    private javax.swing.JButton btn_GuardarUsuario;
    private javax.swing.JButton btn_ModificarUsuario;
    private javax.swing.JButton btn_NuevoUsuario;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox cbo_Cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Usuario;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_NombApellidos;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
