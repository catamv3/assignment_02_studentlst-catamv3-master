/**
 * @author MoaathAlrajab
 * @author Michael Catalanotti
 *
 * This file contains a launch point for the student list program.
 * This program prompts the user for the names of two students,
 * it then prints the users input out on the console.
 */
package com.mycompany.studentlst;
import java.util.Scanner;

public class StudentLst {//open class

    /**
     * This is the main method for the StudentLst program.
     * @param args
     */
    public static void main(String[] args) {
        //declare 2 element array of Student objects
        Student[] students= new Student[2];
        //create keyboard scanner object to recieve input.
        Scanner inScanner = new Scanner(System.in);

        //for loop that prompts the user for a students' name, then
        //declares a student object with that name
        //and populates the student array
        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);
            
            students[i]= student;
            
        }

        //call printOutput and print that to the console.
        System.out.println(printOutput(students));
    }

    /**
     * this method accepts an array of student objects,
     * and generates a formatted string of each name stored in the array.
     * @param students an array of student objects.
     * @return a formatted string that neatly has
     * the names of each student in the array.
     */
    public static String printOutput(Student[] students){
        //declare a blank string
        String str="";

        //To Do 03: complete the implementation of this method
        /**
         * for loop that runs for the length of the array.
         * using the index of the loop and get methods of the student object
         * a formatted string is produced and added to str.
         */
        for(int i =0; i < students.length;i++){
            String frmt = String.format("%d. %s\n",(i+1),students[i].getName());
            str+=frmt;
        }

        //return the ful formatted string
        return str;
    }
    
    
}
