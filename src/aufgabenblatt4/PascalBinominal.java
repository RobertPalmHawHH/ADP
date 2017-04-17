package aufgabenblatt4;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalBinominal implements InterfacePascal {
	
	int zaehler ;
	ArrayList<Long> fakultaet;
	public PascalBinominal()
	{
		zaehler = 0;
		fakultaet = new ArrayList<Long>();
	}

	
	
	public long[] berechneZeile(int n) {
		if(n > 0){
	
		long[] zeile = new long[n];
		n--;
		for (int k = 0; k <= n / 2; k++) {
			zaehler++;

			long faku0 = berechneFakultaet(n);
			long faku1 = berechneFakultaet(k);
			long faku2 = berechneFakultaet(n - k);
			zeile[k] = (faku0) / (faku1 * faku2);
			// System.out.println(zeile[k]);
			zeile[(n - k)] = zeile[k];
		}
		zaehler++;
		return zeile;
		}
		else
		{
			throw new IllegalArgumentException("Zeile 0 nicht definiert!");
		}
		
	}
	
	 long berechneFakultaet(int zahl)
	{

				for (int i = fakultaet.size(); i <= zahl; i++)
				{
					if (i == 0)
					{
						fakultaet.add(i, (long) 1);
					}
					else
					{
						zaehler++;
						long temp = i * fakultaet.get(i - 1);
						fakultaet.add(i, temp);
					}
				}
			
		
		return fakultaet.get(zahl);
	}
			
			
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;

	}

	public int getZaehler() {
		return zaehler;
	}

	public void resetZaehler() {
		zaehler = 0;

	}

	public static void main(String[] args) {
		PascalBinominal pascalbin = new PascalBinominal();

		System.out.println(Arrays.toString(pascalbin.berechneZeile(5)));

		// // for (int i : zeile) {
		// //
		// // System.out.printf("%d\t", i);
		// // }
		// // System.out.println();
		// //
		//
		// // for (int k = 1; k < 15; k++) {
		// //
		// // int[] zeileN = pascalbin.berechneZeile(5);
		// // for (int i : zeileN) {
		// //
		// // System.out.printf("%d\t", i);
		// // }
		// // System.out.println();
		// // }
		//
	}

}
