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
class Resistance {
    private int puissance;
    private String brand;
    Resistance(int puissance, String brand){
    this.puissance=puissance;
    this.brand=brand;
    }
    @Override
    public String toString(){
    return "Brand: "+brand+", puissance: "+puissance;
    }
    
    
    
}
