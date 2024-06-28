package myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.SQLException;
import java.sql.DriverManager;

public class SignUp  extends conection_var implements ActionListener{
    

        conection_var r4=new conection_var();

        JPanel panel_1=new JPanel();
        JPanel panel_2=new JPanel();
        JFrame frame=new JFrame("Sign Up");
        JLabel l_fname,l_lname,l_uname,l_id,l_pass,l_email,l_level;
        JButton b_create,b_back,b_clear,b_exit;
        JTextField t_fname,t_lname,t_uname,t_id,t_email;;
        JPasswordField pass;
        JComboBox compo;
        String[] level={"level 1 ","level 2 ","level 3 ","level 4 "};

        SignUp(){

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame. setLocation(500,75);
            frame. setSize(600,490);
            frame.add(panel_1);
            frame.add(panel_2);
            compo=new JComboBox(level);
            panel_1.setBackground(Color.decode("#EE8223"));
            panel_2.setBackground(Color.decode("#45423E"));

            /* ************************ */
            l_fname=new JLabel("First Name ");
            l_lname=new JLabel("Last name ");
            l_uname=new JLabel("Username");
            l_id=new JLabel("ID ");
            l_pass=new JLabel("Password");
            l_email=new JLabel("Email");
            l_level=new JLabel("Level");

            b_create=new JButton("Create");
            b_back=new JButton("Back");
            b_clear=new JButton("Clear");
            b_exit=new JButton("Exit");

            t_fname=new JTextField();
            t_lname=new JTextField();
            t_uname=new JTextField();
            t_id=new JTextField();
            t_email=new JTextField();

            //t2.setBackground(Color.decode("#EE550E"));

            pass=new JPasswordField();

            panel_1.setLayout(null);
            panel_2.setLayout(null);
            panel_1.setBounds(0,0,175,600);

            l_fname.setBounds(220,50,120,30);
            t_fname.setBounds(350,50,200,30);
            panel_2.add(l_fname);       panel_2.add(t_fname);

            l_lname.setBounds(220,100,120,30);
            t_lname.setBounds(350,100,200,30);
            panel_2.add(l_lname);       panel_2.add(t_lname);

            l_uname.setBounds(220,150,120,30);
            t_uname.setBounds(350,150,200,30);
            panel_2.add(l_uname);       panel_2.add(t_uname);

            l_id.setBounds(220,200,120,30);
            t_id.setBounds(350,200,200,30);
            panel_2.add(l_id);       panel_2.add(t_id);

            l_pass.setBounds(220,250,120,30);
            pass.setBounds(350,250,200,30);
            panel_2.add(l_pass);       panel_2.add(pass);

            l_email.setBounds(220,300,120,30);
            t_email.setBounds(350,300,200,30);
            panel_2.add(l_email);       panel_2.add(t_email);

            b_create.setBounds(350,370,205,50);
            panel_2.add(b_create);

            b_back.setBounds(20,300,120,50);
            panel_1.add(b_back);

            b_clear.setBounds(20,20,120,50);
            panel_1.add(b_clear);

            b_exit.setBounds(20,370,120,50);
            panel_1.add(b_exit);
            
            l_level.setBounds(220,350,120,30);
            compo.setBounds(350,350,200,30);
            panel_2.add(compo); panel_2.add(l_level);
            /**************** color ***************/

            /************ label ******************/
            l_fname.setForeground(Color.decode("#EE8223"));
            l_lname.setForeground(Color.decode("#EE8223"));
            l_id.setForeground(Color.decode("#EE8223"));
            l_uname.setForeground(Color.decode("#EE8223"));
            l_pass.setForeground(Color.decode("#EE8223"));
            l_email.setForeground(Color.decode("#EE8223"));
            l_level.setForeground(Color.decode("#EE8223"));

            /***********Text filed *******************/
            t_fname.setBackground(Color.decode("#DAD9D8"));
            t_fname.setBackground(null);
            t_fname.setForeground(Color.decode("#ffffff"));
            t_fname.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            t_lname.setBackground(Color.decode("#DAD9D8"));
            t_lname.setBackground(null);
            t_lname.setForeground(Color.decode("#ffffff"));
            t_lname.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            t_uname.setBackground(Color.decode("#DAD9D8"));
            t_uname.setBackground(null);
            t_uname.setForeground(Color.decode("#ffffff"));
            t_uname.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            t_id.setBackground(Color.decode("#DAD9D8"));
            t_id.setBackground(null);
            t_id.setForeground(Color.decode("#ffffff"));
            t_id.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            pass.setBackground(Color.decode("#DAD9D8"));
            pass.setBackground(null);
            pass.setForeground(Color.decode("#ffffff"));
            pass.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            t_email.setBackground(Color.decode("#DAD9D8"));
            t_email.setBackground(null);
            t_email.setForeground(Color.decode("#ffffff"));
            t_email.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#EE8223")));

            b_create.setBackground(Color.decode("#888888"));
            b_create.setForeground(Color.decode("#00000"));

            b_back.setBackground(Color.decode("#45423E"));
            b_back.setForeground(Color.decode("#ffffff"));

            b_clear.setBackground(Color.decode("#45423E"));
            b_clear.setForeground(Color.decode("#ffffff"));

            b_exit.setBackground(Color.decode("#45423E"));
            b_exit.setForeground(Color.decode("#ffffff"));

            b_back.addActionListener(this);
            b_clear.addActionListener(this);
            b_exit.addActionListener(this);
            
            compo.setBackground(Color.decode("#45423E"));
            compo.setForeground(Color.decode("#EE8223"));
            compo.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.decode("#EE8223")));

        }

        @Override
        public void actionPerformed(ActionEvent e) {
             String s1,s2,q1,s;
            Object[] row=new Object[6];
            if(e.getSource()==b_back){
                frame.setVisible(false);
                login l=new login();
            }

            if(e.getSource()==b_exit){
                frame.setVisible(false);
            }

            if(e.getSource()==b_clear){
            t_fname.setText(" ");
            t_lname.setText(" ");
            t_uname.setText(" ");
            t_id.setText(" ");
            t_email.setText(" ");
            pass.setText("");


            }
            if(e.getSource()==b_back){
                System.out.println("succes");
            try{
                
               // Class.forName("com.mysql.jdbc.Driver");
               // s=compo.getSelectedItem().toString();
                q1="INSERT INTO `signup`(`first_name`, `last_name`, `id`, `password`, `e_mail`, `level`) VALUES ('"+t_fname.getText()+"','"+t_lname.getText()+"',"+t_id.getText()+",'"+pass.getText()+"','"+t_email.getText()+"','"+compo.getSelectedItem()+"')";
                c=DriverManager.getConnection(uri,"hy","1234");
                ss=c.prepareStatement(q1);
                ss.execute();
                System.out.println("success");
                r=ss.executeQuery("SELECT * FROM `SignUp` ;");
                while(r.next()){
                row[0]=r.getString("first_name");
                 row[1]=r.getString("last_name");
                 row[2]=r.getInt("id");
                 row[3]=r.getString("password");
                 row[3]=r.getString("e_mail");
                 row[3]=r.getString("level");
                }
                for(int i=0;i<6;i++){System.out.println(row[i]);}
            }catch(SQLException ee){
                System.out.println(ee.getMessage());
           // }   catch (ClassNotFoundException ex) {
                   // Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
            try{
                c.close();
                ss.close();
                }catch(SQLException ee){ee.getMessage();}

            }}}}
    






