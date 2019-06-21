import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

public class UnitTest {
    @Test
    public void equalsLine()throws MyNullException{
        String str = "58burb1on4";
        RemoveNumbers obj = new RemoveNumbers(str);
        str=obj.removeNumbers();
        assertEquals("burbon",str);
    }
    @Test
    public void emptyString()throws MyNullException{
        String str = "12345";
        RemoveNumbers obj= new RemoveNumbers(str);
        str=obj.removeNumbers();
        assertEquals(str,"");
    }
    @Test
    public void punctuation()throws MyNullException{
        String str = "bur..54b.on2";
        RemoveNumbers obj= new RemoveNumbers(str);
        str=obj.removeNumbers();
        assertEquals(str, "bur..b.on");
    }
    @Test
    public void spaces()throws MyNullException{
        String str = "65bu 5r 7b6on 5";
        RemoveNumbers obj = new RemoveNumbers(str);
        str=obj.removeNumbers();
        assertEquals(str, "bu r bon ");
    }
    @Test(expected = MyNullException.class)
    public void checkExc()throws MyNullException{
        String str=null;
        RemoveNumbers obj = new RemoveNumbers(str);
        obj.removeNumbers();
    }
}