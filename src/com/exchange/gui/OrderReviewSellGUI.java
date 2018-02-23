package com.exchange.gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.exchange.CurrencySystem;
import com.exchange.User;

public class OrderReviewSellGUI extends javax.swing.JFrame {

	User currentUser;
	double quantity;
	double amount;
	String bankName;
	String currencyName;
	String paymentType = "";
	CurrencySystem system;

	public OrderReviewSellGUI(double quantity, double amount, String bankName, String currencyName, User currentUser,
			CurrencySystem system) {
		this.currentUser = currentUser;
		this.quantity = quantity;
		this.amount = amount;
		this.bankName = bankName;
		this.currencyName = currencyName;
		this.system = system;

		if (bankName.contains("Card"))
			paymentType = "credit";
		else
			paymentType = "bank";

		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jCheckBox1 = new javax.swing.JCheckBox();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jLabel1 = new javax.swing.JLabel();
		buy = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		orderReview = new javax.swing.JTextArea();
		changeOrder = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		limit = new javax.swing.JLabel();

		jCheckBox1.setText("jCheckBox1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setText("Order Review ");

		buy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		buy.setText("Confirm Sell");
		buy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					buyActionPerformed(evt);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		orderReview.setText("Currency: " + currencyName + "\nPayment Method: " + paymentType + "\nQuantity: " + quantity
				+ "\nAmount: " + amount);
		orderReview.setColumns(20);
		orderReview.setRows(5);

		jScrollPane1.setViewportView(orderReview);

		changeOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		changeOrder.setText("Change Order");
		changeOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				changeOrderActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel2.setText("                        ");

		limit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		limit.setText("$8000 out of $20,000");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel1).addGap(308,
								308, 308))
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(215, 215, 215).addComponent(changeOrder)
										.addGap(33, 33, 33).addComponent(buy))
								.addGroup(layout.createSequentialGroup().addGap(127, 127, 127)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
														.addGap(71, 71, 71).addComponent(limit)))))
						.addContainerGap(88, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jLabel1).addGap(28, 28, 28)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(limit))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(buy).addComponent(changeOrder))
						.addGap(35, 35, 35)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void changeOrderActionPerformed(java.awt.event.ActionEvent evt) {

	}// GEN-LAST:event_changeOrderActionPerformed

	private void buyActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException {

		currentUser.transaction(bankName, amount, quantity, currencyName, "sell", paymentType);
		DashboardGUI g = new DashboardGUI(currentUser, system);
		g.setVisible(true);
		Thread dashboard = new Thread(g);
		dashboard.start();

		String data = currencyName + " " + quantity + " " + amount + " " + bankName + " " + "Sell";

		try (FileWriter fw = new FileWriter(currentUser.getEmailID() + "transaction.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(data);
			;

		} catch (IOException e) {

		}

	}

	private javax.swing.JButton buy;
	private javax.swing.JButton changeOrder;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JLabel limit;
	private javax.swing.JTextArea orderReview;
	// End of variables declaration//GEN-END:variables
}
