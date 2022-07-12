package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
	/*Attributs d'instance*/
	private String nom;
	private String prenom;
	private String telephone;
	private Adresse adresse;
	private Creneau[] creneaux = new Creneau[15];
	private int nbCreneaux = 0;
	
	//attributs de classe
	private static int tarif = 25; 
	
	//constructeur
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		this.nom = nom; 
		this.prenom = prenom;
		this.setTelephone(telephone);
		this.adresse = adresse;
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
		System.out.println("Adresse : ");
		this.adresse.afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i < creneaux.length ; i++) {
			if (this.creneaux[i]!= null)
				this.creneaux[i].afficher();
		}
	}
	
	//creneaux
	void ajouterCreneau(Creneau creneau) {
		if (this != creneau.getMedecin()) {
			System.err.println("Ce créneau ne peut être associé à ce médecin car il est déjà associé à un autre");
		} else {
			int i = 0;
			while (i < this.creneaux.length && this.creneaux[i] != null)
				i++;
			if (i == this.creneaux.length)
				System.err.println("Tous les créneaux sont remplis");
			else
				this.creneaux[i] = creneau;
		}
	}
	
	public Creneau[] getCreneaux() {
		return this.creneaux.clone();
	}
	
	public int getNbCreneaux() {
		return this.nbCreneaux;
	}
	
}
