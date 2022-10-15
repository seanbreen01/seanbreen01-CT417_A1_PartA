package org.example;

import java.util.ArrayList;

/**
 *
 * @author seanb
 */
public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> studentsEnrolled;
    private ArrayList<String> coursesAssociated;
    private Lecturer lecturerAssociated;

    public Module(String name, String mID, Lecturer lecturer){
        moduleName = name;
        moduleID = mID;
        lecturerAssociated = lecturer;
        studentsEnrolled = new ArrayList<>();
        coursesAssociated = new ArrayList<>();
    }

    public void addStudent(Student student){
        if(!studentsEnrolled.contains(student)){
            //not present already, add new student
            studentsEnrolled.add(student);
        }
        else{
            System.out.print("Student already enrolled in this course");
        }

    }
    public void listStudentsEnrolled(){
        System.out.println(studentsEnrolled.toString());
    }

    public void addCoursesAssociated(String course){coursesAssociated.add(course);}

    public Lecturer getLecturerAssociated(){return lecturerAssociated;}

    @Override
    public String toString(){

        return "\n Module Name: " + moduleName + " Module ID: " + moduleID + " Lecturer in Charge of module" + lecturerAssociated;
    }


}
