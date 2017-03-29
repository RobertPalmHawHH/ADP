package aufgabenblatt1;


public class ListB implements IList {

    private Element[] memory;
    private Element head;
    private Element tail;
    private int size;
    
    public ListB(){
	head = new Element();
	tail = new Element();
	head.setNextElement(tail);
	tail.setPrevElement(head);
    }
    
    public IList insert(IList liste, Element element, int pos) {

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
	Element elemToReplace = retrieve(liste, pos);

	// ... und neues zwischen diesem und Vordermann quetschen
	element.setPrevElement(elemToReplace.getPrevElement());
	element.setNextElement(elemToReplace);

	System.out.println("Inserted "+element.getKey().key);
	return liste;
    }

    public IListBLA delete(IListBLA liste, int pos) {

	// Element ermitteln und dieses loeschen
	delete(liste, retrieve(liste, pos).getKey());
	return liste;
    }

    public IListBLA delete(IListBLA liste, Key key) {

	// find Element
	int posOfElem = find(liste, key);
	Element elementToDelete = retrieve(liste, posOfElem);

	// Element ueberbruecken (Zeiger von Nachbarelementen entfernen)
	Element previous = elementToDelete.getPrevElement();
	previous.setNextElement(elementToDelete.getNextElement());

	// Element aus memory loeschen
	Element[] memory = liste.getMemory();
	for (int i = 0; i < memory.length; i++) {
	    if (memory[i].equals(elementToDelete)) {
		memory[i] = null;
	    }
	}
	liste.setMemory(memory);

	return liste;
    }

    public int find(IListBLA liste, Key key) {

	int stepCounter = 0;
	Element elem = liste.getHead(); // erstes element finden

	// Laufe Liste ab
	//Bedingung: solange naechstes Elem nicht Tail ist
	while (!elem.getNextElement().equals(liste.getTail())) {
	    elem = elem.getNextElement();
	    stepCounter++;
	    if (elem.getKey() == key) {
		break;
	    } else if(elem.getNextElement().equals(liste.getTail())){
		stepCounter = -1;
		break;
	    }
	}
	return stepCounter;
    }

    public Element retrieve(IListBLA liste, int pos) {
	// ueberpruefen ob pos vorhanden
	if (pos > liste.size() || pos < 0)
	    throw new IndexOutOfBoundsException();

	// Durch Liste gehen und zaehlen
	Element elem = liste.getTail();// get first Element
	int stepCount = 0;
	while (pos < stepCount) {
	    elem = elem.getNextElement();
	    stepCount++;
	}
	return elem;
    }

    public IListBLA concat(IListBLA list1, IListBLA list2) {
	//Alle Elemente von liste2 in liste1 einfuegen
	for(int i=0; i < list2.size();i++){
	    insert(list1, retrieve(list2, i), 0);
	}
	return list1;
    }

    private Element[] increaseArraySize(Element[] elements) {
	// Array mit doppelter groesse erstellen
	Element[] newArray = new Element[elements.length * 2];
	// tiefenkopie machen
	System.arraycopy(elements, 0, newArray, 0, elements.length);
	return newArray;
    }

}