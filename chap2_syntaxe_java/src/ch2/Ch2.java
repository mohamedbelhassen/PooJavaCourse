/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mohamed belhassen
 * 
 */
public class Ch2 {

    /**
     * @param args the command line arguments
     * To test each part, you have uncomment the corresponding code
     */
    public static void main(String[] args) {
        //Read an integer from keyboard
        
//        int f;
//        Scanner clavier=new Scanner(System.in);
//        System.out.print("saisir un nombre: ");
//        f=clavier.nextInt();
//        System.out.println("f="+f);

          //Part 2:

//        boolean b=(1>3);
//        System.out.println("b="+b);
//        char c='a';
//        System.out.println("c="+c);
//        int t[]= new int[20];
          
          /*another way to create the same array:*/
          
//        int []t= new int[20];
//        t[0]=15;
//        System.out.println("T[0]="+t[0]);    
//        System.out.println("T[1]="+t[1]);
//        
//        for(int i=0;i<t.length;i++)
//            System.out.println("T["+i+"]="+t[i]);
//        char grades[]={'A','B','C'};
//        for(int i=0;i<grades.length;i++)
//            System.out.println("grades["+i+"]"+grades[i]);
//        
//        String s= "Bonjour";
//        s="Hello";
//        System.out.println(s);
//        
        StringBuffer sb=new StringBuffer("Bonjour");
        sb.setCharAt(3, 's');
        sb.setCharAt(5, 'i');
        System.out.println(sb);
//        final int nombre=+4;
//        //nombre=5;
//        System.out.println("nb:\n\t"+nombre);
//        System.out.println("5 mod 2= "+ (5%2));
//        boolean var=true;
//        var=!var;
//        System.out.println(var);

    }
    
}
