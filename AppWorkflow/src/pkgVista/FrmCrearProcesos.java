/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pkgControlador.clsConecta;

/**
 *
 * @author YUMI
 */
public class FrmCrearProcesos extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection Conn;
    Statement sent;
    /**
     * Creates new form FrmCrearProcesos
     */
   // public clsConecta abc=new clsConecta();
    
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
        jLabel6 = new javax.swing.JLabel();
        txt_actividad = new javax.swing.JTextField();
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
        btn_EliminarActividad = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbo_tipoTramite = new javax.swing.JComboBox<String>();
        btn_GuardarProcesosActividad = new javax.swing.JButton();
        btn_Listar = new javax.swing.JButton();
        cbo_ListarArea = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_NumeroRest = new javax.swing.JTextField();
        txt_DescripcionRest = new javax.swing.JTextField();
        btn_ListarRestric = new javax.swing.JButton();

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
                        .addContainerGap(306, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_inicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_inicio)
                        .addGap(159, 159, 159))))
        );

        jtpanel_procesos.addTab("INICIO", jp_inicio);

        jp_crear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CREAR ACTIVIDAD");
        jp_crear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Nombre Actividad");
        jp_crear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setText("Area Responsable");
        jp_crear.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jp_crear.add(txt_actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, -1));

        jLabel7.setText("Posicion");
        jp_crear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabel2.setText("Nombre Proceso");
        jp_crear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel8.setText("Tiempo");
        jp_crear.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        jLabel3.setText("Responsable");
        jp_crear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jp_crear.add(txt_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 70, -1));

        btn_GuardarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarRest.setText("Grabar");
        btn_GuardarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_GuardarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 110, -1));

        btn_nuevoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_nuevoRest.setText("Nuevo");
        btn_nuevoRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_nuevoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 110, -1));
        jp_crear.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 74, -1));

        btn_EliminarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_delete_shred.png"))); // NOI18N
        btn_EliminarRest.setText("Eliminar");
        btn_EliminarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_EliminarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 110, -1));

        cbo_responsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Encargado", "GERENTE DE ADMINISTRACIÓN TRIBUTARIA", " " }));
        jp_crear.add(cbo_responsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 300, -1));

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
        tabla_restricciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_restriccionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_restricciones);

        jp_crear.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 390, 110));
        jp_crear.add(txt_NomProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 242, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CREAR PROCESO");
        jp_crear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 178, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("HISTORIAL");
        jp_crear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jp_crear.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 870, 10));

        tabla_procesoActividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Posicion ", "Nombre Actividad", "Area", "Tiempo"
            }
        ));
        tabla_procesoActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_procesoActividadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_procesoActividad);

        jp_crear.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 860, 120));

        jLabel10.setText("dias");
        jp_crear.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 40, -1));
        jp_crear.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 860, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CREAR RESTRICCIONES");
        jp_crear.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        btn_ModificarRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_ModificarRest.setText("Modificar");
        btn_ModificarRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarRestActionPerformed(evt);
            }
        });
        jp_crear.add(btn_ModificarRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 110, -1));

        btn_nuevoH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/news_subscribe.png"))); // NOI18N
        btn_nuevoH.setText("Nuevo");
        btn_nuevoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoHActionPerformed(evt);
            }
        });
        jp_crear.add(btn_nuevoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, -1));

        btn_GuardarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarH.setText("Grabar");
        btn_GuardarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarHActionPerformed(evt);
            }
        });
        jp_crear.add(btn_GuardarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 110, -1));

        btn_ModificarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit.png"))); // NOI18N
        btn_ModificarH.setText("Modificar");
        btn_ModificarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarHActionPerformed(evt);
            }
        });
        jp_crear.add(btn_ModificarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 110, -1));

        btn_EliminarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/edit_delete_shred.png"))); // NOI18N
        btn_EliminarActividad.setText("Eliminar");
        btn_EliminarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActividadActionPerformed(evt);
            }
        });
        jp_crear.add(btn_EliminarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 101, -1));

        jLabel14.setText("Tipo Tramite");
        jp_crear.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        cbo_tipoTramite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DOCUMENTO INTERNO", "DOCUMENTO EXTERNO", " " }));
        jp_crear.add(cbo_tipoTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 240, -1));

        btn_GuardarProcesosActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgIconos/save_all.png"))); // NOI18N
        btn_GuardarProcesosActividad.setText("Grabar");
        btn_GuardarProcesosActividad.setActionCommand("Guardar");
        btn_GuardarProcesosActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarProcesosActividadActionPerformed(evt);
            }
        });
        jp_crear.add(btn_GuardarProcesosActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 110, -1));

        btn_Listar.setText("Listar");
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });
        jp_crear.add(btn_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 90, -1));

        cbo_ListarArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Area", "Oficina Secretaria General", "Gerencia de Administracion Tributaria", "SubGerencia Logistica", "SubGerencia Tesoreria", "SubGerencia Contabilidad", "SubGerencia Informatica y Estadistica", "SubGerencia Estudis y Proyectos", "SubGerencia Recursos Humanos", "SubGerencia Gestion Riesgos de Desastres", "Gerencia Asesoria Juridica", "Gerencia Planificacion y Presupuesto", "Gerencia Desarrollo Urbano", "Gerencia Servicio Ciudadano", "Gerencia Desarrollo Social", "Gerencia Transporte Urbano", "Gerencia Administracion Tributaria", "SubGerencia Fiscalizacion Administracion", "Gerencia Seguridad Ciudadana", "Gerencia Centro Historico" }));
        cbo_ListarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ListarAreaActionPerformed(evt);
            }
        });
        jp_crear.add(cbo_ListarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, -1));

        jLabel15.setText("Codigo");
        jp_crear.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel16.setText("Restriccion");
        jp_crear.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
        jp_crear.add(txt_NumeroRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 170, -1));
        jp_crear.add(txt_DescripcionRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 170, -1));

        jtpanel_procesos.addTab("CREAR PROCESO", jp_crear);

        btn_ListarRestric.setText("Listar");
        btn_ListarRestric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarRestricActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(btn_ListarRestric)
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtpanel_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(640, Short.MAX_VALUE)
                .addComponent(btn_ListarRestric)
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtpanel_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void Deshabilitar(){
        txt_NomProceso.setEditable(false);
        txt_actividad.setEditable(false);
        txt_tiempo.setEditable(false);
    }
    void Limpiar(){
        txt_NomProceso.setText("");
        txt_actividad.setText("");
        txt_tiempo.setText("");
    }
    void Habilitar(){
        txt_NomProceso.setEditable(true);
        txt_actividad.setEditable(true);
        txt_tiempo.setEditable(true);
    }
    void LlenarActividad(){
        try {
            Conn = clsConecta.getConnection();
            String[] titulos = {"ID", "Posicion", "NombreActividad", "Area", "Tiempo"};
            String sql = "select id_actividad,posicion,descripcion,area_responsable, tiempo from actividad_por_proceso";
            model = new DefaultTableModel(null, titulos);
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            String fila[] = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("id_actividad");
                fila[1] = rs.getString("posicion");
                fila[2] = rs.getString("descripcion");
                fila[3] = rs.getString("area_responsable");
                fila[4] = rs.getString("tiempo");

                model.addRow(fila);

            }
            tabla_procesoActividad.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void LlenarRestricciones(){
        try {
            Conn = clsConecta.getConnection();
            String[] titulos = {"ID", "Codigo", "Restricciones"};
            String sql = "select id_restriccion,codigo_restriccion,descripcion from restricciones_por_actividad";
            model = new DefaultTableModel(null, titulos);
            sent = Conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);

            String fila[] = new String[3];

            while (rs.next()) {
                fila[0] = rs.getString("id_restriccion");
                fila[1] = rs.getString("codigo_restriccion");
                fila[2] = rs.getString("descripcion");

                model.addRow(fila);

            }
           tabla_restricciones.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed

        // TODO add your handling code here:
        FrmLogin Principal = new FrmLogin();
        Principal.setVisible(true);
        FrmCrearProcesos.this.dispose();
        
    }//GEN-LAST:event_btn_inicioActionPerformed
    
    private void btn_nuevoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoHActionPerformed
        // TODO add your handling code here:
        txt_actividad.setText("");
        //txt_responsableArea.setText("");
        jSpinner1.getValue();
        txt_tiempo.setText("");
    }//GEN-LAST:event_btn_nuevoHActionPerformed

    private void btn_EliminarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActividadActionPerformed
        // TODO add your handling code here:
        try {
            int fila = tabla_procesoActividad.getSelectedRow();
            String sql = "delete from actividad_por_proceso where id_actividad= '"+tabla_procesoActividad.getValueAt(fila,0).toString().trim() + "'";
            sent = Conn.createStatement();
            int n = sent.executeUpdate(sql);
            if (n > 0) {
                LlenarActividad();
                JOptionPane.showMessageDialog(null, "datos eliminados");
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
//        String sql="delete from actividad_por_proceso where descripcion= '"+tabla_procesoActividad.getValueAt(fila - 1,0).toString().trim() + "'";
    }//GEN-LAST:event_btn_EliminarActividadActionPerformed

    private void btn_GuardarProcesosActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarProcesosActividadActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAOCrearProceso objCrearProceso;
        objCrearProceso = new pkgModelo.clsDAOCrearProceso();
        objCrearProceso.setTipoTramite(cbo_tipoTramite.getSelectedItem().toString().trim());
        objCrearProceso.setNomProceso(txt_NomProceso.getText().trim());
        objCrearProceso.setNomActividad(txt_actividad.getText().trim());
        //objCrearProceso.setArea(txt_responsableArea.getText().trim());
        objCrearProceso.setArea(cbo_ListarArea.getSelectedItem().toString().trim());
        objCrearProceso.setResponsable(cbo_responsable.getSelectedItem().toString().trim());
        objCrearProceso.setPosicion(jSpinner1.getValue().toString().trim());
        objCrearProceso.setTiempo(txt_tiempo.getText().trim());
        objCrearProceso.insertarNuevoProcesoActividad();
        //objCrearProceso.ListarProceso();
        tabla_procesoActividad.setModel(objCrearProceso.ListarProceso());
        LlenarActividad();
        JOptionPane.showMessageDialog(rootPane, "Datos correctos");
        
        NuevaActividad();
    }//GEN-LAST:event_btn_GuardarProcesosActividadActionPerformed
    public void NuevaActividad(){
        txt_actividad.setText("");
        jSpinner1.getValue();
        txt_tiempo.setText("");
    }

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        // TODO add your handling code here:
        LlenarActividad();
        cambiarCombo(evt);
    }//GEN-LAST:event_btn_ListarActionPerformed

    private void cbo_ListarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ListarAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ListarAreaActionPerformed

    private void btn_ModificarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarHActionPerformed
        // TODO add your handling code here:
         try{
            String sql="Update actividad_por_proceso set descripcion=?, area_responsable=?, tiempo=?, posicion=?"+
                    "where id_actividad=?";
            int fila=tabla_procesoActividad.getSelectedRow();
            int dao= Integer.parseInt(tabla_procesoActividad.getValueAt(fila,0).toString());
            PreparedStatement ps=Conn.prepareCall(sql);
            
//           ps.setString(1, txt_NomProceso.getText().trim());
//            ps.setString(1, cbo_tipoTramite.getSelectedItem().toString().trim());
            ps.setString(1, txt_actividad.getText().trim());
            ps.setString(2, cbo_ListarArea.getSelectedItem().toString().trim());
           // ps.setString(3, cbo_responsable.getSelectedItem().toString().trim());
            ps.setString(3, txt_tiempo.getText().trim());
            ps.setString(4, jSpinner1.getValue().toString());
 
           ps.setInt(5,dao);
           //JOptionPane.showMessageDialog(null, ps.toString());
            int n=ps.executeUpdate();
            if(n>0){
                //Limpiar();
                LlenarActividad();
                JOptionPane.showMessageDialog(null, "datos modificados");

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarHActionPerformed

    private void tabla_procesoActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_procesoActividadMouseClicked
        // TODO add your handling code here:
        //Limpiar();
        int i = tabla_procesoActividad.getSelectedRow();
       // Habilitar();
        TableModel model = tabla_procesoActividad.getModel();
        //jSpinner1.setValue(model.getValueAt(i,1));
        jSpinner1.setValue(0);
        txt_actividad.setText(model.getValueAt(i,2).toString().trim());
        cbo_ListarArea.setSelectedItem(toString().equals(model.getValueAt(i, 3).toString()));
//        cbo_responsable.getSelectedItem().toString();
        txt_tiempo.setText(model.getValueAt(i,4).toString().trim());     
    }//GEN-LAST:event_tabla_procesoActividadMouseClicked
    
    private void cambiarCombo(java.awt.event.ActionEvent evt)
    {
        cbo_ListarArea.setSelectedIndex(2);
    }
    
    private void btn_GuardarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarHActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO procesos(nombre_procesos, tipo) VALUES (?,?)";
            PreparedStatement ps=Conn.prepareCall(sql);
            ps.setString(1, txt_NomProceso.getText().trim());
            ps.setString(2, cbo_tipoTramite.getSelectedItem().toString().trim());
//            sql = "INSERT INTO actividad_por_proceso(descripcion, area_responsable, tiempo, posicion) VALUES (?,?,?,?)";
//            PreparedStatement ps=Conn.prepareCall(sql);
//            ps.setString(3, txt_actividad.getText().trim());
//            ps.setString(4, cbo_ListarArea.getSelectedItem().toString().trim());
//            ps.setString(5, cbo_responsable.getSelectedItem().toString().trim());
//            ps.setString(6, txt_tiempo.getText().trim());
//            ps.setString(7, jSpinner1.getValue().toString());
            guardarActividad();
            int n=ps.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "datos guardados");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
        LlenarActividad();
       // Limpiar();
    }//GEN-LAST:event_btn_GuardarHActionPerformed

    private void guardarActividad(){
        try{
            String  sql = "INSERT INTO actividad_por_proceso(descripcion, area_responsable, tiempo, posicion) VALUES (?,?,?,?)";
            PreparedStatement ps=Conn.prepareCall(sql);
            ps.setString(1, txt_actividad.getText().trim());
            ps.setString(2, cbo_ListarArea.getSelectedItem().toString().trim());
            ps.setString(3, cbo_responsable.getSelectedItem().toString().trim());
            ps.setString(4, txt_tiempo.getText().trim());
            ps.setString(5, jSpinner1.getValue().toString());
            
            int n=ps.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "datos guardados");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
        //LlenarActividad();
    }
    
    private void btn_EliminarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarRestActionPerformed
        // TODO add your handling code here:
        try {
            int fila = tabla_restricciones.getSelectedRow();
            String sql = "delete from restricciones_por_actividad where codigo_restriccion= '"+tabla_restricciones.getValueAt(fila-1,0).toString().trim() + "'";
            JOptionPane.showMessageDialog(null, sql);
            sent = Conn.createStatement();
            int n = sent.executeUpdate(sql);
            if (n > 0) {
                LlenarActividad();
                JOptionPane.showMessageDialog(null, "datos eliminados");
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarRestActionPerformed

    private void btn_ModificarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarRestActionPerformed
        // TODO add your handling code here:
            try{
            String sql="Update restricciones_por_actividad set codigo_restriccion=?, descripcion=?"+
            "where id_restriccion=?";
            int fila=tabla_restricciones.getSelectedRow();
            int dao= Integer.parseInt(tabla_restricciones.getValueAt(fila,0).toString().trim());
            PreparedStatement ps=Conn.prepareCall(sql);

            ps.setString(1, txt_NumeroRest.getText().trim());
            ps.setString(2, txt_DescripcionRest.getText().trim());

            ps.setInt(3,dao);
            //JOptionPane.showMessageDialog(null, ps.toString());
            int n=ps.executeUpdate();
            if(n>0){
                //Limpiar();
                LlenarRestricciones();
                JOptionPane.showMessageDialog(null, "datos modificados");

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarRestActionPerformed

    private void btn_GuardarRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarRestActionPerformed
        // TODO add your handling code here:
        try{
            String sql="insert into restricciones_por_actividad (codigo_restriccion, descripcion)" +
            "Values (?,?) ";

            PreparedStatement ps=Conn.prepareCall(sql);
            ps.setString(1, txt_NumeroRest.getText().trim());
            ps.setString(2, txt_DescripcionRest.getText().trim());

            int n=ps.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "datos guardados");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error"+ e.getMessage());
        }
        LlenarRestricciones();
    }//GEN-LAST:event_btn_GuardarRestActionPerformed

    private void btn_nuevoRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoRestActionPerformed
        // TODO add your handling code here:
        txt_NumeroRest.setText("");
        txt_DescripcionRest.setText("");
    }//GEN-LAST:event_btn_nuevoRestActionPerformed

    private void tabla_restriccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_restriccionesMouseClicked
        // TODO add your handling code here:
        //Limpiar();
        int i = tabla_restricciones.getSelectedRow();
        // Habilitar();
        TableModel model = tabla_restricciones.getModel();
        txt_NumeroRest.setText(model.getValueAt(i,1).toString().trim());
        txt_DescripcionRest.setText(model.getValueAt(i,2).toString().trim());
    }//GEN-LAST:event_tabla_restriccionesMouseClicked

    private void btn_ListarRestricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarRestricActionPerformed
        // TODO add your handling code here:
        LlenarRestricciones();
    }//GEN-LAST:event_btn_ListarRestricActionPerformed

    public void insertarNuevoProcesoActividad(){         
        String SQL; //= "INSERT INTO procesos(nombre_procesos, tipo) VALUES (?,?)";
        SQL = "INSERT INTO Actividad_por_Proceso(descripcion, area_responsable, tiempo, posicion) VALUES (?,?,?,?)";
    }
    
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
    private javax.swing.JButton btn_EliminarActividad;
    private javax.swing.JButton btn_EliminarRest;
    private javax.swing.JButton btn_GuardarH;
    private javax.swing.JButton btn_GuardarProcesosActividad;
    private javax.swing.JButton btn_GuardarRest;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_ListarRestric;
    private javax.swing.JButton btn_ModificarH;
    private javax.swing.JButton btn_ModificarRest;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nuevoH;
    private javax.swing.JButton btn_nuevoRest;
    private javax.swing.JComboBox cbo_ListarArea;
    private javax.swing.JComboBox cbo_responsable;
    private javax.swing.JComboBox<String> cbo_tipoTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel jp_crear;
    private javax.swing.JPanel jp_inicio;
    private javax.swing.JTabbedPane jtpanel_procesos;
    private javax.swing.JTable tabla_procesoActividad;
    private javax.swing.JTable tabla_restricciones;
    private javax.swing.JTextField txt_DescripcionRest;
    private javax.swing.JTextField txt_NomProceso;
    private javax.swing.JTextField txt_NumeroRest;
    private javax.swing.JTextField txt_actividad;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
