package aufgabenblatt1v2;

public class ElementBv2<T> {

  private ElementBv2<T> nextElement;
  private ElementBv2<T> prevElement;
  private static int keyCounter = 0;
  private String key;
  private int pos; // TODO POS soll kein int sein?
  private T element;
  
  public ElementBv2() {
    this.key = "#" + keyCounter;
    keyCounter++;
  }
  
  public ElementBv2(T element, int pos) {
    this.element = element;
    this.pos = pos;
    this.key = "#" + keyCounter;
    keyCounter++;
  }
  
  public ElementBv2 (int pos) {
    this.pos = pos;
    this.key = "#" + keyCounter;
    keyCounter++;
  }
  
  public String getKey() {
    return key;
  }

  public T getElement() {
    return element;
  }
  public int getPos() {
    return pos;
  }

  public void setPos(int pos) {
    this.pos = pos;
  }

  public ElementBv2<T> getNextElement() {
    return nextElement;
  }

  public void setNextElement(ElementBv2<T> nextElement) {
    this.nextElement = nextElement;
  }

  public ElementBv2<T> getPrevElement() {
    return prevElement;
  }

  public void setPrevElement(ElementBv2<T> previousElement) {
    this.prevElement = previousElement;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object element) {
    if (element instanceof ElementBv2<?>) {
      if (((ElementBv2<T>) element).key.equals(this.key)) {
        return true;
      }
    }
    return false;
  }
}
