/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Liuchijang
 */
public class CourseList {
    ArrayList<Course> a = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public CourseList() {
    }
    
    public void printHeader() {
        System.out.println("COURSE MANAGEMENT SYSTEM");
        System.out.println("1. A list of all available courses in the system");
        System.out.println("2. Search and display information of a course by course id");
        System.out.println("3. Record/Add information of course");
        System.out.println("4. Sort all courses by number of credit as ascending");
        System.out.println("5. Update information of a specific course (by course id)");
        System.out.println("0. Exit");
        System.out.print("Select your choice: ");
    }
    
    public void listAll(){
        System.out.printf("%s%20s%20s\n", "Course id", "Course name", "Course credit");
        for(Course i: a)
            printCourse(i);
    }
    
    public void add(){
        System.out.print("Enter course id: "); in = new Scanner(System.in);String s1 = in.nextLine();
        System.out.print("Enter course name: "); in = new Scanner(System.in); String s2 = in.nextLine();
        System.out.print("Enter course credit: "); in = new Scanner(System.in);int x = in.nextInt();
        Course b = new Course(x, s2, s1);
        a.add(b);
        System.out.println("Information of course has been added");
    }
    
    public Course getCourseById(String id){
        for(Course i: a){
            if(i.getId().equals(id)) 
                return i;
        }
        return null;
    }
    
    public void printCourse(Course c){
        System.out.printf("%s%20s%20d\n", c.getId(), c.getName(), c.getCredit());
    }
    
    public void search(){
        String id;
        in = new Scanner(System.in);
        System.out.print("Enter course id: ");
        id = in.nextLine();
        System.out.println("Information of course");
        printCourse(getCourseById(id));
    }
    
    public void sort(){
        Collections.sort(a, new Comparator<Course>(){
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getId().compareTo(o2.getId());
            }     
        });
    }
    
    public void update(){
        String id;
        in = new Scanner(System.in);
        System.out.print("Enter course id: ");
        id = in.nextLine();
        System.out.println("Information of course");
        printCourse(getCourseById(id));
        System.out.print("Enter new course credit: ");
        int x = in.nextInt();
        getCourseById(id).setCredit(x);
        System.out.println("Information of course has been update");
    }
}
