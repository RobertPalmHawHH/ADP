package aufgabenblatt1v2;

import java.util.List;

public class AufgabeBv2<T> implements List_Interfacewithkey<T>{

  private ElementBv2<T> head, tail;
  
  public AufgabeBv2() {
    head = new ElementBv2<T>(null, 0);
    tail = head;
  }
  @Override
  public T[] insert(T element, int pos) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public T[] delete(int pos) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public T[] delete(String key) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int find(String key) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public T retrieve(int pos) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean concat(List<T> list2) {
    // TODO Auto-generated method stub
    return false;
  }
  
}
