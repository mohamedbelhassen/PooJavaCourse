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
interface Printable extends OutputStream, InputStream{
    int count=10;
    void print();
}

