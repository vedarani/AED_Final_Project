/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Client;

import Business.Client.Client;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FitnessCenter.FitnessCenter;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DietitianWR;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehap
 */
public class MeetDietitianJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount userAccount;
    Client client;
    ArrayList<String> issues;

    public MeetDietitianJPanel(UserAccount userAccount, EcoSystem system, Client client) {
        initComponents();
        
        this.system = system;
        this.userAccount = userAccount;
        this.client = client;
        populateJComboBox();
        issues = new ArrayList();
        populateHistoryTable();
        DefaultTableModel model = (DefaultTableModel) tblIssues.getModel();
        model.setRowCount(0);
        
        lblAddVisitReasonValidation.setVisible(false);
    }

    private void populateHistoryTable(){
        DefaultTableModel model = (DefaultTableModel) tblHistory.getModel();
        model.setRowCount(0);
        ArrayList<WorkRequest> wr = userAccount.getWorkQueue().getWorkRequestListArray3();
        
        for(int i=wr.size()-1;i>=0;i--){
            DietitianWR request = (DietitianWR) wr.get(i);
            Object[] row = new Object[3];
            row[0] = request.getTest();
            row[2] = request.getStatus();
            row[1] = request.getMessage();
            model.addRow(row);
        }
        
    }
    
    
    private void populateJComboBox(){
        centerPicker.removeAllItems();
        int index = 0;
        
        for (State state: system.getStateList()) {
                for (Enterprise enterprise:state.getEnterpriseDirectory().getEnterpriseListArray()) {
                    if (enterprise.getFitnesscenterDirectory()!= null) {
                        for(FitnessCenter fitnessCenter: enterprise.getFitnesscenterDirectory().getFitnessCentersArray()){
                            centerPicker.addItem(fitnessCenter);
                            if (index == 0){
                                index=1;
                                populateDietitianTable(fitnessCenter);
                            }
                        }
                    }
                }
            }
    }
    
    private void populateDietitianTable(FitnessCenter fitnessCenter){
//        DefaultTableModel model = (DefaultTableModel) tblDietitian.getModel();
//
//        model.setRowCount(0);
//        for (UserAccount us : fitnessCenter.getUserAccountDirectory().getUserAccountList()) {
//            if (us.getRole().toString().equals("Dietitian")) {
//                Object[] row = new Object[1];
//                row[0] = us;
//                model.addRow(row);
//            }
//            
//        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAddVisitReason = new javax.swing.JTextField();
        btnAddVisitReason = new javax.swing.JButton();
        lblAddVisitReasonValidation = new javax.swing.JLabel();
        centerPicker = new javax.swing.JComboBox();
        btnConsultDietitian = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblIssues = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 0));

        mainPanel.setBackground(new java.awt.Color(255, 204, 204));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Suggested test", "Remarks", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistory.setEnabled(false);
        tblHistory.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(tblHistory);
        if (tblHistory.getColumnModel().getColumnCount() > 0) {
            tblHistory.getColumnModel().getColumn(0).setResizable(false);
            tblHistory.getColumnModel().getColumn(1).setResizable(false);
            tblHistory.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Previous Records");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Visit Reason :");

        txtAddVisitReason.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAddVisitReason.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddVisitReasonFocusGained(evt);
            }
        });

        btnAddVisitReason.setBackground(new java.awt.Color(204, 204, 204));
        btnAddVisitReason.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAddVisitReason.setText("Add");
        btnAddVisitReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVisitReasonActionPerformed(evt);
            }
        });

        lblAddVisitReasonValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblAddVisitReasonValidation.setForeground(new java.awt.Color(255, 0, 51));

        centerPicker.setFont(new java.awt.Font("Devanagari MT", 0, 13)); // NOI18N
        centerPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConsultDietitian.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultDietitian.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnConsultDietitian.setText("Consult");
        btnConsultDietitian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultDietitian.setBorderPainted(false);
        btnConsultDietitian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDietitianActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Select Center:");

        tblIssues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblIssues.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(tblIssues);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultDietitian, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblAddVisitReasonValidation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddVisitReason, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddVisitReason)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centerPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddVisitReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddVisitReasonValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnAddVisitReason, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(centerPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultDietitian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Send Details to Fitness Center");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultDietitianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDietitianActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblIssues.getModel();
        int noOfIssues = model.getRowCount();
        
        if (noOfIssues == 0) {
            JOptionPane.showMessageDialog(this,"Please add issue first","Warring",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        FitnessCenter fitnessCenter = (FitnessCenter)centerPicker.getSelectedItem();
        DietitianWR request = new DietitianWR();
        for(String s:issues){
            request.addIssue(s);
        }
        request.setClient(client);
        request.setFitnessCenterName(fitnessCenter);
        request.setMessage("Diet check request");
        request.setStatus("Sent to fitness center");
        request.setSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestListArray3().add(request);
        System.out.println("userAccount.getWorkQueue().getWorkRequestListArray3() -->" +userAccount.getWorkQueue().getWorkRequestListArray3());
        fitnessCenter.getWorkQueue().getWorkRequestListArray3().add(request);
        populateHistoryTable();
        System.out.println("Client Meet Diet --> "+request.getSender());
        JOptionPane.showMessageDialog(this,"Your consult request is successfully sent to the fitnessCenter","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConsultDietitianActionPerformed

    private void txtAddVisitReasonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddVisitReasonFocusGained
        // TODO add your handling code here:
        lblAddVisitReasonValidation.setVisible(false);
    }//GEN-LAST:event_txtAddVisitReasonFocusGained

    private void btnAddVisitReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVisitReasonActionPerformed
        // TODO add your handling code here:

        if (isValidData()) {
            issues.add(txtAddVisitReason.getText());
            DefaultTableModel model = (DefaultTableModel) tblIssues.getModel();
            Object row[] = new Object[1];
            row[0] = txtAddVisitReason.getText();
            model.addRow(row);
            txtAddVisitReason.setText("");
            JOptionPane.showMessageDialog(this, "Symptom added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddVisitReasonActionPerformed

    // To check every validation of all fields
    private boolean isValidData() {
        
        boolean isValid = true;
        
        if (txtAddVisitReason.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblAddVisitReasonValidation, "Please enter symptom");
            
        }
        
        return isValid;
    }
    
    // Common function to hide show validation labels
    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVisitReason;
    private javax.swing.JButton btnConsultDietitian;
    private javax.swing.JComboBox centerPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAddVisitReasonValidation;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTable tblIssues;
    private javax.swing.JTextField txtAddVisitReason;
    // End of variables declaration//GEN-END:variables
}
