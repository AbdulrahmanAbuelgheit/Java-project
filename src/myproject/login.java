package myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;

public class login extends conection_var implements ActionListener {
    JPanel panel_1=new JPanel();
    JPanel panel_2=new JPanel();
    JFrame frame=new JFrame("Login");

        JLabel l_id,l_passwd;
        JPasswordField passwd;
        JButton b_login,b_sign,b_exit;
        JTextField t_name;
        JRadioButton student,doctor;
        ButtonGroup group;
        login(){
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
           frame.setResizable(false);
           frame. setLocation(600,200);
           frame. setSize(500,325);
           frame.add(panel_1);
           frame.add(panel_2);
            panel_1.setBackground(Color.decode("#EE8223"));
            panel_2.setBackground(Color.decode("#45423E"));
            /* ************************ */
            l_id=new JLabel("ID");
            l_passwd=new JLabel("Password");

            b_login=new JButton("Login");
            b_sign=new JButton("Sign Up");
            b_exit=new JButton("Exit");

            t_name=new JTextField();

            passwd=new JPasswordField();

            student=new JRadioButton("student");
            doctor=new JRadioButton("doctor");
            group=new ButtonGroup();


            panel_1.setLayout(null);
            panel_2.setLayout(null);
            panel_1.setBounds(0,0,125,300);

            l_id.setBounds(175,50,120,30);
            t_name.setBounds(250,50,200,30);
            panel_2.add(l_id);       panel_2.add(t_name);

            l_passwd.setBounds(175,125,120,30);
            passwd.setBounds(250,125,200,30);
            panel_2.add(l_passwd);       panel_2.add(passwd);

            b_login.setBounds(300,190,150,50);
            panel_2.add(b_login);

            b_exit.setBounds(15,20,100,30);
            panel_1.add(b_exit);

            b_sign.setBounds(15,190,100,50);
            panel_1.add(b_sign);

            student.setBounds(150,165,150,50);
            group.add(student);
            panel_2.add(student);

            doctor.setBounds(150,205,150,50);
            group.add(doctor);
            panel_2.add(doctor);



            /********************* color color color color color**************************/
            /********************label and passwd **********/
            l_id.setForeground(Color.decode("#EE8223"));
            l_passwd.setForeground(Color.decode("#EE8223"));

            t_name.setBackground(Color.decode("#DAD9D8"));
            t_name.setBackground(null);
            t_name.setForeground(Color.decode("#ffffff"));
            t_name.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            passwd.setBackground(Color.decode("#DAD9D8"));
            passwd.setBackground(null);
            passwd.setForeground(Color.decode("#ffffff"));
            passwd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));
            /**********************************************/
            /************ button **************/
            b_login.setBackground(Color.decode("#888888"));
            b_login.setForeground(Color.decode("#00000"));

            b_exit.setBackground(Color.decode("#45423E"));
            b_exit.setForeground(Color.decode("#ffffff"));

            b_sign.setBackground(Color.decode("#45423E"));
            b_sign.setForeground(Color.decode("#ffffff"));
            /*********************************************/
            /***************** radio box *********************/
            student.setBackground(Color.decode("#DAD9D8"));
            student.setBackground(null);
            student.setForeground(Color.decode("#EE8223"));

            doctor.setBackground(Color.decode("#DAD9D8"));
            doctor.setBackground(null);
            doctor.setForeground(Color.decode("#EE8223"));


            b_login.addActionListener(this);
            b_sign.addActionListener(this);
            b_exit.addActionListener(this);        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1,s2;
            if(e.getSource()==b_login){
                 s1=t_name.getText();
                 s2=passwd.getText();
                System.out.println(s1+"  "+s2);
                 try{
             c=DriverManager.getConnection(uri,"hy","1234");
                
                System.out.println("success");
                ss=c.prepareStatement("selet * from SignUp");
                r=ss.executeQuery("SELECT * FROM `SignUp` WHERE id='"+t_name.getText()+"'AND password='"+passwd.getText()+"' ;");
                if(r.next()){System.out.println("true");}else{System.out.println("false");}
                for(int i=0;i<6;i++){System.out.println("");}
            }catch(SQLException ee){
                System.out.println(ee.getMessage());
           // }   catch (ClassNotFoundException ex) {
                   // Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
            try{
                c.close();
                
                }catch(SQLException ee){ee.getMessage();}}}

                
            
            if(e.getSource()==b_sign){
                frame.setVisible(false);
                SignUp s=new SignUp();
        }
            if(e.getSource()==b_exit){
                frame.setVisible(false);

            }
            
}}






