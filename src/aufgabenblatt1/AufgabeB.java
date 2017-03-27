package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.ElementB;

public class AufgabeB implements List_Interface {

  private ElementB[] array;

  private int listSize = 0;

  public AufgabeB() {
    array = new ElementB[INIT_ARRAY_LENGTH];
  }

  public boolean insert(ElementB element, int pos) {
    // ueberpruefen ob position vorhanden
    if (pos > listSize) {
      throw new IndexOutOfBoundsException();
    }

    // Pruefung ob vergroesserung notwendig
    if (array.length == listSize)
      increaseArraySize();

    // Element in Array einfuegen
    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        break;
      }
    }

    // Element an der jeweiligen Position holen
    ElementB elemToReplace = retrieve(pos);

    // ... und neues zwischen diesem und Vordermann quetschen
    element.setPrevElement(elemToReplace.getPrevElement());
    element.setNextElement(elemToReplace);

    return true;
  }

  public boolean delete(int pos) {
    // Element ermitteln und dieses loeschen
    delete(retrieve(pos));
    return true;
  }

  public boolean delete(ElementB element) {

    // Element ueberbruecken (Zeiger von Nachbarelementen entfernen)
    ElementB previous = element.getPrevElement();
    previous.setNextElement(element.getNextElement());

    // Element aus array loeschen
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        array[i] = null;
      }
    }
    return true;
  }

  public int find(ElementB element) {

    int stepCounter = 0;
    ElementB elem = array[1]; // erstes Element

    // Laufe Liste ab
    while (elem.getNextElement() != null) {
      elem = elem.getNextElement();
      stepCounter++;
      if (elem == element) {
        break;
      }
    }
    return stepCounter;
  }

  public ElementB retrieve(int pos) {
    // ueberpruefen ob pos vorhanden
    if (pos > listSize || pos < 0)
      throw new IndexOutOfBoundsException();

    // Durch Liste gehen und zaehlen
    ElementB elem = array[1];// get first Element
    int stepCount = 0;
    while (pos < stepCount) {
      elem = elem.getNextElement();
      stepCount++;
    }
    return elem;
  }

  public boolean concat(List<ElementB> list2) {
    // TODO Auto-generated method stub
    return false;
  }

  private void increaseArraySize() {
    // einfach groesse des arrays verdoppeln
    ElementB[] newArray = new ElementB[array.length * 2];
    // tiefenkopie machen
    System.arraycopy(array, 0, newArray, 0, array.length);
    array = newArray;
  }

}
