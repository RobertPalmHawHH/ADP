package aufgabenblatt1;

public class ListB implements IList {

    private Position[] posArray;
    private Position head;
    private Position tail;
    private int size;

    public ListB() {
	head = new Position();
	tail = new Position();
	head.setNextPosition(tail);
	tail.setPrevPosition(head);
    }

    public boolean insert(Element element, Position posToInsertOn) {

	// Pruefung ob vergroesserung notwendig
	if (size == posArray.length)
	    increaseArraySize(posArray);

	// create new Position
	Position newPosition = new Position();
	newPosition.setElement(element);

	//find List Position for linking
	Position pos = head;
	
	while(!pos.getNextPosition().equals(tail)){
	    
	    if(pos.getNextPosition().equals(posToInsertOn)){
		newPosition.setPrevPosition(pos);
		pos = pos.getNextPosition();
		newPosition.setNextPosition(pos);
	    }
	    pos = pos.getNextPosition();
	}

	
	//TODO
	
	
	// Element in Memory einfuegen
	for (int i = 0; i < posArray.length; i++) {
	    if (posArray[i] == null) {
		posArray[i] = newPosition;
		break;
	    }
	}

	return false;
    }

    public boolean delete(Position pos) {

	Position prevPos = pos.getPrevPosition();
	prevPos.setNextPosition(pos.getNextPosition());

	for (int i = 0; i < posArray.length; i++) {
	    if (posArray[i].equals(pos))
		posArray[i] = null;
	}
	return true;
    }

    public boolean delete(int key) {
	Position posToDelete = find(key);
	return delete(posToDelete);
    }

    public Position find(int key) {

	Position pos = head; // erstes element

	// Laufe Liste ab
	// Bedingung: solange naechstes Elem nicht Tail ist
	while (!pos.getNextPosition().equals(tail)) {
	    pos = pos.getNextPosition();

	    if (pos.KEY == key) {
		break;
	    }
	}
	return pos;
    }

    public Element retrieve(Position pos) {
	return pos.getElement();
    }

    public boolean concat(IList list2) {
	// Alle Elemente von liste2 in liste1 einfuegen
	for (int i = 0; i < list2.size(); i++) {
	    insert(list1, list2.retrieve(i), 0);
	}
	return false;
    }

    private Element[] increaseArraySize(Position[] elements) {
	// Array mit doppelter groesse erstellen
	Element[] newArray = new Element[elements.length * 2];
	// tiefenkopie machen
	System.arraycopy(elements, 0, newArray, 0, elements.length);
	return newArray;
    }

}
