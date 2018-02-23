package com.exchange.gui;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import com.exchange.Alert;
import com.exchange.CurrencySystem;
import com.exchange.User;

public class AlertsGUI extends javax.swing.JFrame {

	double currentPrice;
	User currentUser;
	String currencyName;
	CurrencySystem system;
	DecimalFormat df = new DecimalFormat(".##");
	HashMap<String, Alert> alertHistory;
	Alert alert;
	String notify = "";

	public AlertsGUI(User currentUser, CurrencySystem system) {
		this.currentUser = currentUser;
		this.system = system;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		delete = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		deleteRadio = new javax.swing.JRadioButton();
		jTextField2 = new javax.swing.JTextField();
		createRadio = new javax.swing.JRadioButton();
		convert = new javax.swing.JButton();
		aboveRadio = new javax.swing.JRadioButton();
		belowRadio = new javax.swing.JRadioButton();
		deleteCombo = new javax.swing.JComboBox<>();
		coinCombo = new javax.swing.JComboBox<>();

		jLabel1.setText("jLabel1");

		jTextField1.setText("jTextField1");

		jTextField3.setText("jTextField3");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel4.setText("Amount");

		delete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		delete.setText("Delete Alert");
		delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					deleteActionPerformed(evt);
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
		jLabel2.setText("Alerts");

		deleteRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		deleteRadio.setText("Delete");
		deleteRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteRadioActionPerformed(evt);
			}
		});

		createRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		createRadio.setText("Create");
		createRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createRadioActionPerformed(evt);
			}
		});

		convert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		convert.setText("Create Alert");
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

		aboveRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		aboveRadio.setText("Above");
		aboveRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aboveRadioActionPerformed(evt);
			}
		});

		belowRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		belowRadio.setText("Below");
		belowRadio.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				belowRadioActionPerformed(evt);
			}
		});

		deleteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ALert" }));

		coinCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Coin" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel2).addGap(377, 377, 377))
								.addGroup(
										javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(jLabel4).addGap(48, 48, 48)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(117, 117, 117))))
				.addGroup(layout.createSequentialGroup().addGap(143, 143, 143).addComponent(delete).addGap(0, 0,
						Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(100, 100, 100)
						.addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(deleteRadio).addGap(47, 47, 47)
												.addComponent(createRadio).addGap(286, 286, 286))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(coinCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(127, 127, 127))))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(600, Short.MAX_VALUE).addComponent(convert)
								.addGap(105, 105, 105)))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(481, Short.MAX_VALUE)
										.addComponent(aboveRadio).addGap(72, 72, 72).addComponent(belowRadio)
										.addGap(119, 119, 119))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap().addComponent(jLabel2).addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(createRadio).addComponent(deleteRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(coinCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(67, 67, 67)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18).addComponent(delete).addGap(29, 29, 29))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(296, Short.MAX_VALUE).addComponent(convert)
								.addGap(26, 26, 26)))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(195, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(aboveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(belowRadio))
								.addGap(127, 127, 127))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void deleteActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException {// GEN-FIRST:event_deleteActionPerformed

		String deleteAlert = deleteCombo.getSelectedItem().toString();
		currentUser.destroyAlert(deleteAlert);

		DashboardGUI g = new DashboardGUI(currentUser, system);
		g.setVisible(true);
		Thread dashboard = new Thread(g);
		dashboard.start();
	}// GEN-LAST:event_deleteActionPerformed

	private void deleteRadioActionPerformed(java.awt.event.ActionEvent evt)

	{// GEN-FIRST:event_deleteRadioActionPerformed
		alertHistory = currentUser.getAlertHistory();
		if (deleteRadio.isSelected() && !alertHistory.isEmpty()) {
			deleteCombo.setEnabled(true);
			delete.setEnabled(true);
			createRadio.setEnabled(false);
			jTextField2.setEnabled(false);

			for (String key : alertHistory.keySet()) {
				deleteCombo.addItem(key);
			}
		} else if (!deleteRadio.isSelected()) {
			createRadio.setEnabled(true);
			jTextField2.setEnabled(true);
		}

	}// GEN-LAST:event_deleteRadioActionPerformed

	private void convertActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, IOException {// GEN-FIRST:event_convertActionPerformed

		if (createRadio.isSelected() && (aboveRadio.isSelected() || belowRadio.isSelected())) {
			currencyName = coinCombo.getSelectedItem().toString();
			double alertPrice = Double.parseDouble(jTextField2.getText());
			currentUser.createAlert(currencyName + " " + alertPrice);

			alert = alertHistory.get(currencyName + " " + alertPrice);
			alert.setAlertID(currencyName + " " + alertPrice);
			alert.setAlertPrice(alertPrice);
			alert.setCurrencyName(currencyName);
			alert.setNotify(notify);

			DashboardGUI g = new DashboardGUI(currentUser, system);
			g.setVisible(true);
			Thread dashboard = new Thread(g);
			dashboard.start();
		}

	}// GEN-LAST:event_convertActionPerformed

	private void createRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createRadioActionPerformed

		alertHistory = currentUser.getAlertHistory();
		if (createRadio.isSelected()) {
			deleteCombo.setEnabled(false);
			delete.setEnabled(false);
			jTextField2.setEnabled(true);
			coinCombo.setEnabled(true);

			coinCombo.removeAllItems();
			coinCombo.addItem("Bitcoin");
			coinCombo.addItem("Ethereum");
			coinCombo.addItem("Litecoin");
		} else if (!createRadio.isSelected()) {
			if (!alertHistory.isEmpty()) {
				deleteCombo.setEnabled(true);
				delete.setEnabled(true);
			}
		}
	}

	private void aboveRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_aboveRadioActionPerformed
		notify = "above";
	}

	private void belowRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_belowRadioActionPerformed
		notify = "below";
	}// GEN-LAST:event_belowRadioActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JRadioButton aboveRadio;
	private javax.swing.JRadioButton belowRadio;
	private javax.swing.JComboBox<String> coinCombo;
	private javax.swing.JButton convert;
	private javax.swing.JRadioButton createRadio;
	private javax.swing.JButton delete;
	private javax.swing.JComboBox<String> deleteCombo;
	private javax.swing.JRadioButton deleteRadio;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables
}
