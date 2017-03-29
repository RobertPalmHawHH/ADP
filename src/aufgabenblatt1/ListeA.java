package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.*;

public class ListeA implements IList {
  
  public static final int INIT_ARRAY_SIZE = 16;
  private int size;
  Position[] listArray = new Position[INIT_ARRAY_SIZE];
  
  
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

  
  
  
  
  
  
  
  
  
  
  
  public boolean delete(Liste list, int pos) {
    if (posValid(list, pos)) {
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
  
  public int find(Liste list, Key key) {
    for (int i = 0; i < list.getArray().length; i++) {
      if (list.getArray()[i].getKey() == key) {
        return i;
      }
    }
    System.out.println("Angegebenes Element wurde nicht gefunden. -1 zurueckgegeben");
    return -1;
  }

  @Override
  public aufgabenblatt1.List delete(Liste list, Key key) {
    // TODO Auto-generated method stub
    return null;
  }



  public Element retrieve(Liste list, int pos) {
    if (!posValid(list, pos)) {
      System.out.println("Null zurueckgegeben!");
      return null;
    }
    return list.getArray()[pos];
  }
  
  @Override
  public Element retriee(Liste list, int pos) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public aufgabenblatt1.List concat(Liste list, Element[] list2) {
    // TODO Auto-generated method stub
    return null;
  }








  public void increaseArraySize() {
    Position[] tempArray = new Position[listArray.length * 2];
    System.arraycopy(listArray, 0, tempArray, 0, listArray.length);
    listArray = tempArray;
  }

//  private boolean posValid(Position pos) {
//    if (pos >= list.getArray().length || pos < 0) {
//      System.out.println("Position not in valid range!");
//      return false;
//    } else {
//      return true;
//    }
//  }
  
  @Override
  public boolean insert() {
    // TODO Auto-generated method stub
    return false;
  }
  
  @Override
  public boolean insert(Element element, Position pos) {
    if (listArray[listArray.length - 1] != null) {
      increaseArraySize();
    }
    for (int i = 0; i < size; i++) {
      if (listArray[i] == pos) {
        
      }
    }
    listArray[pos] = element;
    return listArray;
  }

  @Override
  public Position find(String key) {
    listArray[0] = key;
    for (int i = 0; 
    return null;
  }










  @Override
  public boolean delete(Position pos) {
    // TODO Auto-generated method stub
    return false;
  }












  @Override
  public boolean delete(String key) {
    // TODO Auto-generated method stub
    return false;
  }

























  @Override
  public Element retrieve(Position pos) {
    // TODO Auto-generated method stub
    return null;
  }












  @Override
  public boolean concat(IList list2) {
    // TODO Auto-generated method stub
    return false;
  }

  
  
  
//  public void increaseArraySize(Element[] elements) {
//    Element[] tempArray = new Element[listArray.length * 2];
//    System.arraycopy(listArray, 0, tempArray, 0, listArray.length);
//    listArray = tempArray;
//    lastArrayIndex = listArray.length - 1;
//  }
//  
//  
//  
//  
//  
//  
//  
//  
//  public boolean posValid(Element[] elements, int pos) {
//    if (pos >= listArray.length || pos < 0) {
//      System.out.println("Position not in valid range!");
//      return false;
//    } else {
//      return true;
//    }
//  }
//  
//  public int 
//  public void checkSize(Element[] elements, int neededSize) {
//    while (elements.length - elemCounter < neededSize) {
//      increaseArraySize();
//    }
//  }
//  @Override
//  public Element[] insert(Element[] elements, Element element, int pos) {
//    if (!posValid(elements, pos)) {
//      System.out.println("Position not in valid range!");
//      return elements;
//    }
//    if (listArray[lastArrayIndex] != null) {
//      increaseArraySize();
//    }
//    for (int i = lastArrayIndex; i > pos; i++) {
//      listArray[i] = listArray[i - 1];
//    }
//    listArray[pos] = element;
//    return elements;
//  }
//    return null;
//  }
//
//  @Override
//  public Element[] delete(Element[] elements, int pos) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//  @Override
//  public Element[] delete(Element[] elements, Key key) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//  @Override
//  public int find(Element[] elements, Key key) {
//    // TODO Auto-generated method stub
//    return 0;
//  }
//
//  @Override
//  public Element retrieve(Element[] elements, int pos) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//  @Override
//  public Element[] concat(Element[] list1, Element[] list2) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//}
