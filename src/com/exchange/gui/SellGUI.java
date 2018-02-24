package com.exchange.gui;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.exchange.CryptoCurrency;
import com.exchange.CurrencySystem;
import com.exchange.Payment;
import com.exchange.User;

public class SellGUI extends javax.swing.JFrame {

	CryptoCurrency[] currency;
	double currentPrice;
	User currentUser;
	double quantity;
	double amount;
	String bankName;
	String currencyName;
	CurrencySystem system;
	DecimalFormat df = new DecimalFormat(".##");

	public SellGUI(User currentUser, CryptoCurrency[] currency, CurrencySystem system) {
		this.currentUser = currentUser;
		this.currency = currency;
		this.system = system;

		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		ethereumRadio = new javax.swing.JRadioButton();
		bitcoinRadio = new javax.swing.JRadioButton();
		litecoinRadio = new javax.swing.JRadioButton();
		checkout = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		amountRadio = new javax.swing.JRadioButton();
		quantityRadio = new javax.swing.JRadioButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		bankCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Sell");
		jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel2.setText("USD");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel4.setText("Quantity");

		ethereumRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		ethereumRadio.setText("Ethereum");
		ethereumRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					ethereumRadioActionPerformed(evt);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		bitcoinRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		bitcoinRadio.setText("Bitcoin");
		bitcoinRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					bitcoinRadioActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		litecoinRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		litecoinRadio.setText("Litecoin");
		litecoinRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					litecoinRadioActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		checkout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		checkout.setText("Proceed to Checkout");
		checkout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkoutActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel7.setText("Transaction Fees");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel8.setText("2%");

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel9.setText("                                                                ");

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel10.setText("          ");

		amountRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		amountRadio.setText("Price");
		amountRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				amountRadioActionPerformed(evt);
			}
		});

		quantityRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		quantityRadio.setText("Quantity");
		quantityRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quantityRadioActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel6.setText("Select bank to deposit");

		bankCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bank" }));
		bankCombo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bankComboActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(33, 33, 33))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(bitcoinRadio)
														.addGap(114, 114, 114).addComponent(ethereumRadio))
												.addGroup(layout.createSequentialGroup().addGap(59, 59, 59)
														.addComponent(amountRadio)))
										.addGap(60, 60, 60)))
								.addComponent(litecoinRadio).addGap(136, 136, 136))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(checkout).addGap(267, 267, 267))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(136, 136, 136).addComponent(jLabel7)
								.addGap(261, 261, 261).addComponent(jLabel8))
						.addGroup(layout.createSequentialGroup().addGap(105, 105, 105)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel9)
														.addGap(74, 74, 74).addComponent(jLabel10))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup().addComponent(quantityRadio)
																.addGap(42, 42, 42)))
										.addGroup(layout.createSequentialGroup().addComponent(jLabel6).addGap(277, 277,
												277)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup().addGap(167, 167, 167)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(150, 150, 150)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(bankCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 122,
														Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(135, 135, 135)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(litecoinRadio))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(ethereumRadio)
												.addComponent(bitcoinRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(34, 34, 34)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6)
								.addComponent(bankCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(amountRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(quantityRadio))
						.addGap(1, 1, 1)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(jLabel7))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(jLabel9))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
						.addComponent(checkout).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public void addCombo() throws ClassNotFoundException, IOException {
		Payment pay = currentUser.getBank();
		HashMap<String, Double> map = pay.getBankAccount();

		if (!map.isEmpty()) {
			for (String key : map.keySet()) {
				bankCombo.addItem(key);
			}
		}

		pay = currentUser.getCredit();
		map = pay.getCardAccount();

		if (!map.isEmpty()) {
			for (String key : map.keySet()) {
				bankCombo.addItem(key);
			}
		}

	}

	private void bitcoinRadioActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException, IOException {
		if (ethereumRadio.isSelected() || litecoinRadio.isSelected()) {
			bankCombo.removeAllItems();
			ethereumRadio.setEnabled(false);
			litecoinRadio.setEnabled(false);
		} else if (bitcoinRadio.isSelected()) {
			addCombo();
			ethereumRadio.setEnabled(false);
			litecoinRadio.setEnabled(false);
			currentPrice = currency[0].getPrice();
			currencyName = currency[0].getCurrencyName();
		} else if (!bitcoinRadio.isSelected()) {
			ethereumRadio.setEnabled(true);
			litecoinRadio.setEnabled(true);
			bankCombo.removeAllItems();

		}
	}

	private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {
		if(ethereumRadio.isSelected()||bitcoinRadio.isSelected()||litecoinRadio.isSelected()||(!bankName.isEmpty()))
	    	{
			if (quantityRadio.isSelected()) 
			{
	
				quantity = Double.parseDouble(jTextField2.getText());
				amount = currentPrice * quantity;
	
				OrderReviewSellGUI order = new OrderReviewSellGUI(quantity, amount, bankName, currencyName, currentUser,
						system);
				System.out.println("currency anme" + currencyName);
				order.setVisible(true);
			} 
			else if (amountRadio.isSelected())
			{
	
				amount = Double.parseDouble(jTextField1.getText());
				if (currentPrice != 0)
					quantity = amount / currentPrice;
				else if (currentPrice == 0)
					quantity = amount / 100;
	
				System.out.println(df.format(quantity));
				OrderReviewGUI order = new OrderReviewGUI(Double.parseDouble(df.format(quantity)), amount, bankName,
						currencyName, currentUser, system);
				order.setVisible(true);
			}
			else
	    	   {
	    		   JOptionPane.showMessageDialog(null, "Opps you forgot to select amount or quantity or bank");
	    	   }
	    	}
		
	 	else
	    	{
	    			JOptionPane.showMessageDialog(null, "Select Cryptocurrency");
	    }

	}

	private void amountRadioActionPerformed(java.awt.event.ActionEvent evt) {
		if (amountRadio.isSelected()) {
			amountRadio.setEnabled(true);
			quantityRadio.setEnabled(false);
			jTextField2.setEnabled(false);
		} else if (!amountRadio.isSelected()) {
			amountRadio.setEnabled(true);
			quantityRadio.setEnabled(true);
			jTextField2.setEnabled(true);

		}
	}

	private void quantityRadioActionPerformed(java.awt.event.ActionEvent evt) {
		if (quantityRadio.isSelected()) {
			amountRadio.setEnabled(false);
			quantityRadio.setEnabled(true);
			jTextField1.setEnabled(false);

		} else if (!quantityRadio.isSelected()) {
			amountRadio.setEnabled(true);
			quantityRadio.setEnabled(true);
			jTextField1.setEnabled(true);

		}
	}

	private void bankComboActionPerformed(java.awt.event.ActionEvent evt) {
		if (bankCombo.getSelectedItem() != null)
			bankName = bankCombo.getSelectedItem().toString();
		// message box
	}

	private void ethereumRadioActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException, IOException {
		if (bitcoinRadio.isSelected() || litecoinRadio.isSelected()) {
			bankCombo.removeAllItems();
			bitcoinRadio.setEnabled(false);
			litecoinRadio.setEnabled(false);
		} else if (ethereumRadio.isSelected()) {
			addCombo();
			bitcoinRadio.setEnabled(false);
			litecoinRadio.setEnabled(false);
			currentPrice = currency[1].getPrice();
			currencyName = currency[1].getCurrencyName();
		} else if (!ethereumRadio.isSelected()) {
			bitcoinRadio.setEnabled(true);
			litecoinRadio.setEnabled(true);
			bankCombo.removeAllItems();

		}
	}

	private void litecoinRadioActionPerformed(java.awt.event.ActionEvent evt)
			throws ClassNotFoundException, IOException {
		if (ethereumRadio.isSelected() || bitcoinRadio.isSelected()) {
			bankCombo.removeAllItems();
			bitcoinRadio.setEnabled(false);
			ethereumRadio.setEnabled(false);
		} else if (litecoinRadio.isSelected()) {
			addCombo();
			currentPrice = currency[2].getPrice();
			currencyName = currency[2].getCurrencyName();
		} else if (!litecoinRadio.isSelected()) {
			bitcoinRadio.setEnabled(true);
			ethereumRadio.setEnabled(true);
			bankCombo.removeAllItems();
		}

	}

	private javax.swing.JRadioButton amountRadio;
	private javax.swing.JComboBox<String> bankCombo;
	private javax.swing.JRadioButton bitcoinRadio;
	private javax.swing.JButton checkout;
	private javax.swing.JRadioButton ethereumRadio;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JRadioButton litecoinRadio;
	private javax.swing.JRadioButton quantityRadio;
	// End of variables declaration//GEN-END:variables
}
