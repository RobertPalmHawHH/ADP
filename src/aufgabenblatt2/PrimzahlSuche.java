package aufgabenblatt2;

public class PrimzahlSuche {
  private static int zaehlerPrimzahlSuche;

  public boolean istPrimzahl(int N) {
    for (int i = 2; i <= Math.sqrt(N); i++) {
      zaehlerPrimzahlSuche++;
      System.out.println("istPrim: " + zaehlerPrimzahlSuche);
      if (N % i == 0 && i != N)
        return false;
    }
    return true;
  }
}
