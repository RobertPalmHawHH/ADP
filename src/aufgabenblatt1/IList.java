package aufgabenblatt1;

import aufgabenblatt1.Element;

public interface IList {

    
    public IListBLA insert(IListBLA list, Element element, int pos);
    
    public IListBLA delete(IListBLA list, int pos);
    
    public IListBLA delete(IListBLA list, Key key);
    
    public int find(IListBLA list, Key key);
    
    public Element retrieve(IListBLA list, int pos);
    
    public IListBLA concat(IListBLA list1, IListBLA list2);
    
}
