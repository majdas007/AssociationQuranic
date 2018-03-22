/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associationquranic;

import Entity.Payement;
import Service.Inscrit_Service;
import Service.Payement_Service;

/**
 *
 * @author majd
 */
public class AssociationQuranic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Inscrit i = new Inscrit ("مجد ","ميمون","مستوى أول " ,11,12365,11,15," تتت "," ووو ","لخضر ","أمين","محمد","يحيى");
        
      //  Inscrit_Service.getInstance().AddMembre(i);
     //  Inscrit_Service.getInstance().UpdateMembre("المستوى الثاني",5);
       // Payement p = new Payement("يحيى ","زمالي ","نوفمبر","200",20);
        
       // Payement_Service.getInstance().AddPayment(p);
        System.out.println( Payement_Service.getInstance().Somme("نوفمبر"));
        
        
    }
    
}
