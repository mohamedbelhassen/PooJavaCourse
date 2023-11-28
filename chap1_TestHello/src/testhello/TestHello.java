/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhello;

/**
 *
 * @author moham
 */
public class TestHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length>0)
            System.out.println("Bonjour"+args[0]);
        else
            System.out.println("Bonjour cher utilisateur");
    }
    
}
