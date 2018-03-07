/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author majd
 */
public class ConnexionBD {
    Connection connection ;
   private   String url ="jdbc:mysql://localhost:3306/Assosiation?characterEncoding=utf8" ;
   private   String user ="root";
   private   String password ="";
    static ConnexionBD instance ;
    public ConnexionBD()  {
      
       try {
           connection = DriverManager.getConnection(url,user,password);
       } catch (SQLException ex) {
         
           System.out.println(ex);
       }
    }

    public Connection getConnection() {
        return connection;
    }
    
   public static ConnexionBD getInstance()
    {
         if(instance == null )
        {
            return instance = new ConnexionBD();
        }
        return instance ;
    }
    
}
