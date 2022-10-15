package org.example;

import java.util.List;

/**
 *
 * @author seanb
 */
public class Student {

    private String name;
    private int age;
    private String dob;     //maybe change from String, revisit
    private static long id;
    private String userName ="";

    private String course;
    private List modules;
    //need to add courses and modules here also


    public Student(String name, int age){
        this.name = name;
        this.age = age;
        userName = getUsername();
        id = generateID();

    }


    /**
     * Returns a String representation of the students username
     * Derived from name and age of given student
     */
    public String getUsername(){
        return name+age;

    }

    /**
     *
     * @return Returns unique ID number for Student
     */
    public long generateID(){

        return id++;
    }

    @Override
    /**
     *
     */
    public String toString(){
        return "\n Student Name: " + name + " Age: " + age + " Date of Birth:" + dob + " Student ID:" + id + " User Name:" + userName;
    }

    public void setDOB(String date){
        dob = date;
    }

    public void setCourse(String course){
        this.course = course;
    }

    /**
     *
     * @param module
     */
    public void setModules(Module module){
        modules.add(module);
    }
}
