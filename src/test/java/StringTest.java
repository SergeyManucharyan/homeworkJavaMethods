import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    void StringIsEqual(){
        String m="Hello";
        String n="hello";
        assertFalse(m.equals(n));
        assertTrue(n.equals("hello"));
        assertEquals(m,"Hello");
    }
    @Test
    void StringNull(){
        String s=" ";
        assertNotNull(s);
        s=s.trim();
        assertNotNull(s);
        s=null;
        assertNull(s);
    }
    @Test
    void SubString(){
        String s ="hello";
        assertEquals(s.substring(2),"llo");
    }
    @Test
    void StringLength(){
        String s="Hello";
        assertEquals(s.substring(2).length(),3);
    }


}
