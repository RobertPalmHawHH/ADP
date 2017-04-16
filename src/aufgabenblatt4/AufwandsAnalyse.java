package aufgabenblatt4;

public class AufwandsAnalyse {

    public static void main(String[] args) {

	InterfacePascal pascal;
	for (int zeile = 1; zeile < 30; zeile++) {
	    System.out.println(zeile + " ZEILEN : ");

	    // pascal = new BinominalerPascal();
	    // System.out.print("Binominal");
	    // aufwandsAnalyse(pascal, zeile);

	    pascal = new PascalIterativ();
	    System.out.print("Aufwand Iterativ");
	    aufwandsAnalyse(pascal, zeile);

	    pascal = new PascalRekursiv();
	    System.out.print("Aufwand Rekursiv");
	    aufwandsAnalyse(pascal, zeile);

//	    pascal = new PascalRekursiv2();
//	    System.out.print("Rekursiv2");
//	    aufwandsAnalyse(pascal, zeile);

	}
    }

    private static void aufwandsAnalyse(InterfacePascal pascal, int zeile) {

	int[] result = pascal.berechneZeile(zeile);

	System.out.println(" : " + pascal.getZaehler());
	pascal.resetZaehler();
	// arrayAusgeben(result);
    }

    public static void arrayAusgeben(int[] array) {
	for (int spalte = 0; spalte < array.length; spalte++) {
	    if (array[spalte] != 0) {
		System.out.print(array[spalte] + "|");
	    }
	}
    }
}
