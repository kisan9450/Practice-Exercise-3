import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayPlacesTest {
    ArrayPlaces object;
    @Before
    public void setUp() throws Exception {
        object=new ArrayPlaces();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void removeVowels() {
        String[] expectedOutput={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        String[] actualInput={"India","United States","Germany","Egypt","czechoslovakia"};
        assertEquals(expectedOutput,object.removeVowels(actualInput));
    }

    @Test
    public void removeVowels2() {
        String[] expectedOutput={"Sr Lnk","Englnd","Spn","Mlys","Jpn"};
        String[] actualInput={"Sri Lanka","England","Spain","Malaysia","Japan"};
        assertEquals(expectedOutput,object.removeVowels(actualInput));
    }
}