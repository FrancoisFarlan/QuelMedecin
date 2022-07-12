/**
 * 
 */
package fr.eni.ecole.quelMedecin.bo;

/**
 * @author franc
 *
 */
public class Adresse {

	private String complement;
	private int numVoie; 
	private String complementNum;
	private String nomVoie; 
	private int codePostal;
	private String commune;
	/**
	 * @param complement
	 * @param numVoie
	 * @param complementNum
	 * @param typeVoie
	 * @param nomVoie
	 * @param codePostal
	 * @param commune
	 */
	public Adresse(String complement, int numVoie, String complementNum, String nomVoie,
			int codePostal, String commune) {
		this.complement = complement;
		this.numVoie = numVoie;
		this.complementNum = complementNum;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.commune = commune.toUpperCase();
	} 
	
	public Adresse(int numVoie, String complementNum, String nomVoie,
			int codePostal, String commune) {
		this(null, numVoie, complementNum, nomVoie, codePostal, commune);
	} 
	
	public void afficher() {
		if(this.complement != null) {
			System.out.println(complement);
		}
		System.out.printf("%d %s %s %n%05d %s %n", this.numVoie, this.complementNum, this.nomVoie, this.codePostal, this.commune);
	}
	
	
	
}
