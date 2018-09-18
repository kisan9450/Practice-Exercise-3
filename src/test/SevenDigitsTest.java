import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SevenDigitsTest {
    SevenDigits object;
    @Before
    public void setUp() throws Exception {
        object=new SevenDigits();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void checkDigits() {
        boolean expected=true;
        int input[]={98,97,96,95,94,93};
        assertEquals(expected,object.checkDigits(input));
    }
    @Test
    public void checkDigits2() {
        boolean expected=false;
        int input[]={98,96,95,94,93};
        assertEquals(expected,object.checkDigits(input));
    }
    @Test
    public void checkDigits3() {
        boolean expected=false;
        int input[]={1,2,3,4,5,6,6};
        assertEquals(expected,object.checkDigits(input));
    }

}