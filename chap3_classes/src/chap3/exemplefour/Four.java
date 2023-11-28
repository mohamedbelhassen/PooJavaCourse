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
public class Four {
    final private int capacite;

    public int getCapacite() {
        return capacite;
    }
    //int puissance;
    private Resistance resistance;
    private Soufflerie soufflerie;

    public void setSoufflerie(Object soufflerie) {
        if (soufflerie instanceof Soufflerie ){
            this.soufflerie = (Soufflerie)soufflerie;
            System.out.println("Soufflerie modifiée avec succès");

        }
        else
            System.out.println("il faut passer une soufflerie");
        
    }
    
    public Resistance getResistance() {
        return resistance;
    }
    private void maintenir() {
        System.out.println("Opération de maintenance du four en cours");
    }

    Four(int capacite){
    resistance= new Resistance(200,"LG");
    soufflerie= new Soufflerie();
    this.capacite=capacite;
    }
    
    Four(int capacite, Resistance resistance){
    this.resistance= resistance;
    soufflerie= new Soufflerie();
    this.capacite=capacite;
    }
    
    public void cuire(int temperature, int duree) {
        if (resistance instanceof Resistance 
                && soufflerie instanceof Soufflerie)
            System.out.println("Je cuis un aliment avec une température de " + 
                    temperature+ " degré et une durée de "+duree+" minutes");
        else
            System.out.println("problème sérieux! four en panne");
    }
    public void cuire() {
        System.out.println("Je cuis un aliment");
        System.out.println("avec ma capacité de " + capacite + " litres");
        //System.out.println("et ma puissance de " + puissance + " degrés.");
    }
    public void cuire(Aliment aliment) {
    System.out.println("Je cuis un aliment : " + aliment.nom);
    System.out.println("avec ma capacité de " + capacite + " litres");
    //System.out.println("et ma puissance de " + puissance + " degrés.");
    aliment.setEstCuit(true);
    }
    public String toString(){
        return "ma résistance :"+resistance+"\tcapacité: "+capacite+"\n";
    }
}