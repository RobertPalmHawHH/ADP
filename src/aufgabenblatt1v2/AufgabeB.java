package aufgabenblatt1v2;

public class AufgabeB implements List_Interface {

    private Element head;
    private Element tail;
    private int size;

    public AufgabeB() {
	head = new Element();
	tail = new Element();
	head.setNextElement(tail);
	tail.setPrevElement(head);
	size = 0;
    }

    public Element[] insert(Element[] memory, Element element, int pos) {

	// ueberpruefen ob position vorhanden
	if (pos > memory.length) {
	    throw new IndexOutOfBoundsException();
	}

	// Pruefung ob vergroesserung notwendig
	if (size == memory.length)
	    increaseArraySize(memory);

	// Element in Memory einfuegen
	for (int i = 0; i < memory.length; i++) {
	    if (memory[i] == null) {
		memory[i] = element;
		break;
	    }
	}

	// Element an der jeweiligen Position holen
	Element elemToReplace = retrieve(memory, pos);

	// ... und neues zwischen diesem und Vordermann quetschen
	element.setPrevElement(elemToReplace.getPrevElement());
	element.setNextElement(elemToReplace);

	return memory;
    }

    public Element[] delete(Element[] memory, int pos) {

	// Element ermitteln und dieses loeschen
	delete(memory, retrieve(memory, pos).getKey());
	return memory;
    }

    public Element[] delete(Element[] memory, Key key) {

	// find Element
	int posOfElem = find(memory, key);
	Element elementToDelete = retrieve(memory, posOfElem);

	// Element ueberbruecken (Zeiger von Nachbarelementen entfernen)
	Element previous = elementToDelete.getPrevElement();
	previous.setNextElement(elementToDelete.getNextElement());

	// Element aus memory loeschen
	for (int i = 0; i < memory.length; i++) {
	    if (memory[i].equals(elementToDelete)) {
		memory[i] = null;
	    }
	}

	return memory;
    }

    public int find(Element[] memory, Key key) {

	int stepCounter = 0;
	Element elem = head; // erstes element finden

	// Laufe Liste ab
	// Bedingung: solange naechstes Elem nicht Tail ist
	while (!elem.getNextElement().equals(tail)) {
	    elem = elem.getNextElement();
	    stepCounter++;
	    if (elem.getKey() == key) {
		break;
	    }
	}
	if (elem.getNextElement().equals(tail)) {
	    stepCounter = -1;
	}
	return stepCounter;
    }

    public Element retrieve(Element[] memory, int pos) {
	// ueberpruefen ob pos vorhanden
	if (pos > size || pos < 0)
	    throw new IndexOutOfBoundsException();

	// Durch Liste gehen und zaehlen
	Element elem = head;// get first Element
	int stepCount = 0;
	while (pos <= stepCount) {
	    elem = elem.getNextElement();
	    stepCount++;
	}
	return elem;
    }

    public Element[] concat(Element[] memory1, Element[] memory2) {
	
	
	
	
	
	
	// TODO Auto-generated method stub
	return null;
    }

    private Element[] increaseArraySize(Element[] elements) {
	// Array mit doppelter groesse erstellen
	Element[] newArray = new Element[elements.length * 2];
	// tiefenkopie machen
	System.arraycopy(elements, 0, newArray, 0, elements.length);
	return newArray;
    }

}
