package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seanb
 */
public class Lecturer {
    private String name;
    private int age;
    private String dob;     //maybe change from String, revisit
    private static long id;
    private String userName;
    //need to add courses and modules here also
    private ArrayList<Module> modulesTeaching;

    public Lecturer(String name, int age){
        this.name = name;
        this.age = age;
        modulesTeaching = new ArrayList<>();
        id = generateID();
        userName = getUsername();
    }

    /*
     * Returns a String representation of the lecturers username
     * Derived from name and age of given lecturers
     */
    public String getUsername(){
        return name+age;

    }

    /**
     *
     * @return Returns unique ID number for Lecturer
     */
    public long generateID(){

       return id++;
    }


    @Override
    /**
     * Update as needed@@@@@@@@@@@@@@@@@@@
     */
    public String toString(){

        return "\n Lecturer Name: " + name + " Age: " + age + " Date of Birth:" + dob + " Lecturer ID:" + id + " User Name:" + userName;
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