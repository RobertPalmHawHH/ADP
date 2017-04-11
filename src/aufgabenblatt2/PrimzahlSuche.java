/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 2
 * 05.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt2;

/**
 * Diese Klasse Implementiert eine Methode, die f�r eine angegebene Zahl, ob es
 * eine Primzahl ist.
 * 
 * @author Robert Palm & Leo Peters
 */
public class PrimzahlSuche {

    // Z�hler zur Analyse des Aufwands
    public static int zaehlerPrimzahlSuche;

    /**
     * 
     * @param N
     *            , Zahl f�r welche gepr�ft wird, ob es eine Primzahl ist.
     * @return, true wenn es eine Primzahl ist, false wenn nicht.
     */
    public boolean istPrimzahl(int N) {
	zaehlerPrimzahlSuche = 0;
	for (int i = 2; i <= Math.sqrt(N); i++) {
	    zaehlerPrimzahlSuche++;
//	    System.out.println("istPrim: " + zaehlerPrimzahlSuche);
	    if (N % i == 0)
		return false;
	}
	return true;
    }
}
