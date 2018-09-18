import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade object;
    @Before
    public void setUp() throws Exception {
        object=new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void check() {
        boolean expectedOutput=true;
        int[] actualInput={78,87,56,98,65};
        assertEquals(expectedOutput,object.check(actualInput));
    }

    @Test
    public void checkIt() {
        boolean expectedOutput=false;
        int[] actualInput={78,87,56,101,65};
        assertEquals(expectedOutput,object.check(actualInput));
    }
}