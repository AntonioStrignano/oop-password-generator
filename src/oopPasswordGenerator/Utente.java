/*
 * Password generator OOP: Il programma deve chiedere all’utente nome, cognome,
 * data di nascita, colore preferito e restituire la password così generata:
 * nome + cognome + colore + (giorno + mese + anno) esempio: nome: giuseppe,
 * cognome: pedullà, colore: blu, data: 07/08/1991 passowrd:
 * Giuseppe-Pedullà-Blu-2006 Specifiche OOP: Creare una classe Utente che
 * definisca l’utente con i suoi attributi. Creare la classe Password generator
 * che fornisca un metodo per generare la password e restituirla. Creare una
 * classe Main che chieda all’utente i suoi dati e usi le classi sopra citate
 * per impostare l’utente e farsi restituire la password. BONUS: Password
 * generator deve fornire un costruttore che accetta come parametro un Utente
 * per poter usare le sue proprietà
 */
package oopPasswordGenerator;

public class Utente {
	String nome;
	String cognome;
	String colore;
	int giorno;
	int mese;
	int anno;

	public Utente(String nome, String cognome, String colore, int giorno, int mese, int anno) {
		this.nome = nome;
		this.cognome = cognome;
		this.colore = colore;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
		
	public String pswdGen() {
		return nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno);
	}
		

}
