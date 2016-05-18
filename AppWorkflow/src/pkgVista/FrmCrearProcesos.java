/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUMI
 */
public class FrmCrearProcesos extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearProcesos
     */
    public FrmCrearProcesos() {
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

        jtpanel_procesos = new javax.swing.JTabbedPane();
        jp_inicio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jp_crear = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_actividad = new javax.swing.JTextField();
        txt_responsableArea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tiempo = new javax.swing.JTextField();
        btn_GuardarRest = new javax.swing.JButton();
        btn_nuevoRest = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        btn_EliminarRest = new javax.swing.JButton();
        cbo_responsable = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_restricciones = new javax.swing.JTable();
        txt_NomProceso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_procesoActividad = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        btn_ModificarRest = new javax.swing.JButton();
        btn_nuevoH = new javax.swing.JButton();
        btn_GuardarH = new javax.swing.JButton();
        btn_ModificarH = new javax.swing.JButton();
        btn_EliminarH = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbo_tipoTramite = new javax.swing.JComboBox<String>();
        btn_GuardarProcesosActividad = new javax.swing.JButton();
        btn_Listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtpanel_procesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jp_inicio.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setText("Bienvenido al sistema ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Usted tiene privilegios ");

        btn_inicio.setText("Regresar a Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_inicioLayout = new javax.swing.GroupLayout(jp_inicio);
        jp_inicio.setLayout(jp_inicioLayout);
        jp_inicioLayout.setHorizontalGroup(
            jp_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_inicioLayout.createSequentialGroup()
                        .addGroup(jp_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addContainerGap(753, Short.MAX_VALUE))
                    .addGroup(jp_inicioLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                        .addComponent(btn_inicio)
                        .addGap(33, 33, 33))))
        );
        jp_inicioLayout.setVerticalGroup(
            jp_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGroup(jp_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_inicioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(393, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_inicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_inicio)
                        .addGap(159, 159, 159))))
        );

        jtpanel_procesos.addTab("INICIO", jp_inicio);

        jp_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CREAR ACTIVIDAD");
        jp_crear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, -1, -1));

        jLabel5.setText("Nombre Actividad");
        jp_crear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 168, -1, -1));
        jp_crear.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, 860, -1));

        jLabel6.setText("Area Responsable");
        jp_crear.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 198, -1, -1));
        jp_crear.add(txt_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 165, 154, -1));
        jp_crear.add(txt_responsableArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 195, 154, -1));

        jLabel7.setText("Posicion");
        jp_crear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 227, -1, -1));

        jLabel2.setText("Nombre Proceso");
        jp_crear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel8.setText("Tiempo");
        jp_crear.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 256, -1, -1));

        jLabel3.setText("Responsable");
        jp_crear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        jp_crear.add(txt_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 253, 70, -1));

        btn_GuardarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarRest.setText("Listar");
        btn_GuardarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_GuardarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 110, -1));

        btn_nuevoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_nuevoRest.setText("Nuevo");
        btn_nuevoRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_nuevoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 110, -1));
        jp_crear.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 224, 74, -1));

        btn_EliminarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_delete_shred.png"))); // NOI18N
        btn_EliminarRest.setText("Eliminar");
        btn_EliminarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_EliminarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 110, -1));

        cbo_responsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GERENTE DE ADMINISTRACIÓN TRIBUTARIA", "Item 2", "Item 3", "Item 4" }));
        jp_crear.add(cbo_responsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        tabla_restricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero", "Restriciones"
            }
        ));
        jScrollPane1.setViewportView(tabla_restricciones);

        jp_crear.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 109));
        jp_crear.add(txt_NomProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 242, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CREAR PROCESO");
        jp_crear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 178, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("HISTORIAL");
        jp_crear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));
        jp_crear.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, 860, -1));

        tabla_procesoActividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posicion ", "Nombre Actividad", "Area", "Tiempo"
            }
        ));
        jScrollPane2.setViewportView(tabla_procesoActividad);

        jp_crear.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 860, 110));

        jLabel10.setText("dias");
        jp_crear.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 40, -1));
        jp_crear.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 860, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CREAR RESTRICCIONES");
        jp_crear.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 307, -1, -1));

        btn_ModificarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_ModificarRest.setText("Modificar");
        jp_crear.add(btn_ModificarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 110, -1));

        btn_nuevoH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_nuevoH.setText("Nuevo");
        btn_nuevoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoHActionPerformed(evt);
            }
        });
        jp_crear.add(btn_nuevoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 120, -1));

        btn_GuardarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarH.setText("Grabar");
        jp_crear.add(btn_GuardarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 110, -1));

        btn_ModificarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_ModificarH.setText("Modificar");
        jp_crear.add(btn_ModificarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 110, -1));

        btn_EliminarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_delete_shred.png"))); // NOI18N
        btn_EliminarH.setText("Eliminar");
        btn_EliminarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarHActionPerformed(evt);
            }
        });
        jp_crear.add(btn_EliminarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 101, -1));

        jLabel14.setText("Tipo Tramite");
        jp_crear.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, -1));

        cbo_tipoTramite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DOCUMENTO INTERNO", "DOCUMENTO EXTERNO", " " }));
        jp_crear.add(cbo_tipoTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 240, -1));

        btn_GuardarProcesosActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarProcesosActividad.setText("Grabar");
        btn_GuardarProcesosActividad.setActionCommand("Guardar");
        btn_GuardarProcesosActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarProcesosActividadActionPerformed(evt);
            }
        });
        jp_crear.add(btn_GuardarProcesosActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 110, -1));

        btn_Listar.setText("Listar");
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });
        jp_crear.add(btn_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jtpanel_procesos.addTab("CREAR PROCESO", jp_crear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtpanel_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtpanel_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed

        // TODO add your handling code here:
                FrmLogin Principal=new FrmLogin();
                Principal.setVisible(true);
                FrmCrearProcesos.this.dispose();
        
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_nuevoRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoRestActionPerformed
        // TODO add your handling code here:
        FrmNuevaRestriccion Principal=new FrmNuevaRestriccion();
        Principal.setVisible(true);
        FrmCrearProcesos.this.dispose();
    }//GEN-LAST:event_btn_nuevoRestActionPerformed

    private void btn_EliminarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarRestActionPerformed

    private void btn_nuevoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoHActionPerformed
        // TODO add your handling code here:
        txt_actividad.setText("");
        txt_responsableArea.setText("");
        jSpinner1.getValue();
        txt_tiempo.setText("");
    }//GEN-LAST:event_btn_nuevoHActionPerformed

    private void btn_EliminarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarHActionPerformed

    private void btn_GuardarProcesosActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarProcesosActividadActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAOCrearProceso objCrearProceso;
        objCrearProceso = new pkgModelo.clsDAOCrearProceso();
        objCrearProceso.setTipoTramite(cbo_tipoTramite.getSelectedItem().toString().trim());
        objCrearProceso.setNomProceso(txt_NomProceso.getText().trim());
        objCrearProceso.setNomActividad(txt_actividad.getText().trim());
        objCrearProceso.setArea(txt_responsableArea.getText().trim());
        objCrearProceso.setResponsable(cbo_responsable.getSelectedItem().toString().trim());
        objCrearProceso.setPosicion(jSpinner1.getValue().toString().trim());
        objCrearProceso.setTiempo(txt_tiempo.getText().trim());
        objCrearProceso.insertarNuevoProcesoActividad();
        objCrearProceso.ListarProceso();
        JOptionPane.showMessageDialog(rootPane, "Datos correctos");
        
        tabla_procesoActividad.setModel(objCrearProceso.ListarProceso());
 
    }//GEN-LAST:event_btn_GuardarProcesosActividadActionPerformed
    
    public void ActualizarTablaActividades(ResultSet res) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        tabla_procesoActividad.setModel(modelo);
        
        modelo.addColumn("Posicion");
        modelo.addColumn("NomActividad "); 
        modelo.addColumn("Area");
        modelo.addColumn("Tiempo "); 
        
        while (res.next()){
            Object [] fila = new Object[4];
            fila[0] = res.getString("posicion");
            fila[1] = res.getString("descripcion");
            fila[2] = res.getString("area_responsable");
            fila[3] = res.getString("tiempo");
            
            modelo.addRow(fila);
            //fila = null;
        }
    }
    
    private void btn_GuardarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarRestActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAOCrearProceso objCrearProceso;
        objCrearProceso = new pkgModelo.clsDAOCrearProceso();
//        objCrearProceso.setCodigo_restriccion(txt_Codigo.getText().trim());
//        objCrearProceso.setDescripcion(txt_descripcionRest.getText().trim());
        objCrearProceso.ListarRestriciones();
        JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
        tabla_restricciones.setModel(objCrearProceso.ListarRestriciones());
    }//GEN-LAST:event_btn_GuardarRestActionPerformed

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAOCrearProceso objCrearProceso;
        objCrearProceso = new pkgModelo.clsDAOCrearProceso();
        objCrearProceso.totalPersonas((DefaultTableModel)tabla_procesoActividad.getModel());
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
            java.util.logging.Logger.getLogger(FrmCrearProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearProcesos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarH;
    private javax.swing.JButton btn_EliminarRest;
    private javax.swing.JButton btn_GuardarH;
    private javax.swing.JButton btn_GuardarProcesosActividad;
    private javax.swing.JButton btn_GuardarRest;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_ModificarH;
    private javax.swing.JButton btn_ModificarRest;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nuevoH;
    private javax.swing.JButton btn_nuevoRest;
    private javax.swing.JComboBox cbo_responsable;
    private javax.swing.JComboBox<String> cbo_tipoTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel jp_crear;
    private javax.swing.JPanel jp_inicio;
    private javax.swing.JTabbedPane jtpanel_procesos;
    private javax.swing.JTable tabla_procesoActividad;
    private javax.swing.JTable tabla_restricciones;
    private javax.swing.JTextField txt_NomProceso;
    private javax.swing.JTextField txt_actividad;
    private javax.swing.JTextField txt_responsableArea;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
