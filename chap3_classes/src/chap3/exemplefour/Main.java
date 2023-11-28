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
public class Main {

    public static void main(String[] args) {
//        Four petitFour = new Four();
//        petitFour.capacite = 30;
//        petitFour.puissance = 180;
//        
//        Four grandFour = new Four();
//        grandFour.capacite = 55;
//        grandFour.puissance = 260;
//
//        petitFour.cuire();
//        System.out.println("");
//        grandFour.cuire();

    Resistance res= new Resistance(100, "samsung");
     Four grandFour = new Four(100,res);
   //grandFour.capacite = 55;
   System.out.print(grandFour);
   //grandFour.puissance = 260;
//
//    Aliment cake = new Aliment();
//    cake.nom = "cake aux fruits";
//    cake.estCuit = false;
//    cake.manger();
//    System.out.println("");
//    grandFour.cuire(cake);
//    System.out.println("");
//    cake.manger();
    Resistance res2= new Resistance(50, "beko");

        Four petitFour = new Four(50,res2);
        System.out.print(petitFour);

        //Soufflerie s= new Soufflerie();
        Resistance s = new Resistance(10, "LG");
        petitFour.setSoufflerie(s);
        Aliment viande= new Aliment("Viande");
        viande.manger();
        
        petitFour.cuire(viande);
        viande.manger();

        //four.setSoufflerie(null);
        //four.cuire(180, 10);

    }
}
