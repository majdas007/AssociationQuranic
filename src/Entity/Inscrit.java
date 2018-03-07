/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Utils.ConnexionBD;
import java.sql.Connection;

/**
 *
 * @author majd
 */
public class Inscrit {
    private int id ; 
    String Nom, Prenom ; 
    String Niveau ; 

    
    public Inscrit(String Nom , String Prenom , String Niveau)
    {
       this.Nom = Nom ; 
       this.Prenom = Prenom ; 
       this.Niveau = Niveau;
       
    }
    
    
    
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String Niveau) {
        this.Niveau = Niveau;
    }
    
    
}
