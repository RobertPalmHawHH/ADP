package aufgabenblatt1v2;

public interface List_Interface {

    
    public Element[] insert(Element[] memory, Element element, int pos);
    
    public Element[] delete(Element[] memory, int pos);
    
    public Element[] delete(Element[] memory, Key key);
    
    public int find(Element[] memory, Key key);
    
    public Element retrieve(Element[] memory, int pos);
    
    public Element[] concat(Element[] memory1, Element[] memory2);
    
}
