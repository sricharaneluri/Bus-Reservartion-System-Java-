/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Ticket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anudeep
 */
public class RetriveTicketGUI extends javax.swing.JFrame {

    /**
     * Creates new form RetriveTicketGUI
     */
    String username;
    int ticketno;
    Ticket ticket = new Ticket();
    public RetriveTicketGUI(String username) {
        super("Retrive Ticket");
        initComponents();
        //setSize(1350,730);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.username = username;
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
        booktcktbtn = new javax.swing.JButton();
        cncltcktbtn = new javax.swing.JButton();
        retrivetcktbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tcktidlbl = new javax.swing.JLabel();
        tcktidtxt = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        logOutButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        booktcktbtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        booktcktbtn.setText("Book Ticket");
        booktcktbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktcktbtnActionPerformed(evt);
            }
        });

        cncltcktbtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        cncltcktbtn.setText("Cancel Ticket");
        cncltcktbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cncltcktbtnActionPerformed(evt);
            }
        });

        retrivetcktbtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        retrivetcktbtn.setText("Retrive Ticket");
        retrivetcktbtn.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(booktcktbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(cncltcktbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(retrivetcktbtn)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booktcktbtn)
                    .addComponent(cncltcktbtn)
                    .addComponent(retrivetcktbtn))
                .addGap(45, 45, 45))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        tcktidlbl.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        tcktidlbl.setText("Ticket ID");

        tcktidtxt.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tcktidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcktidtxtActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(tcktidlbl)
                                .addGap(48, 48, 48)
                                .addComponent(tcktidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 314, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logOutButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcktidlbl)
                    .addComponent(tcktidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(logOutButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcktidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcktidtxtActionPerformed
        // TODO add your handling code here:
        confirmButtonActionPerformed(evt);
    }//GEN-LAST:event_tcktidtxtActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
         ticketno = Integer.parseInt(tcktidtxt.getText());
        if(tcktidtxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter a vailid ticket ID");
        }
        else if(!username.equals(ticket.getUsername(ticketno))){
            JOptionPane.showMessageDialog(this, "Invalid ticketno");
        }
        else{
            ticketno = Integer.parseInt(tcktidtxt.getText());
            PrintTicketGUI printTicketGUI = new PrintTicketGUI(ticketno);
            this.setVisible(false);
            printTicketGUI.setVisible(true);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        tcktidtxt.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void booktcktbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktcktbtnActionPerformed
            // TODO add your handling code here:
        BookTicketGUI bookTicketGUI = new BookTicketGUI(username);
        this.setVisible(false);
        bookTicketGUI.setVisible(true);
    }//GEN-LAST:event_booktcktbtnActionPerformed

    private void cncltcktbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cncltcktbtnActionPerformed
        // TODO add your handling code here:
        CancelHomeGUI cancelHomeGUI = new CancelHomeGUI(username);
        this.setVisible(false);
        cancelHomeGUI.setVisible(true);
    }//GEN-LAST:event_cncltcktbtnActionPerformed

    private void logOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton1ActionPerformed
        // TODO add your handling code here:
        HomeGUI homeGUI = new HomeGUI();
        this.setVisible(false);
        homeGUI.setVisible(true);
    }//GEN-LAST:event_logOutButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booktcktbtn;
    private javax.swing.JButton cncltcktbtn;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton retrivetcktbtn;
    private javax.swing.JLabel tcktidlbl;
    private javax.swing.JTextField tcktidtxt;
    // End of variables declaration//GEN-END:variables
}
