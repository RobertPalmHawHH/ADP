package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.*;

public class ListeA implements IList {

  public static final int INIT_ARRAY_SIZE = 16;
  private int size;
  Position[] listArray = new Position[INIT_ARRAY_SIZE];
  private int zaehler;

  public boolean concat(IList list2) {
    Position[] list2Array = new Position[INIT_ARRAY_SIZE];
    
    
    
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
    for (int i = size - 1; i >= 0; i--) {
      listArray[i] = listArray[i - 1];
      if (listArray[i] == insertable) {
        listArray[i] = new Position();
        listArray[i].setElement(element);
        size++;
        return true;
      }
    }
    return false;
  }

  @Override
  public Position find(int key) {
    for (int i = 0; i < size; i++) {
      if (listArray[i].getKEY() == key) {
        return listArray[i];
      }
    }
    return null;
  }

  @Override
  public boolean delete(Position pos) {
    for (int i = 0; i < size - 1; i++) {
      if (listArray[i] == pos) {
        for (int j = i; j < size - 1; j++) {
          listArray[j] = listArray[j + 1];
          if (listArray[j + 1] == null) {
            size--;
            break;
          }
        }
      }
    }
    return true;
  }

  public boolean delete(int key) {
    delete(find(key));
    return true;
  }

  @Override
  public Element retrieve(Position pos) {
    return pos.getElement();
  }
}
