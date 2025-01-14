//Boo!!

package Probeklausur;

public class Zeichenzaehler {
	/**
	 * Die Methode soll zurückgeben, wie häufig in dem übergebenen String das
	 * ebenfalls übergebene Zeichen vorkommt.
	 *
	 * Beispiele: Eingabe = "Hallo Welt", 'l' ---> Rückgabe = 3 Eingabe = "Heute
	 * scheint die Sonne", 's' ---> Rückgabe = 1
	 *
	 * @param s Zeichenkette, für die die Häufigkeit ermittelt werden soll.
	 * @param c Zeichen, dessen Häufigkeit ermittelt werden soll
	 * @return Anzahl der Vorkommen von c in s
	 */

	public static int zaehleZeichen(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c){
				count++;
			}
		}
		
		return count;
	}

	// Verwenden Sie die Methode main für Ihre Tests, fügen Sie ggf.
	// weitere Tests hinzu
	public static void main(String[] args) {
		// Sollte 3 ausgeben:
		System.out.println(zaehleZeichen("Hallo Welt", 'l'));
		// Sollte 1 ausgeben:
		System.out.println(zaehleZeichen("Heute scheint die Sonne", 's'));
	}
}
