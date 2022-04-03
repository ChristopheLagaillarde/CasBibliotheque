package casbibliotheque;

import java.util.Scanner;

/**
 * La classe principale permettant de gérer les livres étagères etc
 * Date: 03/04/22
 * Version: 1.0
 * @author Lagaillarde
 *
 */
public class CasBibliotheque {

	@SuppressWarnings("resource")
	public static void main(String[] args) { 


		Etagere premiereEtagere = new Etagere(1);
		Genre scienceFiction = new Genre("Sci",premiereEtagere);

		System.out.print("Saisir le titre du livre");
		Scanner saisie = new Scanner(System.in); 
		String titreLivre = saisie.nextLine(); 

		Livre livreDeScienceFiction = new Livre(titreLivre, scienceFiction);
		scienceFiction.placeLivre(livreDeScienceFiction);

		System.out.println(scienceFiction.rangLivre(titreLivre));
		System.out.println(scienceFiction.livreEnOrdreAlphabetique);

		System.out.print("Saisir le titre d'un autre livre");
		saisie = new Scanner(System.in); 
		String titreDeuxiemeLivre = saisie.nextLine(); 

		Livre deuxiemeLivreDeScienceFiction = new Livre(titreDeuxiemeLivre, scienceFiction);
		scienceFiction.placeLivre(deuxiemeLivreDeScienceFiction);

		System.out.println(scienceFiction.rangLivre(titreDeuxiemeLivre));
		System.out.println(scienceFiction.livreEnOrdreAlphabetique);

		System.out.print("enlever un livre d'index :");
		saisie = new Scanner(System.in); 
		int index = saisie.nextInt(); 
		saisie.close();
		
		scienceFiction.livreEnOrdreAlphabetique.remove(index);
		
		System.out.println(scienceFiction.livreEnOrdreAlphabetique);


	}

}
