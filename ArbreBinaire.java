package projetFinal;

public class ArbreBinaire {
	
	// attribut repres valeur noeud
	private Integer clef;
	
	// sous arbre gauche
	private ArbreBinaire gauche;
	
	//sous arbre droite
	private ArbreBinaire droite;

	
	// creation arbre vide donc constru sans param
	public ArbreBinaire() {
		// TODO Auto-generated constructor stub
		
		clef = null;
		gauche = null;
		droite = null;
		
	}
	
	
	// singleton arbre vide
	public static ArbreBinaire arbreVide = new ArbreBinaire();
	
	// getters seetter
	public Integer getClef() {
		return clef;
	}
	
	public void setClef(Integer clef) {
		clef = clef;
	}
	
	public ArbreBinaire getGauche() {
		return gauche;
	}
	
	public void setGauche(ArbreBinaire gauche) {
		gauche = gauche;
	}
	
	public ArbreBinaire getDroite() {
		return droite;
	}
	
	public void setDroite(ArbreBinaire droite) {
		droite = droite;
	}
	
	// methode creer qui retourne larbre vide
	public static ArbreBinaire creer() {
		return arbreVide;
	}

}
