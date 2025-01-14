//Boo!!

package Probeklausur;

public class Klausurnoten {
	/**
	 * Die Methode erhält eine ganzzahlige Punktzahl im Intervall [0, 100] und soll
	 * die Klausurnote entsprechend der Tabelle zurückgeben. Falls eine Punktzahl
	 * übergeben wird, die nicht im Intervall [0, 100] liegt, soll -1 zurückgegeben
	 * werden.
	 *
	 * Verwenden Sie die folgenden Parameter und Rückgabewerte:
	 *
	 * Punkte Note 0 - 49 5 50 - 54 4 55 - 69 3 70 - 84 2 85 - 100 1
	 *
	 * @param punkte Punktzahl
	 * @return Note entsprechend der Werte in der Tabelle
	 */

	public static int berechneNote(int punkte) {
		if(punkte >= 85 && punkte <= 100){
			return 1;
		} else if (punkte >= 70 && punkte <= 85){
			return 2;
		} else if (punkte >= 55 && punkte <= 69){
			return 3;
		} else if (punkte >= 50 && punkte <= 54){
			return 4;
		} else if (punkte >= 0 && punkte <= 49){
			return 5;
		} else {
			return -1;
		}
	}

	// Verwenden Sie die Methode main für Ihre Tests, fügen
	// Sie ggf. weitere Tests hinzu
	public static void main(String[] args) {
		System.out.println(berechneNote(72)); // sollte 2 ausgeben
		System.out.println(berechneNote(49)); // sollte 5 ausgeben
		System.out.println(berechneNote(85)); // sollte 1 ausgeben
		System.out.println(berechneNote(107)); // sollte -1 ausgeben
	}
}