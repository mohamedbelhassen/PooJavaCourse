/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3.exemplefour;

/**
 *
 * @author moham
 */
public class Aliment {


    String nom;
    boolean estCuit;

    public Aliment(String nom) {
        this.nom=nom;
        estCuit=false;
    }
    
    
    public String getNom() {
        return nom;
    }

    public boolean isEstCuit() {
        return estCuit;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEstCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }

    public void manger() {
        if (estCuit) {
            System.out.println("Miam miam cet aliment : " + nom + " est bien cuit");
        } else {
            System.out.println("Beeerk cet aliment : " + nom + " est cru !");
        }
    }
}