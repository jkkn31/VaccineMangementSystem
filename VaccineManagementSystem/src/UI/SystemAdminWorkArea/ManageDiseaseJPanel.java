/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import Business.Disease.Disease;
import Business.EcoSystem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavi
 */
public class ManageDiseaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiseaseJPanel
     */
    
    EcoSystem system;
    JPanel WorkArea;
    
    public ManageDiseaseJPanel(EcoSystem system, JPanel workArea) {
        initComponents();
        this.WorkArea = workArea;
        this.system = system;
        populateDiseaseTable();
    }
    
    public void populateDiseaseTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDiseases.getModel();
        dtm.setRowCount(0);
        for (Disease disease : system.getDiseaseDirectory().getDiseaseList()) {
            Object[] row = new Object[1];
            row[0] = disease;
            dtm.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiseases = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        btnAddDisease = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1100, 800));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setText("Manage Disease");

        tblDiseases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Disease"
            }
        ));
        jScrollPane1.setViewportView(tblDiseases);

        jLabel2.setText("Disease :");

        btnAddDisease.setText("Create New Disease");
        btnAddDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiseaseActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Disease");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(jLabel2)
                                    .addGap(41, 41, 41)
                                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(118, 118, 118)
                                    .addComponent(btnAddDisease)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131))
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(262, 262, 262)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblTitle)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnDelete)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAddDisease)
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblDiseases.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the Disease to delete from the System", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Disease p = (Disease) tblDiseases.getValueAt(selectedRow, 0);

            system.getDiseaseDirectory().removeDisease(p);
            JOptionPane.showMessageDialog(null, "Successfully deleted the Disease from the System");
            populateDiseaseTable();
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiseaseActionPerformed
        // TODO add your handling code here:
        
        if(txtDisease.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Disease Name.");
        }
         else
        {
        Disease v = system.getDiseaseDirectory().addDisease();
        v.setDiseaseName(txtDisease.getText());
        populateDiseaseTable();
        txtDisease.setText("");
          JOptionPane.showMessageDialog(null, "Disease added successfully.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }

        
        
        
    }//GEN-LAST:event_btnAddDiseaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDisease;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDiseases;
    private javax.swing.JTextField txtDisease;
    // End of variables declaration//GEN-END:variables
}
