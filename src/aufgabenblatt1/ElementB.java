package aufgabenblatt1;

public class ElementB {

    private ElementB nextElement;
    private ElementB prevElement;


    public ElementB getNextElement() {
  return nextElement;
    }

    public void setNextElement(ElementB nextElement) {
  this.nextElement = nextElement;
    }

    public ElementB getPrevElement() {
  return prevElement;
    }

    public void setPrevElement(ElementB previousElement) {
  this.prevElement = previousElement;
    }

}