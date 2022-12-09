/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import UI.MainLoginJFrame;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bhargavi
 */
public class SystemAdminWorkArea extends javax.swing.JFrame{

    /**
     * Creates new form SystemAdminWorkArea
     */
    
    EcoSystem system;
    Network network;
    public SystemAdminWorkArea(EcoSystem system) {
        initComponents();
        this.system = system;
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageDisease = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageEnterpriseAdmin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnManageVaccine = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setPreferredSize(new java.awt.Dimension(200, 800));

        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageDisease.setText("Manage Disease");
        btnManageDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDiseaseActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmin.setText("Manage Enterprise Admin");
        btnManageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnManageVaccine.setText("Manage Vaccine");
        btnManageVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDisease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageVaccine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageDisease, btnManageEnterprise, btnManageEnterpriseAdmin, btnManageNetwork});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btnManageNetwork)
                .addGap(18, 18, 18)
                .addComponent(btnManageDisease)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccine)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterpriseAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(51, 51, 51))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setPreferredSize(new java.awt.Dimension(1100, 800));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        // TODO add your handling code here:
//        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(system);
////        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
//        CardLayout layout = (CardLayout) workArea.getLayout();
//        layout.next(workArea);
        ManageNetworkJPanel mnp = new ManageNetworkJPanel(system, workArea);
        workArea.add("manageNetworkJPanel", mnp);
//        splitPane.setRightComponent(mnp);

        CardLayout cardlayout = (CardLayout) workArea.getLayout();
        cardlayout.next(workArea);        
        
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDiseaseActionPerformed
        // TODO add your handling code here:
        ManageDiseaseJPanel mdp = new ManageDiseaseJPanel(system, workArea);
//        workArea.add("managePatientJPanel", mdp);
//        splitPane.setRightComponent(mdp);
        workArea.add("manageDiseaseJPanel", mdp);
//        splitPane.setRightComponent(mnp);

        CardLayout cardlayout = (CardLayout) workArea.getLayout();
        cardlayout.next(workArea);        
    }//GEN-LAST:event_btnManageDiseaseActionPerformed

    private void btnManageVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccineActionPerformed
        // TODO add your handling code here:
        ManageVaccineJPanel mvp = new ManageVaccineJPanel(system, workArea);
        workArea.add("managePatientJPanel", mvp);
//        splitPane.setRightComponent(mvp);
        CardLayout cardlayout = (CardLayout) workArea.getLayout();
        cardlayout.next(workArea);      
    }//GEN-LAST:event_btnManageVaccineActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel mep = new ManageEnterpriseJPanel(system, workArea);
        workArea.add("managePatientJPanel", mep);
//        splitPane.setRightComponent(mep);
        CardLayout cardlayout = (CardLayout) workArea.getLayout();
        cardlayout.next(workArea);  
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        
        ManageEnterpriseAdminJPanel meap = new ManageEnterpriseAdminJPanel(system, workArea);
        workArea.add("managePatientJPanel1", meap);
//        splitPane.setRightComponent(meap);
        CardLayout cardlayout = (CardLayout) workArea.getLayout();
        cardlayout.next(workArea);  
    }//GEN-LAST:event_btnManageEnterpriseAdminActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        MainLoginJFrame ml = new MainLoginJFrame(system,network);
        ml.setVisible(true); 
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SystemAdminWorkArea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageDisease;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageVaccine;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
