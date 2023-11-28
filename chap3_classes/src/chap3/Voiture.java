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
public class Voiture {
    String marque;
    static int nbVoitures = 0;
    Voiture(String marque){
        this.marque= marque;
        nbVoitures++;
    }
    public String getModel(){return marque;}
    
    static int getNbVoitures(){return nbVoitures;}
    @Override
    public void finalize(){
        nbVoitures--;
        
        System.out.println("Voiture "+marque+ " sera détruit");
        System.out.println("NB voitures: "+Voiture.getNbVoitures());

    }
}
