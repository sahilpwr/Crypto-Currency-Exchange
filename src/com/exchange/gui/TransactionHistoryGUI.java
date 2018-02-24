package com.exchange.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import com.exchange.Transaction;
import com.exchange.User;

public class TransactionHistoryGUI extends javax.swing.JFrame {

	User currentUser;
	ArrayList<Transaction> transactionHistory = null;

	public TransactionHistoryGUI(User user) throws ClassNotFoundException, IOException {
		initComponents();
		this.currentUser = user;

		DefaultListModel m1 = (DefaultListModel) (listHistory.getModel());
		ArrayList<Transaction> items = currentUser.getTransactionHistory();
		for (Transaction item : items) {
			m1.addElement(item.toString());
		}

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		listHistory = new javax.swing.JList<>();
		btnQuantity = new javax.swing.JButton();
		btnAmount = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Transaction History");

		listHistory.setModel(new javax.swing.DefaultListModel());
		jScrollPane1.setViewportView(listHistory);

		btnQuantity.setLabel("Sort by Quantity");
		btnQuantity.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnQuantityActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnAmount.setLabel("Sort by Amount");
		btnAmount.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnAmountActionPerformed(evt);
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
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(175, 175, 175).addComponent(jLabel1)
						.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(40, 40, 40)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addGap(43, 43, 43)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnQuantity).addComponent(btnAmount))
						.addGap(23, 23, 23)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(34, 34, 34).addComponent(btnQuantity)
										.addGap(31, 31, 31).addComponent(btnAmount))
								.addGroup(layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(73, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnQuantityActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException {// GEN-FIRST:event_btnQuantityActionPerformed
		transactionHistory = currentUser.getTransactionHistory();
		Collections.sort(transactionHistory);

		DefaultListModel m2 = (DefaultListModel) (listHistory.getModel());
		m2.clear();
		for (Transaction t : transactionHistory)
			m2.addElement(t.toString());

	}// GEN-LAST:event_btnQuantityActionPerformed

	private void btnAmountActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException {// GEN-FIRST:event_btnAmountActionPerformed
		// TODO add your handling code here:
		transactionHistory = currentUser.getTransactionHistory();
		Collections.sort(transactionHistory, new Transaction());

		System.out.println("By amount");
		System.out.println(transactionHistory.toString());

		DefaultListModel m2 = (DefaultListModel) (listHistory.getModel());
		m2.clear();
		for (Transaction t : transactionHistory)
			m2.addElement(t.toString());

	}// GEN-LAST:event_btnAmountActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAmount;
	private javax.swing.JButton btnQuantity;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JList<String> listHistory;

	// End of variables declaration//GEN-END:variables
}
