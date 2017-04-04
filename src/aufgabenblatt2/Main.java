/** 
 * Algorithmen & Datenstrukturen - Pareigis
 * Aufgabenblatt Nr. 2
 * 04.04.2017 - Version 1.0
 * Leo Peters & Robert Palm
 */
package aufgabenblatt2;

public class Main {
    public static void main(String args[]) {
	LangsameSuche lSuche = new LangsameSuche();

	SchnelleSuche sSuche = new SchnelleSuche();

	SiebSuche siSuche = new SiebSuche();

	PrimzahlSuche pSuche = new PrimzahlSuche();
	// System.out.println(pSuche.istPrimzahl(50));

	System.out.println("\t\tLangsam:\tSchnell:\tSiebDesEra:\tPrimPruef:");
	int[] arrayMitNs = { 5, 10, 15, 20, 25, 30 };

	for (int i : arrayMitNs) {
	    lSuche.primzahlenLangsam(i);
	    sSuche.primzahlenSchnell(i);
	    siSuche.primzahlenSieb(i);
	    pSuche.istPrimzahl(i);
	    System.out.printf("N=%d:\t\t%d\t\t%d\t\t%d\t\t%d\n", i,
		    lSuche.zaehlerLangsam, sSuche.zaehlerSchnell,
		    siSuche.zaehlerSieb, pSuche.zaehlerPrimzahlSuche);
	}

	// boolean[] a = siSuche.primzahlenSieb(50);
	// for (int i = 0; i < 50; i++) {
	// System.out.println(i + "  " + a[i]);
	// }
    }
}
