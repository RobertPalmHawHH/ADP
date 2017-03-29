package aufgabenblatt1;

public class Position {

    private Element nextPosition;
    private Element prevPosition;
    
    private Element element;

    
    
    public Element getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Element nextPosition) {
        this.nextPosition = nextPosition;
    }

    public Element getPrevPosition() {
        return prevPosition;
    }

    public void setPrevPosition(Element prevPosition) {
        this.prevPosition = prevPosition;
    }


    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

}
