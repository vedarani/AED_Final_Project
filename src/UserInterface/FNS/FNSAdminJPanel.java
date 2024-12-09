/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FNS;

//import Business.DB4OUtil.DB4OUtil;
import Business.DB4OUtil.DB4OUtil;
import Business.Vendor.Vendor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FNS.FNS;
import Business.State.State;
import Business.UserAccount.UserAccount;
import UserInterface.MainJFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author vedar
 */

public class FNSAdminJPanel extends javax.swing.JPanel {

    
    EcoSystem system;
    Enterprise enterprise;
    UserAccount userAccount;
    
    ArrayList<Enterprise> countyEnterpriseArray = new ArrayList<Enterprise>();
    private FNS fns;    
    
    
    public FNSAdminJPanel(EcoSystem system, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.system = system;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        setModel();
        
        
    }
    
    private void setModel() {
        int fl2=0;
        
        for(FNS fns: enterprise.getFnsDirectory().getFNS()){
            
            for(UserAccount ua:fns.getUserAccountDirectory().getUserAccountList()){
                if(ua.getUsername().equals(userAccount.getUsername())){
                     this.fns = fns;
                    fl2=1;
                    break;
                }
            }
            if(fl2==1){
                break;
            }
        }
        
        State flag = null;
        int fl=0;
        for(State state:system.getStateList()){
            for(Enterprise ent: state.getEnterpriseDirectory().getEnterpriseListArray()){
                if(ent.getName() == enterprise.getName()){
                    fl=1;
                    flag = state;
                    break;
                }
                if(fl==1){
                    break;
                }
            }
        }
        for(Enterprise ent:flag.getEnterpriseDirectory().getEnterpriseListArray()){
            if(ent.getEnterpriseType().getValue().equals("County")){
                countyEnterpriseArray.add(ent);
            }
        }
        System.out.println(countyEnterpriseArray);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        OptionsJPanel2 = new javax.swing.JPanel();
        btnManageProductReq = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        ActivityJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane2.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel2.setBackground(new java.awt.Color(255, 102, 102));
        OptionsJPanel2.setPreferredSize(new java.awt.Dimension(250, 925));

        btnManageProductReq.setBackground(new java.awt.Color(255, 102, 102));
        btnManageProductReq.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProductReq.setText("Manage Produce Requests");
        btnManageProductReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageProductReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductReqActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsJPanel2Layout = new javax.swing.GroupLayout(OptionsJPanel2);
        OptionsJPanel2.setLayout(OptionsJPanel2Layout);
        OptionsJPanel2Layout.setHorizontalGroup(
            OptionsJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageProductReq, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(OptionsJPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OptionsJPanel2Layout.setVerticalGroup(
            OptionsJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnManageProductReq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );

        jSplitPane2.setLeftComponent(OptionsJPanel2);

        ActivityJPanel.setBackground(new java.awt.Color(255, 204, 204));
        ActivityJPanel.setPreferredSize(new java.awt.Dimension(997, 800));
        ActivityJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(ActivityJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1390, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProductReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductReqActionPerformed
        // TODO add your handling code here:

        FNSManageProduceJPanel fnsManageProductsJPanel = new FNSManageProduceJPanel(userAccount, countyEnterpriseArray, fns);
        ActivityJPanel.add("FNSManageProductJPanel", fnsManageProductsJPanel);
        CardLayout layout = (CardLayout) ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnManageProductReqActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel2;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageProductReq;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
