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

// if we remove (implements Cloneable), 
// a "java.lang.CloneNotSupportedException"
// will be thrown in runtime 
class Test {
    int x, y;
    
    public Object clone() throws CloneNotSupportedException
    {
       Test t = (Test)super.clone(); 
        t.x = this.x;
        t.y = this.y;
        return t;
    }
}