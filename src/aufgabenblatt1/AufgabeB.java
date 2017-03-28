package aufgabenblatt1;

import aufgabenblatt1.Element;

public class AufgabeB implements List_Interface {

    public Liste insert(Liste liste, Element element, int pos) {

	Element[] memory = liste.getMemory();
	// ueberpruefen ob position vorhanden
	if (pos > memory.length) {
	    throw new IndexOutOfBoundsException();
	}

	// Pruefung ob vergroesserung notwendig
	if (liste.size() == memory.length)
	    increaseArraySize(memory);

	// Element in Array einfuegen
	for (int i = 0; i < liste.getMemory().length; i++) {
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

	liste.setMemory(memory);

	return liste;
    }

    public Liste delete(Liste liste, int pos) {

	// Element ermitteln und dieses loeschen
	delete(liste, retrieve(liste, pos).getKey());
	return liste;
    }

    public Liste delete(Liste liste, Key key) {

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

    public int find(Liste liste, Key key) {

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

    public Element retrieve(Liste liste, int pos) {
	// ueberpruefen ob pos vorhanden
	if (pos > liste.size() || pos < 0)
	    throw new IndexOutOfBoundsException();

	// Durch Liste gehen und zaehlen
	Element elem = liste.getHead();// get first Element
	int stepCount = 0;
	while (pos <= stepCount) {
	    elem = elem.getNextElement();
	    stepCount++;
	}
	return elem;
    }

    public Liste concat(Liste list1, Liste list2) {
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
