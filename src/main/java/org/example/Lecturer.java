package org.example;

import java.util.List;

/**
 *
 * @author seanb
 */
public class Lecturer {
    private String name;
    private int age;
    private String dob;     //maybe change from String, revisit
    private long id;
    private String userName ="";
    //need to add courses and modules here also
    private List modulesTeaching;

    public Lecturer(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
     * Returns a String representation of the lecturers username
     * Derived from name and age of given lecturers
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

    /**
     * may not need this method, could be gammy will revisit again
     * @param module
     */
    public void setModuleTeaching(Module module){
        modulesTeaching.add(module);
    }
}