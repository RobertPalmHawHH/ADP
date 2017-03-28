package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface List_Interface {

    public static final int INIT_ARRAY_LENGTH = 16;
    
    public Element[] insert(Element[] elements, Element element, int pos);
    
    public Element[] delete(Element[] elements, int pos);
    
    public Element[] delete(Element[] elements, Key key);
    
    public int find(Element[] elements, Key key);
    
    public Element retrieve(Element[] elements, int pos);
    
    public Element[] concat(Element[] list1, Element[] list2);
    
}
