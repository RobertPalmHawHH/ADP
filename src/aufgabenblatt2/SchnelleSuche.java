/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 2
 * 05.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt2;

/**
 * Diese Klasse verbessert die Suche nach Primzahlen aus der langsamen Suche,
 * wendet aber die gleiche Methode an. �nderungen: 
 * - Innere Schleife l�uft nur bis zur Wurzel aus "N". 
 * - Wenn eine Berechnung f�r einen Teiler erfolgreich
 *   war, wird die innere Schleife abgebrochen. 
 *   
 * @author Robert Palm & Leo Peters
 */
public class SchnelleSuche {
  // Zaehler zur Aufwandsanalyse
  public static int zaehlerSchnell;

  public boolean[] primzahlenSchnell(int N) {
      zaehlerSchnell = 0;
    // Initialisierung
    boolean[] a = new boolean[N];
    for (int i = 0; i < N; i++) {
      a[i] = true;
    }
    // Berechnung
    for (int i = 3; i < N; i++) {
      for (int j = 2; j <= Math.sqrt(i); j++) {
        zaehlerSchnell++;
//        System.out.println("Schnell: " + zaehlerSchnell);
        if ((i % j == 0) && (j != i)) {
          a[i] = false;
          break;
        }
      }
    }
    return a;
  }
}
