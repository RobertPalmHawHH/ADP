package aufgabenblatt4;

public class PascalRekursiv extends AbstractPascal{


    
    

    @Override
    public int[] berechneZeile(int n) {

	if (n == 1) {

	    return new int[] { 1 };

	} else {

	    int[] zeileNminus1 = berechneZeile(n - 1);
	    int[] zeileN = new int[n];

	    // erste und letzte Position im Array sind immer eins
	    zeileN[0] = 1;
	    zeileN[n - 1] = 1;

	    // berechne zahlen zwischen der ersten und letzten position.
	    for (int i = 1; i < n - 1; i++) {
		zeileN[i] = zeileNminus1[i] + zeileNminus1[i - 1];
	    }
	    return zeileN;

	}
    }
}
