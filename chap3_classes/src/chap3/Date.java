/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

/**
 *
 * @author Belhassen
 */
public class Date {
    int jour;
    int mois;
    int an=1990;
    
    Date(){
        an=2000;
    }
        
    Date(int an){
        //an=an;
        this.an=an;
        System.out.println("Année initialisée à "+this.an);

    }
    Date(int jour, int mois, int an){
        this(an);
        this.jour=jour;
        this.mois= mois;
                
    }
    public String toString(){
    return this.jour+"/"+this.mois+"/"+this.an;
    }
}
