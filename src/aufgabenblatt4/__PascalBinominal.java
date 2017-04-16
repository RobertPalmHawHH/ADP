package aufgabenblatt4;

import java.util.ArrayList;

public class __PascalBinominal implements __Dreieck {

	int zaehler = 0;
	ArrayList<Integer> fakultaet;

	int[] zeile;

	public int[] berechneZeile(int n) {

		if (n > 0) {

			for (int k = 0; k <= n / 2; k++) {
				zaehler++;
				zeile[k] = (berechneFakultät(n)) / (berechneFakultät(k) * berechneFakultät(n - k));
				System.out.println(zeile);
				zeile[n - k] = zeile[k];
			}

			return zeile;
		}
		else{
			throw new IllegalArgumentException("Keine Null erlaubt!");
		}
	}

	public int berechneFakultät(int zahl) {
		int faku = 1;
		
		for (int i = 1; i <= zahl; i++) {
			if(zahl ==0){
				return 1;
			}
			faku *= i;
		}
		return faku;
	}

	public void setZaehler(int zaehler) {
		// TODO Auto-generated method stub

	}

	public int getZaehler() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		__PascalBinominal pascalbin = new __PascalBinominal();
System.out.println(pascalbin.berechneZeile(3));
//		for (int k = 1; k < 15; k++) {
//
//			int[] zeileN = pascalbin.berechneZeile(5);
//			for (int i : zeileN) {
//
//				System.out.printf("%d\t", i);
//			}
//			System.out.println();
//		}

	}
}
