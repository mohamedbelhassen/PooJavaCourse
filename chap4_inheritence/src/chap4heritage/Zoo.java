/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4heritage;

/**
 *
 * @author Belhassen
 */
public class Zoo {
    int MAX;
    Felin[]liste;
    int compteur = 0;
    Zoo(int taille){
        MAX = taille; 
        liste = new Felin[MAX];
    }
    void addFelin(Felin nouveauFelin){
        if(compteur<MAX)
            liste[compteur++]= nouveauFelin;
        else
            System.out.println("Zoo plein, pas de place");
    }
    //la méthode "appeler" ne peut pas être redéfinie dans une sous classe
    final void appeler(){
        for(int i=0; i<compteur;i++)
            liste[i].parler();//appel polymorphe
    }
}
