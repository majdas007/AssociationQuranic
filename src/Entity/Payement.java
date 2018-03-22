/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author majd
 */
public class Payement {
    String Nom , Prenom ,Mois , Annee ; 
    int tarif ; 

    
    public  Payement(String Nom , String Prenom , String Mois , String Annee,int tarif)
    {
        this.Nom = Nom ; 
        this.Prenom = Prenom ; 
        this.Mois = Mois ; 
        this.Annee = Annee;
        this.tarif=tarif ; 
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

    public String getMois() {
        return Mois;
    }

    public void setMois(String Mois) {
        this.Mois = Mois;
    }

    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String Annee) {
        this.Annee = Annee;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
}
