/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Inscrit;
import Utils.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author majd
 */
public class Inscrit_Service {
    
    
      static Inscrit_Service instance ;
      
     public static void AddMembre(Inscrit membre)
     {
         String Sql ="INSERT INTO Inscrit(Nom, Prenom, Niveau) VALUES (?,?,?)";
         try {
              PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(Sql);
             ste.setString(1,membre.getNom());
             ste.setString(2, membre.getPrenom());
             ste.setString(3, membre.getNiveau());
             ste.executeUpdate();
             
             
         } catch (Exception e) {
             
             System.out.println(e);
             
         }
     }

     public static void UpdateMembre(String Niveau ,int id)
     {
         String Sql ="UPDATE Inscrit SET Niveau = ? WHERE id_Inscrit = ? ";
         try {
              PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(Sql);
              ste.setString(1,Niveau);
             ste.setInt(2, id);
              ste.executeUpdate();
             
         } catch (Exception e) {
             System.out.println(e);
         }
     }
      
     
     
     
       public static Inscrit_Service getInstance()
    {
         if(instance == null )
        {
            return instance = new Inscrit_Service();
        }
        return instance ;
    }
}
