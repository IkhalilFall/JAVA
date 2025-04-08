package test;

import javax.swing.JOptionPane;

public class clients {
 public String code;
 public static int numeroOrdre=0;
 public String prenom;
 public String nom;
 public String adresse;

  
public clients() {
	numeroOrdre++;
	code="Mrs25-"+numeroOrdre;
	//code=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir le code du client\n"));
	prenom=JOptionPane.showInputDialog("veuillez saisir le prenom du client numero:"+code);
	nom=JOptionPane.showInputDialog("veuillez saisir le nom du client:"+code);
	adresse=JOptionPane.showInputDialog("veuillez saisir l'adresse du client"+code);
	}

public void setCode (String code)
{
	this.code =code;

}

public String getcode()
{
	return code;
}
//////////////////////////////////////////////////////////////
public void setPrenom (String prenom)
{
	this.prenom =prenom;

}

public String getprenom()
{
	return prenom;
}
////////////////////////////////
public void setNom (String nom)
{
	this.nom =nom;

}

public String getnom()
{
	return nom;
}
public void setAdresse(String adresse)
{
	this.adresse =adresse;

}

public String getadresse()
{
	return adresse;
}

public  void affichage()
{
	String sortie ="Code          : "+ code +"\n"
				  + "Prenom     : "+ prenom +"\n"
				  + "Nom           : "+ nom +"\n"
				  + "Adresse    : "+adresse+"\n";
			JOptionPane.showMessageDialog(null, sortie);
}
}
