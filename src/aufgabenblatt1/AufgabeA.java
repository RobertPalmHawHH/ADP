package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.Element;

public class AufgabeA implements List_Interface {

  private Element[] listArray;
  int lastArrayIndex;

  public AufgabeA() {
    listArray = new Element[INIT_ARRAY_LENGTH];
    lastArrayIndex = listArray.length - 1;
  }

  public void increaseArraySize() {
    Element[] tempArray = new Element[listArray.length * 2];
    System.arraycopy(listArray, 0, tempArray, 0, listArray.length);
    listArray = tempArray;
    lastArrayIndex = listArray.length - 1;
  }

  public boolean insert(Element element, int pos) {
    if (pos >= listArray.length || pos < 0) {
      System.out.println("Der angegebene Index liegt nicht innerhalb der Grenzen des Arrays");
      return false;
    }
    if (listArray[lastArrayIndex] != null) {
      increaseArraySize();
    }
    for (int i = lastArrayIndex; i > pos; i++) {
      listArray[i] = listArray[i - 1];
    }
    listArray[pos] = element;
    return true;
  }

  public boolean delete(int pos) {
    if (pos >= listArray.length || pos < 0) {
      System.out.println("Der angegebene Index liegt nicht innerhalb der Grenzen des Arrays");
      return false;
    }
    for (int i = pos; i < lastArrayIndex; i++) {
      listArray[i] = listArray[i + 1];
    }
    return true;
  }

  public boolean delete(Element element) {
    delete(find(element));
    return true;
  }

  public int find(Element element) {
    for (int i = 0; i < listArray.length; i++) {
      if (listArray[i] == element) {
        return i;
      }
    }
    System.out.println("Angegebenes Element wurde nicht gefunden. -1 zurueckgegeben");
    return -1;
  }

  public Element retrieve(int pos) {
    if (pos >= listArray.length || pos < 0) {
      System.out.println("Index liegt nicht innerhalb der Grenzen des Arrays");
      return null;
    }
    return listArray[pos];
  }

  public boolean concat(List<Element> list2) {
    Element[] list2Array = new Element[list2.size()];
    list2.toArray(list2Array);
    int startPunkt = -1;
    int i = 0;
    while (startPunkt == -1 && i < listArray.length) {
      if (listArray[i] == null) {
        startPunkt = i;
        break;
      }
      i++;
      if (i >= listArray.length) {
        startPunkt = listArray.length;
        increaseArraySize();
      }
    } 
    while (listArray.length - startPunkt - list2Array.length <= 0) {
      increaseArraySize();
    }
    for (int j = 0; j < list2Array.length; j++) {
      listArray[j + startPunkt] = list2Array[j];
    }
    return true;
  }
}
