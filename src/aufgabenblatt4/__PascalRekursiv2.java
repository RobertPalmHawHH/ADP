package aufgabenblatt4;

public class __PascalRekursiv2 implements __Dreieck{

	
	
private int zaehler=0;

    public static void main(String[] args) {
	__PascalRekursiv pascalRek = new __PascalRekursiv();

	for (int k = 1; k < 15; k++) {
	 
		int[] zeileN = pascalRek.berechneZeile(k);
	    for (int i : zeileN) {
	    
		System.out.printf("%d\t", i);
	    }
	    System.out.println();
	}

    }

    public int[] berechneZeile(int n) {
    	
	if (n == 1) {
		zaehler++;
	    return new int[] { 1 };

	} else {
		zaehler++;
	    int[] zeileNminus1 = berechneZeile(n - 1);
	    int[] zeileN = new int[n];

	    // erste und letzte Position im Array sind immer eins
	    zeileN[0] = 1;
	    zeileN[n - 1] = 1;

	    // berechne zahlen zwischen der ersten und letzten position.
	    for (int i = 1; i < n - 1; i++) {
	    zaehler++;
		zeileN[i] = zeileNminus1[i] + zeileNminus1[i - 1];
	    }
	    zaehler++;
	    return zeileN;
	}
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
		
	}

	public int getZaehler() {
		
		return zaehler;
	}
	
    }