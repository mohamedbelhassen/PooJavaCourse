/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinterfaces;

/**
 *
 * @author moham
 */
class Point implements Printable{

    public Point() {
    //la modification de count est impossible car c'est une constante / statique
    //count++;
    }

    
    @Override
    public void print() {
        System.out.println("Nombre de points: "+count);
    }

    @Override
    public void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
