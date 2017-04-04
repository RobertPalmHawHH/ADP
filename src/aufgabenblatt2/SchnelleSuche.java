package aufgabenblatt2;

public class SchnelleSuche {
  private static int zaehlerSchnell;

  public boolean[] primzahlenSchnell(int N) {
    boolean[] a = new boolean[N];
    // Initialisierung
    for (int i = 0; i < N; i++) {
      a[i] = true;
    }
    // Berechnung
    for (int i = 3; i < N; i++) {
      for (int j = 2; j <= Math.sqrt(i); j++) {
        System.out.println("Schnell: " + zaehlerSchnell);
        zaehlerSchnell++;
        if ((i % j == 0) && (j != i)) {
          a[i] = false;
          break;
        }
      }
    }
    return a;
  }
}
