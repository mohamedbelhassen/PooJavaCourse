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
class Felin {
    boolean aFaim= true;
    void parler(){}
    void appeler(){
        System.out.println("Le félin est appelé");
        if (aFaim)
            parler();
    }
}

final class Chat extends Felin{
    String race;
    //boolean aFaim= false; // redéfinition d'une propriété existante
    void parler(){System.out.println("miaou!");}
    //void parler(){System.out.println("miaou!"+ this.aFaim+", super: "+super.aFaim);}//la valeur de la propriété héritée est différente de la propriété de cette classe fille
}

final class Tigre extends Felin{
    void parler(){System.out.println("Groar!");}
    void chasser(){System.out.println("Le tigre est en chasse!");}

}

final class Lion extends Felin{
    void parler(){System.out.println("Euhh!");}
}