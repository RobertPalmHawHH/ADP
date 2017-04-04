package aufgabenblatt1;

public class Element {
  private static int elementCounter = 0;

  private final int KEY;

  public Element() {
    KEY = elementCounter;
    elementCounter++;
  }

  public int getKEY() {
    return KEY;
  }
}