package aufgabenblatt1;

public class AufgabeC implements List_Interface {
  
    
    public Liste insert(Liste liste, Element element, int pos) {

  	
  	// Element an der jeweiligen Position holen
  	Element elemToReplace = retrieve(liste, pos);

  	// ... und neues zwischen diesem und Vordermann quetschen
  	element.setPrevElement(elemToReplace.getPrevElement());
  	element.setNextElement(elemToReplace);

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
  	//Alle Elemente von liste2 in liste1 einfuegen
  	for(int i=0; i < list2.size();i++){
  	    insert(list1, retrieve(list2, i), 0);
  	}
  	return list1;
      }
}
