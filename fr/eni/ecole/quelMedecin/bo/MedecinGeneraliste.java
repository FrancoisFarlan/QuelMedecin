package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
	/*Attributs d'instance*/
	private String nom;
	private String prenom;
	private String telephone;
	
	//attributs de classe
	private static int tarif = 25; 
	
	//constructeur
	public MedecinGeneraliste(String nom, String prenom, String telephone) {
		this.nom = nom; 
		this.prenom = prenom;
		this.setTelephone(telephone);
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	
	public void afficher() {
		System.out.println(this.getNom() + " " + this.prenom);
		System.out.println("Téléphone : " + this.telephone);
		System.out.println("Tarif : " + MedecinGeneraliste.tarif + "€");
	}
	
}
