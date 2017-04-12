package aufgabenblatt1;

import java.util.NoSuchElementException;

public class ListeC implements IList {

    public static int counter = 0;

    private Position head;
    private Position tail;
    private int size;

    public ListeC() {
	head = new Position();
	tail = new Position();
	head.setNextPosition(tail);
	tail.setPrevPosition(head);
	size = 0;
    }

    public boolean insert(Element element, Position position) {

	// find List Position for linking
	Position pos = head;

	do {
	    if (pos.getNextPosition().equals(position)) {

		position = new Position();
		// create new Position
		position.setElement(element);

		position.setPrevPosition(pos);
		pos = pos.getNextPosition();
		position.setNextPosition(pos);
		break;
	    }
	    pos = pos.getNextPosition();

	} while (!pos.equals(tail));

	// falls kein element gefunden, am anfang einfuegen
	if (pos.equals(tail)) {
	    head.getNextPosition().setPrevPosition(position);
	    position.setNextPosition(head.getNextPosition());
	    head.setNextPosition(position);
	    position.setPrevPosition(head);
	}

	size++;

	return true;
    }

    public boolean delete(Position pos) {

	    counter++;
	    System.out.println(counter);

	// Position ueberbruecken
	Position prevPos = pos.getPrevPosition();
	prevPos.setNextPosition(pos.getNextPosition());

	size--;

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
	    counter++;
	    System.out.println(counter);
	    pos = pos.getNextPosition();
	    if (pos.getKEY() == key) {
		break;
	    }
	}
	if (!pos.getNextPosition().equals(tail)) {
	    throw new NoSuchElementException("Element nicht vorhanden!");
	}

	return pos;
    }

    public Element retrieve(Position pos) {
	return pos.getElement();
    }

    public IList concat(IList list2) {
	// TODO Auto-generated method stub
	return null;
    }

}
