package HA141106;

public class Taste {
	private char zeichen;
	private Taschenrechner taschenrechner;

	public void druecken() { // Taste kann gedrückt werden

		taschenrechner.verarbeite(zeichen); // an Rechner übergeben damit er mit
											// der Eingabe arbeiten kann
	}

	public void setZeichen(char zeichen) { // wert auf die taste schreiben

		this.zeichen = zeichen;

	}

	public void setTaschenrechner(Taschenrechner taschenrechner) { /* Taste gehört zum taschenrechner und braucht auch einen */
		this.taschenrechner = taschenrechner;
	}

}
