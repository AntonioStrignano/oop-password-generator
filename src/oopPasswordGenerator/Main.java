package oopPasswordGenerator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome: ");
		String inputNome = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome: ");
		String inputCognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito: ");
		String inputColore = input.nextLine();
		
		System.out.println("Inserisci il tuo giorno di nascita");
		int inputGiorno = input.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita in numero: ");
		int inputMese = input.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita: ");
		int inputAnno = input.nextInt();
		
		Utente utente1 = new Utente(inputNome, inputCognome, inputColore, inputGiorno, inputMese, inputAnno);
				
		System.out.println("Ti chiami " + utente1.nome + " " + utente1.cognome + ", il tuo colore preferito e' il "
				+ utente1.colore + " e la tua data di nascita e' " + utente1.giorno + "/" + utente1.mese + "/" + utente1.anno);
		
		System.out.println("Stiamo calcolando la tua password...");
		System.out.println("Stiamo calcolando la tua password...");
		System.out.println("Stiamo calcolando la tua password...");
		
		System.out.println("La tua password generata e': " + utente1.pswdGen());
	}
}


// molto simpatico