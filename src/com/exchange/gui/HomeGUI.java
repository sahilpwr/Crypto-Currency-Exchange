package com.exchange.gui;

import com.exchange.CurrencySystem;


public class HomeGUI extends javax.swing.JFrame //implements Runnable
{
   private CurrencySystem system;
    public HomeGUI() 
    {
    	system=new CurrencySystem();
        initComponents(); 
    }


                        
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        changeBitcoin = new javax.swing.JLabel();
        changeEthereum = new javax.swing.JLabel();
        changeLitecoin = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bitcoinPrice = new javax.swing.JLabel();
        ethereumPrice = new javax.swing.JLabel();
        litecoinPrice = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Home");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("% Change in last 2 min");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("% Change in last 2 min");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("% Change in last 2 min");

        changeBitcoin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeBitcoin.setText("+26.53%");

        changeEthereum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeEthereum.setText("-7.64%");

        changeLitecoin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeLitecoin.setText("-19.53%");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Current Bitcoin Price");

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

        signUp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        
        login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(signUp)
                .addGap(57, 57, 57)
                .addComponent(login)
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(420, 420, 420))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGap(30, 30, 30)
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
                        .addComponent(changeBitcoin)
                        .addComponent(changeLitecoin)
                        .addComponent(changeEthereum))
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(signUp))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(bitcoinPrice)
                        .addComponent(jLabel8)
                        .addComponent(changeBitcoin))
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(ethereumPrice)
                        .addComponent(jLabel7)
                        .addComponent(changeEthereum))
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(litecoinPrice)
                        .addComponent(jLabel9)
                        .addComponent(changeLitecoin))
                    .addContainerGap(165, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void loginActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
        LoginGUI g=new LoginGUI(system);
	    g.setVisible(true);
    }                                     
    
    private void signUpActionPerformed(java.awt.event.ActionEvent evt)
    {                                      
       
        SignUpGUI g=new SignUpGUI();
	    g.setVisible(true);
    }   
   
    public static void main(String args[])
    {
    
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new HomeGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bitcoinPrice;
    private javax.swing.JLabel changeBitcoin;
    private javax.swing.JLabel changeEthereum;
    private javax.swing.JLabel changeLitecoin;
    private javax.swing.JLabel ethereumPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel litecoinPrice;
    private javax.swing.JButton login;
    private javax.swing.JButton signUp;
    // End of variables declaration                   
}
