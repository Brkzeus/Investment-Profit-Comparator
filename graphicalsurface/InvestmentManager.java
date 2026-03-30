/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graphicalsurface;
import infrastructure.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class InvestmentManager extends javax.swing.JFrame {
InvestmentLedger ledger;
    
    public InvestmentManager() {
        initComponents();
        ledger= new InvestmentLedger();
        seedInitialData();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        capitalHolder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSummary = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtStockName = new javax.swing.JTextField();
        txtStockBuyPrice = new javax.swing.JTextField();
        txtStockHistory = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtStockTaxRate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtTermName = new javax.swing.JTextField();
        txtTermRequiredAmount = new javax.swing.JTextField();
        txtTermInterestRate = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtTermTaxRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCurrencySymbol = new javax.swing.JTextField();
        txtBuyRate = new javax.swing.JTextField();
        txtCurrencyHistory = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCurrencyTaxRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        statisticalGraph = new StatisticalGraph();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reportArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(33, 115, 70));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jLabel1.setText("Capital: ");

        txtSummary.setEditable(false);
        txtSummary.setColumns(20);
        txtSummary.setLineWrap(true);
        txtSummary.setRows(5);
        txtSummary.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtSummary);

        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CALCULATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("CLEAR ALL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(capitalHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capitalHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main Menu", jPanel1);

        txtStockBuyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockBuyPriceActionPerformed(evt);
            }
        });

        txtStockHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockHistoryActionPerformed(evt);
            }
        });

        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Stock Name:");

        jLabel3.setText("Price Per Stock:");

        jLabel4.setText("Stock Tax Rate:");

        jLabel5.setText("Stock Price History:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Please enter at least 1 previous selling price associated with your presented stock!");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStockBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStockTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Stock", jPanel2);

        txtTermInterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTermInterestRateActionPerformed(evt);
            }
        });

        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Term Deposit Name:");

        jLabel7.setText("Required Amount:");

        jLabel8.setText("Deposit Tax Rate:");

        jLabel9.setText("Deposit Interest Rate:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTermTaxRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTermRequiredAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTermName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton5)))
                        .addGap(50, 50, 50)
                        .addComponent(txtTermInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTermName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTermRequiredAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTermTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtTermInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Manage Term Deposit", jPanel3);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Currency Name:");

        jLabel11.setText("Currency Buying Rate:");

        jLabel12.setText("Currency Tax Rate:");

        jLabel13.setText("Currency Price History:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Please enter at least 1 previous selling price associated with your presented currency!");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurrencySymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurrencyTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txtCurrencyHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrencySymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCurrencyTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrencyHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Manage Currency Exchange", jPanel4);

        javax.swing.GroupLayout statisticalGraphLayout = new javax.swing.GroupLayout(statisticalGraph);
        statisticalGraph.setLayout(statisticalGraphLayout);
        statisticalGraphLayout.setHorizontalGroup(
            statisticalGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        statisticalGraphLayout.setVerticalGroup(
            statisticalGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticalGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticalGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Graph", jPanel5);

        reportArea.setEditable(false);
        reportArea.setBackground(new java.awt.Color(255, 255, 255));
        reportArea.setColumns(20);
        reportArea.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        reportArea.setRows(5);
        jScrollPane4.setViewportView(reportArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profit Report", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtSummary.setText("--- CURRENT INVESTMENT OPTIONS ---\n\n");

txtSummary.append("STOCKS:\n");
if (ledger.getStockInvestmentScenario().isEmpty()) {
    txtSummary.append("  (No Stocks added)\n");
} else {
    for (StockInvestment s : ledger.getStockInvestmentScenario()) {
        txtSummary.append("Stock Name: " + s.getStockName() + "\n  Price: " + s.getBuyPricePerStock() +"TL" +"\nTax Rate: "+s.getTaxRate()+ "\n");
    }
}
txtSummary.append("\nFOREIGN CURRENCIES:\n");
if (ledger.getForeignCurrencyInvestmentScenario().isEmpty()) {
    txtSummary.append("  (No Foreign Currencies added)\n");
} else {
    for (ForeignCurrencyInvestment c : ledger.getForeignCurrencyInvestmentScenario()) {
        txtSummary.append("Currency Name: " + c.getCurrencySymbol() + "\n ExchangePrice: " + c.getExchangeRateBuy() +"\n Tax Rate: "+ c.getTaxRate()+"\n");
    }
}
txtSummary.append("\nTERM DEPOSITS:\n");
if (ledger.getTermInvestmentScenario().isEmpty()) {
    txtSummary.append("  (No Term Deposits added)\n");
} else {
    for (TermDepositInvestment t : ledger.getTermInvestmentScenario()) {
        txtSummary.append("Deposit Name: "+ t.getTermInvestmentName()+"\n Deposit Interest Rate: " + t.getInterestRate() + "%\n");
    }
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String input = capitalHolder.getText().trim();
    
       
       
    if (input.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a capital amount first.");
        return;
    }

    try {
        double capital = Double.parseDouble(input);
        
        if(capital<0){
           JOptionPane.showMessageDialog(this, "Please enter a capital amount higher than 0."); 
           return;
        }
        
        ledger.evaluateInvestments(capital);
        
        
        txtSummary.setText("--- CALCULATION COMPLETE ---\n");
        txtSummary.append("Capital invested: " + capital +" TL" + "\n\n");
        
        statisticalGraph.repaint();
        
        JOptionPane.showMessageDialog(this, "Comparison updated! Check the Graph tab.");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter only numbers .");
    }
      
    try {
        double capital = Double.parseDouble(capitalHolder.getText());
        ledger.evaluateInvestments(capital);
       
        
        ((StatisticalGraph)statisticalGraph).setData(ledger.getTopScenarios());
        
        JOptionPane.showMessageDialog(this, "Calculation complete! View the graph in 5th Tab.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    try {
        
        double capital = Double.parseDouble(capitalHolder.getText());

        
        ledger.evaluateInvestments(capital);

        
        String theFullReport = ProfitReport.generateReport(capital, ledger.getTopScenarios());

        
        reportArea.setText(theFullReport);
       
        reportArea.setCaretPosition(0);

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid amount of capital.");
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        String symbol = txtCurrencySymbol.getText().trim();
        double buyRate = Double.parseDouble(txtBuyRate.getText());
        double tax = validateTaxFromField(txtCurrencyTaxRate);
        String historyRaw = txtCurrencyHistory.getText().trim();
        ArrayList<Double> historyList = new ArrayList<>();
        
        
        String[] parts = historyRaw.split(",");
        
        if (parts.length < 2) {
    JOptionPane.showMessageDialog(this, 
        "Please enter at least 2 history prices with a coma in between\n" +
        "One price or an empty field is not enough to calculate a prediction.");
    return; 
}
        for (String p : parts) {
            historyList.add(Double.parseDouble(p.trim()));
        }
        if (historyList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide at least one history price.");
            return;
        }

        boolean exists = false;
        for (ForeignCurrencyInvestment f : ledger.getForeignCurrencyInvestmentScenario()) {
            if (f.getCurrencySymbol().equalsIgnoreCase(symbol)) {
                exists = true; 
                break;
            }
        }

        if (exists) {
            JOptionPane.showMessageDialog(this, "Currency symbol already exists!");
        } else {
            ForeignCurrencyInvestment newCurrency = new ForeignCurrencyInvestment(tax, symbol, buyRate, historyList);
            ledger.addCurrency(newCurrency);
            JOptionPane.showMessageDialog(this, symbol + " added successfully!");
            
            txtCurrencySymbol.setText("");
            txtBuyRate.setText("");
            txtCurrencyHistory.setText("");
            txtCurrencyTaxRate.setText("");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Please make sure numbers are right and comas are used in between");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                                       
    try {
        String name = txtStockName.getText().trim();
        double buyPrice = Double.parseDouble(txtStockBuyPrice.getText());
        double tax = validateTaxFromField(txtStockTaxRate);
        String historyRaw = txtStockHistory.getText().trim();
        ArrayList<Double> historyList = new ArrayList<>();
        String[] parts = historyRaw.split(",");
        
        if (parts.length < 2) {
    JOptionPane.showMessageDialog(this, 
        "Please enter at least 2 history prices with a coma in between\n" +
        "One price or an empty field is not enough to calculate a prediction.");
    return;
}
        
        for (String p : parts) {
            if(!p.trim().isEmpty()) {
                historyList.add(Double.parseDouble(p.trim()));
            }
        }
        if (historyList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stock history cannot be empty.");
            return;
        }

        boolean exists = false;
        for (StockInvestment s : ledger.getStockInvestmentScenario()) {
            if (s.getStockName().equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            JOptionPane.showMessageDialog(this, "Stock already exists.");
        } else {
            StockInvestment newStock = new StockInvestment(tax, name, buyPrice, historyList);
            ledger.addStock(newStock);
            JOptionPane.showMessageDialog(this, name + " added successfully!");
                       
            txtStockName.setText("");
            txtStockBuyPrice.setText("");
            txtStockHistory.setText("");
            txtStockTaxRate.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Please make sure numbers are right and comas are used in between");
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
        String name = txtTermName.getText().trim();
        double amount = Double.parseDouble(txtTermRequiredAmount.getText());
        double rate = Double.parseDouble(txtTermInterestRate.getText());
        double tax = validateTaxFromField(txtTermTaxRate);

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide a name for the Term Deposit.");
            return;
        }

        boolean exists = false;
        for (TermDepositInvestment t : ledger.getTermInvestmentScenario()) {
            if (t.getTermInvestmentName().equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            JOptionPane.showMessageDialog(this, "A term deposit with this name already exists.");
        } else {
            
            TermDepositInvestment term = new TermDepositInvestment(amount, rate, tax, name);
            ledger.addTermDeposit(term);
            JOptionPane.showMessageDialog(this, name + " added!");
            
           
            txtTermName.setText("");
            txtTermRequiredAmount.setText("");
            txtTermInterestRate.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Please enter suitable numbers for required amount and rate.");
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtStockBuyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockBuyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockBuyPriceActionPerformed

    private void txtStockHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockHistoryActionPerformed

    private void txtTermInterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTermInterestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTermInterestRateActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete ALL investments?", 
            "Reset System", javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
       
        ledger.clearEverything();
        reportArea.setText(""); 
        statisticalGraph.removeAll();
        txtStockName.setText("");
        txtSummary.setText("");
        javax.swing.JOptionPane.showMessageDialog(this, "All data has been erased.");
    }

    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvestmentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvestmentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvestmentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvestmentManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvestmentManager().setVisible(true);
            }
        });
    }
    
    private double validateTaxFromField(javax.swing.JTextField field) throws Exception {
    String input = field.getText().trim();
    if (input.isEmpty()) {
        throw new Exception("Tax rate field cannot be empty!");
    }
    
    double tax = Double.parseDouble(input);
    
    if (tax < 0 || tax > 1) {
        throw new Exception("Tax rate must be between 0 and 1 (e.g., 0.15 for 15%).");
    }
    
    return tax;
}
    
    private void seedInitialData() {
    
ledger.addStock(new StockInvestment(0.15, "Apple", 150.0, new ArrayList<Double>() {{
    add(150.0); add(155.0); add(162.0);
}}));

ledger.addStock(new StockInvestment(0.15, "Google", 2500.0, new ArrayList<Double>() {{
    add(2500.0); add(2400.0); add(2600.0);
}}));

ledger.addStock(new StockInvestment(0.15, "Microsoft", 300.0, new ArrayList<Double>() {{
    add(300.0); add(310.0); add(305.0);
}}));

ledger.addCurrency(new ForeignCurrencyInvestment(0.05, "USD", 1.10, new ArrayList<Double>() {{
    add(1.10); add(1.12); add(1.15);
}}));

ledger.addCurrency(new ForeignCurrencyInvestment(0.05, "JPY", 130.0, new ArrayList<Double>() {{
    add(130.0); add(135.0); add(140.0);
}}));

ledger.addCurrency(new ForeignCurrencyInvestment(0.05, "GBP", 0.80, new ArrayList<Double>() {{
    add(0.80); add(0.82); add(0.85);
}}));


ledger.addTermDeposit(new TermDepositInvestment(5000, 0.04, 0.10, "Savings Plus"));
ledger.addTermDeposit(new TermDepositInvestment(10000, 0.05, 0.10, "Gold Saver"));
ledger.addTermDeposit(new TermDepositInvestment(1000, 0.03, 0.10, "Quick Cash"));
    
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capitalHolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea reportArea;
    private javax.swing.JPanel statisticalGraph;
    private javax.swing.JTextField txtBuyRate;
    private javax.swing.JTextField txtCurrencyHistory;
    private javax.swing.JTextField txtCurrencySymbol;
    private javax.swing.JTextField txtCurrencyTaxRate;
    private javax.swing.JTextField txtStockBuyPrice;
    private javax.swing.JTextField txtStockHistory;
    private javax.swing.JTextField txtStockName;
    private javax.swing.JTextField txtStockTaxRate;
    private javax.swing.JTextArea txtSummary;
    private javax.swing.JTextField txtTermInterestRate;
    private javax.swing.JTextField txtTermName;
    private javax.swing.JTextField txtTermRequiredAmount;
    private javax.swing.JTextField txtTermTaxRate;
    // End of variables declaration//GEN-END:variables
}
