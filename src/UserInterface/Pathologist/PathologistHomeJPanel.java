/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pathologist;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FitnessCenter.FitnessCenter;
import Business.UserAccount.UserAccount;
//import UserInterface.;
import UserInterface.MainJFrame;
import java.awt.CardLayout;import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author vedar
 */
public class PathologistHomeJPanel extends javax.swing.JPanel {

    EcoSystem system;
    Enterprise enterprise;
    UserAccount account;

    FitnessCenter fitnessCenter;
    
    /**
     * Creates new form LabAdminOptionsJPanel
     */
    public PathologistHomeJPanel(EcoSystem system, UserAccount account, Enterprise enterprise) {
        this.system = system;
        this.account = account;
        this.enterprise = enterprise;
        initComponents();
    
        setModel();
    }

    private void setModel() {
        int fl2=0;

        for(FitnessCenter fitnessCenter: enterprise.getFitnesscenterDirectory().getFitnessCentersArray()){

            for(UserAccount ua: fitnessCenter.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(account.getUsername())){
                    this.fitnessCenter = fitnessCenter;
                    fl2=1;
                    break;
                }
            }
            if(fl2==1){
                break;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnManageLabTests = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        ActivityJPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 5));
        jPanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        jSplitPane.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel.setBackground(new java.awt.Color(255, 102, 102));
        OptionsJPanel.setPreferredSize(new java.awt.Dimension(250, 925));

        btnManageLabTests.setBackground(new java.awt.Color(255, 102, 102));
        btnManageLabTests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageLabTests.setText("Manage Tests Requests");
        btnManageLabTests.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageLabTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLabTestsActionPerformed(evt);
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
                .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageLabTests, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(btnManageLabTests, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(362, 362, 362)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );

        jSplitPane.setLeftComponent(OptionsJPanel);

        ActivityJPanel.setBackground(new java.awt.Color(255, 204, 204));
        ActivityJPanel.setPreferredSize(new java.awt.Dimension(997, 800));
        ActivityJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane.setRightComponent(ActivityJPanel);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1425, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1441, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageLabTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLabTestsActionPerformed
        // TODO add your handling code here:

        ManageTestRequestsJPanel manageTestRequestsJPanel = new ManageTestRequestsJPanel(account, fitnessCenter);
        ActivityJPanel.add("ManageTestRequestsJPanel", manageTestRequestsJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnManageLabTestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageLabTests;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
