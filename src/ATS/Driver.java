/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Reha
 */
public class Driver {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        //Username and password to access your database
        String user = "root";
        String password = "Maputo31";
      
        try{
            //Get a connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATS", user, password);
            System.out.println("Connected to database");
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
