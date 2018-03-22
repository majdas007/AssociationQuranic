/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Entity.Payement;
import static Service.Inscrit_Service.instance;
import Utils.ConnexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author majd
 */
public class Payement_Service {
    
    
    static Payement_Service instance;
    
    
    public static void AddPayment(Payement p )
            
    {
        String rep = "INSERT INTO `Payement`(Nom, Prenom, Mois, Tarif, Annee) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(rep);
            ste.setString(1,p.getNom());
            ste.setString(2,p.getPrenom());
            ste.setString(3,p.getMois());
            ste.setInt(4,p.getTarif());
            ste.setString(5,p.getAnnee());
          
            ste.executeUpdate();       
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }
    
    public static int Somme( String Mois)
    {
        int res = 0 ; 
        String req ="SELECT SUM(Tarif) FROM Payement WHERE Mois =?";
        try {
            
            PreparedStatement  ste = ConnexionBD.getInstance().getConnection().prepareStatement(req);
            ste.setString(1, Mois);
             ResultSet result = ste.executeQuery();
              while (result.next()){
                 res =  result.getInt("SUM(Tarif)") ;         
              }
                
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return res;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       public static Payement_Service getInstance()
    {
         if(instance == null )
        {
            return instance = new Payement_Service();
        }
        return instance ;
    }
}
