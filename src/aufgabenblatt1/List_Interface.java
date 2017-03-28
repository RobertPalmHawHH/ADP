package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface List_Interface {

    
    public Liste insert(Liste list, Element element, int pos);
    
    public Liste delete(Liste list, int pos);
    
    public Liste delete(Liste list, Key key);
    
    public int find(Liste list, Key key);
    
    public Element retrieve(Liste list, int pos);
    
    public Liste concat(Liste list1, Liste list2);
    
}
