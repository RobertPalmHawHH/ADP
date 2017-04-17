package aufgabenblatt4;

public class AufwandsAnalyse {

    public static void main(String[] args) {

	InterfacePascal pascal;
	for (int zeile = 1; zeile < 30; zeile++) {
	    System.out.println("\n"+zeile + ". ZEILE : \n");
    
	     pascal = new PascalBinominal();
	     System.out.print("Aufwand Binominal ");
	     aufwandsAnalyse(pascal, zeile);

	    pascal = new PascalIterativ();
	    System.out.print("Aufwand Iterativ ");
	    aufwandsAnalyse(pascal, zeile);

	    pascal = new PascalRekursiv();
	    System.out.print("Aufwand Rekursiv ");
	    aufwandsAnalyse(pascal, zeile);

//	    pascal = new PascalRekursiv2();
//	    System.out.print("Rekursiv2");
//	    aufwandsAnalyse(pascal, zeile);

	}
    }

    private static void aufwandsAnalyse(InterfacePascal pascal, int zeile) {

	long[] result = pascal.berechneZeile(zeile);
	 //arrayAusgeben(result);
	System.out.println("  : " + pascal.getZaehler());
	pascal.resetZaehler();
   
    }

    public static void arrayAusgeben(long[] result) {
	for (int spalte = 0; spalte < result.length; spalte++) {
	    if (result[spalte] != 0) {
		System.out.print(result[spalte] + "|");
	    }
	}
    }
}
