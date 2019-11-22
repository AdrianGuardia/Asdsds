/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misVentanas;

import javax.swing.JOptionPane;
import misClases.Mozo;
import misClasesLista.ListaLEG;

/**
 *
 * @author Joshephpm
 */
public class myHome extends javax.swing.JFrame {

    miInicioU inicio;
    miMozoU mozos;
    miListaPedido listaPedido;
    miProcesoU miProceso;
    miMenuU miMenu;
    private void abrirInicio(){ 
        if (ventanasInicio==0) {
            inicio= new miInicioU();
            jTabbedPanePrincipal.addTab("Inicio", inicio);
            jTabbedPanePrincipal.setSelectedComponent(inicio);

        }else{
            jTabbedPanePrincipal.setSelectedComponent( inicio);
        }
        ventanasInicio=1;
        
    }
    ListaLEG<Mozo> listM;
    public myHome() {
        initComponents();
        setLocationRelativeTo(null);
        listM= new ListaLEG<Mozo>();
        abrirInicio();
        
    }

    public int ventanasInicio=0;
    
    public int ventanasMozo=0;
    private void abrirMozos(){ 
        if (ventanasMozo==0) {
            mozos= new miMozoU();
            jTabbedPanePrincipal.addTab("Mozos", mozos);
            jTabbedPanePrincipal.setSelectedComponent( mozos);
            mozos.listM=listM;
        }else{
            jTabbedPanePrincipal.setSelectedComponent(mozos);
        }
        ventanasMozo=1;
        
        
    }
    public int ventanasPedido=0;
    private void abrirListaPedido(){ 
        if (ventanasPedido==0) {
            listaPedido= new miListaPedido();
            jTabbedPanePrincipal.addTab("Pedidos", listaPedido);
            jTabbedPanePrincipal.setSelectedComponent( listaPedido);
            listaPedido.listM=listM;

        }else{
            jTabbedPanePrincipal.setSelectedComponent( listaPedido);
        }
        ventanasPedido=1;
        
    }
    public int ventanasProceso=0;
    private void abrirProceso(){ 
        if (ventanasProceso==1) {
            jTabbedPanePrincipal.setSelectedComponent( miProceso);
        }else{
            miProceso= new miProcesoU();
            jTabbedPanePrincipal.addTab("Procesos", miProceso);
            jTabbedPanePrincipal.setSelectedComponent( miProceso);
            miProceso.listM=listM;
            
        }
        ventanasProceso=1;
        
    }
    public int ventanasMenu=0;
    private void abrirMenu(){ 
        /*if (listM.getPrimero()!=null) {
            
            jTabbedPanePrincipal.addTab("Platos", listM);
        }else{
            JOptionPane.showMessageDialog(this,"Debe registrar a un mozo primero..");
        }
        lleno2=1;
        
        if (listM.getPrimero()!=null) {
            miMenu p = new miMenu();
            p.listM=listM;
            p.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Debe registrar a un mozo primero..");
        
        }
        
      */
        
        
        if (ventanasMenu==0) {
            miMenu= new  miMenuU();
            jTabbedPanePrincipal.addTab("Platos", miMenu);
            jTabbedPanePrincipal.setSelectedComponent( miMenu);
            miMenu.listM=listM;

        }else{
            jTabbedPanePrincipal.setSelectedComponent( miMenu);
        }
        ventanasMenu=1;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        Sidebar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jButtonPedidos = new javax.swing.JButton();
        jButtonInicio1 = new javax.swing.JButton();
        jButtonProcesos = new javax.swing.JButton();
        jButtonMozos2 = new javax.swing.JButton();
        jButtonMozos3 = new javax.swing.JButton();
        jButtonPlatos1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(656, 482));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(32, 51, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(32, 51, 108));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/close (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jButtonMinimizar.setBackground(new java.awt.Color(32, 51, 108));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/minimize (1).png"))); // NOI18N
        jButtonMinimizar.setBorder(null);
        jButtonMinimizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(61, 55, 125));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPanePrincipal.setBackground(new java.awt.Color(61, 55, 125));
        jTabbedPanePrincipal.setForeground(new java.awt.Color(61, 55, 125));
        jPanel2.add(jTabbedPanePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, 470));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 680, 480));

        Sidebar.setBackground(new java.awt.Color(27, 21, 93));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/lobo.png"))); // NOI18N
        Sidebar.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        jButtonPedidos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/comprobar.png"))); // NOI18N
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setBorderPainted(false);
        jButtonPedidos.setContentAreaFilled(false);
        jButtonPedidos.setDefaultCapable(false);
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 200, 140, 45));
        jButtonPedidos.getAccessibleContext().setAccessibleDescription("");

        jButtonInicio1.setBackground(new java.awt.Color(23, 35, 51));
        jButtonInicio1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonInicio1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/home-icon-silhouette.png"))); // NOI18N
        jButtonInicio1.setText("Inicio");
        jButtonInicio1.setActionCommand("");
        jButtonInicio1.setBorderPainted(false);
        jButtonInicio1.setContentAreaFilled(false);
        jButtonInicio1.setDefaultCapable(false);
        jButtonInicio1.setRequestFocusEnabled(false);
        jButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio1ActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 45));

        jButtonProcesos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonProcesos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonProcesos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/ajustes-de-engranajes.png"))); // NOI18N
        jButtonProcesos.setText("Procesos");
        jButtonProcesos.setBorderPainted(false);
        jButtonProcesos.setContentAreaFilled(false);
        jButtonProcesos.setDefaultCapable(false);
        jButtonProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcesosActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 350, 140, 45));

        jButtonMozos2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMozos2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonMozos2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMozos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/cerrar-sesion.png"))); // NOI18N
        jButtonMozos2.setText("Salir");
        jButtonMozos2.setBorderPainted(false);
        jButtonMozos2.setContentAreaFilled(false);
        jButtonMozos2.setDefaultCapable(false);
        jButtonMozos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMozos2ActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonMozos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 140, 45));

        jButtonMozos3.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMozos3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonMozos3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMozos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/esquema-del-servidor.png"))); // NOI18N
        jButtonMozos3.setText("Mozos");
        jButtonMozos3.setBorderPainted(false);
        jButtonMozos3.setContentAreaFilled(false);
        jButtonMozos3.setDefaultCapable(false);
        jButtonMozos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMozos3ActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonMozos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 250, 140, 45));

        jButtonPlatos1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPlatos1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonPlatos1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlatos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misImagenes/bandeja.png"))); // NOI18N
        jButtonPlatos1.setText("Platos");
        jButtonPlatos1.setBorderPainted(false);
        jButtonPlatos1.setContentAreaFilled(false);
        jButtonPlatos1.setDefaultCapable(false);
        jButtonPlatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlatos1ActionPerformed(evt);
            }
        });
        Sidebar.add(jButtonPlatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 300, 140, 45));

        jPanel1.add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        /*        if (listM.getPrimero()!=null) {
            miListaPedidoU e = new miListaPedidoU();
            e.listM=listM;
            e.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"No puede realizar esta accion, debe registrar a un mozo..");
        
        }
     

        if (listM.getPrimero()!=null) {
            abrirListaPedido();
        }else{
            JOptionPane.showMessageDialog(this,"No puede realizar esta accion, debe registrar a un mozo..");
        
        }
*/
        
        abrirListaPedido();
        
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        
        abrirInicio();
        
        

    }//GEN-LAST:event_jButtonInicio1ActionPerformed

    private void jButtonProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcesosActionPerformed
        /*if (listM.getPrimero()!=null) {
            miProceso f = new miProceso();
            f.listM=listM;
            f.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"No puede realizar esta accion, debe registrar a un mozo..");
        
        }*/
        abrirProceso();
        
        
    }//GEN-LAST:event_jButtonProcesosActionPerformed

    private void jButtonMozos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMozos2ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButtonMozos2ActionPerformed

    private void jButtonMozos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMozos3ActionPerformed
        /*miMozo g = new miMozo();
        g.listM=listM;
        g.setVisible(true);
        dispose();*/
        abrirMozos();


    }//GEN-LAST:event_jButtonMozos3ActionPerformed

    private void jButtonPlatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlatos1ActionPerformed
        
        /*
        if (listM.getPrimero()!=null) {
            abrirMenu();
        }else{
            JOptionPane.showMessageDialog(this,"No puede realizar esta accion, debe registrar a un mozo..");
        
        }*/
        
        abrirMenu();
        
        
    }//GEN-LAST:event_jButtonPlatos1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int confirm= JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "EXIT", confirm);
        if (result==0){
            System.exit(0);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed

         this.setState(miLogin.ICONIFIED);

    }//GEN-LAST:event_jButtonMinimizarActionPerformed

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
            java.util.logging.Logger.getLogger(myHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new myHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInicio1;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonMozos2;
    private javax.swing.JButton jButtonMozos3;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jButtonPlatos1;
    private javax.swing.JButton jButtonProcesos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    // End of variables declaration//GEN-END:variables
}
