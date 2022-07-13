package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin{

	private String specialite;
	private int tarif;
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 */
	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, String specialite, int tarif) {
		super(nom, prenom, telephone, adresse);
		this.specialite = specialite;
		this.tarif = tarif;
	} 
	
	@Override 
	public void afficher() {
		super.afficher();
		System.out.printf("Spécialité : %s%nTarif : %d€%n", this.specialite, this.tarif);
		this.afficherAdresseEtCreneaux();
	}
	
}
