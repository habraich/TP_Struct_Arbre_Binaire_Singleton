package projetFinal;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		//creation instance ArbreBinaire --> arbre binaire vide
		ArbreBinaire arbre = ArbreBinaire.creer();
		
		
		// insertion valeur dans larbre
		
		arbre = insererValeur(arbre, 5);
		arbre = insererValeur(arbre, 3);
		arbre = insererValeur(arbre, 8);
		arbre = insererValeur(arbre, 2);
		arbre = insererValeur(arbre, 4);
		arbre = insererValeur(arbre, 7);
		
		
	}

}
