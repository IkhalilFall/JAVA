package test;

import javax.swing.JOptionPane;

public class facture {
 public String numero;
 public static int numeroOrdrefact=0;
 public  Dates datefac;
 public int montant;
 public String codeclient;
 
 public facture(){
	 numeroOrdrefact++;
	 numero="kh-2025-"+numeroOrdrefact;
	 //numero=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir le numero de la facture\n"));
	 datefac=new Dates();
	 montant=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir le montant de la facture\n"));
	 codeclient=JOptionPane.showInputDialog("veuillez saisir le codeclient\n");
	 
 }
 
 ///////////////////////////////////
 public void setNumero (String numero)
 {
 	this.numero =numero;

 }

 public String getnumero()
 {
 	return numero;
 }
 ////////////////////////////////
 public void setDate(Dates datefac) {
	 this.datefac=datefac;
 }
 public Dates getDates() {
	 return datefac;
 }
 /////////////////////////////////
 public void setMontant (int montant)
 {
 	this.montant =montant;

 }
  public int getmontant()
 {
 	return montant;
 }
  public void setCodeclient (String codeclient)
  {
  	this.codeclient =codeclient;

  }
   public String getcodeclient()
  {
  	return codeclient;
  }
   public  void affichageFacture()
   {
   	String sorties ="Numero             : "+ numero +"\n"
   				  + "Date                   : "+ datefac.getjour()+"/"+ datefac.getmois()+ "/" +datefac.getannee() +"\n"
   				  + "Montant             : "+ montant +"\n"
   				  + "Codeclient        : "+codeclient+"\n";
   			JOptionPane.showMessageDialog(null, sorties);
   }
}
