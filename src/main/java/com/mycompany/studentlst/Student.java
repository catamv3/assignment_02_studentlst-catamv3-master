/**
 *
 * @author MoaathAlrajab
 * @author Michael Catalanotti
 *
 * This file contains class information for a student object.
 */
package com.mycompany.studentlst;
public class Student {//open class
    //Class members
    //Name of the student - String
    private String name;


    //To Do 01: add a constructor to this class

    /**
     * Default constructor for a Student object.
     */
    public Student(){
        name = "Michael Catalanotti";
    }

    /**
     * overloaded constructor. accepts a string, and instantiates a student
     * object with that name.
     * @param n
     */
    public Student(String n){
        name = n;
    }

    // To Do 02: Add setters and getters

    /**
     * Get method for the Name field.
     * @return a name
     */
    public String getName() {
        return name;
    }

    /**
     * set method for the name vairable.
     * @param name - name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
}
