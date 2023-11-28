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

public interface Compte {

  int PLAFOND_DEPOT = 1_000_000;

  static int getBalanceTotale(Compte... comptes)  {
    int total = 0;
    for (Compte c : comptes) {
      total += c.getBalance();

    }
    return total;
  }
  void deposer(int montant) ;

  int retirer(int montant);

  int getBalance();

}
