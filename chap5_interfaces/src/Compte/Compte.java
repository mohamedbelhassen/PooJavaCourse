/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compte;

/**
 *
 * @author moham
 */

public interface Compte {

  void deposer(int montant);
                                   

  int retirer(int montant);

  int getBalance();

  void transferer(Compte destination);

}