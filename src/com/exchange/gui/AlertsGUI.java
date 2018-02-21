package com.exchange.gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Random;

import com.exchange.Alert;
import com.exchange.CryptoCurrency;
import com.exchange.CurrencySystem;
import com.exchange.User;

public class AlertsGUI extends javax.swing.JFrame {

	 CryptoCurrency[] currency;
	 double currentPrice;
	 User currentUser;
	 String currencyName;
	 CurrencySystem system;
	 DecimalFormat df = new DecimalFormat(".##");

    public AlertsGUI(User currentUser,CryptoCurrency[] currency,CurrencySystem system) 
    {
    	    this.currentUser=currentUser;
  		this.currency=currency;
  		this.system=system;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ethereumRadio = new javax.swing.JRadioButton();
        bitcoinRadio = new javax.swing.JRadioButton();
        litecoinRadio = new javax.swing.JRadioButton();
        amount = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Amount");

        alert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        alert.setText("Create Alert");
        alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					alertActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("AlertsGUI");

        ethereumRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumRadio.setText("Ethereum");
        ethereumRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethereumRadioActionPerformed(evt);
            }
        });

        bitcoinRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinRadio.setText("Bitcoin");
        bitcoinRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinRadioActionPerformed(evt);
            }
        });

        litecoinRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinRadio.setText("Litecoin");
        litecoinRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                litecoinRadioActionPerformed(evt);
            }
        });

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(alert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bitcoinRadio)
                        .addGap(114, 114, 114)
                        .addComponent(ethereumRadio)
                        .addGap(60, 60, 60)
                        .addComponent(litecoinRadio)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(litecoinRadio)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ethereumRadio)
                        .addComponent(bitcoinRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(amount)
                        .addGap(1, 1, 1)))
                .addGap(64, 64, 64)
                .addComponent(alert)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alertActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException 
    {//GEN-FIRST:event_alertActionPerformed
    	    double price=Double.parseDouble(amount.getText());
    	    Random random=new Random();
    	    int alertID=random.nextInt(100);
    		currentUser.createAlert(alertID);
    		HashMap<Integer, Alert> alert=currentUser.getAlert();
    		Alert createAlert=alert.get(alertID);
    		createAlert.setCurrencyName(currencyName);
    		createAlert.setAlertPrice(price);
    		
    		 DashboardGUI g =new DashboardGUI(currentUser, system);
       	 g.setVisible(true);
       	 Thread dashboard=new Thread(g);
       	 dashboard.start();
    		
    }

    private void bitcoinRadioActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_bitcoinRadioActionPerformed
    	  currencyName="bitcoin";
    }//GEN-LAST:event_bitcoinRadioActionPerformed

    private void ethereumRadioActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_ethereumRadioActionPerformed
     currencyName="ethereum";
    }//GEN-LAST:event_ethereumRadioActionPerformed

    private void litecoinRadioActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_litecoinRadioActionPerformed
       currencyName="litecoin";
    }//GEN-LAST:event_litecoinRadioActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_amountActionPerformed

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alert;
    private javax.swing.JTextField amount;
    private javax.swing.JRadioButton bitcoinRadio;
    private javax.swing.JRadioButton ethereumRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton litecoinRadio;
    // End of variables declaration//GEN-END:variables
}
