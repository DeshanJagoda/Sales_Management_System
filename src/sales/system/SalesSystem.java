/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sales.system;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SalesSystem extends javax.swing.JFrame {
 String selectedImagePath="src\\top.png"; 
 
 String selectedImagePath1="src\\t1.jpg";
 String selectedImagePath2="src\\t2.jpg";
 String selectedImagePath3="src\\t3.jpg";
 String selectedImagePath14="src\\t4.png";
 String selectedImagePath15="src\\t5.png";
 String selectedImagePath16="src\\t6.jpeg";
 
 String selectedImagePath4="src\\S1.jpeg";
 String selectedImagePath5="src\\S2.jpeg";
 String selectedImagePath6="src\\S3.jpeg";
 String selectedImagePath7="src\\S4.jpeg";
 String selectedImagePath8="src\\S5.jpg";
 String selectedImagePath9="src\\S6.jpg";
 
 String selectedImagePath10="src\\O1.jpg";
 String selectedImagePath11="src\\O2.jpg";
 String selectedImagePath12="src\\O3.jpg";
 String selectedImagePath13="src\\O4.jpeg";
 String selectedImagePath17="src\\O5.jpeg";
 String selectedImagePath18="src\\O6.jpeg";
 
 PreparedStatement pst;
 ResultSet rs,rs1;
 DefaultTableModel tableModel; 
 DefaultTableModel tableMode2; 
 DataBaseConnection db=new DataBaseConnection();
 String ProductNoU;
 int AvailableQuantityD=0;
 int AvailableQuantityT=0;
 int AvailableQuantityU=0;
 int NewQuantity;

    public SalesSystem() {
        initComponents();
        db.DBConnection();
        DisplayTableDate();
       
        txtProductNo.requestFocus();
    }
    
    void DisplayTableDate(){
        
        tableModel=(DefaultTableModel) jTableStock.getModel();
        
      try {
         String msg="select * from stock";
         pst=db.con.prepareStatement(msg);
         rs=pst.executeQuery();
         tableModel=(DefaultTableModel) jTableStock.getModel();
         
        while(rs.next()){   
         String Productno=rs.getString(1);
         String Name=rs.getString(2); 
         String AvailableQuantit=rs.getString(3); 
         String UnitPrice=rs.getString(4);   
         
         String[] dataRow={Productno,Name,AvailableQuantit,UnitPrice}; 
         tableModel.addRow(dataRow);     
        }  
      } catch (SQLException ex) {
         Logger.getLogger(SalesSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  float NetTotal=0;  
  float NT=0; 
    float Total(){
       NT=(NT+NetTotal);
       txtNetTotal.setText(""+NT);
     return NT;
    }

    void clear(){
        txtProductNo.setText("");
        txtName.setText("");
        txtQuantity.setText("");
        txtUnitPrice.setText("");
        txtTotalPric.setText("");
        txadisplay.setText("");
    }
    
  int BN=0;  
  void Display(){
     LocalDate date=LocalDate.now();
       int x=date.getDayOfMonth();
       int a=date.getMonthValue();
       int z=date.getYear();
        
       String y =Integer.toString(z);
       String m =Integer.toString(a);
       String d =Integer.toString(x);
        tableModel=(DefaultTableModel) jTableAddRecod.getModel();
        //int x=jTableAddRecod.getRowCount();
              
        txadisplay.setText("");
        String info;
        info=        
           "\t KALUM FOOD CTIY\n"+
           " \t Wanduramba, Galle\n"+
           " Bill Number\n"+
           " Cashier \n"+ 
           " Date- "+d+"-"+m+"-"+y+"\n"+  "Time"+java.time.LocalTime.now()+"\n"+
           "-------------------------------------------------------------------------------------\n"+ 
           " Product            Quantity             Unit Price                  Total Price\n"+ 
           "-------------------------------------------------------------------------------------\n"; 
           txadisplay.append(info);
           for(int k=0;k<x;k++){
              txadisplay.append("\n"+jTableAddRecod.getValueAt(k, 0).toString()+  
              jTableAddRecod.getValueAt(k, 1).toString()+"\n"+  
              "\t"+jTableAddRecod.getValueAt(k, 2).toString()+
              "\t"+jTableAddRecod.getValueAt(k, 3).toString()+
              "\t"+jTableAddRecod.getValueAt(k, 4).toString()+"\n");
            }
            txadisplay.append("-------------------------------------------------------------------------------------");
            txadisplay.append("Net Total                                                                            " +         txtNetTotal.getText()+"\n");
            txadisplay.append("Cash                                                                                  "+             txtCash.getText()+"\n");
            txadisplay.append("Balance                                                                               "+          txtBalance.getText()+"\n");
            txadisplay.append("-------------------------------------------------------------------------------------\n"); 
            txadisplay.append(" \t Thank Come Again\n");
            txadisplay.append( "-------------------------------------------------------------------------------------\n"); 
            txadisplay.append("\tDeshan Software Solution \n");
            txadisplay.append("Tel:0764126712                Email:deshanjagoda38@gmail.com");      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblEmpNo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAddRecod = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnCalcuaat = new javax.swing.JButton();
        btnPrintPreview = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnA1 = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnClearn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtProductNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtTotalPric = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        lblProductNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txadisplay = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStock = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblS1 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        lblS4 = new javax.swing.JLabel();
        lblS5 = new javax.swing.JLabel();
        lblS6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblO1 = new javax.swing.JLabel();
        lblO2 = new javax.swing.JLabel();
        lblO3 = new javax.swing.JLabel();
        lblO4 = new javax.swing.JLabel();
        lblO5 = new javax.swing.JLabel();
        lblO6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblt1 = new javax.swing.JLabel();
        lblt2 = new javax.swing.JLabel();
        lblt3 = new javax.swing.JLabel();
        lblt4 = new javax.swing.JLabel();
        lblt5 = new javax.swing.JLabel();
        lblt6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
                New1WimdowActivate(evt);
                New2WimdowActivate(evt);
                New3WindowActivated(evt);
                New4WindowActivated(evt);
                New5WindowActivated(evt);
                New6WindowActivated(evt);
                New7WindowActivated(evt);
                New8WindowActivated(evt);
                New9WindowActivated(evt);
                New10WindowActivated(evt);
                New11WindowActivated(evt);
                New12WindowActivated(evt);
                New13WindowActivated(evt);
                New14WindowActivated(evt);
                New15WindowActivated(evt);
                New16WindowActivated(evt);
                New17WindowActivated(evt);
                New18WindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 51, 51));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblEmpNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEmpNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableAddRecod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No", "Name", "Unit Price", "Quantity", "Total Price"
            }
        ));
        jTableAddRecod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAddRecodMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAddRecod);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalcuaat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCalcuaat.setText("Calculat");
        btnCalcuaat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcuaatActionPerformed(evt);
            }
        });

        btnPrintPreview.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPrintPreview.setText("Print Preview");
        btnPrintPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPreviewActionPerformed(evt);
            }
        });

        btnPrintBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPrintBill.setText("Print Bill");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcuaat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrintPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(btnPrintBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcuaat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrintPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setToolTipText("");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn10.setText(".");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnA1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnA1.setText("A");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnC1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnC1.setText("C");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnJ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnH.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnS.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnZ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        btnW.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnY.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnClearn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClearn.setText("Clearn");
        btnClearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnA1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(btnC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(5, 5, 5))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClearn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(btn0)
                    .addComponent(btn10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA1)
                    .addComponent(btnB)
                    .addComponent(btnD)
                    .addComponent(btnC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnE)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnI)
                    .addComponent(btnJ)
                    .addComponent(btnK)
                    .addComponent(btnL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnM)
                    .addComponent(btnN)
                    .addComponent(btnP)
                    .addComponent(btnO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ)
                    .addComponent(btnR)
                    .addComponent(btnS)
                    .addComponent(btnT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnU)
                    .addComponent(btnV)
                    .addComponent(btnW)
                    .addComponent(btnX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnY)
                    .addComponent(btnZ)
                    .addComponent(btnClearn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Net Total");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cash");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Balance");

        txtNetTotal.setEditable(false);
        txtNetTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNetTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtCash.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetTotal)
                    .addComponent(txtCash)
                    .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNetTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8666749_plus_add_icon.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6578917_broom_clean_cleaning_housekeeping_icon.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtProductNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProductNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNoActionPerformed(evt);
            }
        });
        txtProductNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductNoKeyPressed(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        txtTotalPric.setEditable(false);
        txtTotalPric.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblProductNo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblProductNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductNo.setText("ProductNo");

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        lblQuantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("Quantity");

        lblUnitPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUnitPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnitPrice.setText("Unit Price");

        txtTotalPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPrice.setText("Total Price");

        btnNew.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1564503_add_business_edit_editor_new_icon.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8666635_refresh_ccw_icon.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductNo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnitPrice)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPrice)
                            .addComponent(txtTotalPric, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductNo)
                    .addComponent(lblUnitPrice)
                    .addComponent(lblQuantity)
                    .addComponent(txtTotalPrice)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bill Previve", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txadisplay.setEditable(false);
        txadisplay.setColumns(20);
        txadisplay.setRows(5);
        jScrollPane4.setViewportView(txadisplay);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Stock ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product No", "Name", "Available Quantity", "Unit Price"
            }
        ));
        jTableStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStockMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableStock);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblS1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS1MouseClicked(evt);
            }
        });

        lblS2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS2MouseClicked(evt);
            }
        });

        lblS3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS3MouseClicked(evt);
            }
        });

        lblS4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS4MouseClicked(evt);
            }
        });

        lblS5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS5MouseClicked(evt);
            }
        });

        lblS6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblS6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblS6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblS4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblS5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblS6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblS1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblS2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblS3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblS1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblS2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblS3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblS4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblS5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblS6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("School Item", jPanel4);

        lblO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO1MouseClicked(evt);
            }
        });

        lblO2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO2MouseClicked(evt);
            }
        });

        lblO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO3MouseClicked(evt);
            }
        });

        lblO4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO4MouseClicked(evt);
            }
        });

        lblO5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO5MouseClicked(evt);
            }
        });

        lblO6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblO6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblO6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblO4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblO1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblO2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblO5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblO3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblO6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblO1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblO4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(lblO5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblO6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Other Items", jPanel10);

        lblt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt1MouseClicked(evt);
            }
        });

        lblt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt2MouseClicked(evt);
            }
        });

        lblt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt3MouseClicked(evt);
            }
        });

        lblt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt4MouseClicked(evt);
            }
        });

        lblt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt5MouseClicked(evt);
            }
        });

        lblt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblt6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblt1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblt2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblt3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(lblt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblt3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblt1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblt2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblt4, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(lblt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sweets", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        float nt=Float.parseFloat(txtNetTotal.getText());
        float cash=Float.parseFloat(txtCash.getText());
        float Balance=(cash-nt);
        txtBalance.setText(""+Balance);
    }//GEN-LAST:event_txtCashActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath);
        Image readyImage=imageicon.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_formWindowActivated

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         txtProductNo.setText( txtProductNo.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         txtProductNo.setText( txtProductNo.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+".");
    }//GEN-LAST:event_btn10ActionPerformed

    private void btnClearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearnActionPerformed
      String currentText =txtProductNo.getText();
      if(currentText.length()>0){
         String modifiedText = currentText.substring(0,currentText.length()-1);
         txtProductNo.setText(modifiedText);
        }
    }//GEN-LAST:event_btnClearnActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"A");
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"C");
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"D");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"E");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"F");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"G");
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"H");
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"I");
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"J");
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"K");
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"L");
    }//GEN-LAST:event_btnLActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"M");
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"N");
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"O");
    }//GEN-LAST:event_btnOActionPerformed

    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"P");
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"Q");
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"R");
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"S");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"T");
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"U");
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"V");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"W");
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        txtProductNo.setText( txtProductNo.getText()+"X");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"V");
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
       txtProductNo.setText( txtProductNo.getText()+"Z");
    }//GEN-LAST:event_btnZActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        NT=NT-(Float.parseFloat(txtTotalPric.getText()));
        txtNetTotal.setText(""+NT);
        
        int x = jTableAddRecod.getSelectedRow();
         
        tableModel.removeRow(x);
        txtProductNo.setText("");
        txtName.setText("");
        txtQuantity.setText("");
        txtUnitPrice.setText("");
        txtTotalPric.setText(""); 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
     try {
        txadisplay.print();
     } catch (PrinterException ex) {
        Logger.getLogger(SalesSystem.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void btnPrintPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPreviewActionPerformed
       Display();
    }//GEN-LAST:event_btnPrintPreviewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StockClear();

        
        tableMode2=(DefaultTableModel) jTableAddRecod.getModel();
        Object[] dataRow=new Object[5];
        dataRow[0]=txtProductNo.getText();
        dataRow[1]=txtName.getText();
        dataRow[2]=txtUnitPrice.getText();
        dataRow[3]=txtQuantity.getText();
        dataRow[4]=txtTotalPric.getText();
        
        NetTotal=Float.parseFloat(txtTotalPric.getText());
       
        if(txtName.getText().equals("")||txtQuantity.getText().equals("")||txtUnitPrice.getText().equals("")||txtTotalPrice.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Emty Record");
        }
        else{    
         tableMode2.addRow(dataRow);     
         Total();  
         Update(); 
         clear(); 
       
         txtProductNo.setText("");
         txtName.setText("");
         txtQuantity.setText("");
         txtUnitPrice.setText("");
         txtTotalPric.setText("");
         DisplayTableDate();
        }
       txtProductNo.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        UserLogin MyObj=new UserLogin();
        this.setVisible(false);
        MyObj.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void txtProductNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNoKeyPressed
        char key=evt.getKeyChar();
          
        if(key==KeyEvent.VK_ENTER){
            txtQuantity.requestFocus();
        }
    }//GEN-LAST:event_txtProductNoKeyPressed

    private void jTableAddRecodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAddRecodMouseClicked
        
      tableModel=(DefaultTableModel) jTableAddRecod.getModel();
      int x=jTableAddRecod.getSelectedRow();
        
      txtProductNo.setText(tableModel.getValueAt(x, 0).toString());
      txtName.setText(tableModel.getValueAt(x, 1).toString());
      txtUnitPrice.setText(tableModel.getValueAt(x, 2).toString());
      txtQuantity.setText(tableModel.getValueAt(x, 3).toString());
      txtTotalPric.setText(tableModel.getValueAt(x, 4).toString());       
    }//GEN-LAST:event_jTableAddRecodMouseClicked

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
    
    }//GEN-LAST:event_txtQuantityKeyPressed

    String ProductNo;
    private void txtProductNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNoActionPerformed
      try {
            String msg="select* from stock where ProductNo=?";
            pst=db.con.prepareStatement(msg);
            pst.setString(1, txtProductNo.getText());
            rs=pst.executeQuery();
                
            if(rs.next()){       
             txtName.setText(rs.getString(2));
             txtUnitPrice.setText(rs.getString(4));   
             ProductNo=txtProductNo.getText();
           }else{
             JOptionPane.showMessageDialog(null, "This Record Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesSystem.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_txtProductNoActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        float UnitPrice=Float.parseFloat(txtUnitPrice.getText());
        float Quantity=Float.parseFloat(txtQuantity.getText());
        float Total=(UnitPrice*Quantity);
        txtTotalPric.setText(""+Total);
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnCalcuaatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcuaatActionPerformed
       float nt=Float.parseFloat(txtNetTotal.getText());
       float cash=Float.parseFloat(txtCash.getText());
       float Balance=(cash-nt);
       txtBalance.setText(""+Balance);
    }//GEN-LAST:event_btnCalcuaatActionPerformed

    private void jTableStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStockMouseClicked
        tableModel=(DefaultTableModel) jTableStock.getModel();
        int x=jTableStock.getSelectedRow();
        txtProductNo.setText(tableModel.getValueAt(x, 0).toString());
        txtName.setText(tableModel.getValueAt(x, 1).toString());
        txtUnitPrice.setText(tableModel.getValueAt(x, 3).toString());
    }//GEN-LAST:event_jTableStockMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
      clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void New1WimdowActivate(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New1WimdowActivate
       ImageIcon imageicon=new ImageIcon(selectedImagePath1);
       Image readyImage=imageicon.getImage().getScaledInstance(lblt1.getWidth(),lblt1.getHeight(), Image.SCALE_SMOOTH);
       lblt1.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New1WimdowActivate

    private void New2WimdowActivate(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New2WimdowActivate
        ImageIcon imageicon=new ImageIcon(selectedImagePath2);
        Image readyImage=imageicon.getImage().getScaledInstance(lblt2.getWidth(),lblt2.getHeight(), Image.SCALE_SMOOTH);
        lblt2.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New2WimdowActivate

    private void New3WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New3WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath3);
        Image readyImage=imageicon.getImage().getScaledInstance(lblt3.getWidth(),lblt3.getHeight(), Image.SCALE_SMOOTH);
        lblt3.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New3WindowActivated

    private void New4WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New4WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath4);
        Image readyImage=imageicon.getImage().getScaledInstance(lblS1.getWidth(),lblS1.getHeight(), Image.SCALE_SMOOTH);
        lblS1.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New4WindowActivated

    private void New5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New5WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath5);
        Image readyImage=imageicon.getImage().getScaledInstance(lblS2.getWidth(),lblS2.getHeight(), Image.SCALE_SMOOTH);
        lblS2.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New5WindowActivated

    private void New6WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New6WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath6);
       Image readyImage=imageicon.getImage().getScaledInstance(lblS3.getWidth(),lblS3.getHeight(), Image.SCALE_SMOOTH);
       lblS3.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New6WindowActivated

    private void New7WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New7WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath7);
       Image readyImage=imageicon.getImage().getScaledInstance(lblS4.getWidth(),lblS4.getHeight(), Image.SCALE_SMOOTH);
       lblS4.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New7WindowActivated

    private void New8WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New8WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath8);
       Image readyImage=imageicon.getImage().getScaledInstance(lblS5.getWidth(),lblS5.getHeight(), Image.SCALE_SMOOTH);
       lblS5.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New8WindowActivated

    private void New9WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New9WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath9);
        Image readyImage=imageicon.getImage().getScaledInstance(lblS6.getWidth(),lblS6.getHeight(), Image.SCALE_SMOOTH);
        lblS6.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New9WindowActivated

    private void New10WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New10WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath10);
        Image readyImage=imageicon.getImage().getScaledInstance(lblO1.getWidth(),lblO1.getHeight(), Image.SCALE_SMOOTH);
        lblO1.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New10WindowActivated

    private void New11WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New11WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath11);
       Image readyImage=imageicon.getImage().getScaledInstance(lblO2.getWidth(),lblO2.getHeight(), Image.SCALE_SMOOTH);
       lblO2.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New11WindowActivated

    private void New12WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New12WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath12);
       Image readyImage=imageicon.getImage().getScaledInstance(lblO3.getWidth(),lblO3.getHeight(), Image.SCALE_SMOOTH);
       lblO3.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New12WindowActivated

    int s1=0;
    private void lblS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS1MouseClicked
        txtProductNo.setText("SI01");
        txtName.setText("Pensil");
        txtUnitPrice.setText("10.0");
        txtQuantity.setText(Integer.toString(s1++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS1MouseClicked

    int s2=0;
    private void lblS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS2MouseClicked
        txtProductNo.setText("Si02");
        txtName.setText("Pen");
        txtUnitPrice.setText("20.0"); 
        txtQuantity.setText(Integer.toString(s2++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS2MouseClicked

    int s3=0;
    private void lblS3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS3MouseClicked
        txtProductNo.setText("SI03");
        txtName.setText("scissors");
        txtUnitPrice.setText("200.0");
        txtQuantity.setText(Integer.toString(s3++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS3MouseClicked

    int s4=0;
    private void lblS4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS4MouseClicked
        txtProductNo.setText("Si04");
        txtName.setText("Color pen");
        txtUnitPrice.setText("200.0"); 
        txtQuantity.setText(Integer.toString(s4++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS4MouseClicked

    int s5=0;
    private void lblS5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS5MouseClicked
        txtProductNo.setText("SI05");
        txtName.setText("Eraser");
        txtUnitPrice.setText("50.0"); 
        txtQuantity.setText(Integer.toString(s5++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS5MouseClicked

    int s6=0;
    private void lblS6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblS6MouseClicked
        txtProductNo.setText("SI06");
        txtName.setText("Stapers");
        txtUnitPrice.setText("120.0"); 
        txtQuantity.setText(Integer.toString(s6++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblS6MouseClicked

    int t1=0;
    private void lblt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt1MouseClicked
        txtProductNo.setText("T01");
        txtName.setText("Vanila Tofe");
        txtUnitPrice.setText("15.0");
        txtQuantity.setText(Integer.toString(t1++)); 
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt1MouseClicked

    int t2=0;
    private void lblt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt2MouseClicked
        txtProductNo.setText("T02");
        txtName.setText("Chokalat Tofe");
        txtUnitPrice.setText("25.0"); 
        txtQuantity.setText(Integer.toString(t1++)); 
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt2MouseClicked

    int t3=0;
    private void lblt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt3MouseClicked
        txtProductNo.setText("T03");
        txtName.setText("Chokalat&milk Tofe");
        txtUnitPrice.setText("40.0");
        txtQuantity.setText(Integer.toString(t1++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt3MouseClicked

    int o1=0;
    private void lblO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO1MouseClicked
        txtProductNo.setText("O01");
        txtName.setText("box of matches");
        txtUnitPrice.setText("20.0"); 
        txtQuantity.setText(Integer.toString(o1++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO1MouseClicked

    int o2=0;
    private void lblO2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO2MouseClicked
        txtProductNo.setText("O02");
        txtName.setText("lighter");
        txtUnitPrice.setText("150.0"); 
        txtQuantity.setText(Integer.toString(o2++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO2MouseClicked

    int o3=0;
    private void lblO3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO3MouseClicked
        txtProductNo.setText("O03");
        txtName.setText("Coconut");
        txtUnitPrice.setText("125.0"); 
        txtQuantity.setText(Integer.toString(o3++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO3MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       Update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    int o4;
    private void lblO4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO4MouseClicked
        txtProductNo.setText("O04");
        txtName.setText("Knorr Seasoning Cubes Pantry Pack");
        txtUnitPrice.setText("100.0"); 
        txtQuantity.setText(Integer.toString(o4++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO4MouseClicked

    private void New13WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New13WindowActivated
      ImageIcon imageicon=new ImageIcon(selectedImagePath13);
      Image readyImage=imageicon.getImage().getScaledInstance(lblO4.getWidth(),lblO4.getHeight(), Image.SCALE_SMOOTH);    
      lblO4.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New13WindowActivated

    int t4;
    private void lblt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt4MouseClicked
        txtProductNo.setText("T04");
        txtName.setText("Tiara Rollo Cakek");
        txtUnitPrice.setText("70.0");
        txtQuantity.setText(Integer.toString(t4++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt4MouseClicked

    private void New14WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New14WindowActivated
       ImageIcon imageicon=new ImageIcon(selectedImagePath14);
       Image readyImage=imageicon.getImage().getScaledInstance(lblt4.getWidth(),lblt4.getHeight(), Image.SCALE_SMOOTH);
       lblt4.setIcon(new ImageIcon (readyImage));      
    }//GEN-LAST:event_New14WindowActivated

    private void New15WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New15WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath15);
        Image readyImage=imageicon.getImage().getScaledInstance(lblt5.getWidth(),lblt5.getHeight(), Image.SCALE_SMOOTH);
        lblt5.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New15WindowActivated

    int t5;
    private void lblt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt5MouseClicked
        txtProductNo.setText("T05");
        txtName.setText("Chocolate");
        txtUnitPrice.setText("170.0"); 
        txtQuantity.setText(Integer.toString(t5++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt5MouseClicked

    private void New16WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New16WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath16);
        Image readyImage=imageicon.getImage().getScaledInstance(lblt6.getWidth(),lblt6.getHeight(), Image.SCALE_SMOOTH);  
        lblt6.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New16WindowActivated
int t6;
    private void lblt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblt6MouseClicked
        txtProductNo.setText("T06");
        txtName.setText("lollipops");
        txtUnitPrice.setText("50.0"); 
        txtQuantity.setText(Integer.toString(t6++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblt6MouseClicked

    private void New17WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New17WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath17);
        Image readyImage=imageicon.getImage().getScaledInstance(lblO5.getWidth(),lblO5.getHeight(), Image.SCALE_SMOOTH);
        lblO5.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New17WindowActivated

    private void New18WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New18WindowActivated
        ImageIcon imageicon=new ImageIcon(selectedImagePath18);
        Image readyImage=imageicon.getImage().getScaledInstance(lblO6.getWidth(),lblO6.getHeight(), Image.SCALE_SMOOTH);
        lblO6.setIcon(new ImageIcon (readyImage));
    }//GEN-LAST:event_New18WindowActivated

    int O5;
    private void lblO5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO5MouseClicked
       txtProductNo.setText("O05");
       txtName.setText("vim dishwash bar");
       txtUnitPrice.setText("265.0"); 
       txtQuantity.setText(Integer.toString(O5++));
       txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO5MouseClicked

    int O6;
    private void lblO6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblO6MouseClicked
        txtProductNo.setText("O06");
        txtName.setText("knorr biryani mix");
        txtUnitPrice.setText("280.0"); 
        txtQuantity.setText(Integer.toString(O6++));
        txtQuantity.requestFocus();
    }//GEN-LAST:event_lblO6MouseClicked

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
 
    }//GEN-LAST:event_btnAddMousePressed

  /* void Update(){
     try {
         ProductNoU=txtProductNo.getText();
         AvailableQuantityT=Integer.parseInt( txtQuantity.getText());
         
         
         String msg="select * from stock where stock.ProductNo=?";
         pst=db.con.prepareStatement(msg);
         pst.setString(1, ProductNoU);
         rs=pst.executeQuery();
         
         if(rs.next()){ 
             AvailableQuantityD=Integer.parseInt(rs.getString(3));
         }
         
         AvailableQuantityU=(AvailableQuantityD-AvailableQuantityT);
         System.out.println(AvailableQuantityU);
                 
         String msg1="Update stock  set AvailableQuantity=? where stock.ProductNo=?";
         pst=db.con.prepareStatement(msg1);
         
         
         pst.setInt(1, AvailableQuantityU);
         pst.setString(2, ProductNoU);
         
         pst.executeUpdate();
         
         //DisplayTableDate();
         
     } catch (SQLException ex) {
         Logger.getLogger(SalesSystem.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   */
  void StockClear(){
      tableModel=(DefaultTableModel) jTableStock.getModel();
      int x =tableModel.getRowCount();
      jTableStock.removeAll();
      int rowCount = tableModel.getRowCount();
      
      for (int i = rowCount -1; i >=0;i--){
        tableModel.removeRow(i);
      }
    }
  
    void Update(){     
     try {   
       String msg="select * from stock where ProductNo=?";
        pst=db.con.prepareStatement(msg);
        pst.setString(1,txtProductNo.getText());
        rs1=pst.executeQuery(); 
        
        if(rs1.next()){ 
         NewQuantity=rs1.getInt(3)-Integer.parseInt(txtQuantity.getText());
     
         String msg1="Update stock  set AvailableQuantity=? where stock.ProductNo=?";
         pst=db.con.prepareStatement(msg1);
         
         String tot=Integer.toString(NewQuantity);
         pst.setString(1, tot);
         pst.setString(2, txtProductNo.getText());
         pst.executeUpdate();
        }
         
     } catch (SQLException ex) {
        Logger.getLogger(SalesSystem.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
          new SalesSystem().setVisible(true);
          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnCalcuaat;
    private javax.swing.JButton btnClearn;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnPrintPreview;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAddRecod;
    private javax.swing.JTable jTableStock;
    public javax.swing.JLabel lblEmpNo;
    public javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblO1;
    private javax.swing.JLabel lblO2;
    private javax.swing.JLabel lblO3;
    private javax.swing.JLabel lblO4;
    private javax.swing.JLabel lblO5;
    private javax.swing.JLabel lblO6;
    private javax.swing.JLabel lblProductNo;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblS4;
    private javax.swing.JLabel lblS5;
    private javax.swing.JLabel lblS6;
    private javax.swing.JLabel lblUnitPrice;
    javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblt1;
    private javax.swing.JLabel lblt2;
    private javax.swing.JLabel lblt3;
    private javax.swing.JLabel lblt4;
    private javax.swing.JLabel lblt5;
    private javax.swing.JLabel lblt6;
    private javax.swing.JTextArea txadisplay;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtProductNo;
    public javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalPric;
    private javax.swing.JLabel txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
