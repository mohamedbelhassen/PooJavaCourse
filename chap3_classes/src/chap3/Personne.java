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
public class Personne {
    private String nom;
    private String prenom;
    Personne(String nom, String prenom){
    this.nom=nom;
    this.prenom=prenom;
    }
    public String toString(){
        return "Nom: "+nom+", Prénom: "+prenom;
    }
    
}
