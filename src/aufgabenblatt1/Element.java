package aufgabenblatt1;

public class Element {

    private static int elementCounter;
    
    private int key;
    
    public Element() {
   	key = elementCounter;
   	elementCounter++;
       }
    
    public int getKey(){
	return key;
    }

    @Override
    public boolean equals(Object element) {
	if (element instanceof Element) {
	    if (((Element) element).key == key) {
		return true;
	    }
	}
	return false;
    }

}