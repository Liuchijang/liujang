/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Liuchijang
 */
public class CourseManagementSystem {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
        int check;
        CourseList list = new CourseList();
        Scanner sc = new Scanner(System.in);
        while(true){
            list.printHeader();
            check = sc.nextInt();
            switch(check){
                case 1:
                    list.listAll();
                    break;
                case 2:
                    list.search();
                    break;
                case 3:
                    list.add();
                    break;
                case 4:
                    list.sort();
                    break;
                case 5:
                    list.update();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}
