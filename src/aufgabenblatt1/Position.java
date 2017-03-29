package aufgabenblatt1;

public class Position {

    private static int elementCounter;

    private Position nextPosition;
    private Position prevPosition;

    private Element element;

    public final int KEY;

    public Position() {
	KEY = elementCounter;
	elementCounter++;
    }

    public Position getNextPosition() {
	return nextPosition;
    }

    public void setNextPosition(Position nextPosition) {
	this.nextPosition = nextPosition;
    }

    public Position getPrevPosition() {
	return prevPosition;
    }

    public void setPrevPosition(Position prevPosition) {
	this.prevPosition = prevPosition;
    }

    public Element getElement() {
	return element;
    }

    public void setElement(Element element) {
	this.element = element;
    }

}
