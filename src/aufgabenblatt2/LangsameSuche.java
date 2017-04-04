package aufgabenblatt2;

public class LangsameSuche {
  public static int zaehlerLangsam;

  public boolean[] primzahlenLangsam(int N) {
    boolean a[] = new boolean[N];
    // Initialisierung
    for (int i = 0; i < N; i++) {
      a[i] = true;
    }
    // Berechnung
    for (int i = 2; i < N; i++) {
      for (int j = 2; j < N; j++) {
        if ((i % j == 0) && (j != i)) {
          a[i] = false;
        }
        System.out.println(zaehlerLangsam);
        zaehlerLangsam++;
      }
    }
    return a;
  }
}
