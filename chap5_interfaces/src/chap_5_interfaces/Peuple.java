/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap_5_interfaces;

/**
 *
 * @author Belhassen
 */
interface Homme
{
	public void identiter() ;
} 

class Personne implements Homme
{
	private String nom,prenom ;
	public Personne (String n, String p)
	{
		nom=n;
		prenom=p ;
	} 
	public void identiter()
	{
		System.out.println(this) ;
	} 
	public String toString()
	{
		return("Personne: "+"nom: " + nom+"prenom: "+prenom);
	} 
	public String getNom()
	{
		return nom;
	} 
	public String getPrenom()
	{
		return prenom;
	}
}

class Client extends Personne implements Homme
{
	private int numero ;
	public Client(String n, String p, int num)
	{
		super(n, p);
		numero = num;
	} 
	public void identiter()
	{
		System.out.println("Client: "+this);
	} 
	public String toString()
	{
		return super.toString() + "numero" + numero;
	} 
	public int getNum()
	{
		return numero;
	}
}

public class Peuple
{
	private Homme pays[] ;
	final int Max = 100 ;
	private int nbHomme = 0 ;
	public Peuple()
	{
		pays = new Homme [Max] ;
	} 
	public void naissance(Homme h)
	{
		try
		{
			if(nbHomme < Max)
			{
				pays[nbHomme]=h ;
				nbHomme ++ ;
			} 
			else
				throw new tabException("erreurtab-h-99") ;
		} 
		catch(tabException e)
		{
			System.out.println(e.getMessage()) ;
		}
	}
	public void explorer()
	{
		int i;
		for(i=0 ;i<nbHomme ;i++)
			pays[i].identiter() ;
	} 
	public static void main(String args[])
	{
		Peuple p= new Peuple() ;
		p.naissance( new Personne ("Ali","Cherif")) ;
		p.naissance(new Client("Med","Ali",1001)) ;
		p.naissance(new Personne(" "," ")) ;
		p.explorer() ;
	}
}
class tabException extends Exception
{
	tabException (String s)
	{
		super(s) ;
	}
}