package aufgabenblatt1v2;

import java.util.Arrays;

import aufgabenblatt1.ElementB;
import aufgabenblatt1v2.*;
public class AufgabeAv2<K, E> implements List_Interfacewithkey<K, E> {
  
  private KeyElement2<K, E> listArray[];
  private int elemCounter = 0;
  
  public static class KeyElement2<K2, E2> implements KeyElement<K2, E2> {
    private K2 key;
    private E2 element;
    
    @Override
    public K2 getKey() {
      return key;
    }
    
    @Override
    public E2 getElement() {
      return element;
    }
    
    public void setKey(K2 key) {
      this.key = key;
    }
    protected KeyElement2 (K2 key, E2 element) {
      this.element = element;
      this.key = null;
    }
  }
  
  @SuppressWarnings("unchecked")
  public AufgabeAv2() {
    listArray = new KeyElement2[INIT_ARRAY_LENGTH];
  }
  
  @SuppressWarnings("unchecked")
  public void increaseArraySize() {
    KeyElement2<K, E>[] tempArray = new KeyElement2[listArray.length * 2];
    System.arraycopy(listArray, 0, tempArray, 0, listArray.length);
    listArray = tempArray;
  }
  
  public void checkSize(int neededSize) {
    while (listArray.length - elemCounter < neededSize) {
      increaseArraySize();
    }
  }
  
  public boolean posValid(int pos) {
     if (pos >= listArray.length || pos < 0) {
       System.out.println("Position not in valid range!");
       return false;
     } else {
       return true;
     }
  }
  
  @Override
  public KeyElement2<K, E>[] insert(E element, int pos) {
    if (!posValid(pos)) {
      return listArray;
    }
    checkSize(1);
    while (listArray[pos - 1] == null) {
      pos--;
    } if (listArray[pos] != null) {
      moveElements(pos, true);
    }
    listArray[pos] = new KeyElement2<K, E>(null, element);
    elemCounter++;
    return listArray;
  }
  
  private void moveElements(int pos, boolean value) {
    if (posValid(pos)) {
      if (value == true) {
      checkSize(1);
      if (listArray[pos + 1] != null) {
        moveElements(pos + 1, true);
      }
      listArray[pos + 1] = listArray[pos];
      } else {
        for (int i = pos; i < elemCounter; i++) {
          listArray[i] = listArray[i + 1];
        }
      }
    }
  }
  
  @Override
  public KeyElement2<K, E>[] delete(int pos) {
    if (posValid(pos)) {
      listArray[pos] = null;
      moveElements(pos, false);
    }
    return listArray;
  }

  @Override
  public KeyElement2<K, E>[] delete(K key) {
      for (int i= 0; i < listArray.length; i++) {
        if (listArray[i] != null) {
          if (listArray[i].getKey() == key) {
            listArray[i] = null;
          }
        }
      }
    return listArray;
  }

  @Override
  public int find(String key) {
    
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public E retrieve(int pos) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean concat(List_Interfacewithkey<K, E> list2) {
    // TODO Auto-generated method stub
    return false;
  }
  
}
