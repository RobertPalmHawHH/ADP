package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.*;

public class ListeA implements IList {

  public static final int INIT_ARRAY_SIZE = 16;
  private static int size;
  Position[] listArray = new Position[INIT_ARRAY_SIZE];
  private static long zaehler;
  public static int zaehlerFIND;
  public static long zaehlerDEL;

  public IList concat(IList list2) {
    for (int i = 0; i < listArray.length; i++) {
      zaehler++;
      list2.insert(listArray[i].getElement(), listArray[i]);
    }
    return list2;
  }

  public void increaseArraySize() {
    Position[] tempArray = new Position[listArray.length * 2];
    System.arraycopy(listArray, 0, tempArray, 0, listArray.length);
    listArray = tempArray;
  }

  // private boolean posValid(Position pos) {
  // if (pos >= list.getArray().length || pos < 0) {
  // System.out.println("Position not in valid range!");
  // return false;
  // } else {
  // return true;
  // }
  // }

  @Override
  public boolean insert(Element element, Position pos) {
    if (listArray[listArray.length - 1] != null) {
      increaseArraySize();
    }
    Position insertable = find(pos.getKEY());
    if (insertable != null) {
      for (int i = size - 1; i >= 0; i--) {
        zaehler++;
        listArray[i] = listArray[i - 1];
        if (listArray[i] == insertable) {
          listArray[i] = new Position();
          listArray[i].setElement(element);
          size++;
          return true;
        }
      }
    } else {
      zaehler++;
      listArray[size] = new Position();
      listArray[size].setElement(element);
      size++;
      return true;
    }
    return false;
  }

  public Position find(int key) {
    for (int i = 0; i < size; i++) {
      zaehlerFIND++;
      if (listArray[i].getKEY() == key) {
        return listArray[i];
      }
    }
    return null;
  }

  @Override
  public boolean delete(Position pos) {
    for (int i = 0; i < size - 1; i++) {
      zaehlerDEL++;
      if (listArray[i] == pos) {
        for (int j = i; j < size - 1; j++) {
          zaehlerDEL++;
          listArray[j] = listArray[j + 1];
          if (listArray[j + 1] == null) {
            size--;
            return true;
          }
        }
      }
    }
    return false;
  }

  public boolean delete(int key) {
    delete(find(key));
    return true;
  }

  @Override
  public Element retrieve(Position pos) {
    return pos.getElement();
  }

  public int getSize() {
    return size;
  }

  public Position[] getListArray() {
    return listArray;
  }

  public Position getListArrayIndex(int index) {
    return listArray[index];
  }

  public static void main(String args[]) {
    ListeA listeA = new ListeA();
    Position[] posListeA = new Position[10];
    for (int i = 0; i < 100000; i++) {
      posListeA[i] = new Position();
      listeA.insert(new Element(), posListeA[i]);
      System.out.println(zaehler);
    }
    System.out.println(" Die groesse!!!!" + size);
    listeA.zaehlerFIND = 0;
    for(int i = 0; i < 100000; i++) {
      int randomZahl = (int) (Math.random() * 100000);
      System.out.println(randomZahl);
    listeA.find(randomZahl);
    System.out.println("Find aufruf: " + listeA.zaehlerFIND);
  }
  }
}
