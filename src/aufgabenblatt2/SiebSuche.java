package aufgabenblatt2;

public class SiebSuche {
  private static int zaehlerSieb;

  public boolean[] primzahlenSieb(int N) {
    boolean[] a = new boolean[N];
    for (int i = 0; i < N; i++) {
      a[i] = true;
    }

    for (int i = 2; i < Math.sqrt(N); i++) {
      if (a[i] == true) {
        for (int j = 2; i*j < N; j++) {
          a[i*j] = false;
          zaehlerSieb++;
          System.out.println("Sieb: " + zaehlerSieb);
        }
      }
    }
    return a;
  }
}
