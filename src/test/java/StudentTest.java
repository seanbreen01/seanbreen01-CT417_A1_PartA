import org.example.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testGetUsername(){
        System.out.println("Student getUsername");
        Student instance = new Student("test", 123);
        String expResult = "test123";
        String result = instance.getUsername();
        assertEquals(expResult, result, "Test failed, username not what was expected");


    }

    @Test
    public void testToString(){
        System.out.println("Student toString");
        Student instance = new Student("TestingName", 22);
        instance.setDOB("22/11/2000");
        String expResult = "\n Student Name: TestingName Age: 22 Date of Birth:22/11/2000 Student ID:0";
        String result = instance.toString();
        assertEquals(expResult, result, "Test failed, toString result not what was expected");

    }

}
