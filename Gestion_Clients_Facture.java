package test;

import javax.swing.JOptionPane;

public class Gestion_Clients_Facture {
	
	public static void CreationTabClient(clients tabClient[]) {
		for(int i=0;i<tabClient.length;i++) {
			tabClient[i]=new clients();
		}
	}
	public static void Affichage(clients tabClient[]) {
		String sortie="";
		for(int i=0;i<tabClient.length;i++) {
			//tabClient[i]=new clients();
			sortie +="Code          : "+ tabClient[i].getcode() +"\n"
					  + "Prenom     : "+tabClient[i].getprenom() +"\n"
					  + "Nom           : "+tabClient[i].getnom() +"\n"
					  + "Adresse    : "+tabClient[i].getadresse()+"\n"
					  + "---------------------------"
					  + "\n";
			
		}
		JOptionPane.showMessageDialog(null, sortie);
		
	}
public static void CreationTabFacture(facture TabFact[]) {
	for(int i=0;i<TabFact.length;i++) {
	   TabFact[i]=new facture();
	}
	
}
public static void 	AffichageTabFacture(facture TabFact[]) {
	String sortie="";
	for(int i=0;i<TabFact.length;i++) {
		//tabClient[i]=new clients();
		sortie +="Code          : "+ TabFact[i].getnumero() +"\n"
				  + "Prenom     : "+TabFact[i].datefac.getjour()+"/"+TabFact[i].datefac.getmois()+"/"+TabFact[i].datefac.getannee() +"\n"
				  + "Nom           : "+TabFact[i].getmontant() +"\n"
				  + "Adresse    : "+TabFact[i].getcodeclient()+"\n"
				  + "---------------------------"
				  + "\n";
		
	}
	JOptionPane.showMessageDialog(null, sortie);
	
	
}
public static void affichageClientAyantReçuUneFacture(clients tabClient[], facture TabFact[]) {
	String sortie = "";
    //Recherche tabClient.getcode dans TabFact.getcodeclient
    
    for(int i=0; i<tabClient.length; i++) {
    	int j=0;
    	while(j<=TabFact.length && tabClient[i].getcode().equalsIgnoreCase(TabFact[j].getcodeclient())!=true) {
    		j++;
    	}
       if(j<=TabFact.length) {
    	   sortie +="Code          : "+ tabClient[i].getcode() +"\n"
					  + "Prenom     : "+tabClient[i].getprenom() +"\n"
					  + "Nom           : "+tabClient[i].getnom() +"\n"
					  + "Adresse    : "+tabClient[i].getadresse()+"\n"
					  + "---------------------------"
					  + "\n";
    		}
       JOptionPane.showMessageDialog(null, sortie);
    	   
       }
}

public static void AuCourDuMoisDeMars(clients tabClient[],facture TabFact[]) {
	String sortie="";
	int i=0;
	while(i<TabFact.length) {
		if(TabFact[i].getDates().getmois()==3 && TabFact[i].getDates().getannee()==2024) {
			int j=0;
			while(j<tabClient.length && tabClient[j].getcode().equalsIgnoreCase(TabFact[i].getcodeclient())!=true){
				
				j++;
				
			}
			if(j<tabClient.length) {
	       	 sortie +="Code          : "+ tabClient[j].getcode() +"\n"
						  + "Prenom     : "+tabClient[j].getprenom() +"\n"
						  + "Nom           : "+tabClient[j].getnom() +"\n"
						  + "Adresse    : "+tabClient[j].getadresse()+"\n"
						  + "---------------------------"
						  + "\n";
			}
			
		}
	} i++;
	 JOptionPane.showMessageDialog(null, sortie);
}
	public static void main(String[] args) {
		
		int choix = 0 ;
		clients tabClient[]=new clients[2]; 
		facture TabFact[]=new facture [2];
	
		
		
		do 
		{
			String sorties = "1. Création d’un tableau statique clients\n"
					       + "2. Création d’un tableau des factures \n"
					       + "3. Clients ayant reçu au moins une facture \n"
					       + "4. Afficher la liste des clients ayant reçu des factures au courant du mois de mars 2024\n"
					       + "5. Afficher tous les clients \n"
					       + "6. Afficher toutes les factures  \n"
					       + "7. Rechercher un client à partir de son code \n"
					       + "8. Afficher la liste de toutes les factures d’un client donné\n"
			               + "9. Afficher les informations du client qui a reçu la facture la plus chère\n"
					       +"10. Modifier les informations d’un client\n"
			               +"11. Modifier les informations d’une facture\n "
					       +"12. Quitter ";
			choix = Integer.parseInt(JOptionPane.showInputDialog(sorties));
			switch (choix)
			{
				case 1:JOptionPane.showMessageDialog(null,"1.Création d’un tableau statique clients\n ");
				CreationTabClient(tabClient);
				break;
				case 2:JOptionPane.showMessageDialog(null,"2.Création d’un tableau des factures\n ");
				CreationTabFacture(TabFact);
				break;
				case 3:JOptionPane.showMessageDialog(null,"3. Clients ayant reçu au moins une facture\n ");
				affichageClientAyantReçuUneFacture(tabClient,TabFact);
				break;
				case 4:JOptionPane.showMessageDialog(null,"4.Afficher la liste des clients ayant reçu des factures au courant du mois de mars 2024\n ");
				AuCourDuMoisDeMars(tabClient,TabFact);	
				break;
				case 5:JOptionPane.showMessageDialog(null,"5.Afficher tous les clients\n ");
				Affichage(tabClient);
				break;
				case 6:JOptionPane.showMessageDialog(null,"6.Afficher toutes les factures\n ");
				AffichageTabFacture(TabFact);
				break;
				case 7:JOptionPane.showMessageDialog(null,"7.Rechercher un client à partir de son code\n ");
				
				break;
				case 8:JOptionPane.showMessageDialog(null,"8.Afficher la liste de toutes les factures d’un client donné\n");
				break;
				case 9:JOptionPane.showMessageDialog(null,"9.Afficher les informations du client qui a reçu la facture la plus chère\n");
				break;
				case 10:JOptionPane.showMessageDialog(null,"10.Modifier les informations d’un client\\n");
				break;
				case 11:JOptionPane.showMessageDialog(null," Modifier les informations d’une facture");
				break;
				case 12:JOptionPane.showMessageDialog(null,"Quitter");
				break;
				default: JOptionPane.showMessageDialog(null,"Ce choix n'existe pas");
			}
		}while (choix != 12);
			}


		
}
