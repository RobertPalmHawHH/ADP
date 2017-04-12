package aufgabenblatt1;

import static org.junit.Assert.*;
import aufgabenblatt1.*;
import org.junit.Test;

public class TestListeA {

    @Test
    public void testIncreaseArraySize() {
      ListeA listeA = new ListeA();
        listeA.increaseArraySize();
        assertEquals(32, listeA.getListArray().length);
        listeA.increaseArraySize();
        assertEquals(64, listeA.getListArray().length);
    }
    
    @Test
    public void testInsert() {
      int testKey = -1;
      ListeA listeA = new ListeA(); Element element = new Element(); Position pos = new Position();
//      Element element2 = new Element();
      pos.setElement(element);
      listeA.insert(element, pos);
      for(int i = 0; i < listeA.getSize(); i++) {
        if(listeA.getListArrayIndex(i) == pos) {
          testKey = listeA.getListArrayIndex(i).getKEY();
        }
      }
      assertEquals(testKey, element.getKEY());
//      listeA.insert(element2, pos);
//      assertEquals(listeA.retrieve(pos).getKEY(), element.getKEY());
    }
    @Test
    public void testFind() {
      ListeA listeA = new ListeA(); Element element = new Element(); Position pos = new Position();
      pos.setElement(element);
      listeA.insert(element, pos);
//      assertEquals(listeA.get, listeA.find(pos.getKEY()));
    }

}
