package org.example;

import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author seanb
 */
public class CourseProgramme {

    private String courseName;
    private List modules;
    private List students;
    private DateTime start, end;    //added dependency and can now use Joda date time stuff

    public CourseProgramme(String name, DateTime start, DateTime end){
        courseName = name;
        this.start = start;
        this.end = end;
    }

    public void addModule(Module module){
        modules.add(module);
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
