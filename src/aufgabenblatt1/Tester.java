package aufgabenblatt1;

public class Tester {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List_Interface b = new AufgabeB();
	
	IList list = new IList();
	
	for (int i = 0; i < 500; i++) {
	    b.insert(list, new Element(), 0);
	    
	}
	
	for (int i = 0; i < 500; i++) {
	    Element elem = b.retrieve(list, 0);
	    System.out.println(elem.getKey().key);
	    
	    b.delete(list, 0);
	    
	}
    }

}
