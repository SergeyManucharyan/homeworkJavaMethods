import arrays.Methods;
import org.junit.jupiter.api.Test;
import stringandstringbuilder.StringMethods;

import static org.junit.jupiter.api.Assertions.*;

public class MethodTest {
    StringMethods sm=new StringMethods();
    Methods m = new Methods();
    @Test
    void reverseTest(){
        assertTrue(sm.reverse("ABC").equals("CBA"));
    }
    @Test
    void upperCaseTest(){
        assertEquals(sm.upperCase("aaa"),"AAA");
    }
    @Test
    void removeCharTest(){
        assertEquals(sm.removeChar("abaacab"),"bcb");
    }
    @Test
    void largestWordTest() {
        StringBuilder s = new StringBuilder("To help others better understand your language");
        assertTrue(sm.largestWord(s).equals("understand"));
    }
    @Test
    void indexOf(){
        assertEquals(sm.indexOf("word","w"),0);
    }
    @Test
    void isNullOrEmptyTest(){
        assertTrue(sm.isNullOrEmpty(null));
        assertTrue(sm.isNullOrEmpty(""));
        assertFalse(sm.isNullOrEmpty(" "));
    }
    @Test
    void maxMinValueTest(){
        long[] l ={10,20,50,6,9};

        assertEquals(m.maxValue(l),50);
        assertEquals(m.minValue(5,2,0.25f,6,81),0.25);
    }
    @Test
    void sumOfTwoArray(){
        int[] arr={1,2,3};
        int[] arr1={4,5,6};
        assertArrayEquals(m.sumOfTwoArray(arr,arr1), new int[]{5, 7, 9});
    }
    @Test
    void howManyTimesTest(){
        int[] arr={5,9,5,3,8,5,1};
        assertEquals(m.howManyTimes(5,arr),3);
    }
    @Test
    void removeZeroTest(){
        int[] arr={1,0,2,0,3,0,4};
        assertArrayEquals(m.removeZero(arr),new int[]{1,2,3,4});
    }
    @Test
    void toDecimalTest(){
        assertEquals(m.toDecimal("1001"),9);
    }
}
