/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre_exceptions;

/**
 *
 * @author moham
 */
public class Chapitre_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=4;
        int b=0;
        int resAddition=CalculMath.addition(a, b);
        int resSoustraction=CalculMath.soustraction(a, b);
        int resMultiplication=CalculMath.multiplication(a, b);
        
        System.out.println(a+" + "+b+" = "+resAddition);
        System.out.println(a+" - "+b+" = "+resSoustraction);
        System.out.println(a+" * "+b+" = "+resMultiplication);

        try{
        double resDivision=CalculMath.division(a, b);
        System.out.println(a+" / "+b+" = "+resDivision);
        }catch (ArithmeticException e){
            System.out.println("Exception rencontrée:"+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception rencontrée2:"+e.getMessage());
        }finally{
            System.out.println("Fin bloc division");
        }

    }
    
}
