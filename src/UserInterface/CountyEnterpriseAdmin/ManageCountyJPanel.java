/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CountyEnterpriseAdmin;

import Business.County.County;
import Business.County.CountyDirectory;
import Business.Enterprise.Enterprise;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehap
 */
public class ManageCountyJPanel extends javax.swing.JPanel {

    private CountyDirectory countyDirectory;
    private Enterprise enterprise;
    private County county;
   
    public ManageCountyJPanel(Enterprise enterprise) {
        initComponents();
        
        this.enterprise = enterprise;
        populateCountyTable();
        btnSubmit.setVisible(false);
        lblCountyNameValidation.setVisible(false);
        
    }
    
    private void populateCountyTable() {

        DefaultTableModel model = (DefaultTableModel) tblCounty.getModel();
        model.setRowCount(0);

        for (County county : enterprise.getCountyDirectory().getCountyDirectoryArray()) {
            Object[] row = new Object[1];
            row[0] = county;
            model.addRow(row);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCounty = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtCountyName = new javax.swing.JTextField();
        lblCountyNameValidation = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1420, 790));

        mainPanel.setBackground(new java.awt.Color(79, 173, 177));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(997, 800));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Agricultural Unit Details");

        tblCounty.setBackground(new java.awt.Color(204, 204, 204));
        tblCounty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Agricultural Unit Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCounty.setGridColor(new java.awt.Color(131, 197, 190));
        jScrollPane1.setViewportView(tblCounty);

        btnModify.setBackground(new java.awt.Color(204, 204, 204));
        btnModify.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnModify.setText("Update");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Add Agricultural Unit Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        lblName1.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblName1.setText("Enter Unit Name:");

        txtCountyName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtCountyName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountyNameFocusGained(evt);
            }
        });
        txtCountyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountyNameActionPerformed(evt);
            }
        });
        txtCountyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCountyNameKeyTyped(evt);
            }
        });

        lblCountyNameValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblCountyNameValidation.setForeground(new java.awt.Color(255, 0, 51));

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCountyName, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCountyNameValidation))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(655, 655, 655))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCountyName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCountyNameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1420, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblCounty.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to modify","Warring",JOptionPane.WARNING_MESSAGE);
            btnModify.setEnabled(true);
            return;
        }

        btnAdd.setVisible(false);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
        btnSubmit.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) tblCounty.getModel();
        County county = (County)model.getValueAt(selectedRow, 0);

        txtCountyName.setText(county.getCounty());
        this.county = county;
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = tblCounty.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete","Warring",JOptionPane.WARNING_MESSAGE);
            return;
        }

        County county = (County) tblCounty.getValueAt(selectedRow, 0);

        this.enterprise.getCountyDirectory().deleteCounty(county);

        populateCountyTable();
        JOptionPane.showMessageDialog(this,"Manufacturing county deleted successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCountyNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountyNameFocusGained
        // TODO add your handling code here:
        lblCountyNameValidation.setVisible(false);
    }//GEN-LAST:event_txtCountyNameFocusGained

    private void txtCountyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountyNameActionPerformed

    private void txtCountyNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountyNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountyNameKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtCountyName.getText();

        if (isValidData()) {
            County county = this.enterprise.createCounty(name);

            populateCountyTable();
            txtCountyName.setText("");
            JOptionPane.showMessageDialog(this, "Manufacturing county added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        String name = txtCountyName.getText();

        if (isValidData()) {
            btnSubmit.setEnabled(false);
            county.setCounty(name);
            btnSubmit.setVisible(false);
            btnModify.setEnabled(true);
            btnAdd.setVisible(true);
            btnDelete.setEnabled(true);

            populateCountyTable();
            txtCountyName.setText("");
            JOptionPane.showMessageDialog(this,"Manufacutring county update successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    private boolean isValidData() {
        boolean isValid = true;
        
        if (txtCountyName.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblCountyNameValidation, "Please enter county name");
            
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountyNameValidation;
    private javax.swing.JLabel lblName1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblCounty;
    private javax.swing.JTextField txtCountyName;
    // End of variables declaration//GEN-END:variables
}