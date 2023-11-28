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

interface Downloadable
{
    String baseURL="http://monsite.tn";
    public void printDownloadURL() ;
} 

class Document implements Downloadable
{
	private String titre ;
        private String fileName ;

	public Document(String titre, String fileName)
	{
		this.titre=titre;
                this.fileName=fileName;
	} 
	public void printDownloadURL()
	{
		System.out.println(baseURL+this.fileName);
	} 
	public String toString()
	{
		return  "titre: "+ titre+" , FileName: "+fileName;
	} 
}

class Program implements Downloadable
{
	private String nomProgramme ;
        private String fileName ;

	public Program(String nomProgramme, String fileName)
	{
		this.nomProgramme=nomProgramme;
                this.fileName=fileName;
	} 
	public void printDownloadURL()
	{
		System.out.println(baseURL+this.fileName);
	} 
	public String toString()
	{
		return  "nom Programme: "+ nomProgramme+" , FileName: "+fileName;
	} 
}
public class DownloadManager {
    private Downloadable dowloadList[] ;
	final int Max = 100 ;
	private int nbDownloads = 0 ;
	public DownloadManager()
	{
		dowloadList = new Downloadable [Max] ;
	} 
	public void addDownload(Downloadable d)
	{

			if(nbDownloads < Max)
			{
				dowloadList[nbDownloads]=d ;
				nbDownloads ++ ;
			} 
			else
				System.out.println("pas de place pour de nouveaux telecargements"); ;
		
	}
	public void showDownloads()
	{
		int i;
		for(i=0 ;i<nbDownloads ;i++)
			dowloadList[i].printDownloadURL();
	} 
	public static void main(String args[])
	{
		DownloadManager dm= new DownloadManager();
		dm.addDownload( new Document ("Programmation C++","prog_c_plus_plus.pdf")) ;
		dm.addDownload( new Program("Android Studio","android_studio.exe")) ;
		dm.addDownload( new Document ("Programmation Java","java.pdf")) ;
		dm.showDownloads() ;
	}
}
