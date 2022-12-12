/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.CDC;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CDCBillingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CDCBillingWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.MainLoginJFrame;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavi
 */
public class BillingWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form BillingWorkArea
     */
    private UserAccount account;
    private CDCBillingOrganization cdcBillingOrganization;
    private Enterprise enterprise; 
    private EcoSystem business;
    private Network network;
     private static final String logoFILENAME = Paths.get("src").toAbsolutePath().toString();// path to the data store
    private String logoImagePath = logoFILENAME+"/Images/logout_blue.png";
    
    private static final String AFILENAME = Paths.get("src").toAbsolutePath().toString();// path to the data store
    private String aimagePath = AFILENAME+"/Images/billing.png";
     private static final String GFILENAME = Paths.get("src").toAbsolutePath().toString();// path to the data store
    private String bgimagePath = GFILENAME+"/Images/my-gradient.png";
    
    public BillingWorkArea(UserAccount account, CDCBillingOrganization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.account= account;
       this.cdcBillingOrganization = cdcBillingOrganization;
       this.enterprise= enterprise;
       this.business = business;
       this.network= network;
       populateTable();
       ImageIcon logoimgIcon = new ImageIcon(logoImagePath);
        Image lI = logoimgIcon.getImage();
        Image logoDimg = lI.getScaledInstance(30, 30,Image.SCALE_SMOOTH);
        ImageIcon logoImgThisImg = new ImageIcon(logoDimg);
        lblL.setIcon(logoImgThisImg);
        
        ImageIcon aimgIcon = new ImageIcon(aimagePath);
        Image aI = aimgIcon.getImage();
        Image aDimg = aI.getScaledInstance(90, 90,Image.SCALE_SMOOTH);
        ImageIcon aImgThisImg = new ImageIcon(aDimg);
        lblI.setIcon(aImgThisImg);
        
        ImageIcon bimgIcon = new ImageIcon(bgimagePath);
        Image bI = bimgIcon.getImage();
        Image cDimg = bI.getScaledInstance(1300, 800,Image.SCALE_SMOOTH);
        ImageIcon cImgThisImg = new ImageIcon(cDimg);
        lblB.setIcon(cImgThisImg);
    }
    
      void populateTable()
    {
       DefaultTableModel dtm = (DefaultTableModel)tbl.getModel();
       dtm.setRowCount(0);
       
       for(WorkRequest wr : network.getWorkQueue().getWorkRequestList())  
       {
           if(wr instanceof CDCBillingWorkRequest){
               Object[] row = new Object[6];
               row[0] = ((CDCBillingWorkRequest) wr).getName();
               row[1] = wr.getVaccine();
               row[2] = wr;
               row[3] = wr.getSender();
               row[4] = wr.getReceiver();
               row[5] = wr.getMessage();
               dtm.addRow(row);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        lblL = new javax.swing.JLabel();
        lblI = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("CDC Billing");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Vaccine", "Status", "Sender", "Receiver", "Message"
            }
        ));
        tbl.setSelectionBackground(new java.awt.Color(255, 156, 141));
        tbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 607, 143));

        btnAssign.setBackground(new java.awt.Color(255, 156, 141));
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Asign");
        btnAssign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 110, 30));

        btnPay.setBackground(new java.awt.Color(255, 156, 141));
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setText("Pay");
        btnPay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 100, 30));

        lblL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLMouseClicked(evt);
            }
        });
        jPanel1.add(lblL, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 50, 44));
        jPanel1.add(lblI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 140, 130));
        jPanel1.add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
         int selectedRow = tbl.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            CDCBillingWorkRequest cwr = (CDCBillingWorkRequest)tbl.getValueAt(selectedRow,2);
            cwr.setReceiver(account);
            cwr.setStatus("Pending");
            populateTable();
              JOptionPane.showMessageDialog(null, "Request Assigned successfully.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null, "Please select the row to Pay", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            CDCBillingWorkRequest cbwr = (CDCBillingWorkRequest)tbl.getValueAt(selectedRow,2);
            if(cbwr.getStatus().equals("Paid"))
            {
                JOptionPane.showMessageDialog(null, "Payment has already been made", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                cbwr.setStatus("Paid by CDC");
                populateTable();
                  JOptionPane.showMessageDialog(null, "Payment made successfully.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
                
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void lblLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        MainLoginJFrame ml = new MainLoginJFrame(business,network);
        ml.setVisible(true);
    }//GEN-LAST:event_lblLMouseClicked

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
//            java.util.logging.Logger.getLogger(BillingWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BillingWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BillingWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BillingWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BillingWorkArea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblI;
    private javax.swing.JLabel lblL;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
