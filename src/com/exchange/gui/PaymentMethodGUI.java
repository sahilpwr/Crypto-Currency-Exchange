package com.exchange.gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.HashMap;

import com.exchange.BankAccount;
import com.exchange.CurrencySystem;
import com.exchange.Payment;
import com.exchange.User;


public class PaymentMethodGUI extends javax.swing.JFrame 
{

	CurrencySystem system;
	User currentUser;
	String bankName;
	
	HashMap<String, Double> map;
    public PaymentMethodGUI(User currentUser,CurrencySystem system) 
    {
		this.currentUser=currentUser;
		this.system=system;
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        accountRadio = new javax.swing.JRadioButton();
        cardRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accountDropdown = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        addAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Payment Method");

        accountRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accountRadio.setText("Bank Account");
        accountRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRadioActionPerformed(evt);
            }
        });

        cardRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cardRadio.setText("Credit Card");
        cardRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardRadioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Enter Card Number/ Bank Account");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Password");

        accountDropdown.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accountDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bank/ Card" }));
        accountDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountDropdownActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Bank /Credit Card Name");

        accountNumber.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accountNumber.setText("                    ");
        accountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setText("                             ");

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setText("                      ");

        addAccount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addAccount.setText("Add Account");
        addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					addAccountActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(accountRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardRadio)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(172, 172, 172)
                        .addComponent(accountDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(accountNumber)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addAccount)
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountRadio)
                    .addComponent(cardRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(addAccount)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountRadioActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(accountRadio.isSelected())
        {
        		  cardRadio.setEnabled(false);
        		  accountDropdown.addItem("American Express");
              accountDropdown.addItem("Chase");
              accountDropdown.addItem("Citi");
              accountDropdown.addItem("Discover");
              accountDropdown.addItem("Well Fargo");
        }
        else if(!accountRadio.isSelected())
        {
      	  accountDropdown.removeAllItems();
      	  cardRadio.setEnabled(true);
      	  accountRadio.setEnabled(true);
        }
    }

    private void accountNumberActionPerformed(java.awt.event.ActionEvent evt) 
    { 
    	
   
    }

    private void accountDropdownActionPerformed(java.awt.event.ActionEvent evt) 
    {
    		if(accountDropdown.getSelectedItem()!=null)
    				bankName=accountDropdown.getSelectedItem().toString();
    	   
    }

    private void cardRadioActionPerformed(java.awt.event.ActionEvent evt) 
    {
       if(cardRadio.isSelected())
        {
    	   	     accountRadio.setEnabled(false);
    	   	     accountDropdown.addItem("BofA Credit Card");
	          accountDropdown.addItem("Chase Credit card");
	          accountDropdown.addItem("Citi Credit card");
	          accountDropdown.addItem("HSBC Credit card");
	          accountDropdown.addItem("Well Fargo Credit card");
          
         
        }
       else if(!cardRadio.isSelected())
       {
    	   	   accountDropdown.removeAllItems();
    	   	   cardRadio.setEnabled(true);
            accountRadio.setEnabled(true);
	   	   
       }
       
       
       
       
    }//GEN-LAST:event_cardRadioActionPerformed

    private void addAccountActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException 
    {
    	    if(accountRadio.isSelected())
		{
			Payment pay=currentUser.getBank();
			map=pay.getBankAccount();
			
			if(!map.containsKey(bankName))
				pay.setBankAccount(bankName);
			else if(map.containsKey(bankName))
				System.out.println();//dialog box
				
			DashboardGUI g =new DashboardGUI(currentUser, system);
	    	  	g.setVisible(true);
	    	  	Thread dashboard=new Thread(g);
	    	  	dashboard.start();
		}
    	    else if(cardRadio.isSelected())
    	    {
    	     	Payment pay=currentUser.getCredit();
    			map=pay.getCardAccount();
    			
    			if(!map.containsKey(bankName))
    				pay.setcreditCardAccount(bankName);
    			else if(map.containsKey(bankName))
    				System.out.println();//dialog box
	
    			
    			 DashboardGUI g =new DashboardGUI(currentUser, system);
	    	    	 g.setVisible(true);
	    	    	 Thread dashboard=new Thread(g);
	    	    	  dashboard.start();
    	    	
    	    }
    	    
    }

   
    private javax.swing.JComboBox<String> accountDropdown;
    private javax.swing.JTextField accountNumber;
    private javax.swing.JRadioButton accountRadio;
    private javax.swing.JButton addAccount;
    private javax.swing.JRadioButton cardRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
