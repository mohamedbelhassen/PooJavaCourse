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
public class CompteBancaire implements Compte {

  private final String numero;
  private int balance;

  public CompteBancaire(String numero) {
    this.numero = numero;
  }

  @Override
  public void deposer(int montant) {
    this.balance += montant;
  }

  @Override
  public int retirer(int montant)  {
    if (balance < montant) {
        System.err.println("Opération impossible");
    }
    return this.balance -= montant;
  }

  @Override
  public int getBalance() {
    return this.balance;
  }

  public String getNumero() {
    return numero;
  }

}