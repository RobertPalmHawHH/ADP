package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface IList {

    
    public boolean insert(Element element, Position pos);
    
    public boolean delete(Position pos);
    
    public boolean delete(String key);
    
    public Position find(String key);
    
    public Element retrieve(Position pos);
    
    public boolean concat(IList list2);
    
}
