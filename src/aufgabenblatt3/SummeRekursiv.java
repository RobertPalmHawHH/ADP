/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 3
 * 12.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt3;

/**
 * Diese Klasse berechnet die Summe der natürlichen Zahlen bis n, mit einer
 * rekursiven Funktion.
 * 
 * @author Robert Palm & Leo Peters
 *
 */
public class SummeRekursiv {
  private int ergebnis = 0;

  public int summeBerechnen(int n) {
    if (n < 0) {
      summeBerechnen(n - 1);
      ergebnis += n;
    }
    return ergebnis;
  }
}
