import org.example.Lecturer;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest {

    @Test
    public void testGetUsername(){
        System.out.println("Lecturer getUsername");
        Lecturer instance = new Lecturer("LecturerTest", 456);
        String expResult = "LecturerTest456";
        String result = instance.getUsername();
        assertEquals(expResult, result, "Test failed, username not what was expected");


    }

    @Test
    public void testToString(){
    System.out.println("Lecturer toString");
    Lecturer instance = new Lecturer("TestName", 44);
    instance.setDOB("22/11/1978");
    String expResult = "\n Lecturer Name: TestName Age: 44 Date of Birth:22/11/1978 Lecturer ID:0";
    String result = instance.toString();
    assertEquals(expResult, result, "Test failed, toString result not what was expected");

    }

}