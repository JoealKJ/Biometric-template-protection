import java.io.File;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERUMAL
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximizedBounds(new java.awt.Rectangle(1100, 700, 1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Form");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 400, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Account No :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 110, 100, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 190, 110, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 110, 250, 30);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(170, 190, 250, 30);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 470, 80, 30);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 470, 90, 30);

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("CREATE ACCOUNT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 20, 420, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the Level", "Level1", "Level2", "Level3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 150, 250, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Level Type:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 150, 100, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Access (Character)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 270, 110, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 230, 250, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Random Key :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 230, 110, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 270, 250, 30);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Fingerprint Photo Chooser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(170, 310, 250, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("FingerPrint");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 310, 90, 30);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 430, 210, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Question");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 350, 80, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 350, 250, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Answer");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 394, 70, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 390, 250, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 90, 460, 520);

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BIOMETRIC TEMPLATE PROTECTION");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 20, 1030, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3d-cube-wallpaper_05.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setMaximumSize(new java.awt.Dimension(1000, 524));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 90, 560, 520);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        Register rs=new Register();
        rs.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
          String L1 = null,L2 = null,L3 = null,L11 = null,L12 = null,L13 = null,r1 = null,r2 = null,r3 = null;
          String ques=null,ans=null,LT1 = null,LT2 = null,LT3 = null,LT11 = null,LT12 = null,LT13 = null,rT1 = null,rT2 = null,rT3 = null,email = null;
          int v=0,v1=0;
           Random randomGenerator = new Random();
                for (int idx = 1; idx <= 10; ++idx) {
                    v1 = randomGenerator.nextInt(100000);

                }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/security","root","root");
            Statement st=con.createStatement();
            Statement ob=con.createStatement();
        
            ResultSet rs=st.executeQuery("select * from register where account='"+jTextField1.getText()+"' and ques='"+jTextField4.getText()+"' and ans='"+jTextField5.getText()+"'");
            if(rs.next()){
             L1=rs.getString(3);
             L2=rs.getString(4);
             L3=rs.getString(5);
             r1=rs.getString(6);
             r2=rs.getString(7);
             r3=rs.getString(8);
             LT11=rs.getString(9);
             LT12=rs.getString(10);
             LT13=rs.getString(11);
             LT1=rs.getString(12);
             LT2=rs.getString(13);
             LT3=rs.getString(14);
             rT1=rs.getString(15);
             rT2=rs.getString(16);
             rT3=rs.getString(17);
                email=rs.getString(20);
                 ques=rs.getString(21);
                ans=rs.getString(22);
            }
                  ResultSet rs1=ob.executeQuery("select * from secure where account='"+jTextField1.getText()+"'");
            if(rs1.next())
            {
             L11=rs1.getString(2);
             L12=rs1.getString(3);
             L13=rs1.getString(4);
             }
            System.out.println("Uname :"+jTextField1.getText()+"L11 :"+L11+"L12 :"+L12+"L13 :"+L13);
          
            
                  if((L11.equals("0"))&&(L12.equals("0"))&&(L11.equals("0"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :0"+"L12 : 0"+"L13 :0");
                   System.out.println("L12 :"+L12);
                 if((jComboBox1.getSelectedItem().equals("Level1"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r1))&&(jTextField3.getText().equals(LT1))){
                 v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              }         System.out.println("L11 :"+L11);        
            }else if((jComboBox1.getSelectedItem().equals("Level2"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r2))&&(jTextField3.getText().equals(LT2))){
                 v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              }        System.out.println("L12 :"+L12); 
            }else  if((jComboBox1.getSelectedItem().equals("Level3"))){
               if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r3))&&(jTextField3.getText().equals(LT3))){
                 v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
               } else{
                  v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
                }              System.out.println("L13 :"+L13);      
              }
            }else
                      
                  if((L11.equals("1"))&&(L12.equals("0"))&&(L11.equals("0"))){
               System.out.println("Uname :"+jTextField1.getText()+"L11 :1"+"L12 : 0"+"L13 :0");
                   System.out.println("L12 :"+L12);
               if((jComboBox1.getSelectedItem().equals("Level2"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r2))&&(jTextField3.getText().equals(LT2))){
                 v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              }        System.out.println("L12 :"+L12); 
            }else  if((jComboBox1.getSelectedItem().equals("Level3"))){
               if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r3))&&(jTextField3.getText().equals(LT3))){
                 v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
               } else{
                  v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
                }              System.out.println("L13 :"+L13);      
              }
            }else
                
                if((L11.equals("0"))&&(L12.equals("1"))&&(L11.equals("0"))){
             System.out.println("Uname :"+jTextField1.getText()+"L11 :0"+"L12 : 1"+"L13 :0");
                   System.out.println("L12 :"+L12);
                 if((jComboBox1.getSelectedItem().equals("Level1"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r1))&&(jTextField3.getText().equals(LT1))){
                 v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              }         System.out.println("L11 :"+L11);        
            }else if((jComboBox1.getSelectedItem().equals("Level3"))){
               if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r3))&&(jTextField3.getText().equals(LT3))){
                 v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
               } else{
                  v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
                }              System.out.println("L13 :"+L13);      
              }
            }else 
                
                if((L11.equals("0"))&&(L12.equals("0"))&&(L11.equals("1"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :0"+"L12 : 0"+"L13 :1");
                   System.out.println("L12 :"+L12);
                 if((jComboBox1.getSelectedItem().equals("Level1"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r1))&&(jTextField3.getText().equals(LT2))) {
                 v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level1='1' where account='"+jTextField1.getText()+"' ");
              }         System.out.println("L11 :"+L11);        
            }else if((jComboBox1.getSelectedItem().equals("Level2"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r2))&&(jTextField3.getText().equals(LT2))){
                 v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level2='1' where account='"+jTextField1.getText()+"' ");
              }        System.out.println("L12 :"+L12); 
            }
            }else 
                
                if((L11.equals("1"))&&(L12.equals("1"))&&(L11.equals("0"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :1"+"L12 : 1"+"L13 :0");
               if((jComboBox1.getSelectedItem().equals("Level3"))){
               if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r3))&&(jTextField3.getText().equals(LT3))){
                 v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
               } else{
                  v=st.executeUpdate("update secure set level3='1' where account='"+jTextField1.getText()+"' ");
                }              System.out.println("L13 :"+L13);      
              }
            }else 
                
                if((L11.equals("1"))&&(L12.equals("0"))&&(L11.equals("1"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :1"+"L12 : 0"+"L13 :1");
                   System.out.println("L12 :"+L12);
             if((jComboBox1.getSelectedItem().equals("Level2"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r2))&&(jTextField3.getText().equals(LT2))){
                v=st.executeUpdate("update secure set level2='1'where account='"+jTextField1.getText()+"' ");
              } else{
                  v=st.executeUpdate("update secure set level2='1'where account='"+jTextField1.getText()+"' ");
              }        System.out.println("L12 :"+L12); 
            }
            }else
                    
                if((L11.equals("0"))&&(L12.equals("1"))&&(L11.equals("1"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :0"+"L12 : 1"+"L13 :1");
                   System.out.println("L12 :"+L12);
                 if((jComboBox1.getSelectedItem().equals("Level1"))){
              if((L1.equalsIgnoreCase(jPasswordField1.getText()))&&(jTextField2.getText().equals(r1))&&(jTextField3.getText().equals(LT1))){
                v=st.executeUpdate("update secure set level1='1'where account='"+jTextField1.getText()+"' ");
              } else{
                 v=st.executeUpdate("update secure set level1='1'where account='"+jTextField1.getText()+"' ");
              }         System.out.println("L11 :"+L11);        
            }
            }else
                    
                if((L11.equals("1"))&&(L12.equals("1"))&&(L11.equals("1"))){
                      System.out.println("Uname :"+jTextField1.getText()+"L11 :0"+"L12 : 1"+"L13 :1");
                   System.out.println("L12 :"+L12);
                
              v=st.executeUpdate("update secure set level1='0',level2='0',level3='0' where account='"+jTextField1.getText()+"' ");   
          
            } 
                  int f=0;
                  CompareTwoImages cti = new CompareTwoImages(jLabel8.getText(), ""+jTextField1.getText()+".jpg");
		cti.setParameters(10, 10);
		cti.compare();
		if (!cti.isIdentic()) {
			System.out.println("no match");
//                        f="Not Match";
                        f=0;
//			CompareTwoImages.saveJPG(cti.getImageResult(), "C:\\Users\\kava\\result.jpg");
		} else {
			System.out.println("Match");
                       // f="Match";
                          f=1;
                           v=st.executeUpdate("update register set rand='"+v1+"' where account='"+jTextField1.getText()+"' ");   
		}
               
            if((v==1)&&(f==1)){
               //  send(email, "Randon Access code :"+v1);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Login Successfully");
                Home1 rs11=new Home1(jTextField1.getText());
                rs11.setVisible(true);
            }else{
          
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Login Failed");
                Home rs11=new Home();
                rs11.setVisible(true);
            }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
           this.setVisible(false);
          Home rs11=new Home();
                rs11.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            String filepath=f.getPath();
            try{
                //        BufferedReader br=new BufferedReader(new FileReader(filepath));
                //        String s1="",s2="";
                //        while((s1=br.readLine())!=null){
                    //        s2+=s1+"\n";
                    //        }
                jLabel8.setText(filepath);
                ////        br.close();
            }catch (Exception ex) {ex.printStackTrace();  }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    public static void send(String sa,String  msg){  
          //Get properties object   
        final String from = "asvperumal@gmail.com";
		final String password = "Asvp@2300#20";
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(sa));    
           message.setSubject(msg);    
           message.setText(msg);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
