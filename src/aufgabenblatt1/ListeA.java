package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.*;

public class ListeA implements IList {

  public static final int INIT_ARRAY_SIZE = 16;
  private int size;
  Position[] listArray = new Position[INIT_ARRAY_SIZE];
  private static int zaehler;
  public static int zaehlerFIND;

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
      return true;
    }
    return false;
  }

  @Override
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
      zaehler++;
      if (listArray[i] == pos) {
        for (int j = i; j < size - 1; j++) {
          zaehler++;
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
    for (int i = 0; i < 100; i++) {
      listeA.insert(new Element(), new Position());
      System.out.println(zaehler);
    }
//    for(int i = 0; i < 100; i++) {
//    listeA.find(i);
//    System.out.println(zaehlerFIND);
//  }
  }
}
