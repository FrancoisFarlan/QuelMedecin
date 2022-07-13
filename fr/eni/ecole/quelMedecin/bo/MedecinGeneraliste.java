package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste extends Medecin{
	/*Attributs d'instance*/
	
	
	
	//attributs de classe
	private static int tarif = 25; 
	
	//constructeur
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom.toUpperCase(), prenom, telephone, adresse);
	}

	

	

	public static int getTarif() {
		return MedecinGeneraliste.tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.printf("Tarif : %d€%n", MedecinGeneraliste.getTarif());
		this.afficherAdresseEtCreneaux();
		}
	
	
}
