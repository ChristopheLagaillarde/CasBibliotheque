package casbibliotheque;

import java.util.ArrayList;
import java.util.Collections;

public class Genre {

	//Attribut
	private String libelle;
	Etagere etagereDuGenre;
	@SuppressWarnings("rawtypes")
	ArrayList livreEnOrdreAlphabetique;

	//Methode
	/**
	 * Le constructeur de Genre
	 * @param libelle
	 * @param uneEtagere
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Genre(String libelle,Etagere uneEtagere){
		this.libelle = libelle;
		this.etagereDuGenre = uneEtagere;
		this.livreEnOrdreAlphabetique = new ArrayList();
		livreEnOrdreAlphabetique.add(etagereDuGenre.getNumeroEtagere());

	}

	/**
	 * Renvoie le rang du livre du genre
	 * @param titreLivre
	 * @return le rang du livre
	 */
	int rangLivre(String titreLivre){   // cette methode est privé car le rang du livre 
		                               // ne doit pas pouvoir etre changé sans que cela n'affecte d'autre rang de livre

		return livreEnOrdreAlphabetique.indexOf(titreLivre);
	}

	/** Place en livre sur une etagere
	 * @param unLivre
	 */
	@SuppressWarnings("unchecked")
	void placeLivre(Livre unLivre){
		livreEnOrdreAlphabetique.add(unLivre.getTitre());
		Collections.sort(livreEnOrdreAlphabetique.subList(1, livreEnOrdreAlphabetique.size()));
	}

}
