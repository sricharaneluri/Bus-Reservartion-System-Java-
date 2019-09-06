/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Home;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anudeep
 */
public class AdminUserMgtGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminUserMgtGUI
     */
    String ausername;
    String username;
    Home home = new Home();
    public AdminUserMgtGUI(String ausername) {
        super("User Management");
        initComponents();
        //setSize(1350,730);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.ausername = ausername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usermgtBtn = new javax.swing.JButton();
        routemgtBtn = new javax.swing.JButton();
        balanceshtBtn = new javax.swing.JButton();
        ticketSearchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        usrnameLbl = new javax.swing.JLabel();
        usrnametxt = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        logOutButton1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usermgtBtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        usermgtBtn.setText("User Management");
        usermgtBtn.setEnabled(false);

        routemgtBtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        routemgtBtn.setText("Route Management");
        routemgtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routemgtBtnActionPerformed(evt);
            }
        });

        balanceshtBtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        balanceshtBtn.setText("Balance Sheet");
        balanceshtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceshtBtnActionPerformed(evt);
            }
        });

        ticketSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        ticketSearchBtn.setText("Ticket Search");
        ticketSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usermgtBtn)
                .addGap(18, 18, 18)
                .addComponent(routemgtBtn)
                .addGap(18, 18, 18)
                .addComponent(balanceshtBtn)
                .addGap(18, 18, 18)
                .addComponent(ticketSearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usermgtBtn)
                    .addComponent(routemgtBtn)
                    .addComponent(balanceshtBtn)
                    .addComponent(ticketSearchBtn))
                .addGap(45, 45, 45))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usrnameLbl.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        usrnameLbl.setText("User Name");

        usrnametxt.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        usrnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnametxtActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        editButton.setText("Edit/Delete");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        logOutButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        logOutButton1.setText("Log Out");
        logOutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(304, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(usrnameLbl)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usrnametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 294, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrnameLbl)
                    .addComponent(usrnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(logOutButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnametxtActionPerformed
        // TODO add your handling code here:
        editButtonActionPerformed(evt);
    }//GEN-LAST:event_usrnametxtActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        username = usrnametxt.getText();
         if(username.equals("")||home.getName(username)==null){
            JOptionPane.showMessageDialog(this, "Enter a vailid username");
         }
         
         else{
             EditUserGUI editUserGUI = new EditUserGUI(ausername,username);
             this.setVisible(false);
             editUserGUI.setVisible(true);
             
         }
    }//GEN-LAST:event_editButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        usrnametxt.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void logOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton1ActionPerformed
        // TODO add your handling code here:
        AdminLoginGUI adminLoginGUI = new AdminLoginGUI();
        this.setVisible(false);
        adminLoginGUI.setVisible(true);

    }//GEN-LAST:event_logOutButton1ActionPerformed

    private void routemgtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routemgtBtnActionPerformed
        // TODO add your handling code here:
        AdminRouteMgtGUI adminRouteMgtGUI = new AdminRouteMgtGUI(ausername);
        this.setVisible(false);
        adminRouteMgtGUI.setVisible(true);
    }//GEN-LAST:event_routemgtBtnActionPerformed

    private void balanceshtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceshtBtnActionPerformed
        // TODO add your handling code here:
        BalanceSheetGUI balanceSheetGUI = new BalanceSheetGUI(ausername);
        this.setVisible(false);
        balanceSheetGUI.setVisible(true);
    }//GEN-LAST:event_balanceshtBtnActionPerformed

    private void ticketSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketSearchBtnActionPerformed
        // TODO add your handling code here:
        TicketSearchGUI ticketSearchGUI = new TicketSearchGUI(ausername);
        this.setVisible(false);
        ticketSearchGUI.setVisible(true);
    }//GEN-LAST:event_ticketSearchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balanceshtBtn;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton routemgtBtn;
    private javax.swing.JButton ticketSearchBtn;
    private javax.swing.JButton usermgtBtn;
    private javax.swing.JLabel usrnameLbl;
    private javax.swing.JTextField usrnametxt;
    // End of variables declaration//GEN-END:variables
}
