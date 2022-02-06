package it.unipa.prg.es12;

public class Giocatore {
	private String nome;
	private String segno;

	public Giocatore(String nome, String segno) {
		setNome(nome);
		setSegno(segno);
	}

	public Giocatore() {
		this("Unknown", "0");
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSegno(String segno) {
		if (segno.equalsIgnoreCase("x") || segno.equalsIgnoreCase("0")) {
			this.segno = segno;
		} else {
			this.segno = "0";
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSegno() {
		return segno;
	}

	public String toString() {
		return ("Nome: " + getNome() + "\n" + "Segno " + getSegno());
	}
}