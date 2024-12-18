/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;

import Business.EcoSystem;
import Business.Employee.Emp;
import Business.Enterprise.Enterprise;
import Business.Role.AgricultureEnterpriseAdmin;
import Business.State.State;
import Business.Role.FNSEnterpriseAdmin;
import Business.Role.FitnessCenterEnterpriseAdmin;
import Business.Role.AgricultureEnterpriseAdmin;
import Business.Role.VendorEnterpriseAdmin;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehap
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    EcoSystem system;
    
    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    public ManageEnterpriseAdminJPanel(EcoSystem system) {
        this.system = system;
        initComponents();
    
        hideAllValidationLabels();
        populateTable();
        populateStatePicker();
        
        
    }
    
    // Function to hide all validation labels
    private void hideAllValidationLabels() {
        lblUsernameValidation.setVisible(false);
        lblPasswordValidation.setVisible(false);
        lblNameValidation.setVisible(false);
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (State state : system.getStateList()) {
            for (Enterprise enterprise : state.getEnterpriseDirectory().getEnterpriseListArray()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = state.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateStatePicker(){
        statePicker.removeAllItems();
        
        for (State state : system.getStateList()){
            statePicker.addItem(state);
        }
    }
    
    private void populateEnterprisePicker(State state){
        enterprisePicker.removeAllItems();
        
        for (Enterprise enterprise : state.getEnterpriseDirectory().getEnterpriseListArray()){
            enterprisePicker.addItem(enterprise);
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

        mainPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsernameValidation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statePicker = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        enterprisePicker = new javax.swing.JComboBox();
        lblName2 = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblNameValidation = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        Enterprises = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        mainPanel.setBackground(new java.awt.Color(255, 204, 204));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSubmit.setText("Add");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("Enter Username:");

        txtUsername.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });

        lblUsernameValidation.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        lblUsernameValidation.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Add Enterprise Admin Details");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Choose State:");

        statePicker.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        statePicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statePickerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose Enterprise: ");

        enterprisePicker.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        enterprisePicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblName2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName2.setText("Enter Password:");

        lblPasswordValidation.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 51));

        lblName3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName3.setText("Enter Name:");

        txtName.setFont(new java.awt.Font("Myanmar MN", 0, 14)); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });

        lblNameValidation.setFont(new java.awt.Font("Malayalam MN", 0, 12)); // NOI18N
        lblNameValidation.setForeground(new java.awt.Color(255, 0, 51));

        txtPassword.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPassword))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNameValidation)
                                            .addComponent(lblPasswordValidation)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUsername)
                                            .addComponent(enterprisePicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblUsernameValidation)
                                            .addComponent(statePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enterprisePicker, statePicker, txtName, txtPassword, txtUsername});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, lblName1, lblName2, lblName3});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterprisePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(2, 2, 2)
                .addComponent(lblUsernameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblPasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {enterprisePicker, jLabel3, jLabel4, lblName1, lblName2, lblName3, statePicker, txtName, txtPassword});

        mainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 410, 350));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        Enterprises.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Enterprises.setText("Enterprises");
        Enterprises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises.setIconTextGap(0);

        enterpriseJTable.setBackground(new java.awt.Color(204, 204, 204));
        enterpriseJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enterpriseJTable.setFont(new java.awt.Font("Myanmar MN", 0, 13)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(251, 254, 234));
        enterpriseJTable.setRowSelectionAllowed(false);
        enterpriseJTable.setSelectionBackground(new java.awt.Color(251, 254, 234));
        enterpriseJTable.setSelectionForeground(new java.awt.Color(251, 254, 234));
        enterpriseJTable.setShowGrid(true);
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(Enterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Enterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        mainPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 720, 350));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Manage Enterprise Admin Details");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1301, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        lblPasswordValidation.setVisible(false);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        lblNameValidation.setVisible(false);
    }//GEN-LAST:event_txtNameFocusGained

    private void statePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statePickerActionPerformed

        State state = (State) statePicker.getSelectedItem();
        if (state != null){
            populateEnterprisePicker(state);
        }
    }//GEN-LAST:event_statePickerActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        lblUsernameValidation.setVisible(false);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (isValidData()) {
            saveData();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void saveData() {
        
        Enterprise enterprise = (Enterprise) enterprisePicker.getSelectedItem();
        
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();
        
        Emp emp = enterprise.getEmpDirectory().createEmp(name);
        System.out.println(enterprise.getEnterpriseType()+" --- "+enterprise.getName());
                
        if(enterprise.getEnterpriseType().getValue().equals("Fitness Center")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, emp, new FitnessCenterEnterpriseAdmin());
            
        } else if(enterprise.getEnterpriseType().getValue().equals("County")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, emp, new AgricultureEnterpriseAdmin());
                    
        } else if(enterprise.getEnterpriseType().getValue().equals("Vendor")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, emp, new VendorEnterpriseAdmin());
                    
        } else if(enterprise.getEnterpriseType().getValue().equals("FNS")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, emp, new FNSEnterpriseAdmin());
                    
        }
        populateTable();
        
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        JOptionPane.showMessageDialog(this,"Enterprise admin details added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    }
    

    // To check every validation of all fields
    private boolean isValidData() {
        boolean isValid = true;
        
        if (txtUsername.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Please enter username");
            
        } 
        /*else if (!UserAccountDirectory.checkIfUsernameIsUnique(txtUsername.getText())) {
            isValid = false;
            hideShowValidation(lblUsernameValidation, "Username already exists");
            
        }*/
        if (txtPassword.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblPasswordValidation, "Please enter password");
            
        } 
        if (txtName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblNameValidation, "Please enter name");
            
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
    private javax.swing.JLabel Enterprises;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterprisePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblNameValidation;
    private javax.swing.JLabel lblPasswordValidation;
    private javax.swing.JLabel lblUsernameValidation;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox statePicker;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
