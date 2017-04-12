package aufgabenblatt1v2;

public class Element {

    private static int elementCounter;
    
    private Element nextElement;
    private Element prevElement;
    
    private Key key;
    
    public Element() {
   	key = new Key("#" + elementCounter);
   	elementCounter++;
       }
    
    public Key getKey(){
	return key;
    }

    public Element getNextElement() {
  return nextElement;
    }

    public void setNextElement(Element nextElement) {
  this.nextElement = nextElement;
    }

    public Element getPrevElement() {
  return prevElement;
    }

    public void setPrevElement(Element previousElement) {
  this.prevElement = previousElement;
    }
    
    public boolean equals(Object element) {
	if (element instanceof Element) {
	    if (((Element) element).key == key) {
		return true;
	    }
	}
	return false;
    }

}