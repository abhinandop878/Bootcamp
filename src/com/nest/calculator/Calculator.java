package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice,a,b,s;
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Select an Option:");
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. MUL");
            System.out.println("4. DIV");
            System.out.println("5. EXIT");
            System.out.println("Enter your choice:");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter 2 number for addition:");
                    a=input.nextInt();
                    b=input.nextInt();
                    s=a+b;
                    System.out.println("Addition:"+s);
                    break;
                case 2:
                    System.out.println("Enter 2 number for substraction:");
                    a=input.nextInt();
                    b=input.nextInt();
                    s=a-b;
                    System.out.println("Substraction:"+s);
                    break;
                case 3:
                    System.out.println("Enter 2 number for Multiplication:");
                    a=input.nextInt();
                    b=input.nextInt();
                    s=a*b;
                    System.out.println("Multiplication:"+s);
                    break;
                case 4:
                    System.out.println("Enter 2 number for Division:");
                    a=input.nextInt();
                    b=input.nextInt();
                    s=a/b;
                    System.out.println("Division:"+s);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
