package aufgabenblatt4;

import java.util.ArrayList;

public class __PascalBinominal implements __Dreieck{

	int zaehler = 0;
	ArrayList<Integer> fakultaet;
	
	public int[] berechneZeile(int reihe) {
		
		int zahl = berechneFakult�t(reihe);
		return null;
	}
	
	
	
	
	
	public int berechneFakult�t(int zahl){
		int faku = 1;
		for(int i =1; i<= zahl;i++){
			faku*=i;
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

	
	public static void main (String[] args){
		__PascalBinominal pas = new __PascalBinominal();
		System.out.println(pas.berechneFakult�t(5));
	}
	
}
