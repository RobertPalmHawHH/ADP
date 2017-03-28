package aufgabenblatt1;

public class Liste{
    
    public static final int INIT_ARRAY_LENGTH = 16;
    
    private Element[] memory;
    private Element head;
    private Element tail;
    private int size;
    
    public Liste(){
	memory = new Element[INIT_ARRAY_LENGTH];
	head = new Element();
	tail = new Element();
	head.setNextElement(tail);
	tail.setPrevElement(head);
	memory[0] = tail;
	memory[1] = head;
	size = 0;
    }

    public Element[] getMemory() {
        return memory;
    }

    public void setMemory(Element[] array) {
        this.memory = array;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }
    
    public int size(){
	return size;
    }
    
    public void increaseSize(){
	size++;
    }
    public void decreaseSize(){
	size--;
    }
}
