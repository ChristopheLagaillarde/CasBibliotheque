package casbibliotheque;

public class Bibliotheque {

	
	Bibliotheque(){
		
	}
	
	Genre getGenre(String libelleDuGenre){
		
		return new Genre("e", new Etagere(1));
	}
	
	Livre nouveauLivre(String titreLibre, String libelleDuGenre){
		
		return new Livre("Titre", new Genre("e", new Etagere(1)));
	}
}
