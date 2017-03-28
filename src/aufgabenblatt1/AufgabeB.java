package aufgabenblatt1;



import aufgabenblatt1.Element;

public class AufgabeB implements List_Interface {

    private int listSize = 0;

    public Element[] insert(Element[] elements, Element element, int pos) {
	// ueberpruefen ob position vorhanden
	if (pos > listSize) {
	    throw new IndexOutOfBoundsException();
	}

	// Pruefung ob vergroesserung notwendig
	if (elements.length == listSize)
	    increaseArraySize(elements);

	// Element in Array einfuegen
	for (int i = 0; i < elements.length; i++) {
	    if (elements[i] == null) {
		elements[i] = element;
		break;
	    }
	}

	// Element an der jeweiligen Position holen
	Element elemToReplace = retrieve(elements, pos);

	// ... und neues zwischen diesem und Vordermann quetschen
	element.setPrevElement(elemToReplace.getPrevElement());
	element.setNextElement(elemToReplace);

	return elements;
    }

    public Element[] delete(Element[] elements, int pos) {

	// Element ermitteln und dieses loeschen
	delete(elements, retrieve(elements, pos).getKey());
	return elements;
    }

    public Element[] delete(Element[] elements, Key key) {

	//find Element
	int posOfElem = find(elements, key);
	Element elementToDelete = retrieve(elements, posOfElem);
	
	// Element ueberbruecken (Zeiger von Nachbarelementen entfernen)
	Element previous = elementToDelete.getPrevElement();
	previous.setNextElement(elementToDelete.getNextElement());

	// Element aus array loeschen
	for (int i = 0; i < elements.length; i++) {
	    if (elements[i].equals(elementToDelete)) {
		elements[i] = null;
	    }
	}

	return elements;
    }

    public int find(Element[] elements, Key key) {

	
	int stepCounter = 0;
	Element elem = elements[0]; //TODO richtig erstes element finden
	
	// Laufe Liste ab
	while (elem.getNextElement() != null) {
	    elem = elem.getNextElement();
	    stepCounter++;
	    if (elem.getKey() == key) {
		break;
	    }
	}
	return stepCounter;
    }

    public Element retrieve(Element[] elements, int pos) {
	// ueberpruefen ob pos vorhanden
	if (pos > listSize || pos < 0)
	    throw new IndexOutOfBoundsException();

	// Durch Liste gehen und zaehlen
	Element elem = elements[1];// get first Element
	int stepCount = 0;
	while (pos < stepCount) {
	    elem = elem.getNextElement();
	    stepCount++;
	}
	return elem;
    }

    public Element[] concat(Element[] list1, Element[] list2) {
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
