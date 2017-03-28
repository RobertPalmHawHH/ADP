package aufgabenblatt1;

public class List {
    
    public static final int INIT_ARRAY_LENGTH = 16;
    
    private Element[] array;
    private Element head;
    private Element tail;
    
    public List(){
	array = new Element[INIT_ARRAY_LENGTH];
	head = new Element();
	tail = new Element();
	head.setNextElement(tail);
	tail.setPrevElement(head);
    }

    public Element[] getArray() {
        return array;
    }

    public void setArray(Element[] array) {
        this.array = array;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

}
