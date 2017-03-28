package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface List_Interface {

    
    public List insert(List list, Element element, int pos);
    
    public List delete(List list, int pos);
    
    public List delete(List list, Key key);
    
    public int find(List list, Key key);
    
    public Element retrieve(List list, int pos);
    
    public List concat(List list, Element[] list2);
    
}
