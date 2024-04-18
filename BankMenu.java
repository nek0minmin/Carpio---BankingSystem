
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class BankMenu extends javax.swing.JFrame {
 
    public BankMenu() {
        initComponents();
        
    }

    BankProcesses bank = new BankProcesses(1000);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        banLabel = new javax.swing.JLabel();
        koquetteFront = new javax.swing.JLabel();
        koquetteBack = new javax.swing.JLabel();
        stripePanel1 = new javax.swing.JPanel();
        stripePanel2 = new javax.swing.JPanel();
        historyButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        inquireButton1 = new javax.swing.JButton();
        menuTabbedPane = new javax.swing.JTabbedPane();
        defaultTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        koquetteFront1 = new javax.swing.JLabel();
        koquetteBack1 = new javax.swing.JLabel();
        banLabel1 = new javax.swing.JLabel();
        questionLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        withdrawPanel = new javax.swing.JPanel();
        withdrawBG = new javax.swing.JPanel();
        withdrawLabel = new javax.swing.JLabel();
        wdPanel = new javax.swing.JPanel();
        amountTF = new javax.swing.JTextField();
        questionLabel = new javax.swing.JLabel();
        clearFields = new javax.swing.JButton();
        withdrawAmountButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        depositPanel = new javax.swing.JPanel();
        depositBG = new javax.swing.JPanel();
        depositLabel = new javax.swing.JLabel();
        dpPanel1 = new javax.swing.JPanel();
        depositAmountTF = new javax.swing.JTextField();
        questionLabel2 = new javax.swing.JLabel();
        clearDepositFields = new javax.swing.JButton();
        depositAmountButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        transferPanel = new javax.swing.JPanel();
        transferBG = new javax.swing.JPanel();
        transferLabel = new javax.swing.JLabel();
        tfPanel = new javax.swing.JPanel();
        questionLabel3 = new javax.swing.JLabel();
        accNumTF = new javax.swing.JTextField();
        transferAmountTF = new javax.swing.JTextField();
        questionLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clearTransferFields = new javax.swing.JButton();
        transferAmountButton = new javax.swing.JButton();
        historyPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        exitButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BanKoquette Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        menuPanel.setBackground(new java.awt.Color(255, 214, 214));
        menuPanel.setForeground(new java.awt.Color(255, 204, 204));
        menuPanel.setPreferredSize(new java.awt.Dimension(490, 320));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(255, 214, 214));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banLabel.setFont(new java.awt.Font("Bodoni MT", 3, 24)); // NOI18N
        banLabel.setForeground(new java.awt.Color(204, 0, 51));
        banLabel.setText("BAN");
        topPanel.add(banLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 30));

        koquetteFront.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        koquetteFront.setForeground(new java.awt.Color(153, 0, 0));
        koquetteFront.setText("Koquette");
        topPanel.add(koquetteFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        koquetteBack.setFont(new java.awt.Font("Brush Script MT", 1, 48)); // NOI18N
        koquetteBack.setForeground(new java.awt.Color(255, 255, 255));
        koquetteBack.setText("Koquette");
        topPanel.add(koquetteBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, 150, -1));

        stripePanel1.setBackground(new java.awt.Color(255, 189, 189));

        javax.swing.GroupLayout stripePanel1Layout = new javax.swing.GroupLayout(stripePanel1);
        stripePanel1.setLayout(stripePanel1Layout);
        stripePanel1Layout.setHorizontalGroup(
            stripePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        stripePanel1Layout.setVerticalGroup(
            stripePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        topPanel.add(stripePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 10));

        stripePanel2.setBackground(new java.awt.Color(255, 189, 189));

        javax.swing.GroupLayout stripePanel2Layout = new javax.swing.GroupLayout(stripePanel2);
        stripePanel2.setLayout(stripePanel2Layout);
        stripePanel2Layout.setHorizontalGroup(
            stripePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        stripePanel2Layout.setVerticalGroup(
            stripePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        topPanel.add(stripePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        menuPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 490, 100));

        historyButton.setBackground(new java.awt.Color(255, 153, 153));
        historyButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        historyButton.setForeground(new java.awt.Color(255, 255, 255));
        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });
        menuPanel.add(historyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 102, 35));

        withdrawButton.setBackground(new java.awt.Color(255, 153, 153));
        withdrawButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(255, 255, 255));
        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        menuPanel.add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 102, 35));

        depositButton.setBackground(new java.awt.Color(255, 153, 153));
        depositButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        depositButton.setForeground(new java.awt.Color(255, 255, 255));
        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        menuPanel.add(depositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 102, 35));

        transferButton.setBackground(new java.awt.Color(255, 153, 153));
        transferButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        transferButton.setForeground(new java.awt.Color(255, 255, 255));
        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });
        menuPanel.add(transferButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 102, 35));

        inquireButton1.setBackground(new java.awt.Color(255, 153, 153));
        inquireButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        inquireButton1.setForeground(new java.awt.Color(255, 255, 255));
        inquireButton1.setText("Inquire");
        inquireButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquireButton1ActionPerformed(evt);
            }
        });
        menuPanel.add(inquireButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 102, 35));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        koquetteFront1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        koquetteFront1.setForeground(new java.awt.Color(153, 0, 0));
        koquetteFront1.setText("Myne!");
        jPanel1.add(koquetteFront1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        koquetteBack1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        koquetteBack1.setForeground(new java.awt.Color(255, 255, 255));
        koquetteBack1.setText("Myne!");
        jPanel1.add(koquetteBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 150, -1));

        banLabel1.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        banLabel1.setForeground(new java.awt.Color(204, 0, 51));
        banLabel1.setText("Good Day,");
        jPanel1.add(banLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 130, 30));

        questionLabel1.setBackground(new java.awt.Color(151, 50, 0));
        questionLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        questionLabel1.setForeground(new java.awt.Color(204, 0, 0));
        questionLabel1.setText("What would you like to do next?");
        jPanel1.add(questionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 330, 20));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 20));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 10));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 10));

        javax.swing.GroupLayout defaultTabLayout = new javax.swing.GroupLayout(defaultTab);
        defaultTab.setLayout(defaultTabLayout);
        defaultTabLayout.setHorizontalGroup(
            defaultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        defaultTabLayout.setVerticalGroup(
            defaultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTabbedPane.addTab("", defaultTab);

        withdrawBG.setBackground(new java.awt.Color(255, 189, 189));
        withdrawBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawLabel.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        withdrawLabel.setForeground(new java.awt.Color(204, 0, 0));
        withdrawLabel.setText("WITHDRAWAL");
        withdrawBG.add(withdrawLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        wdPanel.setBackground(new java.awt.Color(255, 214, 214));

        amountTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        questionLabel.setBackground(new java.awt.Color(151, 50, 0));
        questionLabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(151, 50, 0));
        questionLabel.setText("Enter Amount to be withdrawn in Peso:");

        clearFields.setBackground(new java.awt.Color(253, 160, 160));
        clearFields.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        clearFields.setForeground(new java.awt.Color(153, 51, 0));
        clearFields.setText("Clear");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });

        withdrawAmountButton.setBackground(new java.awt.Color(253, 160, 160));
        withdrawAmountButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        withdrawAmountButton.setForeground(new java.awt.Color(204, 0, 0));
        withdrawAmountButton.setText("Enter");
        withdrawAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawAmountButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("~ enter DIGITS");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("~ must be at least 100 less than current balance");

        javax.swing.GroupLayout wdPanelLayout = new javax.swing.GroupLayout(wdPanel);
        wdPanel.setLayout(wdPanelLayout);
        wdPanelLayout.setHorizontalGroup(
            wdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountTF)
                    .addGroup(wdPanelLayout.createSequentialGroup()
                        .addGroup(wdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(wdPanelLayout.createSequentialGroup()
                        .addComponent(clearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        wdPanelLayout.setVerticalGroup(
            wdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(wdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearFields)
                    .addComponent(withdrawAmountButton))
                .addContainerGap())
        );

        withdrawBG.add(wdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 170));

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("", withdrawPanel);

        depositBG.setBackground(new java.awt.Color(255, 189, 189));
        depositBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depositLabel.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        depositLabel.setForeground(new java.awt.Color(204, 0, 0));
        depositLabel.setText("DEPOSIT");
        depositBG.add(depositLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        dpPanel1.setBackground(new java.awt.Color(255, 214, 214));

        depositAmountTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        questionLabel2.setBackground(new java.awt.Color(151, 50, 0));
        questionLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        questionLabel2.setForeground(new java.awt.Color(151, 50, 0));
        questionLabel2.setText("Enter Amount to be deposited in Peso:");

        clearDepositFields.setBackground(new java.awt.Color(253, 160, 160));
        clearDepositFields.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        clearDepositFields.setForeground(new java.awt.Color(153, 51, 0));
        clearDepositFields.setText("Clear");
        clearDepositFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDepositFieldsActionPerformed(evt);
            }
        });

        depositAmountButton.setBackground(new java.awt.Color(253, 160, 160));
        depositAmountButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        depositAmountButton.setForeground(new java.awt.Color(204, 0, 0));
        depositAmountButton.setText("Enter");
        depositAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("~ enter DIGITS");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("~ must be a positive amount");

        javax.swing.GroupLayout dpPanel1Layout = new javax.swing.GroupLayout(dpPanel1);
        dpPanel1.setLayout(dpPanel1Layout);
        dpPanel1Layout.setHorizontalGroup(
            dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositAmountTF)
                    .addGroup(dpPanel1Layout.createSequentialGroup()
                        .addGroup(dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(dpPanel1Layout.createSequentialGroup()
                        .addComponent(clearDepositFields, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        dpPanel1Layout.setVerticalGroup(
            dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dpPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(depositAmountButton)
                            .addComponent(clearDepositFields))
                        .addContainerGap())))
        );

        depositBG.add(dpPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 170));

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuTabbedPane.addTab("", depositPanel);

        transferBG.setBackground(new java.awt.Color(255, 189, 189));
        transferBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transferLabel.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        transferLabel.setForeground(new java.awt.Color(204, 0, 0));
        transferLabel.setText("TRANSFER MONEY");
        transferBG.add(transferLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, -1));

        tfPanel.setBackground(new java.awt.Color(255, 214, 214));

        questionLabel3.setBackground(new java.awt.Color(151, 50, 0));
        questionLabel3.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        questionLabel3.setForeground(new java.awt.Color(151, 50, 0));
        questionLabel3.setText("Enter Amount to be transferred in Peso:");

        questionLabel4.setBackground(new java.awt.Color(151, 50, 0));
        questionLabel4.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        questionLabel4.setForeground(new java.awt.Color(151, 50, 0));
        questionLabel4.setText("Recipient's 4-digit account number:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("~ must be Php 100.0 less");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("~ must be at least 100 less than current balance");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("than your current balance");

        clearTransferFields.setBackground(new java.awt.Color(253, 160, 160));
        clearTransferFields.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        clearTransferFields.setForeground(new java.awt.Color(153, 51, 0));
        clearTransferFields.setText("Clear");
        clearTransferFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTransferFieldsActionPerformed(evt);
            }
        });

        transferAmountButton.setBackground(new java.awt.Color(253, 160, 160));
        transferAmountButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        transferAmountButton.setForeground(new java.awt.Color(204, 0, 0));
        transferAmountButton.setText("Enter");
        transferAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferAmountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfPanelLayout = new javax.swing.GroupLayout(tfPanel);
        tfPanel.setLayout(tfPanelLayout);
        tfPanelLayout.setHorizontalGroup(
            tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
            .addGroup(tfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tfPanelLayout.createSequentialGroup()
                        .addComponent(transferAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tfPanelLayout.createSequentialGroup()
                        .addComponent(clearTransferFields, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(transferAmountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tfPanelLayout.setVerticalGroup(
            tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tfPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(tfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearTransferFields)
                    .addComponent(transferAmountButton))
                .addContainerGap())
        );

        transferBG.add(tfPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 170));

        javax.swing.GroupLayout transferPanelLayout = new javax.swing.GroupLayout(transferPanel);
        transferPanel.setLayout(transferPanelLayout);
        transferPanelLayout.setHorizontalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transferBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transferPanelLayout.setVerticalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(transferBG, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuTabbedPane.addTab("", transferPanel);

        jPanel7.setBackground(new java.awt.Color(255, 189, 189));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("TRANSACTION HISTORY");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, -1));

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Transaction"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyTable.setSelectionBackground(new java.awt.Color(255, 214, 214));
        historyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(historyTable);
        if (historyTable.getColumnModel().getColumnCount() > 0) {
            historyTable.getColumnModel().getColumn(0).setResizable(false);
            historyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, 304, 171));

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTabbedPane.addTab("", historyPanel);

        menuPanel.add(menuTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 25, 330, 260));

        exitButton1.setBackground(new java.awt.Color(255, 185, 185));
        exitButton1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(255, 255, 255));
        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });
        menuPanel.add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 102, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        
        menuTabbedPane.setSelectedIndex(4);  
    }//GEN-LAST:event_historyButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        //goes to withdraw tab
        menuTabbedPane.setSelectedIndex(1);
        
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        //goes to deposit tab
        menuTabbedPane.setSelectedIndex(2);
        
    }//GEN-LAST:event_depositButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        //goes to transfer tab
        menuTabbedPane.setSelectedIndex(3);
        
    }//GEN-LAST:event_transferButtonActionPerformed

    private void inquireButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquireButton1ActionPerformed
        // shows current balance then goes back to default tab
        
        JOptionPane.showMessageDialog(this,"Account Name: Myne\nAccount Number: 1418\n\nCurrent Balance: Php " + bank.getBalance(), "Inquire Balance",  JOptionPane.INFORMATION_MESSAGE);
        menuTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_inquireButton1ActionPerformed

    private void withdrawAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawAmountButtonActionPerformed
        // requires user input with specifications, once transaction is successful,
        // default tab will re-appear
        
        if (!amountTF.getText().matches("^-?\\d*\\.?\\d+$")){ //only accepts digits and  positive doubles
            JOptionPane.showMessageDialog(this,"Enter Digits Only!","Invalid Input", JOptionPane.ERROR_MESSAGE);
            amountTF.setText("");
            
        }else {
            double withdrawAmount = Double.parseDouble(amountTF.getText());
            
                if(withdrawAmount > bank.getBalance()){
                    JOptionPane.showMessageDialog(this,"Amount must not be higher than your current balance\n\nCurrent Balance: Php " + bank.getBalance(),"Invalid Input", JOptionPane.ERROR_MESSAGE);
                    amountTF.setText("");
                    
                } else if (withdrawAmount <= 0){
                    JOptionPane.showMessageDialog(this, "Amount must be greater than 0", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    amountTF.setText("");
                    
                }else if((bank.getBalance() - withdrawAmount) < 100 ){
                    JOptionPane.showMessageDialog(this,"There must be at least Php 100.0 in your account\n\nCurrent Balance: Php " + bank.getBalance(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    amountTF.setText("");
                    
                } else {
                    
                    int reply = JOptionPane.showConfirmDialog(this,"Withdrawal Confirmation: Php " + withdrawAmount + "\nAccount Name: Myne\nAccount Number: 1418", "Confirmation", JOptionPane.YES_NO_OPTION);
                    
                    if (reply == JOptionPane.YES_OPTION){
                        bank.withdraw(withdrawAmount);
                        JOptionPane.showMessageDialog(this,"Php " + withdrawAmount + " Successfully Withdrawn!\n\nCurrent Balance: Php " + bank.getBalance() + "\nGoing back to menu page...", "Withdrawal Successful", JOptionPane.INFORMATION_MESSAGE);
                    
                        String history = "Withdrew Php " + withdrawAmount;
                        transactions(history);
                        amountTF.setText("");
                        menuTabbedPane.setSelectedIndex(0);
                        
                    }else {
                        JOptionPane.showMessageDialog(this, "Cancelling transaction...", "Cancel Withdraw", JOptionPane.INFORMATION_MESSAGE);
                        amountTF.setText("");
                    }
                    
                }
        }
    }//GEN-LAST:event_withdrawAmountButtonActionPerformed

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed
        // clears field
        amountTF.setText("");
        
    }//GEN-LAST:event_clearFieldsActionPerformed

    private void clearDepositFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDepositFieldsActionPerformed
        // clears field
        depositAmountTF.setText("");
        
    }//GEN-LAST:event_clearDepositFieldsActionPerformed

    private void depositAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountButtonActionPerformed
        // requires user input with specifications, once transaction is successful,
        // default tab will re-appear
        
        if (!depositAmountTF.getText().matches("^-?\\d*\\.?\\d+$")){ //only accepts digits and positive doubles
            JOptionPane.showMessageDialog(this,"Enter Digits Only!","Inv Input", JOptionPane.ERROR_MESSAGE);
            depositAmountTF.setText("");
            
        }else {
            double depositAmount = Double.parseDouble(depositAmountTF.getText());
            
            if (depositAmount <= 0){
                JOptionPane.showMessageDialog(this, "Amount must be greater than 0", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                depositAmountTF.setText("");
                
            }else {
                int reply = JOptionPane.showConfirmDialog(this,"Deposit Confirmation: Php " + depositAmount + "\nAccount Name: Myne\nAccount Number: 1418", "Confirmation", JOptionPane.YES_NO_OPTION);

                    if (reply == JOptionPane.YES_OPTION){
                        bank.deposit(depositAmount);
                        JOptionPane.showMessageDialog(this,"Php " + depositAmount + " Successfully Deposited!\n\nCurrent Balance: Php " + bank.getBalance() + "\nGoing back to menu page...", "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);

                        String history = "Deposited Php " + depositAmount;
                        transactions(history);
                        depositAmountTF.setText("");
                        menuTabbedPane.setSelectedIndex(0);

                    } else {
                        JOptionPane.showMessageDialog(this, "Cancelling transaction...", "Cancel Deposit", JOptionPane.INFORMATION_MESSAGE);
                        depositAmountTF.setText("");
                        
                    }
                    
            }     
        }
        
    }//GEN-LAST:event_depositAmountButtonActionPerformed

    private void clearTransferFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTransferFieldsActionPerformed
        // clears fields
        transferAmountTF.setText("");
        accNumTF.setText("");
        
    }//GEN-LAST:event_clearTransferFieldsActionPerformed

    private void transferAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferAmountButtonActionPerformed
        /**requires user input with specifications, once transaction is successful,
         * default tab will re-appear. It will accept ANY 4-digit account number
        **/ 
        
        if(accNumTF.getText().equals("") || transferAmountTF.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Fields must not be Empty!", "Empty Fields", JOptionPane.ERROR_MESSAGE);
            
        } else if (!accNumTF.getText().matches("\\d{4}")){//accepts only 4 digits
            JOptionPane.showMessageDialog(this,"Enter a Valid Account Number!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            accNumTF.setText("");
            
        } else if (!transferAmountTF.getText().matches("^-?\\d*\\.?\\d+$")){
            JOptionPane.showMessageDialog(this,"Enter Digits Only!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            transferAmountTF.setText("");
        
        } else {
            double transferAmount = Double.parseDouble(transferAmountTF.getText());
            
                if(transferAmount > bank.getBalance()){
                    JOptionPane.showMessageDialog(this,"Amount must not be higher than your current balance\n\nCurrent Balance: Php " + bank.getBalance(),"Invalid Input", JOptionPane.ERROR_MESSAGE);
                    transferAmountTF.setText("");
        
                } else if (transferAmount <= 0){
                    JOptionPane.showMessageDialog(this, "Amount must be greater than 0", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    transferAmountTF.setText("");
        
                } else if((bank.getBalance() - transferAmount) < 100){
                    JOptionPane.showMessageDialog(this,"There must be at least Php 100.0 in your account\n\nCurrent Balance: Php " + bank.getBalance(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    transferAmountTF.setText("");
        
                } else {
                    int reply = JOptionPane.showConfirmDialog(this,"Transfer money confirmation: Php " + transferAmount + "\nSender:\nAccount Name: Myne\nAccount Number: 1418\n\nRecipient:\nAccount Name: Errol\nAccount Number: " + accNumTF.getText(), "Confirmation", JOptionPane.YES_NO_OPTION);
                    
                        if (reply == JOptionPane.YES_OPTION){

                            bank.withdraw(transferAmount);
                            JOptionPane.showMessageDialog(this,"Php " + transferAmount + " Successfully Transferred to: " + "\nAccount Name: Errol\nAccount Number: " + accNumTF.getText() + "\n\nCurrent Balance: Php " + bank.getBalance() + "\nGoing back to menu page...", "Transfer Successful", JOptionPane.INFORMATION_MESSAGE);

                            String history = "Transferred Php " + transferAmount;
                            transactions(history);
                            
                            transferAmountTF.setText("");
                            accNumTF.setText("");
                            menuTabbedPane.setSelectedIndex(0);

                        } else {
                            JOptionPane.showMessageDialog(this, "Cancelling transaction...", "Cancel Transfer", JOptionPane.INFORMATION_MESSAGE);
                            transferAmountTF.setText("");
                            accNumTF.setText("");

                        }
 
                }
        }
   
    }//GEN-LAST:event_transferAmountButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        // TODO add your handling code here:
        dispose(); //disposes the login page
        
        int reply = JOptionPane.showConfirmDialog(this, "Exit Application?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
            if (reply == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Exiting Application...\nThank You for your time!");
               

            } else {
                JOptionPane.showMessageDialog(null, "Going back to Login Page...");
                LogIn login = new LogIn();
                login.setVisible(true);
                
            }   
    }//GEN-LAST:event_exitButton1ActionPerformed

    public int i = 1;
    public void transactions(String a) {
        Object[] data = {i, a};
        DefaultTableModel tableModel = (DefaultTableModel) historyTable.getModel();
        tableModel.addRow(new Object[]{i,a});
        i++;
    }
    
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
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNumTF;
    private javax.swing.JTextField amountTF;
    private javax.swing.JLabel banLabel;
    private javax.swing.JLabel banLabel1;
    private javax.swing.JButton clearDepositFields;
    private javax.swing.JButton clearFields;
    private javax.swing.JButton clearTransferFields;
    private javax.swing.JPanel defaultTab;
    private javax.swing.JButton depositAmountButton;
    private javax.swing.JTextField depositAmountTF;
    private javax.swing.JPanel depositBG;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JPanel dpPanel1;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton historyButton;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton inquireButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel koquetteBack;
    private javax.swing.JLabel koquetteBack1;
    private javax.swing.JLabel koquetteFront;
    private javax.swing.JLabel koquetteFront1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTabbedPane menuTabbedPane;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionLabel1;
    private javax.swing.JLabel questionLabel2;
    private javax.swing.JLabel questionLabel3;
    private javax.swing.JLabel questionLabel4;
    private javax.swing.JPanel stripePanel1;
    private javax.swing.JPanel stripePanel2;
    private javax.swing.JPanel tfPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton transferAmountButton;
    private javax.swing.JTextField transferAmountTF;
    private javax.swing.JPanel transferBG;
    private javax.swing.JButton transferButton;
    private javax.swing.JLabel transferLabel;
    private javax.swing.JPanel transferPanel;
    private javax.swing.JPanel wdPanel;
    private javax.swing.JButton withdrawAmountButton;
    private javax.swing.JPanel withdrawBG;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}

class BankProcesses{
    private double balance;
    private double amount;
    
    public BankProcesses(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    void withdraw(double amount){
        this.amount = amount;
        balance -= amount;
    }
    
    void deposit(double amount){
        balance += amount;
        
    }
    
}