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
public class Chap4Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exemple 1
        
        Tigre tigre = new Tigre();
        tigre.chasser();
        tigre.appeler(); //hérité de Félin
        
        
        // Exemple 2
        /*
        Felin felin;
        Tigre tigre = new Tigre();
        felin=tigre; //OK car tigre hérité de félin
        felin.parler();//C'esr la méthode Tigre.parler qui est réellement appelée
        //felin.chasser();//Erreur compilation car chasser n'existe pas dans la classe Felin
        //tigre= felin; //erreur compilation: Conversion explicite est nécessaire (Tigre)felin; 
        tigre= (Tigre)felin; //ok
        tigre.parler();//ok
        tigre.chasser();//ok
        
        Chat chat = new Chat();
        felin = chat;
        //Lion lion =(Lion)felin;//Erreur détectée lors de l'exécution
                                //Exception in thread "main" java.lang.ClassCastException: 
                                //chap4heritage.Chat cannot be cast to chap4heritage.Lion
        
        
        //Exemple 3
        Zoo zoo= new Zoo(3);
        zoo.addFelin(new Tigre());
        zoo.addFelin(new Chat());
        zoo.addFelin(new Tigre());
        zoo.addFelin(new Chat());//pas de place car taille =3/non ajouté
        zoo.appeler();//appel polymorphe
*/
        
    }
    
}
