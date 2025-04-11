/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DisasterRelief;

import model.Enterprise.Enterprise;
import model.Organization.DisasterReliefKitSupplyOrg;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import model.WorkQueue.DisasterReliefKitSupplyWorkRequest;
import model.WorkQueue.WorkRequest;
import model.WorkQueue.WorkQueue;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author team-11
 */
public class DisaterReliefKitSupplyManagerJPanel extends javax.swing.JPanel {

    
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization organization;
    private DisasterReliefKitSupplyOrg disasterReliefKitSupplyOrg;
    /**
     * Creates new form DisaterReliefKitSupplyManager
     */
    public DisaterReliefKitSupplyManagerJPanel(UserAccount userAccount, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userAccount =userAccount;
        this.enterprise = enterprise;
        this.organization =organization;
        this.disasterReliefKitSupplyOrg = (DisasterReliefKitSupplyOrg) organization;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKits = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        tableKits.setBackground(new java.awt.Color(220, 215, 224));
        tableKits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Quantity", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableKits);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 270, 1000, 130);

        jLabelIncomingKit.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(220, 215, 201));
        jLabelIncomingKit.setText("Kits Requests:");
        jPanel1.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(80, 220, 178, 37);

        btnProcess.setBackground(new java.awt.Color(220, 215, 201));
        btnProcess.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess);
        btnProcess.setBounds(640, 450, 123, 36);

        jLabelTitle.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(220, 215, 201));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Welcome Disaster Relief Kit Supply Manager");
        jPanel1.add(jLabelTitle);
        jLabelTitle.setBounds(90, 50, 990, 90);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 100, 90);

        btnReject.setBackground(new java.awt.Color(220, 215, 201));
        btnReject.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnReject.setText("Reject");
        btnReject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        jPanel1.add(btnReject);
        btnReject.setBounds(390, 450, 123, 36);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Proceessed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to the Donation organization.");
                return;
            }
            else {
                if (req instanceof DisasterReliefKitSupplyWorkRequest) {
                    DisasterReliefKitSupplyWorkRequest fr = (DisasterReliefKitSupplyWorkRequest) tableKits.getValueAt(selectedRow, 0);
                }
                req.setReceiver(userAccount);
                req.setStatus("Processed to Donation Organization");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is processed to the Donation organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to Donation Organization");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else {
                request.setReceiver(userAccount);
                request.setStatus("Rejected");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request rejected");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to reject.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKits;
    // End of variables declaration//GEN-END:variables

public void populateTable() {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        DefaultTableModel model = (DefaultTableModel) tableKits.getModel();
        model.setRowCount(0);

        if (organization.getWorkQueue() == null) {
            organization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest req : organization.getWorkQueue().getWorkReqList()) {

            if (req instanceof DisasterReliefKitSupplyWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = req;
                row[1] = formatter.format(((DisasterReliefKitSupplyWorkRequest) req).getRequestDateTime());
                row[2] = ((DisasterReliefKitSupplyWorkRequest) req).getKitCount();
                row[3] = ((DisasterReliefKitSupplyWorkRequest) req).getName();
                row[4] = ((DisasterReliefKitSupplyWorkRequest) req).getType();
                row[5] = ((DisasterReliefKitSupplyWorkRequest) req).getStatus();

                model.addRow(row);
            }
        }

    }


}
