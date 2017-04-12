package aufgabenblatt1;

import java.util.NoSuchElementException;

public class ListeB implements IList {
    
    
    public static int counter = 0;
    

    private final int minArraySize = 16;

    private Position[] posArray;
    private Position head;
    private Position tail;
    private int size;

    public ListeB() {
	posArray = new Position[minArraySize];
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

	// Pruefung ob vergroesserung notwendig
	if (size >= posArray.length)
	    posArray = increaseArraySize(posArray);

	// Element in Memory einfuegen
	for (int i = 0; i < posArray.length; i++) {
	    if (posArray[i] == null) {
		posArray[i] = position;
		break;
	    }
	}

	return true;
    }

    public boolean delete(Position pos) {

	    counter++;
	    System.out.println(counter);

	// Position ueberbruecken
	Position prevPos = pos.getPrevPosition();
	prevPos.setNextPosition(pos.getNextPosition());

	size--;

	// Position aus posArray loeschen
	for (int i = 0; i < posArray.length; i++) {
	    if (posArray[i] != null && posArray[i].equals(pos)) {
		posArray[i] = null;
	    }
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

	// Alle Positionen von THIS (posArray) in list2 inserten
	for (int i = 0; i < posArray.length; i++) {
	    list2.insert(posArray[i].getElement(), posArray[i]);
	}
	return list2;
    }

    private Position[] increaseArraySize(Position[] elements) {
	System.out.println("[Increasing Array Size]");
	// Array mit doppelter groesse erstellen
	Position[] newArray = new Position[elements.length * 2];
	// tiefenkopie machen
	System.arraycopy(elements, 0, newArray, 0, elements.length - 1);
	return newArray;
    }

}
