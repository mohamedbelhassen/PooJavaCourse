/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepCopy;

/**
 *
 * @author moham
 */
class Test2 implements Cloneable {
    int a, b;
 
    Test c = new Test();
 
    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable t
        // it will clone (a,b,c: just reference copy)
        Test2 t = (Test2)super.clone();
        //the following code will perform a deep clone of c object
        t.c=(Test)this.c.clone();
        return t;
    }
}
 

