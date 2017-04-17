package aufgabenblatt4;

public class PascalIterativ implements InterfacePascal {

    public static int zaehler = 0;

    public long[] berechneZeile(int n) {

	long[] zeileAlt = new long[0];
	long[] zeileNeu;

	for (int i = 1; i <= n; i++) {
		zaehler++;
	    zeileNeu = new long[zeileAlt.length + 1];

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
