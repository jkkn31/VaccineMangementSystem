/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.CDCAdminRole;
import Business.Role.DistributorAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.InsuaranceAdminRole;
import Business.Role.PHDAdminRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavi
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    EcoSystem system;
    JPanel workArea;
    public ManageEnterpriseAdminJPanel(EcoSystem sys, JPanel workArea) {
        initComponents();
        this.workArea = workArea;

        this.system = sys;
        populateTable();
        populateCBNetwork();
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateCBNetwork(){
        cbNet.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            cbNet.addItem(network);
        }
    }
    
    private void populateCBEnterprise(Network network){
        cbEnter.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cbEnter.addItem(enterprise);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbNet = new javax.swing.JComboBox();
        cbEnter = new javax.swing.JComboBox();
        txtUN = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblPwdValid = new javax.swing.JLabel();
        lblUN = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Create Enterprise Account");

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "User Name"
            }
        ));
        jScrollPane1.setViewportView(tblEnterprise);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Network :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enterprise :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("UserName :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Name :");

        cbNet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetActionPerformed(evt);
            }
        });

        cbEnter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNActionPerformed(evt);
            }
        });
        txtUN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUNKeyReleased(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblUN.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPwd)
                    .addComponent(cbEnter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPwdValid, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(lblUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel1)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwdValid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(btnSubmit)
                .addGap(297, 297, 297))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUNActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       
        String passwordToHash = String.valueOf(txtPwd.getText());
        String password_ = null;
        boolean upCase = false;
        boolean loCase = false;
        boolean isDigit = false;
        boolean spChar = false;
        if (!passwordToHash.equals("")) {
            String SPECIAL_CHARACTERS = "!@#$%^&*()~`-=_+[]{}|:\";',./<>?";

            password_ = passwordToHash.trim();
            char[] aC = password_.toCharArray();
            for (char c : aC) {
                if (Character.isUpperCase(c)) {
                    upCase = true;
                } else if (Character.isLowerCase(c)) {
                    loCase = true;
                } else if (Character.isDigit(c)) {
                    isDigit = true;
                } else if (SPECIAL_CHARACTERS.indexOf(String.valueOf(c)) >= 0) {
                    spChar = true;
                }
            }
        }
        
        
//        String password = txtPwd.getText();
        
        
        if (txtUN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter User Name.");
        } 
        else if (txtPwd.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Password.");
        } 
        else if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter  Name.");
        } 
        else if ((password_.length() > 15) || (password_.length() < 5)) {
            JOptionPane.showMessageDialog(null, "Password must have minimum lenght 3 and maximum length 7");
            lblPwdValid.setText("Password must have minimum lenght of 5 and maximum length of 15");
        } 
        else if (upCase == false) {
            JOptionPane.showMessageDialog(null, "Password must have one Upper case");
            lblPwdValid.setText("Password must have one Upper case");
        } 
        else if (loCase == false) {
            JOptionPane.showMessageDialog(null, "Password must have one Lower case");
            lblPwdValid.setText("Password must have one Lower case");
        } 
        else if (isDigit == false) {
            JOptionPane.showMessageDialog(null, "Password must have one Digit");
            lblPwdValid.setText("Password must have one Digit");
        } 
        else if (spChar == false) {
            JOptionPane.showMessageDialog(null, "Password must have one Special Character");
            lblPwdValid.setText("Password must have one Special Character");
        }
        else 
        {

            Enterprise enterprise = (Enterprise) cbEnter.getSelectedItem();

            String username = txtUN.getText();
            String password = txtPwd.getText();
            String name = txtName.getText().toUpperCase();

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);

            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.CDC) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new CDCAdminRole());
            }
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Distributor) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DistributorAdminRole());
            }
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
            }
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.PHD) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PHDAdminRole());
            }
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Insuarance) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new InsuaranceAdminRole());
            }

            populateTable();
            
            txtUN.setText("");
            txtPwd.setText("");
            txtName.setText("");
            JOptionPane.showMessageDialog(null, "User Account created successfully.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetActionPerformed
        // TODO add your handling code here:
        
        Network network = (Network) cbNet.getSelectedItem();
        
        if (network != null){
            populateCBEnterprise(network);
        }
    }//GEN-LAST:event_cbNetActionPerformed

    private void txtUNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUNKeyReleased
        // TODO add your handling code here:
        
        Enterprise enterprise = (Enterprise) cbEnter.getSelectedItem();
        String un = txtUN.getText().toUpperCase();
        boolean isExist = enterprise.getUserAccountDirectory().isUserNameExist(un);

        if(isExist){
            lblUN.setText("UserName Already Taken.");
        }
        else{
            lblUN.setText("");
        }
    }//GEN-LAST:event_txtUNKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbEnter;
    private javax.swing.JComboBox cbNet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPwdValid;
    private javax.swing.JLabel lblUN;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
