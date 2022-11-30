/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DistributorBillingOrganization;
import Business.Organization.HospitalBillingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.DistributionCenter.DistributorBillingWorkAreaJPanel;
import userinterface.Hospital.Billing.BillingWorkAreaJPanel;

/**
 *
 * @author Krishnakanth Naik Jarapala, Venkata Bhargavi Sikhakolli.
 */
public class DistributorBillManagerRole extends Role{
    
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DistributorBillingWorkAreaJPanel(userProcessContainer, account,  (DistributorBillingOrganization)organization, enterprise, business,network);
    }
}
