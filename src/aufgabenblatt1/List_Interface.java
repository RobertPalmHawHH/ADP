package aufgabenblatt1;

import java.util.List;

import aufgabenblatt1.ElementB;

public interface List_Interface {

    public static final int INIT_ARRAY_LENGTH = 16;
    
    public boolean insert(ElementB element, int pos);
    
    public boolean delete(int pos);
    
    public boolean delete(ElementB element);
    
    public int find(ElementB element);
    
    public ElementB retrieve(int pos);
    
    public boolean concat(List<ElementB> list2);
    
}
