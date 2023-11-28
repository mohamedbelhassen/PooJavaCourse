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

class BergerAllemand extends ClasseChien{
    final String race="Berger Allemand";

    public BergerAllemand(String nom) {
        super(nom);
    }
}

public class ClasseChien {

 


    private String nom;
    private String couleurYoeux;
    int age;
    private boolean avecQueue;
    private String race = "Berger";
    private static int count = 0;
    
    ClasseChien(){
        count++;
    }
    ClasseChien(String nom){
        this.nom=nom;
        count++;
    }
    
    @Override
    public  void finalize (){
        count-=1;
        System.out.println("finalize method called");   
        System.out.println("Nombre de chiens actuel: "+
                            ClasseChien.getCount());
        

    }
    
    public void aboie(){
        Message msgAboie= new Message();
        msgAboie.setMessage("Wouah Wouah!");
        System.out.println(getNom()+": "+msgAboie);
    }
    void afficheAge(){
    System.out.println("Age: "+age);
    }
    
    static void  afficheNombreChiens(){
        System.out.println("nombre de chiens: "+getCount());
//        System.out.println("age: "+count);
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the couleurYoeux
     */
    public String getCouleurYoeux() {
        return couleurYoeux;
    }

    /**
     * @param couleurYoeux the couleurYoeux to set
     */
    public void setCouleurYoeux(String couleurYoeux) {
        this.couleurYoeux = couleurYoeux;
    }


    /**
     * @return the avecQueue
     */
    public boolean isAvecQueue() {
        return avecQueue;
    }

    /**
     * @param avecQueue the avecQueue to set
     */
    public void setAvecQueue(boolean avecQueue) {
        this.avecQueue = avecQueue;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }
}
