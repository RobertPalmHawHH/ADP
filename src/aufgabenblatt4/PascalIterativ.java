package aufgabenblatt4;

public class PascalIterativ implements InterfacePascal {

    public static int zaehler = 0;

    public int[] berechneZeile(int n) {

	int[] zeileAlt = new int[0];
	int[] zeileNeu;

	for (int i = 1; i <= n; i++) {

	    zeileNeu = new int[zeileAlt.length + 1];

	    // erste und letzte Position im Array sind immer eins
	    zeileNeu[0] = 1;
	    zeileNeu[zeileNeu.length - 1] = 1;

	    // berechne zahlen zwischen der ersten und letzten position.
	    for (int k = 1; k < i - 1; k++) {
		zeileNeu[k] = zeileAlt[k] + zeileAlt[k - 1];
		zaehler++;
	    }

	    zeileAlt = zeileNeu.clone();

	}
	return zeileAlt;

    }

    public int getZaehler() {
	return zaehler;
    }

    public void resetZaehler() {
	zaehler = 0;

    }
}
