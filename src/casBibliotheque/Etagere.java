package casbibliotheque;

public class Etagere {
	//Attribut
	private int numero;
	
	//Méthodes
	/**
	 * constructeur de Etagere
	 * @param numero :  le numero de l'etagere
	 */
	Etagere(int numero) {
		this.numero = numero;
	}
	
	/**
	 * le getter de Etagere
	 */
	void getNumeroEtagere(){
		System.out.println(this.numero);
	}

}
