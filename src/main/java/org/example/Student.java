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
    private long id;
    private String userName ="";

    private String course;
    private List modules;
    //need to add courses and modules here also


    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }


    /*
     * Returns a String representation of the students username
     * Derived from name and age of given student
     */
    public String getUsername(){
        return userName+=name+age;

    }

    @Override
    /**
     * Update as needed@@@@@@@@@@@@@@@@@@@
     */
    public String toString(){
        return "\n Student: " + name + " Age: " + age;
    }

    public void setDOB(String date){
        dob = date;
    }

    public void setCourse(String course){
        this.course = course;
    }

    /**
     * may not need this method, could be gammy will revisit again
     * @param module
     */
    public void setModules(Module module){
        modules.add(module);
    }
}
