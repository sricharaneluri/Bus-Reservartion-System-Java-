/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TicketObj;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import Model.Ticket;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


/**
 *
 * @author cherry
 */
public class TicketSearchGUI extends javax.swing.JFrame {

    /**
     * Creates new form TicketSearchGUI
     */
    Ticket ticket = new Ticket();
    Date date;
    String ausername;
    
    int ticketID = 0;
    public TicketSearchGUI(String ausername) {
        super("Ticket Search");
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        ausername = this.ausername;
        
        toDate.setDate(Calendar.getInstance().getTime());
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
        usermgtBtn = new javax.swing.JButton();
        routemgtBtn = new javax.swing.JButton();
        balanceshtBtn = new javax.swing.JButton();
        ticketSearchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        busID = new javax.swing.JLabel();
        datetxt = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        generateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        busIDtext = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        logOutButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        retriveTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usermgtBtn.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        usermgtBtn.setText("User Management");

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
        ticketSearchBtn.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(usermgtBtn)
                .addGap(18, 18, 18)
                .addComponent(routemgtBtn)
                .addGap(18, 18, 18)
                .addComponent(balanceshtBtn)
                .addGap(18, 18, 18)
                .addComponent(ticketSearchBtn)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGap(41, 41, 41))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        busID.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        busID.setText("Bus ID");

        datetxt.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        datetxt.setText("To");

        generateBtn.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        generateBtn.setText("Generate");
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        busIDtext.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        busIDtext.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        busIDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busIDtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(busID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(datetxt)
                .addGap(18, 18, 18)
                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datetxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(busID)
                        .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        logOutButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        logOutButton3.setText("Log Out");
        logOutButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButton3ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket ID", "Bus ID", "Username", "Seat No"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        retriveTicket.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        retriveTicket.setText("Retrive Ticket");
        retriveTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retriveTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retriveTicket)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logOutButton3)
                            .addComponent(retriveTicket)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        // TODO add your handling code here:
        int i;
        TicketObj ticketObj= new TicketObj();
        date = toDate.getDate();
        int busId = 0;
        if(!busIDtext.getText().equals(""))        
            busId = Integer.parseInt(busIDtext.getText());
        
        ticketObj = ticket.ticketSearch(date, busId);

        String[] cols = {"Ticket ID","Bus ID","Username","Seat No"};
        DefaultTableModel table = new DefaultTableModel(cols,0);
        jTable3.setModel(table);

        for(i = 0;i<ticketObj.ticketId.size();i++){
            Object[] data = {ticketObj.ticketId.get(i),ticketObj.busID.get(i),ticketObj.username.get(i),ticketObj.seatNo.get(i)};

            table.addRow(data);
            }
            

        
    }//GEN-LAST:event_generateBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        
        toDate.setDate(Calendar.getInstance().getTime());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_resetBtnActionPerformed

    private void busIDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busIDtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busIDtextActionPerformed

    private void logOutButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton3ActionPerformed
        // TODO add your handling code here:
        AdminLoginGUI adminLoginGUI = new AdminLoginGUI();
        this.setVisible(false);
        adminLoginGUI.setVisible(true);
    }//GEN-LAST:event_logOutButton3ActionPerformed

    private void retriveTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retriveTicketActionPerformed
        // TODO add your handling code here:
        if(ticketID==0)
            JOptionPane.showMessageDialog(this, "Select the ticket");
        else
        {
            PrintTicketGUI printTicketGUI = new PrintTicketGUI(ticketID);
            printTicketGUI.setVisible(true);
            printTicketGUI.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        
    }//GEN-LAST:event_retriveTicketActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int i = jTable3.getSelectedRow();
        TableModel table = jTable3.getModel();
        ticketID = Integer.parseInt(table.getValueAt(i, 0).toString());
        
    }//GEN-LAST:event_jTable3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balanceshtBtn;
    private javax.swing.JLabel busID;
    private javax.swing.JFormattedTextField busIDtext;
    private javax.swing.JLabel datetxt;
    private javax.swing.JButton generateBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton logOutButton1;
    private javax.swing.JButton logOutButton2;
    private javax.swing.JButton logOutButton3;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton retriveTicket;
    private javax.swing.JButton routemgtBtn;
    private javax.swing.JButton ticketSearchBtn;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JButton usermgtBtn;
    // End of variables declaration//GEN-END:variables
}
