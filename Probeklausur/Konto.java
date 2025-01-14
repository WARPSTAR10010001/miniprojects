//Boo!!

package Probeklausur;/**

 * DIESE KLASSE DARF NICHT GEÄNDERT WERDEN
 */
public class Konto {
	// Kontonummer
	private int nummer;
	// Guthaben auf dem Konto: kann auch negativ sein
	private double guthaben;
	// Höhe des Dispokredits: Betrag, um den das Konto überzogen werden
	// kann (kleinstes erlaubtes negatives Guthaben). Der Wert dispo
	// selbst ist positiv
	private double dispo;
	// interner Zähler für die Kontonummern
	private static int nextNumber = 1;

	/**
	 * Parameterloser Konstruktor, legt ein Konto mit Guthaben 0 und Dispo 0 an
	 */
	public Konto() {
		this(0.0, 0.0);
	}

	/**
	 * Konstruktor
	 *
	 * @param guthaben Höhe des Guthabens bei Kontoeröffnung
	 * @param dispo    Höhe des Dispokredits bei Kontoeröffnung
	 */
	public Konto(double guthaben, double dispo) {
		this.guthaben = guthaben;
		this.dispo = dispo;
		this.nummer = Konto.nextNumber;
		Konto.nextNumber += (1 + (int) (10 * Math.random()));
	}

	/**
	 * Getter für die Kontonummer
	 *
	 * @return Kontonummer
	 */
	public int getNummer() {
		return this.nummer;
	}

	/**
	 * Getter für das Guthaben
	 *
	 * @return Guthaben
	 */
	public double getGuthaben() {
		return this.guthaben;
	}

	/**
	 * Getter für den Dispo
	 *
	 * @return Höhe des Dispokredits
	 */
	public double getDispo() {
		return this.dispo;
	}

	/**
	 * Bucht den übergebenen Betrag auf das Konto
	 *
	 * @param betrag Zuzubuchender Betrag
	 * @return neues Guthaben des Kontos
	 */
	public double zubuchen(double betrag) {
		this.guthaben = this.guthaben + betrag;
		return this.guthaben;
	}

	/**
	 * Bucht den übergebenen Betrag vom Konto ab, falls die Deckung (Guthaben +
	 * Dispo) ausreichend ist
	 *
	 * @param betrag Abzubuchender Betrag
	 * @return neues Guthaben des Kontos
	 */
	public double abbuchen(double betrag) {
		if (this.guthaben + this.dispo >= betrag) {
			this.guthaben = this.guthaben - betrag;
		}
		return this.guthaben;
	}

	/**
	 * Liefert eine Formatierte String-Repräsentation des Kontos zurück:
	 *
	 * [nr]: guthaben
	 *
	 * @return Stringdarstellung des Kontos
	 */
	public String toString() {
		return String.format("[%2d]: %10.2f (%4.0f)%n", this.nummer, this.guthaben, this.dispo);
	}
}
