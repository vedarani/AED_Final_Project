/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Shipping;

import Business.County.County;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vedar
 */
public class ShippingHomeJPanel extends javax.swing.JPanel {
    
    public static EcoSystem system;
    private UserAccount userAccount;
    private County county;
    
    /**
     * Creates new form ShippingOptionsJPanel
     */
    public ShippingHomeJPanel(EcoSystem system, UserAccount userAccount,County county) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.county = county;
    
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnShippingOrders = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        ActivityJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 204));

        jSplitPane1.setDividerLocation(150);

        OptionsJPanel.setBackground(new java.awt.Color(255, 102, 102));
        OptionsJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnShippingOrders.setBackground(new java.awt.Color(255, 102, 102));
        btnShippingOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnShippingOrders.setText("Shipping Orders");
        btnShippingOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnShippingOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShippingOrdersActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 102, 102));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsJPanelLayout = new javax.swing.GroupLayout(OptionsJPanel);
        OptionsJPanel.setLayout(OptionsJPanelLayout);
        OptionsJPanelLayout.setHorizontalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShippingOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OptionsJPanelLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btnShippingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(603, 603, 603))
            .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OptionsJPanelLayout.createSequentialGroup()
                    .addGap(560, 560, 560)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(OptionsJPanel);

        ActivityJPanel.setBackground(new java.awt.Color(255, 204, 204));
        ActivityJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ActivityJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(ActivityJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShippingOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShippingOrdersActionPerformed
        // TODO add your handling code here:

        ManageShippingPartnerJPanel manageShippingManJPanel = new ManageShippingPartnerJPanel(userAccount, county);
        ActivityJPanel.add("ManageShippingPartnerJPanel", manageShippingManJPanel);
        CardLayout layout = (CardLayout) ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnShippingOrdersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnShippingOrders;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
