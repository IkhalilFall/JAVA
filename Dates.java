package test;

import javax.swing.JOptionPane;

public class Dates {
public int jour;
public int mois;
public int annee;
public Dates() {
	jour=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir le jour\n"));
	mois=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir le mois\n"));
	annee=Integer.parseInt(JOptionPane.showInputDialog("veuillez saisir l'annee\n"));
	}
public void  setJour(int jour) {
	this.jour=jour;
}
public int getjour() {
	return jour;
}

public void  setMois(int mois) {
	this.mois=mois;
}
public int getmois() {
	return mois;
}
public void  setAnne(int annee) {
	this.annee=annee;
}
public int getannee() {
	return annee;
}


}

