/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Cliente.JF_AgregarCliente;
import Factura.JF_FiltrarFacturas;
import Prueba.VentasPrueba;
import Inventario.JF_Inventario;
import Proforma.JF_Proforma;
import Usuario.JF_AgregarUsuario;
import Login.JF_Login;
import Producto.JF_AgregarProducto;
import Prueba.VentasPrueba;
import Producto.JF_Provedor;

/**
 *
 * @author justi
 */
public class JF_Menu extends javax.swing.JFrame {

    /**
     * Creates new form JF_Menu
     */
    public JF_Menu() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnRUsuario = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnRCliente = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProformas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnproveedor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFiltroFacturas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnproductos = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Auto repuestos k&j2.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jLabel29.setText("jLabel29");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 890));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setText("AUTO REPUESTOS K&J");

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerca.png"))); // NOI18N
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        BtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_minus_1540160.png"))); // NOI18N
        BtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(899, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345)
                .addComponent(BtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1610, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel12.setText("Registros");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 110, 30));

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel27.setText("Registros");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 110, 30));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnRUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnRUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRUsuarioMouseClicked(evt);
            }
        });
        btnRUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel22.setText("Usuario");
        btnRUsuario.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        btnRUsuario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 140));

        btnRCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnRCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRClienteMouseClicked(evt);
            }
        });
        btnRCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel24.setText("Cliente");
        btnRCliente.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 30));
        btnRCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        jLabel1.setText(".");
        btnRCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 140));

        btnInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        btnInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel19.setText("Inventario ");
        btnInventario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));
        btnInventario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        btnInventario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 170));

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel15.setText("Ventas");
        btnVentas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, 30));
        btnVentas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 90));
        btnVentas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        btnVentas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 140));

        btnProformas.setBackground(new java.awt.Color(255, 255, 255));
        btnProformas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProformas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProformas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProformasMouseClicked(evt);
            }
        });
        btnProformas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel13.setText("Proformas");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        btnProformas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 30));
        btnProformas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura (1).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        btnProformas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        btnproveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnproveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnproveedorMouseClicked(evt);
            }
        });
        btnproveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel11.setText("Agregar proveedor");
        btnproveedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        btnproveedor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        btnFiltroFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltroFacturas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFiltroFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltroFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroFacturasMouseClicked(evt);
            }
        });
        btnFiltroFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel17.setText("Historial de ventas");
        btnFiltroFacturas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 30));
        btnFiltroFacturas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 70, 90));
        btnFiltroFacturas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte-de-negocios.png"))); // NOI18N
        btnFiltroFacturas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 160, 130));

        btnproductos.setBackground(new java.awt.Color(255, 255, 255));
        btnproductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnproductosMouseClicked(evt);
            }
        });
        btnproductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel25.setText("Agregar productos");
        btnproductos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario11.png"))); // NOI18N
        btnproductos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        jLabel28.setText("Facturación");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 110, 30));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnProformas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFiltroFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btnRUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProformas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFiltroFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 1360, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRUsuarioMouseClicked
        JF_AgregarUsuario m = new JF_AgregarUsuario();
        m.setVisible(true);
        dispose();
       // m.txtUsuarioVenta.setText(txtUsuarioIniciado.getText());
    }//GEN-LAST:event_btnRUsuarioMouseClicked

    private void btnRClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRClienteMouseClicked
        JF_AgregarCliente m = new JF_AgregarCliente();
        m.setVisible(true);
        dispose();
//        m.txtUsuarioVentas2.setText(txtUsuarioIniciado.getText());
    }//GEN-LAST:event_btnRClienteMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        JF_Inventario m = new JF_Inventario();
        m.setVisible(true);
        dispose();
       // m.txtUsuarioVentas3.setText(txtUsuarioIniciado.getText());
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
               VentasPrueba m = new VentasPrueba();
                m.setVisible(true);
                dispose();
        
           //    m.txtUsuarioVentas.setText(txtUsuarioIniciado.getText());
        
                m.mostrardatosProducto("");

    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProformasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseClicked
        JF_Proforma m = new JF_Proforma();
        m.setVisible(true);
        dispose();
      //  m.txtUsuarioVentas3.setText(txtUsuarioIniciado.getText());
    }//GEN-LAST:event_btnProformasMouseClicked

    private void btnproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproveedorMouseClicked
JF_Provedor p= new JF_Provedor();
p.setVisible(true);
dispose();
        

    }//GEN-LAST:event_btnproveedorMouseClicked

    private void btnFiltroFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroFacturasMouseClicked

        JF_FiltrarFacturas m = new JF_FiltrarFacturas();
        m.setVisible(true);
        dispose();
        //m.txtUsuarioVentas2.setText(txtUsuarioIniciado.getText());

        m.mostrardatos("");
    }//GEN-LAST:event_btnFiltroFacturasMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btnproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproductosMouseClicked
         JF_AgregarProducto m = new JF_AgregarProducto();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnproductosMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
          this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel btnFiltroFacturas;
    private javax.swing.JPanel btnInventario;
    private javax.swing.JPanel btnProformas;
    private javax.swing.JPanel btnRCliente;
    private javax.swing.JPanel btnRUsuario;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JPanel btnproductos;
    private javax.swing.JPanel btnproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
