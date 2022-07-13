package fr.eni.ecole.quelMedecin.bo;

public class Personne {

	protected String nom;
	protected String prenom;
	protected String telephone;
	protected Adresse adresse;
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 */
	public Personne(String nom, String prenom, String telephone, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	public void afficher() {
		System.out.printf("%s %s%nTelephone : %s%n", this.nom, this.prenom, this.telephone);
	}
}
