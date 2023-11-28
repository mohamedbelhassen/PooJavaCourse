/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap3;

public class MathTool {
    
    final static double PI=3.14;
    public static double getPI() {
        return PI;
    }
    
    public static double perimetre(double r){
        return 2*PI*r;
    }
    public static double square(double x){
        return x*x;
    }
}

