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
public class Chap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        MaClasse monPremierObjet;
//        monPremierObjet= new MaClasse();
//        System.out.println(monPremierObjet);

//        MaClasseFille objFille;
//        objFille= new MaClasseFille();
//        System.out.println(objFille);
//          ClasseChien.afficheNombreChiens();
//          System.out.println("Le nombre de chiens actuel est : "+ClasseChien.getCount());
            if(ClasseChien.getCount()==0){
                ClasseChien ch1= new ClasseChien("Bel");
                System.out.println("Nb chiens: "+ClasseChien.getCount());
                //ch1=null;
                if(ch1 instanceof ClasseChien){
                    System.out.println("Le nom du chien");
                    System.out.println(ch1.getNom());
                }
                else{
                    System.out.println("cette adresse ne contient pas un chien");
                }
            }
            
            System.out.println("Après if / Nb chiens: "+ClasseChien.getCount());

            
            
            //System.out.println(monChien.getNom());
                
           
                   
           for(int i =0;i<1000000;i++){
                ClasseChien ch1= new ClasseChien("Bel");
                //ClasseChien monChien=ch1;
                //System.out.println(ch1.getNom());
                //System.out.println(monChien.getNom());
           
            }
//          System.out.println("Nombre actuel de chiens: "+ClasseChien.getCount());
//          ClasseChien ch2= new ClasseChien("Alex");
//          System.out.println("Nombre actuel de chiens: "+ch1.getCount());
//          ch1.aboie();
//          ch2.aboie();
//           Personne p= new Personne("Ben Salah", "Mariem");
//           System.out.println(p);
//           System.out.println("carré de 5: "+MathTool.square(5));
//
//        System.out.println("Le nombre de chiens actuel est : "+ClasseChien.count);
//        System.out.println("Le nombre de chiens actuel est : "+ClasseChien.getCount());
//
//        if(ClasseChien.getCount()>0){
//            ClasseChien ch3= new ClasseChien("Alice");
//        }
//        
//        System.out.println("Le nombre de chiens actuel après if est : "+ClasseChien.getCount());
//        ch2.age=-4;
//        System.out.println("age chien: "+ch2.age);
//        ch2.afficheAge();
//        ch2.afficheNombreChiens();
//        
//        ch2.aboie();
//        ch1.aboie();
         //TestPrint t= new TestPrint();
         //float s=(float)11.5;
//char c='a';
         //t.print(s);   

         //t.print((float)c);
//         
//         BergerAllemand ba= new BergerAllemand("Alex");
//         ((ClasseChien)ba).setRace("Husky");
//         System.out.println("Race: "+ba.race);
//         System.out.println("Race: "+((ClasseChien)ba).getRace());
//         
//         System.out.println("(1)Nombre de chiens actuel: "+ClasseChien.getCount());
//         ba=null;
//         System.gc();
//            if(Voiture.nbVoitures==0){
//                Voiture clio = new Voiture("Clio");
//                System.out.println("1- NB voitures: "+Voiture.getNbVoitures());
//                Voiture bmw = new Voiture("BMW");
//                System.out.println("2- NB voitures: "+Voiture.getNbVoitures());
//                if(moiEstUnbFumeur()){
//                    Voiture maVoiture=bmw;
//                    System.out.println("3- NB voitures: "+Voiture.getNbVoitures());
//                    System.gc();
//                    System.out.println("appel du GC");
//
//                }
//                    System.gc();
//                    System.out.println("appel du GC");
//
//            }
//            
//            System.gc();
//            System.out.println("appel du GC");

         /*Date d= new Date(2000);
         System.out.println(d);    
         Date d2= new Date(14,3,2020);
         System.out.println(d2);    
*/
//         System.out.println("date: "+d2); 
           //Date d3=null;
           //si date nulle (non initialisé, on l'initialise
//           if(d3==null)
//               d3= new Date(2020);
//           System.out.println(d3); 
//         
//         if(d3 instanceof Object){
//             System.out.println("c'est une date ou une sous classe de date");
//         }
//         short a=1;
//         byte b=3;
//         int e=1;
//         t.print(a,b,e);

    }
    
    static boolean moiEstUnbFumeur(){return true;}
    
}
