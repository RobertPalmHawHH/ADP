package aufgabenblatt1;

import static org.junit.Assert.*;
import aufgabenblatt1.*;
import org.junit.Test;

public class TestAufgabeA {

    @Test
    public void testIncreaseArraySize() {
      ListeA listeA = new ListeA();
        listeA.increaseArraySize();
        assertEquals(32, listeA.listArray.length);
        listeA.increaseArraySize();
        assertEquals(64, listeA.listArray.length);
    }
    
    @Test
    public void testFind() {
      ListeA listeA = new ListeA(); Element element = new Element(); Position pos = new Position();
      Element element2 = new Element();
      pos.setElement(element);
      listeA.insert(element, pos);
      assertEquals(listeA.getListArrayIndex(0).getElement(), pos.getElement());
      listeA.insert(element2, pos);
      assertEquals(listeA.getListArrayIndex(0), )
    }
    @Test
    public void testInsert() {
      IList listeA = new ListeA(); Element element = new Element(); Position pos = new Position();
      pos.setElement(element);
//      assertEquals();
    }

}
