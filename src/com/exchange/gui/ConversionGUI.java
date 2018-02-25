package com.exchange.gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.exchange.CryptoCurrency;
import com.exchange.CurrencySystem;
import com.exchange.User;


public class ConversionGUI extends javax.swing.JFrame {

	CurrencySystem system;
	User currentUser;
	String bankName;
	double quantity,quantityChange;
	CryptoCurrency[] cryptoCurrency;
	String currency1,currency2;
	 DecimalFormat df = new DecimalFormat(".##");
	 double toQuantity;

	 
    public ConversionGUI(User currentUser,CurrencySystem system) 
    {
    		this.currentUser=currentUser;
		this.system=system;
		cryptoCurrency=system.cryptoInfo();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")

    private void initComponents() 
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox<>();
        toCombo = new javax.swing.JComboBox<>();
        quantity1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        convert = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        currencyWallet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Currency Conversion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("From ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("To");

        fromCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        fromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboActionPerformed(evt);
            }
        });

        toCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        toCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ""}));
        toCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					toComboActionPerformed(evt);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        quantity1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
       // quantity1.setText("");
        quantity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Currency");

        convert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					convertActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Total Currency Deposited in Wallet");

        currencyWallet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        
        
        fromCombo.addItem("Bitcoin");
	    fromCombo.addItem("Ethereum");
	    fromCombo.addItem("Litecoin");
	    toCombo.addItem("Bitcoin");
	    toCombo.addItem("Ethereum");
	    toCombo.addItem("litecoin");
	   

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(quantity1,  javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convert)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(74, 74, 74)
                        .addComponent(currencyWallet)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyWallet)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(convert)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromComboActionPerformed(java.awt.event.ActionEvent evt)
    { 
    		currency1=fromCombo.getSelectedItem().toString();
    	/*	if(currencyName=="Bitcoin")
    		{
    	    	    toCombo.removeItemAt(0);

    			   // toCombo.addItem("Ethereum");
    			    //toCombo.addItem("litecoin");
    		}
    		else if(currencyName=="Ethereum")
		{
    			toCombo.removeItemAt(1);

			   // toCombo.addItem("Bitcoin");
			    //toCombo.addItem("litecoin");
		}
    		else if(currencyName=="Litecoin")
		{
    			toCombo.removeItemAt(2);

			   // toCombo.addItem("Bitcoin");
			    //toCombo.addItem("Ethereum");
		}
*/    	   
    	   
    	 
    }

    private void toComboActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException
    {

        currency2=toCombo.getSelectedItem().toString();
        if(!quantity1.getText().isEmpty())
     	        quantity=Double.parseDouble(quantity1.getText());

        if(currency1.equalsIgnoreCase("Bitcoin")&&currency2.equalsIgnoreCase("Ethereum"))
         { 
         	  currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[1].getPrice()))
     		   ));	   
         	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[1].getPrice()));
         }
        else if(currency1.equalsIgnoreCase("Bitcoin")&&currency2.equalsIgnoreCase("Litecoin"))
 		{
 			currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[2].getPrice()))
 					));
       	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[2].getPrice()));

 		}
        else if(currency1.equalsIgnoreCase("Ethereum")&&currency2.equalsIgnoreCase("Bitcoin"))
 		{
 			currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[0].getPrice()))));
       	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[0].getPrice()));

 		}
        else if(currency1.equalsIgnoreCase("Ethereum")&&currency2.equalsIgnoreCase("Litecoin"))
 		{
 			currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[2].getPrice()))
 					));	
 	       	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[2].getPrice()));

 		}
        else if(currency1.equalsIgnoreCase("Litecoin")&&currency2.equalsIgnoreCase("Bitcoin"))
 		{
 			currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[0].getPrice()))
 					));	
 	       	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[0].getPrice()));

 		}
        else if(currency1.equalsIgnoreCase("Litecoin")&&currency2.equalsIgnoreCase("Ethereum"))
 		{
 			currencyWallet.setText(Double.toString(Double.parseDouble(df.format(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[1].getPrice()))
 					));
 	       	  toQuantity=Double.parseDouble(df.format(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[1].getPrice()));

 		}
        
        
     	

    }

    private void convertActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException 
    {
    	if(currency1!=currency2&&quantity>0)
	    	{
	    	   currentUser.conversion(quantity, currency1, currency2,toQuantity);
	    	   DashboardGUI g =new DashboardGUI(currentUser, system);
	   	   g.setVisible(true);
	   	   Thread dashboard=new Thread(g);
	   	   dashboard.start();
	    	}
	    	else 
		     JOptionPane.showMessageDialog(null, "Please don't select same currency for conversion and quantity should be above 0");

    }

    private void quantity1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    }//GEN-LAST:event_quantity1ActionPerformed

 
   
    private javax.swing.JButton convert;
    private javax.swing.JLabel currencyWallet;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField quantity1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JComboBox<String> toCombo;
    // End of variables declaration//GEN-END:variables
}
