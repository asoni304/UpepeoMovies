//JEAN ANDERSON OWINO
//JAVA PROJECT SUBMISSION ON DATE 03/06/2021
//J17/3671/2019
package upepeopanel;



import java.awt.event.*; 
import net.proteanit.sql.DbUtils;
import java.awt.*; 
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; 
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
class Upepeopanel extends Frame { 

	// introduction page
	 Frame f;
	 JLabel l;
        JPanel p;
         JButton buttonadmin,buttonmember;
      
         //shared
    Font f1,f2,f3,f4,f5; 
DateTimeFormatter dtf;

//member    login    page    
    JFrame login3;
JPanel p3;
JTextField txtmemberid3;
JPasswordField enterpass3;
JLabel loginpage3,lmemberid3,lenterpass3;
JButton btnlogin3;
JCheckBox rememberme3;
    
  //member borrow movie page
JFrame fmembersearch;
JPanel pmembs,pmembsa;
JTable cartoontable,thrillertable,comedytable,horrortable,generaltable;

JTextField mtxtmember,mtxtmovieid,mtxtmovietitle,mtxtdate;

JLabel llmember,llmovieid,llmovietitle,lldate,llcartoon,llhorror,llcomedy,llthriller,llgeneral;
JButton bborrow,bbsearcht,bbsearchh,bbsearchco,bbsearchca,bbsearchg;

    
    
   //admin login page
        JFrame login2;
JPanel p2;
JTextField TXTADMIN;
JPasswordField enterpass2;
JLabel loginpage2,LADMIN,lenterpass2;
JButton btnlogin2;
JCheckBox rememberme2;

       //admin main page
JFrame adminmain;
JButton directtoadd,baddnewmember;
JPanel ppanel,ppanel2,ppanel3;
JTable tablememberpasswords,tablememberdetails,tablerecord,tablemoney,tablepermanentrecords;
JButton btnshowmemberdetails,btnshowmovies,btndeleterecords,btnsystemdate,btnsystemdate2,btnupdate,bsearch,btnupdatepay,bgetfine,bgettotal;
JLabel lborrowed,lborrowedid,ldob,ldor,lcondition,labelmemberid,ldaysoverdue,lfine,ltotalfine,lfeecharge,ltotal,lchoosegenre2;
JTextField tborrowedid,tdob,tdor,textmemberid,textdaysoverdue,textfine,texttotalfine,textfeecharge,texttotal;
JRadioButton rb3days,rb3daysplus,rblost,thriller,comedy,cartoon,general,horror;

JComboBox chcondition;

//register new members page

JFrame fregister;
JPanel combi;
 JLabel lname,lmeb,lid,laddr,locc,ldoj,lorganization,lstatus,lwelcome,lemail,lcontact;
    JTextField txtname,txtmeb,txtid,txtaddr,txtocc,txtdoj,txtstatus,txtemail,txtcontact;
    JRadioButton btnpaid,btnnotpaid;
    JTextArea  printid;
    JButton btnprint,btngenerate,btnreset,btnshow,btnregister,btnadmin,btnmember;
    
    SimpleDateFormat formatter;
    Date date;
    
    //create password page
    JFrame create;
JPanel p5;
JLabel createpage,meb,pass,confirm;
JTextField tmeb;
JPasswordField tpass,tconfirm;
JButton tsave,cancel;

   //reportpage
JFrame freport;
JPanel preport;
JTextField textsum;
JButton btgetreport;
  
//add movie page
    JFrame adminfunctions;
JButton btncomedy,btnthriller,btncartoon,btnhorror,btngeneral,btndelete;

JLabel laddmovieg,lmovieid,lmovietitle;
JPanel panel;
JTextField tmovieid,tmovietitle;

//admin see movie collection page
 JFrame ftables2;
    JPanel ptables2;
JLabel ldate2,lcartoon2,lhorror2,lcomedy2,lthriller2,lgeneral2;
JTable cartoontable2,thrillertable2,comedytable2,horrortable2,generaltable2;


UIManager UI;

        
        
        Upepeopanel(){
            //introduction page
          UI= new UIManager();
          UI.put("OptionPane.background", new ColorUIResource(Color.ORANGE));
           UI.put("Panel.background", new ColorUIResource(Color.ORANGE));
          UI.put("OptionPane.buttonFont", new FontUIResource(new Font("Arial",Font.BOLD,9)));
           UI.put("OptionPane.messageForeground", new ColorUIResource(Color.BLUE));
          UI.put("OptionPane.messageFont", new FontUIResource(new Font("Monospaced",Font.ROMAN_BASELINE,13)));
       UI.put("OptionPane.buttonColor", new ColorUIResource(Color.BLUE));
          
            
            //define frame,define jbutton,jlabel,font,jpanel
            f= new Frame("Upepeo Videos");
            f.setLocation(320, 10);
            f.setCursor(Cursor.HAND_CURSOR);
            
                f1 = new Font("DialogInput", Font.BOLD, 30);
     f2 = new Font("SansSerif", Font.ITALIC, 14);
     f3 = new Font("Monospaced", Font.BOLD + Font.ITALIC, 18); 
     f4 = new Font("Monospaced", Font.BOLD, 12);
            
             f3 = new Font("Monospaced", Font.BOLD + Font.ITALIC, 60);
             f5 = new Font("serif", Font.BOLD + Font.ITALIC, 22);
             
             buttonadmin= new JButton("ADMIN");
             buttonadmin.setBounds(150, 700, 100, 30);
             buttonadmin.setBackground(Color.orange);
             buttonadmin.setForeground(Color.BLUE);
             
               buttonmember= new JButton("MEMBER");
             buttonmember.setBounds(500, 700, 100, 30);
             buttonmember.setBackground(Color.orange);
             buttonmember.setForeground(Color.blue);
           
            l= new JLabel("UPEPEO MOVIES");
            
            l.setBounds(180, 400, 550, 50);
            l.setFont(f3);
            l.setForeground(Color.ORANGE);
            
            //add components to introduction frame
            f.add(l);
            f.add(buttonadmin);
            f.add(buttonmember);
            f.setLayout(null);
            f.show();
            f.setVisible(true);
            f.setResizable(false);
            f.setBackground(Color.BLUE);
            f.setSize(800, 800);
              f.addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
            
             
             //member login page
       login3=new JFrame("UPEPEO MEMBER LOGIN");
login3.setLocation(320, 50);
login3.setCursor(Cursor.HAND_CURSOR);

p3= new JPanel();
p3.setBounds(0, 0, 500, 350);
p3.setBackground(Color.BLUE);
p3.setLayout(null);

loginpage3= new JLabel("UPEPEO MEMBER LOGIN");
loginpage3.setBounds(50,50,300,20);
loginpage3.setFont(f5);
loginpage3.setForeground(Color.orange);
p3.add(loginpage3);

lmemberid3 = new JLabel("Member ID");
lmemberid3.setBounds(50,100,100,20);
lmemberid3.setFont(f4);
lmemberid3.setForeground(Color.orange);
txtmemberid3= new JTextField();
txtmemberid3.setBounds(120, 100, 150, 20);
txtmemberid3.setBackground(Color.ORANGE);
txtmemberid3.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

lenterpass3= new JLabel("Password");
lenterpass3.setBounds(50,150,100,20);
lenterpass3.setFont(f4);
lenterpass3.setForeground(Color.orange);
enterpass3= new JPasswordField();
enterpass3.setBounds(120, 150, 150, 20);
enterpass3.setBackground(Color.ORANGE);
enterpass3.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));


btnlogin3= new JButton("LOGIN NOW >");
btnlogin3.setBounds(150, 250, 150, 30);
btnlogin3.setBackground(Color.ORANGE);
btnlogin3.setForeground(Color.BLUE);
btnlogin3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

 btnlogin3.addActionListener((ActionEvent e) -> {
      
             String sql= "select * from password where memberid = ? and newpassword = ?";
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, txtmemberid3.getText());
                     sam.setString(2, new String (enterpass3.getPassword()));
                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                         JOptionPane.showMessageDialog(null, "WELCOME MEMBER" + " " + txtmemberid3.getText() , "SUCCESSFUL LOGIN!",JOptionPane.PLAIN_MESSAGE);
                         fmembersearch.setVisible(true);
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "INVALID memberid/password"  , "UNSUCCESSFUL LOGIN!",JOptionPane.ERROR_MESSAGE);
                          enterpass3.setText("");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
          mtxtmember.setText(txtmemberid3.getText());
    } 

    ); 
        

p3.add(loginpage3);
p3.add(lmemberid3);
p3.add(txtmemberid3);
p3.add(lenterpass3);
p3.add(enterpass3);

p3.add(btnlogin3);

login3.add(p3);

        login3.setResizable(false);
         login3.setSize(500, 350); 
        login3.setLayout(null);
        login3.setVisible(false); 
        login3.setBackground(Color.RED);
        login3.addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
//member button pressed opens the login member page and closes the introduction page
  buttonmember.addActionListener((ActionEvent e) -> {
      
          login3.setVisible(true);
          f.setVisible(false);
          
    } 

    ); 
            
            
            
            
            
            //admin login page 
               f1 = new Font("DialogInput", Font.BOLD, 30);
     f2 = new Font("SansSerif", Font.ITALIC, 14);
     f3 = new Font("Monospaced", Font.BOLD + Font.ITALIC, 18); 
     f4 = new Font("Monospaced", Font.BOLD, 12);
login2=new JFrame("UPEPEO ADMIN LOGIN");
login2.setLocation(320,100);
login2.setCursor(Cursor.HAND_CURSOR);

p2= new JPanel();
p2.setBounds(0, 0, 500, 350);
p2.setBackground(Color.blue);
p2.setLayout(null);

loginpage2= new JLabel("UPEPEO ADMIN LOGIN");
loginpage2.setBounds(150,50,250,20);
loginpage2.setFont(f3);
loginpage2.setForeground(Color.ORANGE);

LADMIN = new JLabel("USER");
LADMIN.setBounds(50,100,100,20);
LADMIN.setFont(f4);
LADMIN.setForeground(Color.ORANGE);
TXTADMIN= new JTextField("1234");
TXTADMIN.setBounds(120, 100, 150, 20);
TXTADMIN.setBackground(Color.ORANGE);
TXTADMIN.setEditable(false);


lenterpass2= new JLabel("Password");
lenterpass2.setBounds(50,150,100,20);
lenterpass2.setFont(f4);
lenterpass2.setForeground(Color.ORANGE);
enterpass2= new JPasswordField();
enterpass2.setBounds(120, 150, 150, 20);
enterpass2.setBackground(Color.ORANGE);
enterpass2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));


rememberme2= new JCheckBox("Remember me");
rememberme2.setBounds(100,200,150,20);
rememberme2.setBackground(Color.blue);
rememberme2.setForeground(Color.orange);

btnlogin2= new JButton("LOGIN NOW >");
btnlogin2.setBounds(150, 250, 150, 30);
btnlogin2.setBackground(Color.ORANGE);
btnlogin2.setForeground(Color.BLUE);


 btnlogin2.addActionListener((ActionEvent e) -> {
      
             String sql= "select * from password where memberid = ? and newpassword = ?";
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, TXTADMIN.getText());
                     sam.setString(2, new String (enterpass2.getPassword()));
                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                         JOptionPane.showMessageDialog(null, "WELCOME ADMIN"  , "SUCCESSFUL LOGIN!",JOptionPane.PLAIN_MESSAGE);
                         adminmain.setVisible(true);
                         login2.setVisible(false);
                         enterpass2.setText("");
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "INVALID PASSWORD"  , "UNSUCCESSFUL LOGIN!",JOptionPane.ERROR_MESSAGE);
                          adminmain.setVisible(false);
                          enterpass2.setText("");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
          
    } 

    ); 
 
p2.add(loginpage2);
p2.add(LADMIN);
p2.add(TXTADMIN);
p2.add(lenterpass2);
p2.add(enterpass2);
p2.add(rememberme2);
p2.add(btnlogin2);

login2.add(p2);
login2.setVisible(false);

         login2.setSize(500, 350); 
        login2.setLayout(null);
        login2.setResizable(false);
        login2.addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
        
//admin button on mainscreen pressed shows admin login page and closes introduction page
        buttonadmin.addActionListener((ActionEvent e) -> {
      
          login2.setVisible(true);
          f.setVisible(false);
          
    } 

    ); 

        //admin main screen
        
            adminmain=new JFrame("ADMIN MAIN PAGE");
            adminmain.setCursor(Cursor.HAND_CURSOR);
             adminmain.addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
    
 ppanel= new JPanel();
ppanel.setBounds(0, 0, 500, 1000);
ppanel.setBackground(Color.BLUE);
ppanel.setLayout(null);
ppanel.hide();


baddnewmember= new JButton("ADD NEW");
baddnewmember.setBackground(Color.orange);
baddnewmember.setForeground(Color.BLUE);
baddnewmember.setBounds(30, 120, 100, 30);

ppanel2= new JPanel();
ppanel2.setBounds(500, 0, 450, 1000);
ppanel2.setBackground(Color.ORANGE);
ppanel2.setLayout(null);

ppanel3= new JPanel();
ppanel3.setBounds(900, 0, 450, 1000);
ppanel3.setBackground(Color.BLUE);
ppanel3.setLayout(null);

Object[] rowdetails = new String[9];
  
Object [] columndetails= { "Name", "NATIONAL ID", "ADDRESS"," OCCUPATION"," DATE JOINED","EMAIL" ,"CONTACT ","MEMBERSHIP NO.","PAYMENT"}; 
                
DefaultTableModel konde = new DefaultTableModel(columndetails,0);
tablememberdetails= new JTable(konde);
tablememberdetails.setLayout(null);
tablememberdetails.setLocation(700,400);
tablememberdetails.setSize(600, 350);
tablememberdetails.setForeground(Color.RED);
tablememberdetails.setBackground(Color.GREEN);
tablememberdetails.setVisible(true);
               
 JScrollPane mf = new JScrollPane(tablememberdetails);
mf.setBounds(10, 10, 480, 100); 
 ppanel.add(mf); 
 ppanel.add(baddnewmember);
 
 
 
 Object[] rowpassword = new String[3];
Object [] columnpassword = { "MEMBERID", "PASSWORD", "CONFIRMPASSWORD"};
DefaultTableModel chibu = new DefaultTableModel(columnpassword,0);
tablememberpasswords= new JTable(chibu);
 tablememberpasswords.setLayout(null);
tablememberpasswords.setLocation(700,400);
 tablememberpasswords.setSize(600, 350);
 tablememberpasswords.setForeground(Color.RED);
 tablememberpasswords.setBackground(Color.GREEN);
 tablememberpasswords.setVisible(true);
               
JScrollPane ku = new JScrollPane(tablememberpasswords);
ku.setBounds(10, 220, 350, 100);
ppanel.add(ku); 

Object[] rowrecords = new String[5];
Object [] columnrecords = { "MEMBERID", "MOVIE ID", "BORROW DATE","RETURN DATE","CONDITION"};
DefaultTableModel jirani = new DefaultTableModel(columnrecords,0);
tablerecord= new JTable(jirani);
 tablerecord.setLayout(null);
tablerecord.setLocation(700,400);
 tablerecord.setSize(600, 350);
 tablerecord.setForeground(Color.RED);
 tablerecord.setBackground(Color.GREEN);
 tablerecord.setVisible(true);
               
JScrollPane ay= new JScrollPane(tablerecord);
ay.setBounds(10, 400, 480, 100);
ppanel.add(ay); 


Object[] rowprecords = new String[5];
Object [] columnprecords = { "MEMBERID", "MOVIE ID", "BORROW DATE","RETURN DATE","CONDITION"};
DefaultTableModel jiranip = new DefaultTableModel(columnprecords,0);
tablepermanentrecords= new JTable(jiranip);
 tablepermanentrecords.setLayout(null);
tablepermanentrecords.setLocation(700,400);
 tablepermanentrecords.setSize(600, 350);
 tablepermanentrecords.setForeground(Color.RED);
 tablepermanentrecords.setBackground(Color.GREEN);
 tablepermanentrecords.setVisible(true);
               
JScrollPane ayp= new JScrollPane(tablepermanentrecords);
ayp.setBounds(10, 620, 480, 100);
ppanel.add(ayp); 




                 
 
        
        
         btnshowmemberdetails= new JButton("MEMBERS");
        btnshowmemberdetails.setBounds(10, 10, 120, 30);
        btnshowmemberdetails.setBackground(Color.BLACK);
        btnshowmemberdetails.setForeground(Color.GREEN);
        
         btnshowmemberdetails.addActionListener((ActionEvent e) -> {
                                        
            ppanel.show();
            
            
                   }); 
        
          btnshowmovies= new JButton("ADD MOVIE");
        btnshowmovies.setBounds(150, 10, 120, 30);
         btnshowmovies.setBackground(Color.BLACK);
        btnshowmovies.setForeground(Color.GREEN);
        
        btndeleterecords= new JButton("AVAIL MOVIE");
        btndeleterecords.setBounds(290, 10, 150, 30);
         btndeleterecords.setBackground(Color.BLACK);
        btndeleterecords.setForeground(Color.GREEN);
        
         btnsystemdate= new JButton("GET");
        btnsystemdate.setBounds(310, 200, 70, 20);
         btnsystemdate.setBackground(Color.BLACK);
        btnsystemdate.setForeground(Color.GREEN);
        
            bsearch= new JButton("Search");
        bsearch.setBounds(330, 100, 100, 30);
         bsearch.setBackground(Color.BLACK);
        bsearch.setForeground(Color.GREEN);
        
         bsearch.addActionListener((ActionEvent e) -> {
      
                 
             String sql= "select * from recorddd where movieid = ? ";
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, tborrowedid.getText());

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        textmemberid.setText(rs.getString("memberid"));
                         tdob.setText(rs.getString("dateofborrow"));
                          tdor.setText(rs.getString("dateofreturn"));
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "Record not found!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
          
    } 

    ); 
        
        
        SimpleDateFormat formatte= new SimpleDateFormat("yyyy-MM-dd ");
     Date firstdate = new Date();
     Date seconddate= new Date();
        
         btnsystemdate.addActionListener((ActionEvent e) -> {
      
                 tdob.setText(formatte.format(firstdate));
          
    } 

    ); 
        
         btnsystemdate2= new JButton("GET");
        btnsystemdate2.setBounds(310, 250, 70, 20);
         btnsystemdate2.setBackground(Color.BLACK);
        btnsystemdate2.setForeground(Color.GREEN);
        
         btnupdate= new JButton("UPDATE");
        btnupdate.setBounds(310, 300, 100, 20);
         btnupdate.setBackground(Color.BLACK);
        btnupdate.setForeground(Color.GREEN);
        
        Object[] rowmoney = new String[3];
  
Object [] columnmoney= { "Member ID"," Movie id", "Payment", "Date"}; 
                
DefaultTableModel ason = new DefaultTableModel(columnmoney,0);
tablemoney= new JTable(ason);
tablemoney.setLayout(null);
tablemoney.setLocation(700,400);
tablemoney.setSize(600, 350);
tablemoney.setForeground(Color.RED);
tablemoney.setBackground(Color.GREEN);
tablemoney.setVisible(true);
               
 JScrollPane as = new JScrollPane(tablemoney);
as.setBounds(100, 30, 300, 100); 
 ppanel3.add(as); 
        
          
       

    
        
        
         btnupdate.addActionListener((ActionEvent e) -> {
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                       String sql= "update  permanentrecords set memberid = ? ,dateofborrow = ?,  dateofreturn = ?, conditionreturned = ? where movieid = ?";
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setInt(1,Integer.parseInt( textmemberid.getText()));                      
                       sam.setString(2, tdob.getText());
                        sam.setString(3, tdor.getText());
                        sam.setString(4, (String) chcondition.getSelectedItem());
                     sam.setInt(5,Integer.parseInt( tborrowedid.getText()));
                        sam.executeUpdate();
                        
                      JOptionPane.showMessageDialog(null, "Permanent updated successfully!");
                   
                    
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
      
                 try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                       String sql= "update  recorddd set memberid = ? ,dateofborrow = ?,  dateofreturn = ?, conditionreturned = ? where movieid = ?";
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setInt(1,Integer.parseInt( textmemberid.getText()));                      
                       sam.setString(2, tdob.getText());
                        sam.setString(3, tdor.getText());
                        sam.setString(4, (String) chcondition.getSelectedItem());
                     sam.setInt(5,Integer.parseInt( tborrowedid.getText()));
                        sam.executeUpdate();
                        
                      JOptionPane.showMessageDialog(null, "Record updated successfully!");
                   
                    
                     conn.close();
                     textmemberid.setText("");
                     tborrowedid.setText("");
                     tdob.setText("");
                     tdor.setText("");
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
    } 

    ); 
        
          btnsystemdate2.addActionListener((ActionEvent e) -> {
      
                 tdor.setText(formatte.format(seconddate));
          
    } 

    ); 
        
        
        
        
         lborrowed= new JLabel("KEEP TAB");
        lborrowed.setBounds(150,70, 100, 20);
        lborrowed.setForeground(Color.RED);
        
        labelmemberid= new JLabel("MEMBER ID");
        labelmemberid.setBounds(10,100,150,20);
        labelmemberid.setForeground(Color.BLUE);
        textmemberid= new JTextField();
         textmemberid.setBounds(100,100,200,30);
         textmemberid.setBackground(Color.RED);
        
        lborrowedid= new JLabel("MOVIE ID");
        lborrowedid.setBounds(10,150,150,20);
        lborrowedid.setForeground(Color.BLUE);
        tborrowedid= new JTextField();
         tborrowedid.setBounds(100,150,200,30);
         tborrowedid.setBackground(Color.RED);
         
         
         ldob= new JLabel("DATE borrowed");
        ldob.setBounds(10,200,150,20);
        ldob.setForeground(Color.BLUE);
        tdob= new JTextField();
         tdob.setBounds(100,200,200,30);
         tdob.setBackground(Color.CYAN);
         
         ldor= new JLabel("DATE returned");
        ldor.setBounds(10,250,150,20);
        ldor.setForeground(Color.BLUE);
        tdor= new JTextField();
         tdor.setBounds(100,250,200,30);
         tdor.setBackground(Color.CYAN);
         
         lcondition= new JLabel("condition returned");
         lcondition.setBounds(10,330,200,10);
         
         String payment[] = { " ", "GOOD", "SPOILT", "LOST" }; 
 
        chcondition = new JComboBox(payment);
        chcondition.setBounds(10, 350, 90, 20);
        chcondition.setBackground(Color.ORANGE);
        chcondition.setForeground(Color.BLACK);
        chcondition.setFont(f4);
        chcondition.setEnabled(true);
         
         
         rb3days= new JRadioButton("in 3 days");
         rb3days.setBounds(10,440,90,20);
         rb3days.setBackground(Color.BLACK);
         rb3days.setForeground(Color.ORANGE);
         
         
         rb3daysplus= new JRadioButton("3 days+");
         rb3daysplus.setBounds(10,460,90,20);
         rb3daysplus.setBackground(Color.BLACK);
         rb3daysplus.setForeground(Color.ORANGE);
         
         
        
          ButtonGroup aj= new ButtonGroup();
         aj.add(rb3days);
         aj.add(rb3daysplus);
         aj.add(rblost);
         
          lchoosegenre2 = new JLabel( "Choose genre"); 
       lchoosegenre2.setBounds(150, 330, 150, 20); 
         
         thriller = new JRadioButton("Thriller");
        thriller.setBounds(120, 350, 100, 20);
        thriller.setBackground(Color.BLACK);
        thriller.setForeground(Color.ORANGE);
                       
        cartoon = new JRadioButton("Cartoon");
        cartoon.setBounds(120, 370, 100, 20);
        cartoon.setBackground(Color.black);
        cartoon.setForeground(Color.ORANGE);
        
       
        horror = new JRadioButton("Horror");
        horror.setBounds(240, 350, 100, 20);
        horror.setBackground(Color.black);
        horror.setForeground(Color.ORANGE);
        
        
        general= new JRadioButton("General");
        general.setBounds(240, 370, 100, 20);
        general.setBackground(Color.black);
        general.setForeground(Color.ORANGE);
        
       
        comedy= new JRadioButton("Comedy");
        comedy.setBounds(120, 390, 100, 20);
        comedy.setBackground(Color.black);
        comedy.setForeground(Color.ORANGE);
        
        JButton bcollection= new JButton("movies");
        bcollection.setBounds(350, 350, 80, 20);
        bcollection.setBackground(Color.blue);
        bcollection.setForeground(Color.black);
        ppanel2.add(bcollection);
        
        bcollection.addActionListener((ActionEvent->{
            ftables2.setVisible(true);
        }
        ));
        
         ButtonGroup bo= new ButtonGroup();
         bo.add(cartoon);
         bo.add(general);
         bo.add(horror);
         bo.add(thriller);
         bo.add(comedy);
       
        

         
          btndeleterecords.addActionListener((ActionEvent e) ->{
               try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from recorddd where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tborrowedid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"MOVIE AVAILABLE FOR SELECTION");
             
                   connn.close();
                   textmemberid.setText(" ")  ;
                     tborrowedid.setText(" ")  ;
                      tdob.setText(" ")  ;
                     tdor.setText(" ")  ;
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "FAILED1!");
                        }
              
                });
          
          btnsystemdate2.addActionListener((ActionEvent e) -> {
          
             
             String qual = " ";
             String qual2 =" ";
             String qual3 = " ";
            
            
             if (rb3days.isSelected()) {
 
             if (thriller.isSelected()) {
                 
                 qual = "0";
                 textfine.setText(qual);
                 qual2="60";
                 textfeecharge.setText(qual2);
                 qual3=" 0";
                 textdaysoverdue.setText(qual3);
             }
             
             else if (cartoon.isSelected()) {
                 qual = "0";
                 textfine.setText(qual);
                 qual2="80";
                 textfeecharge.setText(qual2);
                 qual3=" 0";
                 textdaysoverdue.setText(qual3);
                 
             }
             else if (comedy.isSelected()) {
                 qual = "0";
                 textfine.setText(qual);
                 qual2="70";
                 textfeecharge.setText(qual2);
                 qual3=" 0";
                 textdaysoverdue.setText(qual3);
                 
             }
             else if (horror.isSelected()) {
                 qual = "0";
                 textfine.setText(qual);
                 qual2="40";
                 textfeecharge.setText(qual2);
                 qual3=" 0";
                 textdaysoverdue.setText(qual3);
             }
             else if (general.isSelected()) {
                qual = "0";
                 textfine.setText(qual);
                 qual2="50";
                 textfeecharge.setText(qual2); 
                 qual3=" 0";
                 textdaysoverdue.setText(qual3);
                 
             }
             
 
             }       
            
    } 

    ); 
          
             ldaysoverdue= new JLabel("Days overdue");
        ldaysoverdue.setBounds(10,500,150,20);
        ldaysoverdue.setForeground(Color.BLUE);
        textdaysoverdue= new JTextField();
         textdaysoverdue.setBounds(100,500,50,30);
         textdaysoverdue.setBackground(Color.RED);
         
         
           btnsystemdate2.addActionListener((ActionEvent e) -> {
          
             
             String qual = " ";
             String qual2 ="0";
 
             if(rb3daysplus.isSelected()){
                   if (thriller.isSelected()) {
                 
                 qual = "36";
                 textfine.setText(qual);
                 qual2="60";
                 textfeecharge.setText(qual2);
             }
             
             else if (cartoon.isSelected()) {
                 qual = "48";
                 textfine.setText(qual);
                 qual2="80";
                 textfeecharge.setText(qual2);
                 
             }
             else if (comedy.isSelected()) {
                 qual = "42";
                 textfine.setText(qual);
                 qual2="70";
                 textfeecharge.setText(qual2);
                 
             }
             else if (horror.isSelected()) {
                 qual = "24";
                 textfine.setText(qual);
                 qual2="40";
                 textfeecharge.setText(qual2);
             }
             else if (general.isSelected()) {
                qual = "30";
                 textfine.setText(qual);
                 qual2="50";
                 textfeecharge.setText(qual2); 
                 
             }
             
             else  {
                 textfine.setText("0");
                 
                 textfeecharge.setText("0"); 
                 
             }
             }
             
             
          long diff =seconddate.getTime() - firstdate.getTime();
            
            TimeUnit time =TimeUnit.DAYS;
            int difference = (int) time.convert(diff, time.MILLISECONDS);
            textdaysoverdue.setText(Integer.toString(difference)); 
            
             
                   
            
    } 

    ); 
          
     
        
        lfine= new JLabel("Fine/day");
        lfine.setBounds(200,500,150,20);
        lfine.setForeground(Color.BLUE);
        textfine= new JTextField();
         textfine.setBounds(290,500,50,30);
         textfine.setBackground(Color.RED);
         textfine.setEditable(false);
         
         
         ltotalfine= new JLabel("Total fine");
        ltotalfine.setBounds(10,550,150,20);
        ltotalfine.setForeground(Color.BLUE);
        texttotalfine= new JTextField();
         texttotalfine.setBounds(100,550,50,30);
         texttotalfine.setBackground(Color.CYAN);
         texttotalfine.setEditable(true);
         
         lfeecharge= new JLabel("Normal fee");
        lfeecharge.setBounds(200,550,150,20);
        lfeecharge.setForeground(Color.BLUE);
        textfeecharge= new JTextField();
         textfeecharge.setBounds(290,550,50,30);
         textfeecharge.setBackground(Color.CYAN);
         textfeecharge.setEditable(false);
         
         ltotal= new JLabel("TOTAL");
        ltotal.setBounds(150,600,150,20);
        ltotal.setForeground(Color.BLUE);
        texttotal= new JTextField();
         texttotal.setBounds(210,600,100,30);
         texttotal.setBackground(Color.WHITE);
         texttotal.setForeground(Color.RED);
         texttotal.setEditable(false);
                 
          bgetfine= new JButton("Fine calc");
         bgetfine.setBounds(100, 650, 130, 30);
         bgetfine.setBackground(Color.GREEN);
         bgetfine.setForeground(Color.black);
         
         bgettotal= new JButton("Total calc");
         bgettotal.setBounds(280, 650, 130, 30);
         bgettotal.setBackground(Color.GREEN);
         bgettotal.setForeground(Color.black);
         
          btnupdatepay= new JButton("Pay Update");
         btnupdatepay.setBounds(100, 180, 130, 20);
         btnupdatepay.setBackground(Color.RED);
         btnupdatepay.setForeground(Color.black);
         
         JButton buttongenerate= new JButton("REPORT");
         buttongenerate.setBounds(70, 250, 100, 20);
         buttongenerate.setBackground(Color.black);
         buttongenerate.setForeground(Color.green);
         ppanel3.add(buttongenerate);
         
         JButton buttonprint= new JButton("PRINT");
         buttonprint.setBounds(200, 250, 100, 20);
         buttonprint.setBackground(Color.black);
         buttonprint.setForeground(Color.green);
         ppanel3.add(buttonprint);
                 
                 JButton buttonclear= new JButton("CLEAR");
         buttonclear.setBounds(320, 250, 100, 20);
         buttonclear.setBackground(Color.black);
         buttonclear.setForeground(Color.green);
         ppanel3.add(buttonclear);
         
         
        
         JTextArea report = new JTextArea();
         report.setBounds(60,300,380,250);
         report.setEditable(false);
         report.setBackground(Color.ORANGE);
         report.setFont(f4);
         ppanel3.add(report);
         
          buttonclear.addActionListener((ActionEvent->{
             report.setText(" ");
         }));
         buttonprint.addActionListener((ActionEvent e) -> {
            try {
                report.print();
            }
            catch (java.awt.print
                    .PrinterException a) {
                System.err.format(
                        "NoPrinter Found",
                        a.getMessage());
            }
        }); 
          // Generating the receipt 
        buttongenerate.addActionListener((ActionEvent e) -> {
            report.setText( 
                    "-------------"
                            + "-----UPEPEO REPORT----"
                            + "--------------------------"
                            + "--------------------------"
                            + "-------------------\n");
                             
                            
            
            
            report.setText(report.getText()
                    + "Member"
                    + " "
                    + textmemberid.getText()
                    + " ");
            report.setText(report.getText()
                    + "paid"
                    + " "
                    + texttotal.getText()
                    + "/-"
                    + " ");
            report.setText(report.getText()
                    + "on"
                    + " "
                    + tdor.getText()
                    + " ");
            report.setText(report.getText()
                    + "for movie"
                    + "\n "
                    + tborrowedid.getText()
                    + " ");
            report.setText(report.getText()
                    + "issued out on"
                    + " "
                    + tdob.getText()                          
                    + " ");
            report.setText(report.getText()
                    + "and returned on"
                    + "\n "
                    + tdor.getText()
                    + " ");
            
            report.setText(report.getText()
                    + "in"
                    + " "
                    + ((String)chcondition.getSelectedItem())
                    + " "
                    + "condition."
                     + "\n");
            
            report.setText(report.getText()
                    + "inclusive of"
                    + "\n"
                    +"NORMAL FEE:"
                    + textfeecharge.getText() 
                    + "/- "
                    + "\n");
            report.setText(report.getText()
                    + "FINE:"
                    + texttotalfine.getText()
                    + "/- "
                    + "\n");
            report.setText(report.getText()
                    + "DAYS OVERDUE:"
                    + textdaysoverdue.getText()             
                    + "\n");
            
                   
                   
      
            
            if (e.getSource() == buttongenerate) {
                try {
                    try (FileWriter fw = new FileWriter(
                            "java.txt", true)) {
                        fw.write(report.getText());
                    }
                }
                catch (IOException ae) {
                    System.out.println(ae);
                }
            }
            
            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO individualreport (thereport)VALUES(?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,report.getText());
                    
                     
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"MOVIE REPORT SAVED");
             
                      pstmt.close();
                   connn.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "MONTHLY REPORT NOT SAVED!");
                        }
              
                    
        }); 
         
       JButton  btnexit= new JButton("EXIT");
         btnexit.setBounds(300, 700, 130, 20);
         btnexit.setBackground(Color.RED);
         btnexit.setForeground(Color.black);
         
          JButton  btnreportpage= new JButton("REPORTPAGE");
         btnreportpage.setBounds(70, 700, 150, 20);
         btnreportpage.setBackground(Color.RED);
         btnreportpage.setForeground(Color.black);
         
         ppanel3.add(btnreportpage);
         
         btnreportpage.addActionListener((ActionEvent e)->{
             
            freport.setVisible(true);
            
             
         });
         
          btnexit.addActionListener((ActionEvent e)->{
             
            f.setVisible(true);
            adminmain.setVisible(false);
             
         });
         
         bgetfine.addActionListener((ActionEvent e)->{
             
             int c = Integer.parseInt(textdaysoverdue.getText());
              int d=Integer.parseInt(textfine.getText());
              
              
              String answer = String.valueOf(c * d);
              
              texttotalfine.setText(answer);
             
         });
         
          bgettotal.addActionListener((ActionEvent e)->{
              
              int a = Integer.parseInt(texttotalfine.getText());
              int b=Integer.parseInt(textfeecharge.getText());
              
              
              String answer = String.valueOf(a + b);
              
              texttotal.setText(answer);
             
         });
         
          btnupdatepay.addActionListener((ActionEvent e) ->{
              
               try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO paymentrecords (memberid,movieid,payment,dateofpay)VALUES(?,?,?,?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,textmemberid.getText());
                     pstmt.setString(2, tborrowedid.getText());
                     pstmt.setString(3, (texttotal.getText()));
                     pstmt.setString(4, tdor.getText());
                     
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"PAYMENT RECORDED!");
             
                      pstmt.close();
                   connn.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "PAYMENT NOT RECORDED!");
                        }
              
                    
                     
                     aj.clearSelection();
                     bo.clearSelection();
                     texttotal.setText("");
                    textdaysoverdue.setText("");
                    texttotalfine.setText("");
                    textfine.setText("");
                    textfeecharge.setText("");
                    
                });
          
         ppanel3.add(btnupdatepay);
          ppanel3.add(btnexit);
         
         
        ppanel2.add(btnshowmemberdetails);
        ppanel2.add(btnshowmovies);
        ppanel2.add(btndeleterecords);
         ppanel2.add(btnsystemdate);
         ppanel2.add(btnsystemdate2);
         ppanel2.add(bsearch);
        ppanel2.add(lborrowed);
        ppanel2.add(lborrowedid);
        ppanel2.add(tborrowedid);
        ppanel2.add(ldob);
        ppanel2.add(tdob);
        ppanel2.add(textmemberid);
        ppanel2.add(labelmemberid);
        ppanel2.add(ldor);
        ppanel2.add(tdor);
        ppanel2.add(lcondition);
        ppanel2.add(lchoosegenre2);
        ppanel2.add(comedy);
        ppanel2.add(cartoon);
        ppanel2.add(horror);
        ppanel2.add(general);
        ppanel2.add(thriller);
        ppanel2.add(rb3days);
        ppanel2.add(rb3daysplus);
        ppanel2.add(chcondition);
        ppanel2.add(lfeecharge);
        ppanel2.add(textfeecharge);
        ppanel2.add(ltotalfine);
        ppanel2.add(texttotalfine);
        ppanel2.add(lfine);
        ppanel2.add(textfine);
        ppanel2.add(ldaysoverdue);
        ppanel2.add(textdaysoverdue);
        ppanel2.add(ltotal);
        ppanel2.add(texttotal);
        ppanel2.add(btnupdate);
        ppanel2.add(bgetfine);
        ppanel2.add(bgettotal);


        
        
      
        
        
      adminmain.add(ppanel);
          adminmain.add(ppanel2);
          adminmain.add(ppanel3);
          
          adminmain.setSize(1500, 1500); 
        adminmain.setLayout(null);
        adminmain.setVisible(false);  
        
        //monthly reportpage
        freport = new JFrame("MONTHLY REPORT");
        freport.setCursor(Cursor.HAND_CURSOR);
freport.setBounds(0,0,600,600);
freport.setLocation(180, 200);

preport= new JPanel();
preport.setBounds(0, 0, 1000, 400);
preport.setBackground(Color.BLUE);
preport.setLayout(null);

JLabel repdate = new JLabel("DATE");
repdate.setBounds(10, 5, 130, 30);
repdate.setForeground(Color.orange);
JTextField textrepdate= new JTextField();
textrepdate.setBounds(170, 5, 150, 20);
textrepdate.setBackground(Color.ORANGE);
textrepdate.setEditable(false);
preport.add(repdate);
preport.add(textrepdate);



JLabel monthlyincome = new JLabel("MEMBERPAYMENTS");
monthlyincome.setBounds(10, 50, 130, 30);
monthlyincome.setForeground(Color.orange);
textsum= new JTextField();
textsum.setBounds(170, 50, 150, 20);
textsum.setBackground(Color.ORANGE);
textsum.setEditable(false);

JLabel memberincome = new JLabel("JOINING FEES");
 memberincome.setBounds(10, 100, 130, 30);
 memberincome.setForeground(Color.orange);
 JTextField textmemberincome= new JTextField();
textmemberincome.setBounds(170, 100, 150, 20);
textmemberincome.setBackground(Color.ORANGE);
textmemberincome.setEditable(false);
preport.add(textmemberincome);
preport.add(memberincome);

JLabel admintotal = new JLabel("TOTAL EARNINGS");
 admintotal.setBounds(10, 150, 130, 30);
 admintotal.setForeground(Color.orange);
 JTextField tadmintotal= new JTextField();
tadmintotal.setBounds(170, 150, 150, 20);
tadmintotal.setBackground(Color.ORANGE);
tadmintotal.setEditable(false);
preport.add(tadmintotal);
preport.add(admintotal);



JLabel adminstration = new JLabel("ADMINSTRATION");
adminstration.setBounds(10, 200, 130, 30);
adminstration.setForeground(Color.orange);
JTextField textadminstration= new JTextField();
textadminstration.setBounds(170, 200, 150, 20);
textadminstration.setBackground(Color.ORANGE);
textadminstration.setEditable(false);
preport.add(adminstration);
preport.add(textadminstration);


JLabel salaries = new JLabel("SALARIES");
salaries.setBounds(10, 250, 130, 30);
salaries.setForeground(Color.orange);
 JTextField textsalaries= new JTextField();
textsalaries.setBounds(170, 250, 150, 20);
textsalaries.setBackground(Color.ORANGE);
textsalaries.setEditable(false);
preport.add(salaries);
preport.add(textsalaries);


JLabel expenses = new JLabel("EXPENSES");
expenses.setBounds(10, 300, 130, 30);
expenses.setForeground(Color.orange);
 JTextField textexpenses= new JTextField();
textexpenses.setBounds(170, 300, 150, 20);
textexpenses.setBackground(Color.ORANGE);
textexpenses.setEditable(false);
preport.add(textexpenses);
preport.add(expenses);




btgetreport= new JButton("INCOME");
btgetreport.setBounds(50,330,100,20);
btgetreport.setBackground(Color.BLACK);
btgetreport.setForeground(Color.GREEN);

 JButton btgetcalc= new JButton("CALCULATE");
btgetcalc.setBounds(200,330,140,20);
btgetcalc.setBackground(Color.BLACK);
btgetcalc.setForeground(Color.GREEN);

JTextArea monthlyex = new JTextArea();
monthlyex.setBounds(450, 10, 400, 300);
monthlyex.setBackground(Color.ORANGE);
monthlyex.setFont(f4);
monthlyex.setEditable(false);
preport.add(monthlyex);

JButton genbutton= new JButton("GENERATE");
genbutton.setBounds(860,50,120,20);
genbutton.setBackground(Color.BLACK);
genbutton.setForeground(Color.GREEN);
preport.add(genbutton);

JButton printbutton= new JButton("PRINT");
printbutton.setBounds(860,150,100,20);
printbutton.setBackground(Color.BLACK);
printbutton.setForeground(Color.GREEN);
preport.add(printbutton);

JButton clearbutton= new JButton("CLEAR");
clearbutton.setBounds(860,250,100,20);
clearbutton.setBackground(Color.BLACK);
clearbutton.setForeground(Color.GREEN);
preport.add(clearbutton);

preport.add(btgetcalc);

//clear textfields after generating report
  clearbutton.addActionListener((ActionEvent->{
             monthlyex.setText(" ");
             textrepdate.setText(" ");
             textsum.setText(" ");
             textsalaries.setText(" ");
             textadminstration.setText(" ");
             textexpenses.setText(" ");
             tadmintotal.setText(" ");
             textmemberincome.setText(" ");
         }));
  
  //printing the report
         printbutton.addActionListener((ActionEvent e) -> {
            try {
                monthlyex.print();
            }
            catch (java.awt.print
                    .PrinterException a) {
                System.err.format(
                        "NoPrinter Found",
                        a.getMessage());
            }
        }); 
         
         
          // Generating the report
        genbutton.addActionListener((ActionEvent e) -> {
            
            SimpleDateFormat formattez= new SimpleDateFormat("yyyy-MM-dd ");
     Date datehfz = new Date();
        textrepdate.setText(formatte.format(datehfz));
            monthlyex.setText( 
                    "-------------"
                            + "---UPEPEO MONTHLY REPORT----"
                            + "--------------------------"
                            + "--------------------------"
                            + "-------------------\n");
                             
                            
            
            
            monthlyex.setText(monthlyex.getText()
                    + "On"
                    + " "
                    + textrepdate.getText()
                    + "\n "
                    + "The report for the month is as follows: "
                    + "\n ");
            monthlyex.setText(monthlyex.getText()
                    + "Total monthly income is"
                    + " "
                    + tadmintotal.getText()
                    + "/-"
                    + ". "
                    +"\n ");
            monthlyex.setText(monthlyex.getText()
                    + textadminstration.getText()
                    + "/-"
                    + " "
                    +" is allocated to adminstration."
                    + " \n");
            monthlyex.setText(monthlyex.getText()
                    + textsalaries.getText()
                    + "/-"
                    +" "
                    +" is allocated to salaries."        
                    + "\n "
                    
                   );
            monthlyex.setText(monthlyex.getText()
                    + textexpenses.getText()
                    + "/-"
                    +" "
                    +" is allocated to miscellaneous expenses."        
                    + "\n ");
            monthlyex.setText(monthlyex.getText()
                    +"\n"
                     +"\n"
                    + " END."
                    
                    );
            
            
           
                   
      
            
            if (e.getSource() == genbutton) {
                try {
                    try (FileWriter fw = new FileWriter(
                            "java.txt", true)) {
                        fw.write(monthlyex.getText());
                    }
                }
                catch (IOException ae) {
                    System.out.println(ae);
                }
            }
            
            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO monthlyreport (thereport)VALUES(?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,monthlyex.getText());
                    
                     
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"MONTHLY REPORT SAVED");
             
                      pstmt.close();
                   connn.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "MONTHLY REPORT NOT SAVED!");
                        }
              
                    
        }); 

btgetcalc.addActionListener((ActionEvent e)->{
    int z = Integer.parseInt(textmemberincome.getText());
    int w = Integer.parseInt(textsum.getText());
    
    int p = z+ w;
    String totalyaadmin = String.valueOf(p);
    tadmintotal.setText(totalyaadmin);
    
          int a = Integer.parseInt(tadmintotal.getText());
          double b = 0.54;
        int c = (int) (a * b) ;
        double d = 0.27;
        double h = 0.07;
        int k = (int) (a * d) ;
        int l = (int) (a * h) ;
        String answer = String.valueOf((c));
        textsalaries.setText(answer);
        String gerriit = String.valueOf((k));
        textadminstration.setText(gerriit);
        String maliza = String.valueOf((l));
        textexpenses.setText(maliza);
        

});



preport.add(textsum);
preport.add(monthlyincome);
preport.add(btgetreport);


freport.add(preport);
  btgetreport.addActionListener((ActionEvent e) -> {     
            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection dit= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "SELECT sum(payment) from paymentrecords";
                     PreparedStatement pstmt = dit.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     
                     if(rs.next()){
                         String sum = rs.getString("sum(payment)");
                         textsum.setText(sum);
                     }
                     
                     
                  
             
                      pstmt.close();
                   dit.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "CANNOT SHOW GENERATED REVENUE!");
                        }
            
             try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection dit= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "SELECT sum(payment) from membership";
                     PreparedStatement pstmt = dit.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     
                     if(rs.next()){
                         String sum = rs.getString("sum(payment)");
                         textmemberincome.setText(sum);
                     }
                     
                     
                  
             
                      pstmt.close();
                   dit.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "CANNOT SHOW FEES FOR JOINING!");
                        }
                 
             
              
             
        }); 
 freport.setSize(1000, 400); 
        freport.setLayout(null);
        freport.setVisible(false);
        freport.setResizable(false);
        

        
        
        //admin register new members page (found on admin page)member cannot register themselves
   
fregister = new JFrame("REGISTER NEW MEMBER");
fregister.setBounds(0,0,1300,1300);
fregister.setCursor(Cursor.HAND_CURSOR);

combi= new JPanel();
combi.setBounds(0, 0, 1300, 1300);
combi.setBackground(Color.BLUE);
combi.setLayout(null);

 formatter= new SimpleDateFormat("yyyy-MM-dd ");
      date = new Date();
         
         lorganization = new JLabel(" UPEPEO CLUB "); 
         lorganization.setBounds(550, 50, 450, 50); 
         lorganization.setFont(f1);
         lorganization.setForeground(Color.black); 
         
         lwelcome=new JLabel("Welcome to our official registration page");
         lwelcome.setBounds(350, 100, 550, 50);
         lwelcome.setFont(f3);
         lwelcome.setForeground(Color.ORANGE);
                 
          lname = new JLabel( "NAME "); 
        lname.setBounds(50, 150, 250, 30);
        lname.setFont(f4);
        lname.setForeground(Color.orange);
         txtname = new JTextField(); 
        txtname.setBounds(150, 150, 250, 30);
        txtname.setBackground(Color.yellow);
        txtname.setFont(f2);
        txtname.setForeground(Color.RED);
        
         lid= new JLabel( "NATIONAL ID"); 
        lid.setBounds(50, 200, 250, 30);
        lid.setFont(f4);
        lid.setForeground(Color.orange);
         txtid = new JTextField(); 
        txtid.setBounds(150, 200, 250, 30);
        txtid.setBackground(Color.yellow);
         txtid.setFont(f2);
         txtid.setForeground(Color.RED);
         
          laddr = new JLabel( "ADDRESS"); 
        laddr.setBounds(50, 250, 250, 30);
        laddr.setFont(f4);
        laddr.setForeground(Color.orange);
        txtaddr= new JTextField(); 
        txtaddr.setBounds(150, 250, 250, 30);
        txtaddr.setBackground(Color.yellow);
         txtaddr.setFont(f2);
         txtaddr.setForeground(Color.RED);
         
          locc = new JLabel( "OCCUPATION"); 
        locc.setBounds(50, 300, 250, 30);
        locc.setFont(f4);
        locc.setForeground(Color.orange);
        txtocc= new JTextField(); 
        txtocc.setBounds(150, 300, 250, 30);
        txtocc.setBackground(Color.yellow);
         txtocc.setFont(f2);
         txtocc.setForeground(Color.RED);
         
          ldoj = new JLabel( "DATE JOINED"); 
        ldoj.setBounds(50, 350, 250, 30);
        ldoj.setFont(f4);
        ldoj.setForeground(Color.orange);
        txtdoj= new JTextField(); 
        txtdoj.setBounds(150, 350, 250, 30);
        txtdoj.setBackground(Color.yellow);
         txtdoj.setFont(f2);
         txtdoj.setForeground(Color.RED);
         txtdoj.setEditable(false);
         
         lemail = new JLabel( "EMAIL"); 
        lemail.setBounds(50, 400, 250, 30);
        lemail.setFont(f4);
        lemail.setForeground(Color.orange);
        txtemail= new JTextField(); 
        txtemail.setBounds(150, 400, 250, 30);
        txtemail.setBackground(Color.yellow);
         txtemail.setFont(f2);
         txtemail.setForeground(Color.RED);
         txtemail.setEditable(true);
         
         lcontact = new JLabel( "CONTACT"); 
        lcontact.setBounds(50, 450, 250, 30);
        lcontact.setFont(f4);
        lcontact.setForeground(Color.orange);
        txtcontact= new JTextField(); 
        txtcontact.setBounds(150, 450, 250, 30);
        txtcontact.setBackground(Color.yellow);
         txtcontact.setFont(f2);
         txtcontact.setForeground(Color.RED);
         txtcontact.setEditable(true);
         
          lmeb = new JLabel( "MEMBERSHIP NO."); 
        lmeb.setBounds(50, 500, 250, 30);
        lmeb.setFont(f4);
        lmeb.setForeground(Color.orange);
        txtmeb= new JTextField(); 
        txtmeb.setBounds(150, 500, 250, 30);
        txtmeb.setBackground(Color.yellow);
         txtmeb.setFont(f2);
         txtmeb.setForeground(Color.RED);
         txtmeb.setEditable(false);
         
          lstatus = new JLabel("AMOUNT"); 
        lstatus.setBounds(600, 250, 250, 30);
        lstatus.setFont(f4);
        lstatus.setForeground(Color.orange);
        txtstatus= new JTextField(); 
        txtstatus.setBounds(700, 250, 250, 30);
        txtstatus.setBackground(Color.yellow);
         txtstatus.setFont(f2);
         txtstatus.setEditable(false);
         txtstatus.setForeground(Color.RED);
         
         btnpaid= new JRadioButton("Paid");
        btnpaid.setBounds(600, 150, 100, 30);
        btnpaid.setBackground(Color.BLUE);
        btnpaid.setForeground(Color.ORANGE);
        
         btnnotpaid = new JRadioButton("Not Paid");
        btnnotpaid.setBounds(700, 150, 100, 30);
        btnnotpaid.setBackground(Color.BLUE);
        btnnotpaid.setForeground(Color.ORANGE);
        
         
        ButtonGroup bg = new ButtonGroup();
        
          bg.add(btnpaid);
          bg.add(btnnotpaid);
          
           btnshow = new JButton("show");
         btnshow.setBounds(600, 200, 100, 20);
        btnshow.setBackground(Color.RED);
        btnshow.setFont(f4);
        btnshow.setForeground(Color.black);
          
          btngenerate = new JButton("Generate ID");
        btngenerate.setBounds(600, 350, 150, 20);
        btngenerate.setBackground(Color.black);
         btngenerate.setForeground(Color.RED);
         
           
          btnreset = new JButton("Reset");
        btnreset.setBounds(800, 350, 100, 20);
        btnreset.setBackground(Color.BLACK);
        btnreset.setFont(f4);
        btnreset.setForeground(Color.RED);
        
        btnprint = new JButton("Print");
        btnprint.setBounds(1000, 350, 100, 20);
        btnprint.setBackground(Color.BLACK);
        btnprint.setFont(f4);
        btnprint.setForeground(Color.RED);
        
         btnregister = new JButton("Register");
        btnregister.setBounds(150, 700, 150, 20);
        btnregister.setBackground(Color.BLACK);
        btnregister.setFont(f4);
        btnregister.setForeground(Color.RED);
        
        
        
        
        
          
           printid = new JTextArea();
        printid.setBackground(Color.YELLOW);
        printid.setBounds(600, 400, 450, 250);
        printid.setEditable(false);
        printid.setFont(f2);
        printid.setForeground(Color.RED);
          
 
          combi.add(lorganization);  
          combi.add(lwelcome);
        combi.add(lname); 
        combi.add(txtname); 
        combi.add(lid); 
        combi.add(txtid); 
        combi.add(laddr); 
        combi.add(txtaddr); 
        combi.add(locc); 
        combi.add(txtocc); 
        combi.add(ldoj); 
        combi.add(txtdoj); 
        combi.add(lmeb);
        combi.add(txtmeb);
        combi.add(lcontact);
        combi.add(txtcontact);
        combi.add(lemail);
        combi.add(txtemail);
        combi.add(btnpaid);
        combi.add(btnnotpaid);
        
        combi.add(btngenerate);
         combi.add(btnreset);
         
        combi.add(btnprint);
        combi.add(printid);
       
        combi.add(lstatus);
        combi.add(txtstatus);
        combi.add(btnshow);
        combi.add(btnregister);
      
        
        
         //generate random numbers and assign to new member being registered as member id
        
           btnshow.addActionListener((ActionEvent e) -> {
                Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                 
             
             String qual = " ";
             
            
             if (btnpaid.isSelected()) {
                 
                 qual = "5000";
             }
             
            
            
             
             else  {
                 
                 qual = "not paid,ID pending";
             }
             
             
            //txtsatatus displays whether the 5000 is paid or not
             txtstatus.setText(qual);
             
             //btnnotpaid pressed hides generate ID button and does not show assign system date to the field doj
             if(btnnotpaid.isSelected()){
                 btngenerate.hide();
                 txtdoj.setText("");
                 
             }
             else
                 btngenerate.show();
             //btn paid pressed assigns system date to field doj and assigns random id to the new member
              if(btnpaid.isSelected()){
                 txtdoj.setText(formatter.format(date));
                  txtmeb.setText(output);
            }
            
    } ); 
           
           
       btnregister.addActionListener((ActionEvent e) -> {     
            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO membership (name,nationalid,address,occupation,dateofjoining,email,contact,membershipid,payment)VALUES(?,?,?,?,?,?,?,?,?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,txtname.getText());
                     pstmt.setString(2, (txtid.getText()));
                     pstmt.setString(3, txtaddr.getText());
                     pstmt.setString(4, txtocc.getText());
                     pstmt.setString(5, txtdoj.getText());
                     pstmt.setString(6, txtemail.getText());
                     pstmt.setString(7, (txtcontact.getText()));
                     pstmt.setString(8, (txtmeb.getText()));
                     pstmt.setString(9, txtstatus.getText());
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"MEMBER OFFICIALLY REGISTERED!");
             tmeb.setText(txtmeb.getText());
                      pstmt.close();
                   connn.close();
                   create.setVisible(true);
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "MEMBER NOT REGISTERED!");
                        }
                 
             
        }); 
               
           
           
            btnreset.addActionListener((ActionEvent e) -> {
            
            printid.setText("");
            txtname.setText("");
            txtid.setText("");
            txtaddr.setText("");
            txtocc.setText("");
            txtdoj.setText("");
            txtemail.setText("");
            txtcontact.setText("");
           
           txtstatus.setText("");
           txtmeb.setText("");
            
           bg.clearSelection();
        
        }); 
            
           
            
     
            
             btnprint.addActionListener((ActionEvent e) -> {
            try {
                printid.print();
            }
            catch (java.awt.print
                    .PrinterException a) {
                System.err.format(
                        "NoPrinter Found",
                        a.getMessage());
            }
        }); 
            
              btngenerate.addActionListener((ActionEvent e) -> {
                  if(btnpaid.isSelected()){
            printid.setText( 
                    "-------------"
                            + "---UPEPEO MEMBER ID----"
                            + "--------------------------"
                            + "--------------------------"
                            + "-------------------\n");
                             
                            
            
           
            printid.setText(printid.getText()
                    + "NAME: "
                    + txtname.getText()
                    + "\n");
            printid.setText(printid.getText()
                    + "ID NO.: "
                    + txtid.getText()
                    + "\n");
            printid.setText(printid.getText()
                    + " ADDRESS: "
                    + txtaddr.getText()
                    + "\n");
            printid.setText(printid.getText()
                    + "OCCUPATION: "
                    + txtocc.getText()
                    + "\n");
            printid.setText(printid.getText()
                    + "DATE OF JOINING: "
                    + txtdoj.getText()                          
                    + "\n");
            printid.setText(printid.getText()
                    + "MEMBERSHIP NO.: "
                    +txtmeb.getText()
                    + "\n"
                    + "\n"
                    +"\n");
            printid.setText(printid.getText()
                     + "--------------------enjoy the best services from upepeo!--------------------------------------"
                     +"\n");
            
           
            
            
           
                  }
                  else{
                      printid.setText("NOT PAID");
                  }
                      
            
            if (e.getSource() == btngenerate) {
                try {
                    try (FileWriter fw = new FileWriter(
                            "java.txt", true)) {
                        fw.write(printid.getText());
                    }
                }
                catch (IOException ae) {
                    System.out.println(ae);
                }
            }
            
            JOptionPane.showMessageDialog(
                    printid, "DETAILS RECORDED."); 
        }); 
       
        fregister.add(combi);
        fregister.setSize(1300, 1300); 
       fregister.setLayout(null);
        fregister.setVisible(false); 
        fregister.setResizable(false);
        fregister.setLocation(30,0);
        
        baddnewmember.addActionListener((ActionEvent e) -> {
      fregister.setVisible(true);
             
          
    } 

    ); 
        
        //create password for new member
        
        create = new JFrame("UPEPEO CREATE PASSWORD");
create.setBounds(10,10,600,600);
create.setCursor(Cursor.HAND_CURSOR);

p5= new JPanel();
p5.setBounds(0, 0, 500, 350);
p5.setBackground(Color.cyan);
p5.setLayout(null);

createpage= new JLabel("CREATE YOUR UPEPEO PASSWORD");
createpage.setBounds(100,20,450,30);
createpage.setFont(f3);

meb= new JLabel("Member ID");
meb.setBounds(50,50, 150, 20);
meb.setFont(f4);
tmeb= new JTextField();
tmeb.setBounds(170, 50, 150, 20);
tmeb.setBackground(Color.ORANGE);

pass= new JLabel("Enter Password");
pass.setBounds(50, 100, 200, 20);
pass.setFont(f4);
tpass= new JPasswordField();
tpass.setBounds(170, 100, 150, 20);
tpass.setBackground(Color.ORANGE);

confirm= new JLabel("Confirm Password");
confirm.setBounds(50,150,200,20);
confirm.setFont(f4);
tconfirm= new JPasswordField();
tconfirm.setBounds(170, 150, 150, 20);
tconfirm.setBackground(Color.ORANGE);

tsave= new JButton("SAVE");
tsave.setBounds(50,250,100,20);
tsave.setBackground(Color.BLACK);
tsave.setForeground(Color.GREEN);

cancel= new JButton("Cancel");
cancel.setBounds(300,250 , 100, 20);
cancel.setBackground(Color.BLACK);
cancel.setForeground(Color.GREEN);

cancel.addActionListener((ActionEvent e)->{
    create.setVisible(false);
});


p5.add(createpage);
p5.add(meb);
p5.add(tmeb);
p5.add(pass);
p5.add(tpass);
p5.add(confirm);
p5.add(tconfirm);
p5.add(tsave);
p5.add(cancel);

create.add(p5);
  tsave.addActionListener((ActionEvent e) -> {    
      if(tpass.getText().matches(tconfirm.getText())){
            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection dit= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO password (memberid,newpassword,confirmpassword)VALUES(?,?,?)";
                     PreparedStatement pstmt = dit.prepareStatement(sql);
                     pstmt.setString(1,(tmeb.getText()));
                     pstmt.setString(2, tpass.getText());
                     pstmt.setString(3, tconfirm.getText());
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"PASSWORD SAVED");
             
                      pstmt.close();
                   dit.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "PASSWORD NOT SAVED");
                        }
      }
      else 
      {
           JOptionPane.showMessageDialog(null, "PASSWORD MISMATCH!");
      }
             
        }); 
 create.setSize(500, 350); 
        create.setLayout(null);
        create.setVisible(false); 
        create.setResizable(false);
        


        
        //admin add movies page
        
    adminfunctions=new JFrame("ADMIN ADD MOVIES");
    adminfunctions.setLocation(320,100);
adminfunctions.setCursor(Cursor.HAND_CURSOR);

panel= new JPanel();
panel.setBounds(0, 0, 500, 400);
panel.setBackground(Color.BLUE);
panel.setLayout(null);

        
        laddmovieg= new JLabel("ADD MOVIE");
        laddmovieg.setBounds(100,10, 100, 20);
        laddmovieg.setForeground(Color.yellow);
        
        lmovieid= new JLabel("MOVIE ID");
        lmovieid.setBounds(10,50,150,20);
        lmovieid.setForeground(Color.ORANGE);
        tmovieid= new JTextField();
         tmovieid.setBounds(100,50,250,30);
         tmovieid.setBackground(Color.ORANGE);
         
         
         lmovietitle= new JLabel("MOVIE TITLE");
        lmovietitle.setBounds(10,100,150,20);
        lmovietitle.setForeground(Color.ORANGE);
        tmovietitle= new JTextField();
         tmovietitle.setBounds(100,100,250,30);
         tmovietitle.setBackground(Color.ORANGE);
         
        
        
        btncomedy= new JButton("ADD comedy");
        btncomedy.setBounds(10, 150, 120, 30);
        btncomedy.setBackground(Color.BLACK);
        btncomedy.setForeground(Color.GREEN);
        
          btnthriller= new JButton("ADD thriller");
        btnthriller.setBounds(150, 150, 120, 30);
         btnthriller.setBackground(Color.BLACK);
        btnthriller.setForeground(Color.GREEN);
        
          btngeneral= new JButton("ADD general");
        btngeneral.setBounds(280, 150, 120, 30);
         btngeneral.setBackground(Color.BLACK);
        btngeneral.setForeground(Color.GREEN);
        
          btncartoon= new JButton("ADD cartoon");
        btncartoon.setBounds(10, 200, 120, 30);
         btncartoon.setBackground(Color.BLACK);
        btncartoon.setForeground(Color.GREEN);
        
          btnhorror= new JButton("ADD horror");
        btnhorror.setBounds(150, 200, 120, 30);
         btnhorror.setBackground(Color.BLACK);
        btnhorror.setForeground(Color.GREEN);
        
         btndelete= new JButton("DELETE");
        btndelete.setBounds(280, 200, 120, 30);
         btndelete.setBackground(Color.RED);
        btndelete.setForeground(Color.WHITE);
        
           btndelete.addActionListener((ActionEvent e) ->{
               try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from horror where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tmovieid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                   
             
                   connn.close();
                  
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                       
                        }
                try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from thriller where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tmovieid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                   
             
                   connn.close();
                  
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        
                        }
                 try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from general where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tmovieid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                   
             
                   connn.close();
                  
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                       
                        }
                  try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from comedy where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tmovieid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                  
             
                   connn.close();
                  
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                       
                        }
                   try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "delete from cartoon where movieid = ?";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,tmovieid.getText());
                    
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"MOVIE" + " "+ tmovieid.getText()+ " " + "DELETED!");
             
                   connn.close();
                  
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "FAILED TO DELETE MOVIE!");
                        }
              
                });
        
   
                
                btncartoon.addActionListener((ActionEvent e) ->{
            //assigning random movie id for movies being added        
                    Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                  
                  tmovieid.setText(output);
                        try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO cartoon (movieid,movietitle)VALUES(?,?)";
                     PreparedStatement pstmt = conn.prepareStatement(sql);
                     pstmt.setString(1,(tmovieid.getText()));
                     pstmt.setString(2, tmovietitle.getText());
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"CARTOON MOVIE ADDED!");
             
                      pstmt.close();
                   conn.close();
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "CARTOON MOVIE NOT ADDED!");
                        }
            
               
                        
                     tmovieid.setText(" ")  ;
                     tmovietitle.setText(" ")  ;
                     
                    
                    
                });
 
                
                 btnthriller.addActionListener((ActionEvent e) ->{
                     
                            Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                  
                  tmovieid.setText(output);
                        try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
              
                     String sql = "INSERT INTO thriller (movieid,movietitle) VALUES (?,?)";
                     PreparedStatement pstmt = con.prepareStatement(sql);
                      pstmt.setString(1,(tmovieid.getText()));
                     pstmt.setString(2, tmovietitle.getText());
                     
                    pstmt.executeUpdate();
                             
             
                   JOptionPane.showMessageDialog(null, "THRILLER MOVIE ADDED!");
             
                   pstmt.close();
                   con.close();
                   
                       
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "THRILLER  MOVIE NOT ADDED!");
                        }
                    
                        
                     tmovieid.setText(" ")  ;
                     tmovietitle.setText(" ")  ;
                     
                     
                    
                });
                
     
                 btngeneral.addActionListener((ActionEvent e) ->{
                     
                            Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                  
                  tmovieid.setText(output);
                      try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO general (movieid,movietitle)VALUES (?,?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     pstmt.setString(1,(tmovieid.getText()));
                     pstmt.setString(2, tmovietitle.getText());
                     
                          
               pstmt.executeUpdate();
                   JOptionPane.showMessageDialog(null, "GENERAL MOVIE ADDED!");
             
                      pstmt.close();
                     connn.close();
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "GNERAL MOVIE NOT ADDED!");
                        }
              
                   
                        
                     tmovieid.setText(" ")  ;
                     tmovietitle.setText(" ")  ;
                     
                       
                    
                });
                
 


                
                 btncomedy.addActionListener((ActionEvent e) ->{
                     
                            Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                  
                  tmovieid.setText(output);
                     
                      try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO comedy(movieid,movietitle) VALUES(?,?)";
                     PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1,(tmovieid.getText()));
                     pstmt.setString(2, tmovietitle.getText());
                     
                       pstmt.executeUpdate();
            
                   JOptionPane.showMessageDialog(null, "COMEDY MOVIE ADDED!");
             
                      pstmt.close();
                     conn.close();
                     
                    }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "COMEDY MOVIE NOT ADDED!");
                        
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                     tmovieid.setText(" ")  ;
                     tmovietitle.setText(" ")  ;
                     
                
                    
                });
                
  
                
                 btnhorror.addActionListener((ActionEvent e) ->{
                     
                            Random rand =new Random();
       int upperbound =100000;
        int int_random= rand.nextInt(upperbound);
        
                  String output=String.valueOf(int_random);
                  
                  tmovieid.setText(output);
                     try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO horror(movieid,movietitle) VALUES (?,?)";
                     PreparedStatement mas = conn.prepareStatement(sql);
                     mas.setString(1,(tmovieid.getText()));
                     mas.setString(2, tmovietitle.getText());
                     
                     mas.executeUpdate();
             
                   JOptionPane.showMessageDialog(null, "HORROR MOVIE ADDED!");
             
             
                     
                     mas.close();
                     conn.close();
                    }catch(SQLException j){
                        JOptionPane.showMessageDialog(null,"HORROR MOVIE NOT ADDED!");
                        
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     
              
                   
                        
                     tmovieid.setText(" ")  ;
                     tmovietitle.setText(" ")  ;
                     
                     
                    
                    
                });
                 
               
        
        
          adminfunctions.add(panel);
   
          panel.add(btncomedy);
          panel.add(btnhorror);
          panel.add(btnthriller);
          panel.add(btncartoon);
          panel.add(btngeneral);
          panel.add(btndelete);
           panel.add(laddmovieg);adminfunctions.setSize(500, 400); 
        adminfunctions.setLayout(null);
        adminfunctions.setVisible(false); 
            panel.add(lmovieid);
             panel.add(tmovieid);
              panel.add(lmovietitle);
               panel.add(tmovietitle);
   
          
           btnshowmovies.addActionListener((ActionEvent e) -> {
      
                 
          adminfunctions.setVisible(true);
    } 

    ); 
        
          //member borrow moviepage
          
fmembersearch=new JFrame("MEMBER MOVIE SEARCH");
fmembersearch.setCursor(Cursor.HAND_CURSOR);

pmembs= new JPanel();
pmembs.setBounds(0, 0, 1500, 1500);
pmembs.setBackground(Color.BLUE);
pmembs.setLayout(null);



llmember = new JLabel("USER");
llmember.setBounds(50,100,100,20);
llmember.setFont(f4);
llmember.setForeground(Color.ORANGE);
mtxtmember= new JTextField();
mtxtmember.setBounds(170, 100, 150, 30);
mtxtmember.setBackground(Color.ORANGE);
mtxtmember.setEditable(false);
mtxtmember.setText(txtmemberid3.getText());


llmovieid= new JLabel("MOVIE ID");
llmovieid.setBounds(50,150,100,20);
llmovieid.setFont(f4);
llmovieid.setForeground(Color.orange);
mtxtmovieid= new JTextField();
mtxtmovieid.setBounds(170, 150, 150, 30);
mtxtmovieid.setBackground(Color.ORANGE);


llmovietitle= new JLabel("MOVIE TITLE");
llmovietitle.setBounds(50,200,100,20);
llmovietitle.setFont(f4);
llmovietitle.setForeground(Color.orange);
mtxtmovietitle= new JTextField();
mtxtmovietitle.setBounds(170, 200, 150, 30);
mtxtmovietitle.setBackground(Color.ORANGE);



lldate= new JLabel("DATE");
lldate.setBounds(50,250,100,20);
lldate.setFont(f4);
lldate.setForeground(Color.orange);

mtxtdate= new JTextField();
mtxtdate.setBounds(170, 250, 150, 30);
mtxtdate.setBackground(Color.ORANGE);

bbsearcht= new JButton("Thriller search");
bbsearcht.setBounds(50, 350, 200, 30);
bbsearcht.setBackground(Color.orange);
bbsearcht.setForeground(Color.blue);

bbsearchg= new JButton("General search");
bbsearchg.setBounds(50, 400, 200, 30);
bbsearchg.setBackground(Color.orange);
bbsearchg.setForeground(Color.blue);

bbsearchca= new JButton("Cartoon search");
bbsearchca.setBounds(50, 450, 200, 30);
bbsearchca.setBackground(Color.orange);
bbsearchca.setForeground(Color.blue);

bbsearchco= new JButton("Comedy search");
bbsearchco.setBounds(50, 500, 200, 30);
bbsearchco.setBackground(Color.orange);
bbsearchco.setForeground(Color.blue);

bbsearchh= new JButton("Horror search");
bbsearchh.setBounds(50, 550, 200, 30);
bbsearchh.setBackground(Color.orange);
bbsearchh.setForeground(Color.blue);

bborrow= new JButton("BORROW");
bborrow.setBounds(100, 600, 150, 30);
bborrow.setBackground(Color.RED);
bborrow.setForeground(Color.black);
bborrow.setEnabled(false);

if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}

 bbsearcht.addActionListener((ActionEvent e) -> {
           
             String sql= "select * from thriller where movieid = ? ";
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, mtxtmovieid.getText());
                     
                     

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        mtxtmovietitle.setText(rs.getString("movietitle"));
                        
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "THRILLER > MOVIE NOT FOUND!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
             if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}
          
    } 

    ); 
        
 bbsearchg.addActionListener((ActionEvent e) -> {
           
             String sql= "select * from general where movieid = ? ";
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, mtxtmovieid.getText());
                     
                     

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        mtxtmovietitle.setText(rs.getString("movietitle"));
                        
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "GENERAL > MOVIE NOT FOUND!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
             if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}
          
    } 

    ); 
        
 bbsearchca.addActionListener((ActionEvent e) -> {
           
             String sql= "select * from cartoon where movieid = ? ";
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, mtxtmovieid.getText());
                     
                     

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        mtxtmovietitle.setText(rs.getString("movietitle"));
                        
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "CARTOON > MOVIE NOT FOUND!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
             if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}
          
    } 

    ); 
        
 bbsearchco.addActionListener((ActionEvent e) -> {
           
             String sql= "select * from comedy where movieid = ? ";
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, mtxtmovieid.getText());
                     
                     

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        mtxtmovietitle.setText(rs.getString("movietitle"));
                        
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "COMEDY > MOVIE NOT FOUND!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
             if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}
          
    } 

    ); 
        
 bbsearchh.addActionListener((ActionEvent e) -> {
           
             String sql= "select * from horror where movieid = ? ";
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
                     
                     PreparedStatement sam = conn.prepareStatement(sql);
                     sam.setString(1, mtxtmovieid.getText());
                     
                     

                     
                     ResultSet rs = sam.executeQuery();
                     if(rs.next()){
                        mtxtmovietitle.setText(rs.getString("movietitle"));
                        
                         
                     }
                     else
                     {
                          JOptionPane.showMessageDialog(null, "HORROR > MOVIE NOT FOUND!");
                     }
                     conn.close();
                     
                 
             }
             catch(Exception j){
                 JOptionPane.showMessageDialog(null, j);
             }
             if (mtxtmovietitle.getText().matches("")){
    bborrow.setEnabled(false);
}
else{
    bborrow.setEnabled(true);
}
          
    } 

    ); 
 
 
 
 //add view tables to panel
 
 llcartoon= new JLabel("Cartoon");
 llcartoon.setBounds(480, 10, 50, 20);
 llcartoon.setForeground(Color.ORANGE);
 Object[] rowcartoon = new String[2];
Object [] columncartoon = { " Cartoon Movie ID", "movie Title"};
DefaultTableModel modelo = new DefaultTableModel(columncartoon,0);
               cartoontable= new JTable(modelo);
               cartoontable.setLayout(null);
               cartoontable.setLocation(700,400);
               cartoontable.setSize(600, 350);
               cartoontable.setForeground(Color.RED);
               cartoontable.setBackground(Color.GREEN);
               cartoontable.setVisible(true);
               
               JScrollPane cc = new JScrollPane(cartoontable); 
               cc.setBounds(450, 50, 400, 100);
		 
                pmembs.add(cc);
                pmembs.add(llcartoon);
    
                
                llthriller= new JLabel("Thriller");
 llthriller.setBounds(480, 230, 50, 20);
 llthriller.setForeground(Color.ORANGE);
                  Object[] rowthriller = new String[2];
Object [] columnthriller = { " Thriller Movie ID", "movie Title"};
DefaultTableModel toko = new DefaultTableModel(columnthriller,0);
               thrillertable= new JTable(toko);
               thrillertable.setLayout(null);
               thrillertable.setLocation(700,400);
               thrillertable.setSize(600, 350);
               thrillertable.setForeground(Color.RED);
               thrillertable.setBackground(Color.GREEN);
               thrillertable.setVisible(true);
               
               JScrollPane ct = new JScrollPane(thrillertable); 
               ct.setBounds(450, 250, 400, 100);
		pmembs.add(ct); 
                pmembs.add(llthriller);
                
                
                       
                llgeneral= new JLabel("General");
 llgeneral.setBounds(480, 430, 50, 20);
 llgeneral.setForeground(Color.ORANGE);
                
                 Object[] rowgeneral = new String[2];
Object [] columngeneral = { " General Movie ID", "movie Title"};
DefaultTableModel rko = new DefaultTableModel(columngeneral,0);
               generaltable= new JTable(rko);
               generaltable.setLayout(null);
               generaltable.setLocation(700,400);
               generaltable.setSize(600, 350);
               generaltable.setForeground(Color.RED);
               generaltable.setBackground(Color.GREEN);
               generaltable.setVisible(true);
               
               JScrollPane cg = new JScrollPane(generaltable); 
               cg.setBounds(450, 450, 400, 100);
		pmembs.add(cg); 
                pmembs.add(llgeneral);
                
                
       llcomedy= new JLabel("Comedy");
 llcomedy.setBounds(900, 30, 50, 20);
 llcomedy.setForeground(Color.ORANGE);            
                
                Object[] rowcomedy = new String[2];
Object [] columncomedy = { "Comedy Movie ID", "movie Title"};
DefaultTableModel kosovo = new DefaultTableModel(columncomedy,0);
               comedytable= new JTable(kosovo);
               comedytable.setLayout(null);
               comedytable.setLocation(700,400);
               comedytable.setSize(600, 350);
               comedytable.setForeground(Color.RED);
               comedytable.setBackground(Color.GREEN);
               comedytable.setVisible(true);
               
               JScrollPane cr = new JScrollPane(comedytable); 
                cr.setBounds(900, 50, 400, 100);
		pmembs.add(cr);
                pmembs.add(llcomedy);
                
                
                
    llhorror= new JLabel("Horror");
 llhorror.setBounds(900, 230, 50, 20);
 llhorror.setForeground(Color.ORANGE);               
                       Object[] rowhorror = new String[2];
Object [] columnhorror = { "Horror Movie ID", "movie Title"};
DefaultTableModel otero = new DefaultTableModel(columnhorror,0);
               horrortable= new JTable(otero);
               horrortable.setLayout(null);
               horrortable.setLocation(700,400);
               horrortable.setSize(600, 350);
               horrortable.setForeground(Color.RED);
               horrortable.setBackground(Color.GREEN);
               horrortable.setVisible(true);
               
               JScrollPane hr = new JScrollPane(horrortable); 
               hr.setBounds(900, 250, 400, 100);
		pmembs.add(hr);
                pmembs.add(llhorror);
        
 

pmembs.add(llmember);
pmembs.add(llmovieid);
pmembs.add(llmovietitle);
pmembs.add(mtxtmovietitle);
pmembs.add(mtxtmovieid);
pmembs.add(mtxtmember);
pmembs.add(lldate);
pmembs.add(mtxtdate);
pmembs.add(bbsearcht);
pmembs.add(bbsearchg);
pmembs.add(bbsearchco);
pmembs.add(bbsearchca);
pmembs.add(bbsearchh);
pmembs.add(bborrow);

  SimpleDateFormat formatt= new SimpleDateFormat("yyyy-MM-dd ");
     Date datej = new Date();
        
         bborrow.addActionListener((ActionEvent e) -> {
      
                 mtxtdate.setText(formatte.format(datej));
                 
                 try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO permanentrecords (memberid,movieid,dateofborrow)VALUES(?,?,?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,mtxtmember.getText());
                     pstmt.setString(2, (mtxtmovieid.getText()));
                     pstmt.setString(3, mtxtdate.getText());
                     
                     
                     
                     
                     pstmt.executeUpdate();
           
               
                      pstmt.close();
                   connn.close();
   
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "NOT ADDED TO PERMANENT");
                        
                        
                        }
              
                  try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "INSERT INTO recorddd (memberid,movieid,dateofborrow)VALUES(?,?,?)";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     
                     pstmt.setString(1,mtxtmember.getText());
                     pstmt.setString(2, (mtxtmovieid.getText()));
                     pstmt.setString(3, mtxtdate.getText());
                     
                     
                     
                     
                     pstmt.executeUpdate();
           
                   JOptionPane.showMessageDialog(null,"BORROW SUCCESS!");
                   
             
                      pstmt.close();
                   connn.close();
                   
                   
                   mtxtmovietitle.setText("");
                   mtxtmovieid.setText("");
                   mtxtdate.setText("");
                     
                    
                    }   catch (ClassNotFoundException ex) {
                            Logger.getLogger(Upepeopanel.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(SQLException j){
                        JOptionPane.showMessageDialog(null, "NOT AVAILABLE");
                        
                        mtxtmovietitle.setText("");
                   mtxtmovieid.setText("");
                   mtxtdate.setText("");
                        }
                  
                  
          
    } 

    ); 

fmembersearch.add(pmembs);

fmembersearch.setSize(1500, 1500);
fmembersearch.setVisible(false);
fmembersearch.setLayout(null);
fmembersearch.addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 


//show movies table in admin page
ftables2=new JFrame("MOVIE COLLECTION");
    
ptables2= new JPanel();
ptables2.setBounds(0, 0, 1000, 800);
ptables2.setBackground(Color.BLUE);
ptables2.setLayout(null);

 lthriller2= new JLabel("Thriller");
 lthriller2.setBounds(10, 30, 50, 20);
 lthriller2.setForeground(Color.ORANGE);
 
 
  Object[] rowthriller2 = new String[2];
Object [] columnthriller2 = { " Thriller Movie ID", "movie Title"};
DefaultTableModel to = new DefaultTableModel(columnthriller2,0);
               thrillertable2= new JTable(to);
               thrillertable2.setLayout(null);
               thrillertable2.setLocation(700,400);
               thrillertable2.setSize(600, 350);
               thrillertable2.setForeground(Color.red);
               thrillertable2.setBackground(Color.green);
               thrillertable2.setVisible(true);
               
               JScrollPane ctr = new JScrollPane(thrillertable2); 
               ctr.setBounds(10, 50, 400, 100);
		ptables2.add(ctr); 
                ptables2.add(lthriller2);
                
                
                                    
 lgeneral2= new JLabel("General");
 lgeneral2.setBounds(10, 330, 50, 20);
 lgeneral2.setForeground(Color.orange);
                
 Object[] rowgeneral2 = new String[2];
Object [] columngeneral2 = { " General Movie ID", "movie Title"};
DefaultTableModel rkos = new DefaultTableModel(columngeneral2,0);
               generaltable2= new JTable(rkos);
               generaltable2.setLayout(null);
               generaltable2.setLocation(700,400);
               generaltable2.setSize(600, 350);
               generaltable2.setForeground(Color.RED);
               generaltable2.setBackground(Color.GREEN);
               generaltable2.setVisible(true);
               
               JScrollPane cgi = new JScrollPane(generaltable2); 
               cgi.setBounds(10, 350, 400, 100);
		ptables2.add(cgi); 
                ptables2.add(lgeneral2);
                
                
  lcartoon2= new JLabel("Cartoon");
 lcartoon2.setBounds(10, 580, 50, 20);
 lcartoon2.setForeground(Color.ORANGE);
 Object[] rowcartoon2 = new String[2];
Object [] columncartoon2 = { " Cartoon Movie ID", "movie Title"};
DefaultTableModel modeloz = new DefaultTableModel(columncartoon2,0);
               cartoontable2= new JTable(modeloz);
               cartoontable2.setLayout(null);
               cartoontable2.setLocation(700,400);
               cartoontable2.setSize(600, 350);
               cartoontable2.setForeground(Color.RED);
               cartoontable2.setBackground(Color.GREEN);
               cartoontable2.setVisible(true);
               
               JScrollPane cck = new JScrollPane(cartoontable2); 
               cck.setBounds(10, 600, 400, 100);
		 
                ptables2.add(cck);
                ptables2.add(lcartoon2);     
                
                
 lhorror2= new JLabel("Horror");
 lhorror2.setBounds(450, 30, 50, 20);
 lhorror2.setForeground(Color.ORANGE);               
                       Object[] rowhorror2 = new String[2];
Object [] columnhorror2 = { "Horror Movie ID", "movie Title"};
DefaultTableModel ote = new DefaultTableModel(columnhorror2,0);
               horrortable2= new JTable(ote);
               horrortable2.setLayout(null);
               horrortable2.setLocation(700,400);
               horrortable2.setSize(600, 350);
               horrortable2.setForeground(Color.RED);
               horrortable2.setBackground(Color.GREEN);
               horrortable2.setVisible(true);
               
               JScrollPane hyo = new JScrollPane(horrortable2); 
               hyo.setBounds(450, 50, 400, 100);
		ptables2.add(hyo);
                ptables2.add(lhorror2);
                
       lcomedy2= new JLabel("Comedy");
 lcomedy2.setBounds(450, 330, 50, 20);
 lcomedy2.setForeground(Color.ORANGE);            
                
                Object[] rowcomedy2 = new String[2];
Object [] columncomedy2 = { "Comedy Movie ID", "movie Title"};
DefaultTableModel koso = new DefaultTableModel(columncomedy2,0);
               comedytable2= new JTable(koso);
               comedytable2.setLayout(null);
               comedytable2.setLocation(700,400);
               comedytable2.setSize(600, 350);
               comedytable2.setForeground(Color.RED);
               comedytable2.setBackground(Color.GREEN);
               comedytable2.setVisible(true);
               
               JScrollPane cru = new JScrollPane(comedytable2); 
                cru.setBounds(450, 350, 400, 100);
		ptables2.add(cru);
                ptables2.add(lcomedy2);                
   
                ftables2.add(ptables2);
                ftables2.setSize(1000,800);
                 ftables2.setVisible(false);
                 ftables2.setResizable(false);
                 



DisplayTable();
DisplayTable2();
DisplayTable3();
DisplayTable4();
DisplayTable5();
DisplayTable6();
DisplayTable7();
DisplayTable8();
DisplayTable9();
DisplayTable10();
DisplayTable11();
DisplayTable12();
DisplayTable13();
DisplayTable14();
DisplayTable15(); 

}

  private void DisplayTable() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from cartoon";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     cartoontable.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  
  private void DisplayTable2() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from thriller";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     thrillertable.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable3() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from comedy";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     comedytable.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable4() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from general";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     generaltable.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable5() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from horror";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     horrortable.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
   private void DisplayTable6() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from recorddd";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     tablerecord.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable7() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from membership";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     tablememberdetails.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  
   private void DisplayTable8() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from password";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     tablememberpasswords.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
   
   private void DisplayTable9() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from paymentrecords";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     tablemoney.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
   
   private void DisplayTable10() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from permanentrecords";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     tablepermanentrecords.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable11() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from cartoon";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     cartoontable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  
  private void DisplayTable12() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from thriller";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     thrillertable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable13() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from comedy";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     comedytable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable14() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from general";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     generaltable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  private void DisplayTable15() {
          try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection connn= DriverManager.getConnection("jdbc:mysql://localhost:3301/upepeo","root","Hitlaasoni275");
              
                     String sql = "select * from horror";
                     PreparedStatement pstmt = connn.prepareStatement(sql);
                     ResultSet rs = pstmt.executeQuery();
                     horrortable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                    
                    
                        }catch(Exception j){
                        JOptionPane.showMessageDialog(null, j);
                        }
    }
  
  
  
            
 
        

	// main class 
	public static void main(String[] args) 
	{ 
		new Upepeopanel();
	} 
} 

