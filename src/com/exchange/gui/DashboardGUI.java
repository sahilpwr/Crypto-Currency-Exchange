package com.exchange.gui;

import java.io.IOException;

import com.exchange.CryptoCurrency;
import com.exchange.CurrencySystem;
import com.exchange.User;

public class DashboardGUI extends javax.swing.JFrame implements Runnable
{

     CurrencySystem system;
	 User currentUser;
	 CryptoCurrency[] currency;
	 
	 
    public DashboardGUI(User currentUser,CurrencySystem system) throws ClassNotFoundException, IOException 
    {
    		this.currentUser=currentUser;
    		this.system=system;
    		
        initComponents();
    }
    
	public void run()
	{
		while(true)
		{
			currency=system.cryptoInfo();
			System.out.println(currency[0].getPrice());
			
			bitcoinPrice.setText("$ "+Double.toString(currency[0].getPrice()));
			ethereumPrice.setText("$ "+Double.toString(currency[1].getPrice()));
			litecoinPrice.setText("$ "+Double.toString(currency[2].getPrice()));
			
			bitcoinChange.setText(""+Integer.toString(currency[0].getPercentDifference())+" %");
			ethereumChange.setText(""+Integer.toString(currency[1].getPercentDifference())+" %");
			litecoinChange.setText(""+Integer.toString(currency[2].getPercentDifference())+" %");
			try
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			
		}
		
	
	}
	    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws ClassNotFoundException, IOException {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bitcoinPrice = new javax.swing.JLabel();
        ethereumPrice = new javax.swing.JLabel();
        litecoinPrice = new javax.swing.JLabel();
        bitcoinBuy = new javax.swing.JButton();
        bitcoinSell = new javax.swing.JButton();
        ethereumBuy = new javax.swing.JButton();
        ethereumSell = new javax.swing.JButton();
        litecoinBuy = new javax.swing.JButton();
        litecoinSell = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bitcoinChange = new javax.swing.JLabel();
        ethereumChange = new javax.swing.JLabel();
        litecoinChange = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        litecoinWallet = new javax.swing.JLabel();
        bitcoinBalance = new javax.swing.JLabel();
        ethereumWallet = new javax.swing.JLabel();
        schedule = new javax.swing.JButton();
        alerts = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        transaction = new javax.swing.JButton();
        autoSchedule = new javax.swing.JButton();
        paymentMethod = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        roi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Current Bitcoin Price");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Current Litecoin Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Current Ethereum Price");

        bitcoinPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinPrice.setText("$12,000");

        ethereumPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumPrice.setText("$1000");

        litecoinPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinPrice.setText("$350");

        bitcoinBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinBuy.setText("Buy");
        bitcoinBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinBuyActionPerformed(evt);
            }
        });

        bitcoinSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinSell.setText("Sell");
        bitcoinSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinSellActionPerformed(evt);
            }
        });

        ethereumBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumBuy.setText("Buy");
        ethereumBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethereumBuyActionPerformed(evt);
            }
        });

        ethereumSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumSell.setText("Sell");
        ethereumSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethereumSellActionPerformed(evt);
            }
        });

        litecoinBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinBuy.setText("Buy");
        litecoinBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                litecoinBuyActionPerformed(evt);
            }
        });

        litecoinSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinSell.setText("Sell");
        litecoinSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                litecoinSellActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("% Change in last 2 min");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("% Change in last 2 min");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("% Change in last 2 min");

        bitcoinChange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinChange.setText("+26.53%");

        ethereumChange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumChange.setText("-7.64%");

        litecoinChange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinChange.setText("-19.53%");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Crypto Currency Dash Board");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Crypto Currency Wallet");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Bitcoin Balance");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Ethereum Balance");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Litecoin Balance");

        litecoinWallet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinWallet.setText("$24000");

        bitcoinBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinBalance.setText("$1259.67");

        ethereumWallet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumWallet.setText("$20000");

        bitcoinBalance.setText(Double.toString(currentUser.getWallet()[0].getQuantity()));
		litecoinWallet.setText(Double.toString(currentUser.getWallet()[2].getQuantity()));
		ethereumWallet.setText(Double.toString(currentUser.getWallet()[1].getQuantity()));
        
        schedule.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        schedule.setText("Create Schedule");
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });

        alerts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        alerts.setText("Create Alerts");
        alerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        convert.setText("Convert Currency");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        transaction.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        transaction.setText("Transcation History");
        transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionActionPerformed(evt);
            }
        });

        autoSchedule.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        autoSchedule.setText("Create Auto Schedule");
        autoSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoScheduleActionPerformed(evt);
            }
        });

        paymentMethod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paymentMethod.setText("Add Payment Method");
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("ROI");

        roi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        roi.setText("$13,000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(38, 38, 38)
                        .addComponent(ethereumWallet)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(convert)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ethereumPrice)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bitcoinPrice)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(litecoinPrice)
                                                .addGap(87, 87, 87)
                                                .addComponent(jLabel9)))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bitcoinChange)
                                            .addComponent(litecoinChange)
                                            .addComponent(ethereumChange))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bitcoinBuy)
                                            .addComponent(ethereumBuy)
                                            .addComponent(litecoinBuy)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(paymentMethod)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(72, 72, 72)
                                                .addComponent(litecoinWallet)
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(bitcoinBalance)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(150, 150, 150)))))))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(litecoinSell)
                                    .addComponent(bitcoinSell)
                                    .addComponent(ethereumSell))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(schedule)
                                .addGap(43, 43, 43)
                                .addComponent(autoSchedule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alerts)
                                .addGap(29, 29, 29))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transaction))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel21)
                        .addGap(34, 34, 34)
                        .addComponent(roi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(417, 417, 417))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bitcoinPrice)
                    .addComponent(bitcoinBuy)
                    .addComponent(bitcoinSell)
                    .addComponent(jLabel8)
                    .addComponent(bitcoinChange))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ethereumPrice)
                    .addComponent(ethereumBuy)
                    .addComponent(ethereumSell)
                    .addComponent(jLabel7)
                    .addComponent(ethereumChange))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(litecoinPrice)
                    .addComponent(litecoinBuy)
                    .addComponent(litecoinSell)
                    .addComponent(jLabel9)
                    .addComponent(litecoinChange))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ethereumWallet)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bitcoinBalance))
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(litecoinWallet))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(roi))
                .addGap(18, 18, 18)
                .addComponent(paymentMethod)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transaction)
                    .addComponent(convert)
                    .addComponent(schedule)
                    .addComponent(alerts)
                    .addComponent(autoSchedule))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bitcoinBuyActionPerformed(java.awt.event.ActionEvent evt) 
    {
    		currency=system.cryptoInfo();
    		BuyGUI buy=new BuyGUI(currentUser,currency,system);
    		buy.setVisible(true);
    }

    private void bitcoinSellActionPerformed(java.awt.event.ActionEvent evt) 
    {
    		 currency=system.cryptoInfo();
    	     SellGUI sell=new SellGUI(currentUser,currency,system);
    	     sell.setVisible(true);
    }
    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) 
    {
	    	System.out.println("Clicked");
	    	
	    	ManualSchedulerGUI g = new ManualSchedulerGUI(currentUser, system, currency);
	    	g.setVisible(true);
    	
    	
    }

    private void alertsActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    }

    private void convertActionPerformed(java.awt.event.ActionEvent evt)
    { 
    		ConversionGUI convert=new ConversionGUI(currentUser,system);
    		convert.setVisible(true);
    }
    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt)
    {
	    	  PaymentMethodGUI payment=new PaymentMethodGUI(currentUser,system);
	    	  payment.setVisible(true);
    }

    private void autoScheduleActionPerformed(java.awt.event.ActionEvent evt) 

    {//GEN-FIRST:event_autoScheduleActionPerformed
        // TODO add your handling code here:
        
    	AutoSchedulerGUI g = new AutoSchedulerGUI(currentUser, system, currency);
    	g.setVisible(true);
    }
    private void transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionActionPerformed

    private void ethereumBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethereumBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ethereumBuyActionPerformed

    private void litecoinBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_litecoinBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_litecoinBuyActionPerformed

    private void ethereumSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethereumSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ethereumSellActionPerformed

    private void litecoinSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_litecoinSellActionPerformed
        // TODO add your handling code here:
    }
    
    
    
    private javax.swing.JButton alerts;
    private javax.swing.JButton autoSchedule;
    private javax.swing.JLabel bitcoinBalance;
    private javax.swing.JButton bitcoinBuy;
    private javax.swing.JLabel bitcoinChange;
    private javax.swing.JLabel bitcoinPrice;
    private javax.swing.JButton bitcoinSell;
    private javax.swing.JButton convert;
    private javax.swing.JButton ethereumBuy;
    private javax.swing.JLabel ethereumChange;
    private javax.swing.JLabel ethereumPrice;
    private javax.swing.JButton ethereumSell;
    private javax.swing.JLabel ethereumWallet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton litecoinBuy;
    private javax.swing.JLabel litecoinChange;
    private javax.swing.JLabel litecoinPrice;
    private javax.swing.JButton litecoinSell;
    private javax.swing.JLabel litecoinWallet;
    private javax.swing.JButton paymentMethod;
    private javax.swing.JLabel roi;
    private javax.swing.JButton schedule;
    private javax.swing.JButton transaction;
    // End of variables declaration//GEN-END:variables
}
