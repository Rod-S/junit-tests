import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    @Test
    public void testAddStudent(){
        Cohort cohort1 = new Cohort();
        Student fer = new Student(1L, "fer");
        Student fer2 = new Student(2L, "fer2");
        cohort1.addStudent(fer);
        assertNotNull(cohort1);
        assertSame(cohort1.getStudents().get(0), fer);
        assertNotSame(cohort1.getStudents().get(0), fer2);
    }

    @Test
    public void testGetListCurrentStudents(){
        Cohort cohort1 = new Cohort();
        Student fer = new Student(1L, "fer");
        Student fer2 = new Student(2L, "fer2");
        cohort1.addStudent(fer);
        cohort1.addStudent(fer2);
        assertTrue(cohort1.getStudents().contains(fer));
        assertTrue(cohort1.getStudents().contains(fer2));
        assertNotNull(cohort1.getStudents());
    }


    @Test
    public void testGetCohortAvg(){
        Cohort cohort1 = new Cohort();
        Student fer = new Student(1L, "fer");
        Student fer2 = new Student(2L, "fer2");
        cohort1.addStudent(fer);
        cohort1.addStudent(fer2);
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
        fer2.addGrade(100);
        assertSame(100, fer2.getGrades().get(0));
        fer2.addGrade(80);
        assertSame(80, fer2.getGrades().get(1));
        assertTrue(cohort1.getCohortAverage()==90);
    }

}
