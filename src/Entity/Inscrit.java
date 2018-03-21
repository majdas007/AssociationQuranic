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
    
    private int id ,id_assoc , cin , alhifdh , tel; 
   private String Nom, Prenom ; 
     private String Niveau , niveau_educ ,email ,autre_assoc,categorie,date_naiss ,adress;

    
    public Inscrit(String Nom , String Prenom , String Niveau , int id_assoc,int cin ,  int alhifdh ,int tel, String niveau_educ
    
     , String email , String autre_assoc,String categorie, String date_naiss,String adress )
    {
       this.Nom = Nom ; 
       this.Prenom = Prenom ; 
       this.Niveau = Niveau;  
       this.id_assoc = id_assoc;
       this.cin = cin;
       this.alhifdh = alhifdh;
       this.niveau_educ = niveau_educ;
       this.email= email;
       this.autre_assoc= autre_assoc;
       this.categorie= categorie;
       this.tel = tel;
       this.date_naiss = date_naiss;
       this.adress = adress ;
       
       
       
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    

    public int getId_assoc() {
        return id_assoc;
    }

    public void setId_assoc(int id_assoc) {
        this.id_assoc = id_assoc;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getAlhifdh() {
        return alhifdh;
    }

    public void setAlhifdh(int alhifdh) {
        this.alhifdh = alhifdh;
    }

    public String getNiveau_educ() {
        return niveau_educ;
    }

    public void setNiveau_educ(String niveau_educ) {
        this.niveau_educ = niveau_educ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAutre_assoc() {
        return autre_assoc;
    }

    public void setAutre_assoc(String autre_assoc) {
        this.autre_assoc = autre_assoc;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
