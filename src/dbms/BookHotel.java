/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import static dbms.BookHolidays.male1;
import static dbms.Main.hottab;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class BookHotel extends javax.swing.JFrame {

    /**
     * Creates new form BookHotel
     */
    int p;
    public BookHotel() {
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

        bg = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        Gname = new javax.swing.JTextField();
        male1 = new javax.swing.JRadioButton();
        Female1 = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        confirmbookbtn1 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        conblbl1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        G = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        C = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 153));
        jLabel62.setText("Guest Name:");
        jPanel6.add(jLabel62);
        jLabel62.setBounds(120, 70, 100, 17);

        Gname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel6.add(Gname);
        Gname.setBounds(250, 60, 166, 30);

        bg.add(male1);
        male1.setText("Male");
        jPanel6.add(male1);
        male1.setBounds(250, 110, 70, 23);

        bg.add(Female1);
        Female1.setText("Female");
        jPanel6.add(Female1);
        Female1.setBounds(340, 110, 80, 23);

        jLabel63.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 102));
        jLabel63.setText("Book a Room");
        jPanel6.add(jLabel63);
        jLabel63.setBounds(29, 14, 193, 26);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 153));
        jLabel64.setText("Gender:");
        jPanel6.add(jLabel64);
        jLabel64.setBounds(150, 110, 62, 17);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 153));
        jLabel65.setText("Identification Number:");
        jPanel6.add(jLabel65);
        jLabel65.setBounds(50, 170, 178, 17);

        ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel6.add(ID);
        ID.setBounds(250, 160, 166, 30);

        confirmbookbtn1.setBackground(new java.awt.Color(0, 0, 102));
        confirmbookbtn1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        confirmbookbtn1.setForeground(new java.awt.Color(255, 255, 255));
        confirmbookbtn1.setText("Confirm Booking");
        confirmbookbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbookbtn1ActionPerformed(evt);
            }
        });
        jPanel6.add(confirmbookbtn1);
        confirmbookbtn1.setBounds(50, 480, 190, 34);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 153));
        jLabel66.setText("Confirm Selection:");
        jPanel6.add(jLabel66);
        jLabel66.setBounds(70, 330, 146, 22);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 153));
        jLabel67.setText("Price/Day :");
        jPanel6.add(jLabel67);
        jLabel67.setBounds(100, 420, 85, 35);

        price1.setBackground(new java.awt.Color(102, 0, 102));
        price1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel6.add(price1);
        price1.setBounds(250, 420, 206, 30);

        conblbl1.setEditable(false);
        conblbl1.setColumns(20);
        conblbl1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        conblbl1.setRows(5);
        jScrollPane9.setViewportView(conblbl1);

        jPanel6.add(jScrollPane9);
        jScrollPane9.setBounds(240, 320, 226, 91);

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(270, 480, 158, 34);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Number of Guests in Room:");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(20, 240, 219, 22);

        jPanel6.add(G);
        G.setBounds(250, 240, 166, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Need Extra Bed:");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(90, 290, 126, 22);

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel6.add(C);
        C.setBounds(240, 290, 21, 21);

        jLabel4.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        jLabel4.setText("Identification Number can be aadhar number, ");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(50, 200, 259, 17);

        jLabel5.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        jLabel5.setText("Passport number or any other valid identity proof");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(50, 220, 275, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/blurred-hotel-reception_1203-2099.jpg"))); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmbookbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbookbtn1ActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        String modifiedDate= new SimpleDateFormat("dd-MM-yyyy").format(date);
        String da=String.valueOf(modifiedDate);
//        int g1=Integer.parseInt(Main.Guests);
        int i=0;
        String g;
        if((Gname.getText()!=null)&&(ID.getText()!=null)&&(bg.getSelection()!=null) ){
            if(male1.isSelected()){
               g="M"; 
            }
            else
                g="F";
            String td="IDNo="+ID.getText()+" "+" G="+g;
            int dialog=JOptionPane.showConfirmDialog(null, "Confirm your Booking?");
            if(dialog==JOptionPane.YES_OPTION){
                    try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Nasil Saniah","sahil123");
            String query="insert into booking(traveller_name,username,booking_date,traveller_details,hotel_id,BOOKING__DETAILS) values(?,?,?,?,?,?)";
            PreparedStatement stat=con.prepareStatement(query);
            stat.setString(1,Gname.getText());
            stat.setString(2,Login.n);
            stat.setString(3,da);
            stat.setString(4,td);
            stat.setString(5,Main.hotelid);
            stat.setString(6,conblbl1.getText());
            ResultSet res=stat.executeQuery();
            JOptionPane.showMessageDialog(null,"Booking Done!");
            String query2="Select hotel_name,available_rooms,price_perday,extra_bed_price,number_of_adults_in_room,DESCRIPTION,city from hotel where available_rooms>0";
            PreparedStatement stat2=con.prepareStatement(query2);
            ResultSet res2=stat2.executeQuery();
            hottab.setModel(DbUtils.resultSetToTableModel(res2));  
            String query1 = "{call PROC()}"; 
            CallableStatement statement = con.prepareCall(query1);    
            statement.execute(); 
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class not found ");
        } catch (SQLException ex) {
               Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
            
            
        
        else
        JOptionPane.showMessageDialog(null, "Fields are empty");
        }
    }//GEN-LAST:event_confirmbookbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conblbl1.setText("Hotel Name- "+Main.Hotelname+"\n"+"City- "+Main.City+"\n"+"Description- "+Main.Description+"\n");
         p=Integer.parseInt(Main.hotprice);
        price1.setText(String.valueOf(p));
        int nog=Integer.parseInt(Main.Guests);
        for(int i=1;i<=nog;i++){
            G.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_formWindowOpened

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        if(C.isSelected()){
           int s=Integer.valueOf(Main.bed);
           int t=p+s;
           price1.setText(String.valueOf(t));
           conblbl1.setText(conblbl1.getText()+"Extra bed required");
        }
    }//GEN-LAST:event_CActionPerformed

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
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C;
    public static javax.swing.JRadioButton Female1;
    private javax.swing.JComboBox<String> G;
    private javax.swing.JTextField Gname;
    private javax.swing.JTextField ID;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JTextArea conblbl1;
    private javax.swing.JButton confirmbookbtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    public static javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JRadioButton male1;
    private javax.swing.JLabel price1;
    // End of variables declaration//GEN-END:variables
}