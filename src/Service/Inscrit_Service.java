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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author majd
 */
public class Inscrit_Service {
    
    
      static Inscrit_Service instance ;
      
     public static void AddMembre(Inscrit membre)
     {
         String Sql ="INSERT INTO Inscrit(Nom, Prenom, Niveau,niveau_educ,alhifdh,autre_association,email,date,categorie,cin,id_assoc,adresse,tel) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
         try {
              PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(Sql);
             ste.setString(1,membre.getNom());
             ste.setString(2, membre.getPrenom());
             ste.setString(3, membre.getNiveau());
             ste.setString(4,membre.getNiveau_educ());
             ste.setInt(5,membre.getAlhifdh());
             ste.setString(6,membre.getAutre_assoc());       
             ste.setString(7,membre.getEmail());
             ste.setString(8,membre.getDate_naiss());
             ste.setString(9,membre.getCategorie());
             ste.setInt(10,membre.getCin());
             ste.setInt(11,membre.getId_assoc());
             ste.setString(12,membre.getAdress());
             ste.setInt(13,membre.getTel()) ;
                  
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
      
     public static void DeleteMembre( int id )
     {
         String req = "DELETE FROM Inscrit WHERE id_Inscrit = ? " ;
         try {
             PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(req);
             ste.setInt(1, id);
             ste.executeUpdate();
             
         } catch (Exception e) {
             System.out.println(e);
         }
     }
     
//     public static List<Inscrit> ReadQuestion()
//    {
//        String req = "SELECT * from Inscrit ";
//         List<Inscrit> p = new ArrayList<>();
//         try {
//             PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(req);
//             ResultSet result = ste.executeQuery();
//
//              while(result.next())
//             {
//                 p.add(
//                 new Inscrit(result.getString("Nom"),result.getString("Prenom"),result.getString("Niveau"),result.getInt("niveau_educ"),result.getString(""))
//                 );
//             }
//        } catch (SQLException ex) {
//             System.out.println(ex);
//        }
//         /* for ( Question e : p) {
//                System.out.println(e);
//          }*/
//         return p ;
//    }
     
     
     
       public static Inscrit_Service getInstance()
    {
         if(instance == null )
        {
            return instance = new Inscrit_Service();
        }
        return instance ;
    }
}
