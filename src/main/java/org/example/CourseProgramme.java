package org.example;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author seanb
 */
public class CourseProgramme {

    private String courseName;
    private ArrayList modules;
    private ArrayList students;
    private DateTime start, end;    //added dependency and can now use Joda date time stuff

    public CourseProgramme(String name, DateTime start, DateTime end){
        courseName = name;
        this.start = start;
        this.end = end;
        modules = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addModule(Module module){
        modules.add(module);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void getStudentsEnrolled(){

        //Print all students here
        System.out.println("");
    }

}
