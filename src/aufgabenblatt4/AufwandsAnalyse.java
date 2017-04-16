package aufgabenblatt4;

public class AufwandsAnalyse {

	
public static void main(String[]args) {		
		
		Dreieck pascal;
		for(int zeile = 1; zeile < 30; zeile++){
			System.out.println("\n ------ ZEILE : "+zeile+" -----");
			System.out.println("Aufwand:\n");
			
//			pascal = new BinominalerPascal();
//			System.out.print("Binominal");
//			aufwandsAnalyse(pascal, zeile);
			
			pascal = new PascalIterativ();
			System.out.print("Iterativ");
			aufwandsAnalyse(pascal, zeile);
			
			pascal = new PascalRekursiv();
			System.out.print("Rekursiv");
			aufwandsAnalyse(pascal, zeile);
			
			pascal = new PascalRekursiv2();
			System.out.print("Rekursiv2");
			aufwandsAnalyse(pascal, zeile);
			
		}
}
		private static void aufwandsAnalyse(Dreieck pascal, int zeile){
			
			int[] result = pascal.berechneZeile(zeile);
			
			
			
			System.out.println(" : " + pascal.getZaehler());
			pascal.setZaehler(0);
			//arrayAusgeben(result);
		}
	
	
	public static void arrayAusgeben(int[] array)
	{
		for (int spalte = 0; spalte < array.length; spalte++) 
		{			
			if(array[spalte] != 0)
			{
				System.out.print(array[spalte] + "|");
			}
		}
	}
}
