package it.unipa.prg.es12;

import it.unipa.prg.es5.SingletonInput;
public class TestPartita {
	public static void main(String[] args) {
		Giocatore g1, g2;
		SingletonInput input = SingletonInput.getInstance();
		int turni = 0;
		String nome, segno;

		nome = input.leggiString("Inserisci il nome del giocatore1: ");
		segno = input.leggiString("Scegli il segno (0 o x): ");
		g1 = new Giocatore(nome, segno);

		nome = input.leggiString("Inserisci il nome del giocatore2: ");
		segno = input.leggiString("Scegli il segno (0 o x): ");
		g2 = new Giocatore(nome, segno);

		Partita partita = new Partita(g1, g2);

		while (!partita.getVittoria() && turni < 9) {
			partita.gestisciPartita();
			++turni;
		}
		if (turni == 9) {
			System.out.println("La partita si e' conclusa in pareggio!");
		}
	}
}