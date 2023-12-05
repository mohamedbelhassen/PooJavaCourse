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
public class TestChaineVideCourte {
    
    public static void verifChaine(String s)throws ChaineCourteException, ChaineVideException{
        if(s.length()<5){
            throw new ChaineCourteException();
        }
         if(s.length()==0){
            throw new ChaineVideException();
        }
       
        
    }
    
    public static void main(String args[]){
    String s="";
    
        try {
            verifChaine(s);
        } catch (ChaineCourteException ex) {
            System.out.print("Chaine courte");
        } catch (ChaineVideException ex) {
            System.out.print("Chaine vide");
        }
    
    }
    
}
