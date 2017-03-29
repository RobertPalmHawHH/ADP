package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface IList {

    
    public IList insert(IList list, Element element, int pos);
    
    public IList delete(IList list, int pos);
    
    public IList delete(IList list, Key key);
    
    public int find(IList list, Key key);
    
    public Element retrieve(IList list, int pos);
    
    public IList concat(IList list1, IList list2);
    
}
