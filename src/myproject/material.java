/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.Transparency;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author r
 */
public class material {
    JFrame frame=new JFrame("material chosser");
    JTable t=new JTable();
    DefaultTableModel model=new DefaultTableModel();
    String colomn[]={"time","saturday","sunday","monday","tuesday","wednesday","thursday"};
    Object e[][]={};
    JPanel p=new JPanel();
    JCheckBox c1=new JCheckBox("operating system");JCheckBox c4=new JCheckBox("operating system");
    JCheckBox c2=new JCheckBox("operating system");JCheckBox c5=new JCheckBox("operating system");
    JCheckBox c3=new JCheckBox("operating system");JCheckBox c6=new JCheckBox("operating system");
    //JScrollPane b;
    material(){
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 600);
    frame.setResizable(false);
    frame.setLocation(200,50);
    model.setDataVector(e, colomn);
    t.setModel(model);
    frame.setLayout(null);
   // b.setBounds(22, 10, 20,100);
    p.setBackground(Color.decode("#45423E"));
    //frame.add(b);
   // t.setSize(900, 450);
   // p.setSize(900, 150);
   p.setLayout(null);
   t.setBounds(0, 200, 900, 400);
   p.setBounds(0,0,900,200);//b=new JScrollPane(t);
   c1.setBackground(null);c1.setForeground(Color.decode("#EE8223"));c4.setBackground(null);c4.setForeground(Color.decode("#EE8223"));
   c2.setBackground(null);c2.setForeground(Color.decode("#EE8223"));c5.setBackground(null);c5.setForeground(Color.decode("#EE8223"));
   c3.setBackground(null);c3.setForeground(Color.decode("#EE8223"));c6.setBackground(null);c6.setForeground(Color.decode("#EE8223"));
   //c1.setBounds(10, 5, 200, 25); c2.setBounds(10, 50, 200, 25); c3.setBounds(10, 75, 200, 25);
   
    frame.add(p);//;frame.add(t);
   // p.add(c1);p.add(c2);p.add(c3);p.add(c4);
  // p.add(c5);p.add(c6);
  p.add(t);
    
    
    
    }
    
}
