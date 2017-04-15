/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 3
 * 12.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt3;

/**
 * Diese Klasse berechnet die Summe der natürlichen Zahlen bis n, mit einer
 * iterative durchlaufenden Schleife.
 * 
 * @author Robert Palm & Leo Peters
 *
 */
public class SummeIterativ {

  public int summeBerechnen(int n) {
    int ergebnis = 0;
    for (int i = 0; i <= n; i++) {
      ergebnis += n;
    }
    return ergebnis;
  }
}
