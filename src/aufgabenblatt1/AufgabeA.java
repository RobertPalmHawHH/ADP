package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.*;

public class AufgabeA implements List_Interface {


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
  public Liste insert(Liste list, Element element, int pos) {
    if (!posValid(list, pos)) {
      System.out.println("Element konnte nicht eingefuegt werden!");
      return list;
    }
    if (list.getArray()[list.getArray().length - 1] != null) {
      increaseArraySize(list);
    }
    for (int i = list.getArray().length - 1; i > pos; i++) {
      list.getArray()[i] = list.getArray()[i - 1];
    }
    list.getArray()[pos] = element;
    return list;
  }
  
  public boolean posValid(Liste list, int pos) {
    if (pos >= list.getArray().length || pos < 0) {
      System.out.println("Position not in valid range!");
      return false;
    } else {
      return true;
    }
  }
  
  public void increaseArraySize(Liste list) {
    Element[] tempArray = new Element[list.getArray().length * 2];
    System.arraycopy(list.getArray(), 0, tempArray, 0, list.getArray().length);
    list.setArray(tempArray);
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
