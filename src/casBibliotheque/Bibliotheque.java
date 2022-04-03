package casbibliotheque;

public class Bibliotheque {

	
	Bibliotheque(){
		
	}
	/**
	 * Donne le genre en fonction du libelle
	 * @param libelleDuGenre
	 * @return Genre  
	 */
	Genre getGenre(String libelleDuGenre){
		
		return new Genre("e", new Etagere(1));
	}
	
	/**
	 * Crée un livre
	 * @param titreLivre
	 * @param libelleDuGenre
	 * @return Livre           
	 */
	/*Livre nouveauLivre(String titreLivre, String libelleDuGenre){
		Livre nouveauLivre = new Livre(titreLivre, );
		return nouveauLivre;    */
}
