package Lists;

import java.util.*;

/**
 * Created by P045 on 20-06-2015.
 */
public class EmpDB {
    static ArrayList<Employee> database;

    static {
        database = new ArrayList<Employee>();
    }
    public static  void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        for(int i =0 ;i<n;i++)
        {
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter employee id");
            String temp = sc.nextLine();

            System.out.println("Enter employee salary");
            String salary = sc.nextLine();
            database.add(new Employee(Integer.parseInt(temp), name, salary));
        }
        System.out.println("------------------------------------------------");
        /*for(int i = 0;i<database.size();i++)
        {
            database.get(i).display_Employee();
        }*/
       /* for(Object o : database) {//In jav Object is the parent of all class.
           // Employee ob = (Employee) o;
            ((Employee) o).display_Employee();
            System.out.println("------------------------------------");
        }*/
        for(Employee o : database) {

            o.display_Employee();
            System.out.println("------------------------------------");
        }


    }

}
