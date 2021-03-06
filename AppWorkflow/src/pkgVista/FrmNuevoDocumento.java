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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pkgControlador.clsConecta;


/**
 *
 * @author YUMI
 */
public class FrmNuevoDocumento extends javax.swing.JFrame {
DefaultTableModel model;
Connection Conn;
Statement sent;
private javax.swing.DefaultComboBoxModel modeloCboProcesos;
private javax.swing.DefaultComboBoxModel modeloCboArea;
clsConecta conectar;
    /**
     * Creates new form FrmNuevoDocumento
     */
    public FrmNuevoDocumento() {
        initComponents();
        modeloCboProcesos = new javax.swing.DefaultComboBoxModel(new String[] {});
        modeloCboArea = new javax.swing.DefaultComboBoxModel(new String[] {});
        Calendar c1 = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");    
        LlenarComboboxProcesos();
        LlenarComboboxDestino();
        //LlenarComboboxEstado();
        //txt_Fecha.setDate(sdf.format(c1.getTime())); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Asunto = new javax.swing.JTextField();
        txt_Destino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_remitente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_Modificar = new javax.swing.JButton();
        txt_Fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Expediente = new javax.swing.JTable();
        btn_Listar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbo_proceso = new javax.swing.JComboBox<String>();
        cbo_Destino = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Datos del Registro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        jLabel1.setText("Numero Expediente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, -1, -1));
        getContentPane().add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 92, 124, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Datos del Documento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 140, -1, -1));

        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel4.setText("Asunto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        getContentPane().add(txt_Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 320, -1));
        getContentPane().add(txt_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 124, -1));

        jLabel5.setText("Destino");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txt_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_remitenteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_remitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 124, -1));

        jLabel3.setText("Remitente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Datos Administrado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_Guardar.setText("Grabar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 110, -1));

        btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 110, -1));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/document_preview.png"))); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 110, -1));

        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/dialog_close.png"))); // NOI18N
        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 110, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 120, 770, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, 820, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NUEVO DOCUMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 110, -1));
        getContentPane().add(txt_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 133, -1));

        tabla_Expediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NumExpediente", "Asunto", "Fecha", "Destino", "Remitente"
            }
        ));
        tabla_Expediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ExpedienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Expediente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 670, 160));

        btn_Listar.setText("Listar");
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 110, -1));

        jLabel7.setText("Proceso");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel8.setText("Destino");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        cbo_proceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbo_proceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 320, -1));

        cbo_Destino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbo_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void Deshabilitar() {
        txt_numero.setEditable(false);
        txt_Asunto.setEditable(false);
        txt_remitente.setEditable(false);
        txt_Destino.setEditable(false);
    }

    void Limpiar() {
        txt_numero.setText("");
        txt_Asunto.setText("");
        txt_remitente.setText("");
        txt_Destino.setText("");
    }

    void Habilitar() {
        txt_numero.setEditable(true);
        txt_Asunto.setEditable(true);
        txt_remitente.setEditable(true);
        txt_Destino.setEditable(true);
    }


    void LlenarDocumento() {
        try {
            Conn = clsConecta.getConnection();
            String[] titulos = {"ID", "NumExpediente", "Asunto", "Fecha", "Destino", "Remitente"};
            String sql = "select id_documento,numero_expediente,asunto,fecha,destino,remitente from documento";
            model = new DefaultTableModel(null, titulos);
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            String fila[] = new String[6];

            while (rs.next()) {
                fila[0] = rs.getString("id_documento");
                fila[1] = rs.getString("numero_expediente");
                fila[2] = rs.getString("asunto");
                fila[5] = rs.getString("remitente");
                fila[3] = rs.getString("fecha");
                fila[4] = rs.getString("destino");
                fila[5] = rs.getString("remitente");

                model.addRow(fila);

            }
            tabla_Expediente.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void LlenarComboboxProcesos() {

        try {
            Conn = clsConecta.getConnection();
            String sql = "SELECT id_procesos,nombre_procesos,tipo FROM procesos ORDER BY id_procesos";
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            modeloCboProcesos.addElement("[ Elije un Proceso ]");
            while (rs.next()) {
                modeloCboProcesos.addElement(rs.getString("nombre_procesos"));
                cbo_proceso.setModel(modeloCboProcesos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void LlenarComboboxDestino() {

        try {
            Conn = clsConecta.getConnection();
            String sql = "SELECT id_area,nombre_area FROM area ORDER BY id_area";
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            modeloCboArea.addElement("[ Elije un area ]");
            while (rs.next()) {
                modeloCboArea.addElement(rs.getString("nombre_area"));
                cbo_Destino.setModel(modeloCboArea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void txt_remitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_remitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_remitenteActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        // TODO add your handling code here:
        txt_numero.setEnabled(true);
        txt_Fecha.setEnabled(true);
        txt_Asunto.setEnabled(true);
        txt_remitente.setEnabled(true);
        txt_Destino.setEnabled(true);
        
        txt_numero.setText("");
        txt_Asunto.setText("");
        txt_remitente.setText("");
        txt_Destino.setText("");
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // TODO add your handling code here:
        //FrmNuevoDocumento nuevoDoc = new FrmNuevoDocumento();
        pkgModelo.clsDAONuevoDocumento objNuevoDocumento;
        objNuevoDocumento = new pkgModelo.clsDAONuevoDocumento();
        objNuevoDocumento.setNumExpediente(txt_numero.getText().trim());
        objNuevoDocumento.setAsunto(txt_Asunto.getText().trim());
        //System.out.println("LA FECHA ES: " + txt_Fecha.getDateFormatString().trim());
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(txt_Fecha.getDate());
        System.out.println("LA FECHA ES: " + fecha);
        objNuevoDocumento.setFecha(fecha);
        
        objNuevoDocumento.setRemitente(txt_remitente.getText().trim());
        objNuevoDocumento.setDestino(txt_Destino.getText().trim());
        objNuevoDocumento.insertarNuevoDocumento();
        JOptionPane.showMessageDialog(rootPane, "Datos correctos");
        LlenarDocumento();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        FrmLogin Principal=new FrmLogin();
        Principal.setVisible(true);
        FrmNuevoDocumento.this.dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:
        Calendar c1 = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");       
       // txtfecha.setText(sdf.format(c1.getTime()));  
        
        try{
            String sql="Update documento set numero_expediente=?, asunto=?, destino=?, remitente=?"+
                    "where id_documento=?";
            int fila=tabla_Expediente.getSelectedRow();
            int dao= Integer.parseInt(tabla_Expediente.getValueAt(fila,0).toString());
            PreparedStatement ps=Conn.prepareCall(sql);
            ps.setInt(1, Integer.parseInt(txt_numero.getText().trim()));
            ps.setString(2, txt_Asunto.getText().trim());
            //ps.setDate(3, (java.sql.Date) txt_Fecha.getDate());
            ps.setString(3, txt_remitente.getText().trim());
            ps.setString(4, txt_Destino.getText().trim());
 
           ps.setInt(5,dao);
           //JOptionPane.showMessageDialog(null, ps.toString());
            int n=ps.executeUpdate();
            if(n>0){
                //Limpiar();
                LlenarDocumento();
                JOptionPane.showMessageDialog(null, "datos modificados");

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void tabla_ExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ExpedienteMouseClicked
        // TODO add your handling code here:
          if(evt.getButton()==1){
            int fila=tabla_Expediente.getSelectedRow();
            try{
                Habilitar();
                 
                 String sql="select * from documento where id_documento="+tabla_Expediente.getValueAt(fila,0);
                 sent=Conn.createStatement();
                 ResultSet rs=sent.executeQuery(sql);
                 rs.next();
                 txt_numero.setText(rs.getString("numero_expediente").trim());
                 txt_Asunto.setText(rs.getString("asunto").trim());
                 txt_Fecha.setDate(rs.getDate("fecha"));
                 txt_Destino.setText(rs.getString("destino").trim());
                 txt_remitente.setText(rs.getString("remitente").trim());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
//         Limpiar();
//         int i = tabla_Expediente.getSelectedRow();
//       // Habilitar();
//        TableModel model = tabla_Expediente.getModel();
//        txt_numero.setText(model.getValueAt(i,1).toString().trim());
//        txt_Asunto.setText(model.getValueAt(i,2).toString().trim());
//        txt_Fecha.setDate((Date) model.getValueAt(i,3));
//        txt_Destino.setText(model.getValueAt(i,4).toString().trim()); 
//        txt_remitente.setText(model.getValueAt(i,5).toString().trim());  
        
    }//GEN-LAST:event_tabla_ExpedienteMouseClicked

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        // TODO add your handling code here:
        LlenarDocumento();
    }//GEN-LAST:event_btn_ListarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevoDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cbo_Destino;
    private javax.swing.JComboBox<String> cbo_proceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabla_Expediente;
    private javax.swing.JTextField txt_Asunto;
    private javax.swing.JTextField txt_Destino;
    private com.toedter.calendar.JDateChooser txt_Fecha;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_remitente;
    // End of variables declaration//GEN-END:variables
}
