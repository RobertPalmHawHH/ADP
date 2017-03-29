package aufgabenblatt1;

public class Position {

    private Element nextElement;
    private Element prevElement;

    private Element element;

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
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

}
