package aufgabenblatt2;

public class Main {
  public static void main(String args[]) {
     LangsameSuche lSuche = new LangsameSuche();
     lSuche.primzahlenLangsam(50);
    SchnelleSuche sSuche = new SchnelleSuche();
      sSuche.primzahlenSchnell(50);
    SiebSuche siSuche = new SiebSuche();
    siSuche.primzahlenSieb(50);
//    boolean[] a = siSuche.primzahlenSieb(50);
//    for (int i = 0; i < 50; i++) {
//      System.out.println(i + "  " + a[i]);
//    }
  }
}
