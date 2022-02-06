package it.unipa.prg.es12;

import it.unipa.prg.es5.SingletonInput;
public class Partita {
	private String [][]campo;
	private Giocatore g1;
	private Giocatore g2;
	SingletonInput input;
	private int x, y;
	private boolean vittoria;
	private int turno;

	public Partita(Giocatore g1, Giocatore g2) {
		this.g1 = g1;
		this.g2 = g2;
		this.campo = new String[3][3];
		this.vittoria = false;
		input = SingletonInput.getInstance();
		setCampo();
		this.turno = 1;
	}

	public boolean getVittoria() {
		return vittoria;
	}

	public void setCampo() {
		for (int i = 0; i < campo.length; ++i) {
			for (int j = 0; j < campo.length; ++j) {
				campo[i][j] = "*";
			}
		}
	}

	public void gioca(Giocatore g1) {
		stampaCampo();
		x = input.leggiInt("Scegli una riga (" + g1.getSegno() + "): ");
		y = input.leggiInt("Scegli una colonna (" + g1.getSegno() + "): ");
		if ((x >= 1 && x <= 3) && (y >= 1 && y <= 3)) {
			if (campo[x-1][y-1].equals("*")) {
				campo[x-1][y-1] = g1.getSegno();
				verificaVittoria(g1);
			} else {
				System.out.println("Posizione gia' occupata, prova da un'altra parte!");
				gioca(g1);
			}
		} else {
			System.out.println("Valore errato!");
		}

	}

	public void verificaVittoria(Giocatore g1) {
		for (int i = 0; i < campo.length; ++i) {
			if ((campo[i][0]).equals(g1.getSegno()) && (campo[i][1].equals(g1.getSegno()) && (campo[i][2]).equals(g1.getSegno()))) {
				stampaCampo();
				this.vittoria = true;
				System.out.println("Congratulazioni, " + g1.getNome() + " (" + g1.getSegno() + ") " + "hai vinto!");
			}
		}
		for (int i = 0; i < campo.length; ++i) {
			if ((campo[0][i]).equals(g1.getSegno()) && (campo[1][i]).equals(g1.getSegno()) && (campo[2][i]).equals(g1.getSegno())) {
				stampaCampo();
				this.vittoria = true;
				System.out.println("Congratulazioni, " + g1.getNome() + " (" + g1.getSegno() + ") " + "hai vinto!");
			}
		}

		if ((campo[0][0].equals(g1.getSegno()) && (campo[1][1]).equals(g1.getSegno()) && (campo[2][2]).equals(g1.getSegno()))) {
			stampaCampo();
			this.vittoria = true;
			System.out.println("Congratulazioni, " + g1.getNome() + " (" + g1.getSegno() + ") " + "hai vinto!");
		}

		if ((campo[2][0]).equals(g1.getSegno()) && (campo[1][1]).equals(g1.getSegno()) && (campo[0][2]).equals(g1.getSegno())) {
			stampaCampo();
			this.vittoria = true;
			System.out.println("Congratulazioni, " + g1.getNome() + " (" + g1.getSegno() + ") " + "hai vinto!");
		}
	}

	public void gestisciPartita() {
		if (this.turno == 1) {
			this.turno++;
			gioca(g1);
		} else if (this.turno == 2) {
			this.turno--;
			gioca(g2);
		}
	}

	public void stampaCampo() {
		System.out.print("|");
		for (int i = 0; i < campo.length; ++i) {
			for (int j = 0; j < campo.length; ++j) {
				System.out.print(campo[i][j]);
				System.out.print("|");
			}
			System.out.println("");
			System.out.print("|");
		}
	}


}