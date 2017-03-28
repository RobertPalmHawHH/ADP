package aufgabenblatt1v2;

import java.util.List;

import aufgabenblatt1v2.AufgabeAv2.KeyElement2;

public interface List_Interfacewithkey<K, E> {

    public static final int INIT_ARRAY_LENGTH = 16;
    
    public KeyElement2<K, E>[] insert(E element, int pos);
    
    public KeyElement2<K, E>[] delete(int pos);
    
    public KeyElement2<K, E>[] delete(K key);
    
    public int find(String key);
    
    public E retrieve(int pos);
    
    public boolean concat(List_Interfacewithkey<K, E> list2);
    
}
