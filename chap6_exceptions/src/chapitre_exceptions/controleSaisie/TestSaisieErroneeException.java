/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre_exceptions.controleSaisie;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moham
 */
public class TestSaisieErroneeException {
    
    public static void controle (String s) throws SaisieErroneException{
    if(s.equals(""))
        throw new SaisieErroneException("Saisie erronée: chaine vide");
    }
    
    public static void main(String[] args) {
        String chaine1="Bonjour";
        String chaine2="";

        try {
            System.out.println("Début Bloc try 1");
            controle(chaine1);
            System.out.println("Bloc try fini sans problème");
        } catch (SaisieErroneException ex) {
            System.out.println("Chaine1 présente une erreur: "+ ex.getMessage());
        }finally{            
            System.out.println("fin du programme p1");
        }  
        
        try {
            System.out.println("Début Bloc try 2");
            controle(chaine2);
            System.out.println("Bloc try 2 fini sans problème");

        } catch (SaisieErroneException ex) {
            System.out.println("Chaine2 présente une erreur: "+ ex.getMessage());
        }catch (Exception ex) {
            System.out.println("Chaine2 présente une erreur inconnue");
        }
        finally{            
            System.out.println("fin du programme p2");
        }   

    }
}
