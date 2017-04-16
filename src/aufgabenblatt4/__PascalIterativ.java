package aufgabenblatt4;

public class __PascalIterativ implements __Dreieck {

	
	private int zaehler =0;
	
	public int[] berechneZeile(int zeile) {

		int[][] pascal = new int[zeile][zeile + 2];
		int result;

		pascal[0][1] = 1;

		for (int reihe = 1; reihe < zeile; reihe++) {
			zaehler++;
			for (int spalte = 1; spalte < zeile + 2; spalte++) {
				zaehler++;
				result = pascal[reihe - 1][spalte] + pascal[reihe - 1][spalte - 1];
				pascal[reihe][spalte] = result;
				if (result == 0) {
					break;
				}
			}
		}

		return pascal[zeile - 1];
	}

	public void setZaehler(int zahl) {

		 zaehler = zahl;
	}

	public int getZaehler() {
		return zaehler;
	}
	
	


}