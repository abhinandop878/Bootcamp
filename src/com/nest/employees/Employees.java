package com.nest.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        int choice;
        String Empname;
        ArrayList<String> emplist=new ArrayList<String>();
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter an Option:");
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee Selected");
                    System.out.println("Enter Employee name:");
                    Empname=input.next();
                    emplist.add(Empname);
                    break;
                case 2:
                    if (emplist.size()==0)
                    {
                        System.out.println("No Employee Added!");
                        break;
                    }
                    else
                    {
                        System.out.println("View all Employee Selected");
                        System.out.println(emplist);
                        break;
                    }
                case 3:
                    System.exit(0);

            }

        }
    }
}
