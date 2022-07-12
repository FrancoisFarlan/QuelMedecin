package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
	
	private LocalTime debutCreneau; 
	private int duree; 
	private MedecinGeneraliste medecin;
	/**
	 * @param debutCreneau
	 * @param duree
	 * @param medecin
	 */
	public Creneau(LocalTime debutCreneau, int duree, MedecinGeneraliste medecin) {
		this.debutCreneau = debutCreneau;
		this.duree = duree;
		this.medecin = medecin;
		medecin.ajouterCreneau(this); 
	} 
	
	
	
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}



	public void afficher() {
		System.out.printf("%s - %s (%d minutes)%n", this.debutCreneau.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
				this.debutCreneau.plusMinutes(this.duree).format(
						DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);
	}
}
