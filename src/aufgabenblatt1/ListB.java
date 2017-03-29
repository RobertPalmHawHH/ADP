package aufgabenblatt1;

import java.util.NoSuchElementException;

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

	// find List Position for linking
	Position pos = head;

	do {
	    if (pos.getNextPosition().equals(posToInsertOn)) {
		newPosition.setPrevPosition(pos);
		pos = pos.getNextPosition();
		newPosition.setNextPosition(pos);
		break;
	    }
	    pos = pos.getNextPosition();

	} while (!pos.equals(tail));

	// falls kein element gefunden, am anfang einfuegen
	if (pos.equals(tail)) {
	    head.getNextPosition().setPrevPosition(newPosition);
	    newPosition.setNextPosition(head.getNextPosition());
	    head.setNextPosition(newPosition);
	    newPosition.setPrevPosition(head);
	}

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

	// Laufe Liste ab
	// Bedingung: solange naechstes Elem nicht Tail ist
	Position pos = head; // erstes element

	while (!pos.getNextPosition().equals(tail)) {
	    pos = pos.getNextPosition();
	    if (pos.getKEY() == key) {
		break;
	    }
	}
	if (!pos.getNextPosition().equals(tail)) {
	    throw new NoSuchElementException("Yo digga Element ist nicht da!");
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
