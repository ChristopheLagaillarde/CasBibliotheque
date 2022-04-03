package casbibliotheque;

public class Genre {
	
	//Attribut
	private String libelle;
	Etagere etagereDuGenre;
	
	//Methode
	/**
	 * Le constructeur de Genre
	 * @param libelle
	 * @param uneEtagere
	 */
	Genre(String libelle,Etagere uneEtagere){
		this.libelle = libelle;
		this.etagereDuGenre = uneEtagere;
		
	}
	
	/**
	 * Renvoie le rang du livre du genre
	 * @return le rang du livre
	 */
	int rangLivre(){
		
		return 5;
	}
	
	/**
	 * @param unLivre
	 */
	void placeLivre(Livre unLivre){
		
	}

}
