/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FitnessCenter;

import Business.EcoSystem;
import Business.Employee.Emp;
import Business.Enterprise.Enterprise;
import Business.FitnessCenter.FitnessCenter;
import Business.Role.PathologistRole;
import Business.UserAccount.UserAccount;
import static UserInterface.MainJFrame.mainPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vedar
 */
public class CreatePathologistJPanel extends javax.swing.JPanel {
    
    private Enterprise enterprise;
    EcoSystem system;
    
    /**
     * Creates new form CreatePathologist
     */
    public CreatePathologistJPanel(Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        lblPatholgistNameValidation.setVisible(false);
        lblUsernameValidation.setVisible(false);
        lblPasswordValidation.setVisible(false);
        populateJComboBox();      
    }
    
    private void populateJComboBox() {
        fitnesscenterNamePicker.removeAllItems();
        int i = 0;
        for (FitnessCenter fitnesscenter : enterprise.getFitnesscenterDirectory().getFitnessCentersArray()) {
            if (i == 0) {
                populateTable(fitnesscenter);
                i++;
                System.out.println(fitnesscenter.getFitnessCenterName());
            }
            fitnesscenterNamePicker.addItem(fitnesscenter);
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPathologists = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblFitnessCenterName = new javax.swing.JLabel();
        fitnesscenterNamePicker = new javax.swing.JComboBox();
        lblpathologistName = new javax.swing.JLabel();
        txtPathologistName = new javax.swing.JTextField();
        lblPatholgistNameValidation = new javax.swing.JLabel();
        lblpathologistUsername = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUsernameValidation = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Create Pathologist");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblPathologists.setBackground(new java.awt.Color(204, 204, 204));
        tblPathologists.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        tblPathologists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Pathologist Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPathologists);

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(204, 204, 204));
        btnModify.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnModify.setText("Update");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lblFitnessCenterName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFitnessCenterName.setText("Fitness Center Name:");

        fitnesscenterNamePicker.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        fitnesscenterNamePicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fitnesscenterNamePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitnesscenterNamePickerActionPerformed(evt);
            }
        });

        lblpathologistName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblpathologistName.setText("Pathologist Name:");

        txtPathologistName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtPathologistName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPathologistNameFocusGained(evt);
            }
        });
        txtPathologistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathologistNameActionPerformed(evt);
            }
        });
        txtPathologistName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPathologistNameKeyTyped(evt);
            }
        });

        lblPatholgistNameValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblPatholgistNameValidation.setForeground(new java.awt.Color(255, 0, 51));

        lblpathologistUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblpathologistUsername.setText("Username:");

        txtUserName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        lblUsernameValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblUsernameValidation.setForeground(new java.awt.Color(255, 0, 51));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        lblPasswordValidation.setFont(new java.awt.Font("Myanmar MN", 0, 12)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 51));

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Add Pathologist Details");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpathologistName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpathologistUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFitnessCenterName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsernameValidation)
                                    .addComponent(lblPatholgistNameValidation)
                                    .addComponent(txtPathologistName)
                                    .addComponent(fitnesscenterNamePicker, 0, 466, Short.MAX_VALUE)
                                    .addComponent(txtUserName)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPasswordValidation)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFitnessCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fitnesscenterNamePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpathologistName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPathologistName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblPatholgistNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpathologistUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblUsernameValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPathologists.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to modify","Warring",JOptionPane.WARNING_MESSAGE);
            return;
        }
        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) tblPathologists.getModel();
        UserAccount us = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        txtUserName.setText(us.getUsername());
        txtPassword.setText(us.getPassword());
        txtPathologistName.setText(us.getEmp().getName());
        fitnesscenter.getUserAccountDirectory().removeUser(us);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblPathologists.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete","Warring",JOptionPane.WARNING_MESSAGE);
            return;
        }
        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) tblPathologists.getModel();

        UserAccount userAcc = (UserAccount) model.getValueAt(selectedRow, 0);

        fitnesscenter.getEmpDirectory().deleteEmp(userAcc.getEmp());
        fitnesscenter.getUserAccountDirectory().removeUser(userAcc);
        populateTable(fitnesscenter);
        JOptionPane.showMessageDialog(this, "Lab technician deleted successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void fitnesscenterNamePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitnesscenterNamePickerActionPerformed
        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();
        if (fitnesscenter != null) {
            populateTable(fitnesscenter);
        }
    }//GEN-LAST:event_fitnesscenterNamePickerActionPerformed

    private void txtPathologistNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPathologistNameFocusGained
        // TODO add your handling code here:
        lblPatholgistNameValidation.setVisible(false);
    }//GEN-LAST:event_txtPathologistNameFocusGained

    private void txtPathologistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathologistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathologistNameActionPerformed

    private void txtPathologistNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPathologistNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathologistNameKeyTyped

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        lblUsernameValidation.setVisible(false);
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        lblPasswordValidation.setVisible(false);
    }//GEN-LAST:event_txtPasswordFocusGained
    
    private boolean isValidData() {
        boolean isValid = true;
        boolean isValidName = txtPathologistName.getText().matches("^[a-zA-Z]+$");
        boolean isValidUsername = txtUserName.getText().matches("^[a-zA-Z0-9]+$");

        if (txtPathologistName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblPatholgistNameValidation, "Please enter name");

        } 
//        else if (!isValidName) {
//            isValid = false;
//            hideShowValidation(lblTechnicianNameValidation, "Please enter name in correct format");
//
//        }
        if (txtUserName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Please enter username");

        } else if (!isValidUsername) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Please enter username in correct format");

        }
        if (txtPassword.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblPasswordValidation, "Please enter password");

        }
        return isValid;
    }
    
    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }

    }
    
    private void saveData() {
        FitnessCenter fitnesscenter = (FitnessCenter) fitnesscenterNamePicker.getSelectedItem();

        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String name = txtPathologistName.getText();

        Emp employee = fitnesscenter.getEmpDirectory().createEmp(name);
        UserAccount userAcc = fitnesscenter.getUserAccountDirectory().createUserAccount(username, password, employee, new PathologistRole());

        populateTable(fitnesscenter);
        txtUserName.setText("");
        txtPassword.setText("");
        txtPathologistName.setText("");
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
        JOptionPane.showMessageDialog(this,"Pathologist added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (isValidData()) {
            saveData();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    private void populateTable(FitnessCenter fitnesscenter) {
        DefaultTableModel model = (DefaultTableModel) tblPathologists.getModel();
        model.setRowCount(0);
        String role = "Pathologist";

        for (UserAccount us : fitnesscenter.getUserAccountDirectory().getUserAccountList()) {
            if (us.getRole().toString().equals(role)) {
                Object[] row = new Object[2];
                row[0] = us;
                row[1] = us.getEmp().getName();
                model.addRow(row);
            }

        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox fitnesscenterNamePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFitnessCenterName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordValidation;
    private javax.swing.JLabel lblPatholgistNameValidation;
    private javax.swing.JLabel lblUsernameValidation;
    private javax.swing.JLabel lblpathologistName;
    private javax.swing.JLabel lblpathologistUsername;
    private javax.swing.JTable tblPathologists;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPathologistName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
