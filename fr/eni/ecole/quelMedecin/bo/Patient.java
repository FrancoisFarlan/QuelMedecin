/**
 * 
 */
package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author franc
 *
 */
public class Patient {
	
	//attributs d'instance
	private String nom;
	private String prenom;
	private String telephone; 
	private char sexe; 
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param sexe
	 * @param numSecu
	 * @param dateNaissance
	 * @param commentaires
	 */
	public Patient(String nom, String prenom, String telephone, char sexe, long numSecu, LocalDate dateNaissance,
			String commentaires) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.setTelephone(telephone);
		this.setSexe(sexe);
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.setCommentaires(commentaires);
	}

	public String getNom() {
		return nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	public void afficher() {
		System.out.printf("%s %s%nTéléphone : %s%nSexe : %s%n" +
		"Numéro de Sécurité sociale : %d%nDate de naissance : %s%nCommentaires : %s%n",
		this.nom, this.prenom, this.telephone,
		this.sexe == 'F' ? "Féminin" : "Masculin", this.numSecu,
		this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
		this.commentaires != null ? this.commentaires : "[aucun commentaire]");
		}
	
	
	
}
