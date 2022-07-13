package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
	
	private LocalTime debutCreneau; 
	private int duree; 
	private Medecin medecin;
	/**
	 * @param debutCreneau
	 * @param duree
	 * @param medecin
	 */
	public Creneau(LocalTime debutCreneau, int duree, Medecin medecin) {
		this.debutCreneau = debutCreneau;
		this.duree = duree;
		this.medecin = medecin;
		medecin.ajouterCreneau(this); 
	} 
	
	
	
	public Medecin getMedecin() {
		return medecin;
	}



	public void afficher() {
		System.out.printf("%s - %s (%d minutes)%n", this.debutCreneau.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
				this.debutCreneau.plusMinutes(this.duree).format(
						DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);
	}
}
