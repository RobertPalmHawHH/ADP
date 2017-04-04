/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 2
 * 05.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt2;

/**
 * Diese Klasse prüft bis zu einer angegebenen Zahl alle Zahlen aufsteigend nach
 * Primzahlen.
 * 
 * @author Robert Palm & Leo Peters
 */
public class LangsameSuche {
  // Zaehler zur Aufwandsanalyse
  public static int zaehlerLangsam;

  public boolean[] primzahlenLangsam(int N) {
    // Initialisierung
    boolean a[] = new boolean[N];
    for (int i = 0; i < N; i++) {
      a[i] = true;
    }
    // Berechnung
    for (int i = 2; i < N; i++) {
      for (int j = 2; j < N; j++) {
        zaehlerLangsam++;
        System.out.println("Langsam: " + zaehlerLangsam);
        if ((i % j == 0) && (j != i)) {
          a[i] = false;
        }
      }
    }
    return a;
  }
}
