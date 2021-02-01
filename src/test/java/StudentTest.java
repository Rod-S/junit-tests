import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student newStudent;

    @Before
    public void setUp(){
        newStudent = new Student(0, "rod");
    }

    @Test
    public void testLongId() {
        assertEquals(0, newStudent.getId());
    }

    @Test
    public void testName() {
        assertEquals("rod", newStudent.getName());
    }

    @Test
    public void testAddGrade() {
        assertEquals("0", newStudent.addGrade(0));
    }
}

