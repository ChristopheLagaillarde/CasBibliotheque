package casbibliotheque;

public class Livre {

	//Attribut
	private String titre;
	Genre GenreLivre;
	
	//Methode
/**
 * Constructeur de Liver
 * @param titreLivre : le titre du livre
 * @param unGenre    : le Genre du libre
 */
	Livre(String titreLivre, Genre unGenre){
		this.titre = titreLivre;
		this.GenreLivre = unGenre;
	}
/**
 * Le getter de Livre, pour le Titre uniquement
 */
	void getTitre(){
		System.out.println(this.titre);
	}

}


