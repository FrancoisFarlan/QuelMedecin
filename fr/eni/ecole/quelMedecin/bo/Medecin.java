package fr.eni.ecole.quelMedecin.bo;

public class Medecin extends Personne {

	private Creneau[] creneaux = new Creneau[15];
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 */
	public Medecin(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom.toUpperCase(), prenom, telephone, adresse);
		// TODO Auto-generated constructor stub
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getNom() {
		return nom.toUpperCase();
	}
	
	public void afficherAdresseEtCreneaux() {
		System.out.println("Adresse : ");
		this.adresse.afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i < creneaux.length ; i++) {
			if (this.creneaux[i]!= null)
				this.creneaux[i].afficher();
		}
	}
	
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
	
}
