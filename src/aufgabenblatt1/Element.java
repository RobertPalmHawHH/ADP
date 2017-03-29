package aufgabenblatt1;

public class Element {

    private static int elementCounter;
    
    private String key;
    
    public Element() {
   	key = "#" + elementCounter;
   	elementCounter++;
       }
    
    public String getKey(){
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