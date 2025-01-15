//Boo!!

package Probeklausur;

import java.util.Arrays;

public class ArrayDelete {
	/**
	 * Die Methode nimmt ein Array und einen Wert entgegen und soll eine Kopie des
	 * übergebenen Arrays zurückgeben, in dem alle Vorkommen des Wertes nicht mehr
	 * enthalten sind. Die Methode soll das Originalarray unverändert lassen.
	 *
	 * Beispiel: Eingabe = {4, -3, 17, 6, 0, -3, 4, 9}, -3 Rückgabe = {4, 17, 6, 0,
	 * 4, 9}
	 *
	 * @param a    Das Array, das kopiert werden soll
	 * @param wert Wert, der nicht in der Kopie enthalten sein soll
	 * @return Das kopierte Array mit den verbliebenen Elementen
	 */

	public static int[] deleteElements(int[] a, int wert) {
		int count = 0;
		int[] temp = new int [a.length];
		Arrays.fill(temp, Integer.MIN_VALUE);

		for(int i = 0; i < a.length; i++){
			if(a[i] != wert){
				temp[i] = a[i];
				count++;
			}
		}

		int[] result = new int[count];
		int index = 0;

		for(int i = 0; i < temp.length; i++){
			if(temp[i] != Integer.MIN_VALUE){
				result[index] = temp[i];
				index++;
			}
		}

		return result;
	}

	// Verwenden Sie die Methode main für Ihre Tests, fügen Sie ggf.
	// weitere Tests hinzu
	public static void main(String[] args) {
		int[] a = { 4, -3, 17, 6, 0, -3, 4, 9 };
		// Sollte [4, 17, 6, 0, 4, 9] ausgeben:
		System.out.println(Arrays.toString(ArrayDelete.deleteElements(a, -3)));
	}
}