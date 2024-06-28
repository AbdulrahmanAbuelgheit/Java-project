/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author r
 */
public class conection_var extends JFrame {
    public ResultSet r;
        public  Connection c;
        public PreparedStatement ss;
        public final String uri="jdbc:mysql://localhost:3306/project";
}
