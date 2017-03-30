package aufgabenblatt1;

import java.util.NoSuchElementException;

public class ListeC implements IList {
  
    private Position head;
    private Position tail;
    private int size;

    public ListeC() {
	head = new Position();
	tail = new Position();
	head.setNextPosition(tail);
	tail.setPrevPosition(head);
    }

    public boolean insert(Element element, Position posToInsertOn) {


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

	return true;
    }

    public boolean delete(Position pos) {

	//Position ueberbruecken
	Position prevPos = pos.getPrevPosition();
	prevPos.setNextPosition(pos.getNextPosition());

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

    public IList concat(IList list2) {
	//ALTER DAS IST NICHT MOEGLICH DIE ZU CONCATEN
	return list2;
    }

    private Element[] increaseArraySize(Position[] elements) {
	// Array mit doppelter groesse erstellen
	Element[] newArray = new Element[elements.length * 2];
	// tiefenkopie machen
	System.arraycopy(elements, 0, newArray, 0, elements.length);
	return newArray;
    }
}
