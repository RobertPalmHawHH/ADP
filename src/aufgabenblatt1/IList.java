package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface IList {

    
    public boolean insert(Element element, Position pos);
    
    public boolean delete(Position pos);
    
    public boolean delete(int key);
    
    public Position find(int key);
    
    public Element retrieve(Position pos);
    
    public IList concat(IList list2);
    
}
