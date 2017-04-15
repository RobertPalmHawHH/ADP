/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 3
 * 12.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt3;

/**
 * Diese Klasse berechnet die Summe der natürlichen Zahlen bis n, mithilfe der
 * Gaussschen Summenformel.
 * 
 * @author Robert Palm & Leo Peters
 */
public class SummeGauss {
  public int summeBerechnen(int n) {
    return (int) (Math.pow(n, 2)) + n / 2;
  }
}
