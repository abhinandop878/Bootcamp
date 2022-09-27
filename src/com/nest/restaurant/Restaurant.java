package com.nest.restaurant;

import com.nest.gettersAndSetters.Food;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total=0,choice,n,i,f=0;
        Scanner input=new Scanner(System.in);
        ArrayList<String> purchase=new ArrayList<String>();
        ArrayList<Integer> numberOf=new ArrayList<Integer>();
        ArrayList<Integer> price=new ArrayList<Integer>();
        ArrayList<Integer> sum=new ArrayList<Integer>();
        Food fooditems=new Food(40,51,55,70,51);
        Food takeawayFooditems=new Food(42,53,57,72,53);
        while (true){
            System.out.println("\t\t\tSelect an Option");
            System.out.println("1. Dinner In");
            System.out.println("2. Takeaway");
            System.out.println("3. Cancel");
            System.out.println("Enter your Choice:");
            choice=input.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\t\t\t***MENU***");
                        System.out.println("\t\t\t   ====");
                        System.out.println("1. Tea                  " + fooditems.getTea());
                        System.out.println("2. Coffee Mocachino     " + fooditems.getCoffeeMocachino());
                        System.out.println("3. Espresso (Black)     " + fooditems.getEspresso());
                        System.out.println("4. Cold-Coffee (Frappe) " + fooditems.getColdCoffee());
                        System.out.println("5. Ice Tea (Lemon)      " + fooditems.getIceTea());
                        System.out.println("6. \t\tPRINT BILL");
                        System.out.println("7. Exit");
                        System.out.println("Enter your choice:");
                        try {
                            choice = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            System.out.println("Enter your choice again:");
                            choice = input.nextInt();
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Number of Tea");
                                n = input.nextInt();
                                total = total + (n * 40);
                                purchase.add("Tea");
                                numberOf.add(n);
                                price.add(40);
                                sum.add(n * 40);
                                break;
                            case 2:
                                System.out.println("Number of Coffee Mocachino");
                                n = input.nextInt();
                                total = total + (n * 51);
                                purchase.add("Coffee Mocachino");
                                numberOf.add(n);
                                price.add(51);
                                sum.add(n * 51);
                                break;
                            case 3:
                                System.out.println("Number of Espresso (Black)");
                                n = input.nextInt();
                                total = total + (n * 55);
                                purchase.add("Espresso (Black)");
                                numberOf.add(n);
                                price.add(55);
                                sum.add(n * 55);
                                break;
                            case 4:
                                System.out.println("Number of Cold-Coffee (Frappe)");
                                n = input.nextInt();
                                total = total + (n * 70);
                                purchase.add("Cold-Coffee (Frappe)");
                                numberOf.add(n);
                                price.add(70);
                                sum.add(n * 70);
                                break;
                            case 5:
                                System.out.println("Number of Ice Tea (Lemon)");
                                n = input.nextInt();
                                total = total + (n * 51);
                                purchase.add("Ice Tea (Lemon)");
                                numberOf.add(n);
                                price.add(51);
                                sum.add(n * 51);
                                break;
                            case 6:
                                System.out.println("\t\t\t***BILL***");
                                System.out.println("\t\t\t   ====");
                                for (i = 0; i < purchase.size(); i++) {
                                    System.out.println(i + 1 + ". " + purchase.get(i) + "   " + numberOf.get(i) + " * " + price.get(i) + " = " + sum.get(i));
                                }
                                System.out.println("\t\t\t\t\tTOTAL= " + total + "/-");
                                System.out.println("\t\t\t\t\t===========");
                                break;
                            case 7:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invaild input!");
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("\t\t\t***MENU***");
                        System.out.println("\t\t\t   ====");
                        System.out.println("1. Tea                  " + takeawayFooditems.getTea());
                        System.out.println("2. Coffee Mocachino     " + takeawayFooditems.getCoffeeMocachino());
                        System.out.println("3. Espresso (Black)     " + takeawayFooditems.getEspresso());
                        System.out.println("4. Cold-Coffee (Frappe) " + takeawayFooditems.getColdCoffee());
                        System.out.println("5. Ice Tea (Lemon)      " + takeawayFooditems.getIceTea());
                        System.out.println("6. \t\tPRINT BILL");
                        System.out.println("7. Exit");
                        System.out.println("Enter your choice:");
                        try {
                            choice = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            System.out.println("Enter your choice again:");
                            choice = input.nextInt();
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Number of Tea");
                                n = input.nextInt();
                                total = total + (n * 40);
                                purchase.add("Tea");
                                numberOf.add(n);
                                price.add(40);
                                sum.add(n * 40);
                                break;
                            case 2:
                                System.out.println("Number of Coffee Mocachino");
                                n = input.nextInt();
                                total = total + (n * 51);
                                purchase.add("Coffee Mocachino");
                                numberOf.add(n);
                                price.add(51);
                                sum.add(n * 51);
                                break;
                            case 3:
                                System.out.println("Number of Espresso (Black)");
                                n = input.nextInt();
                                total = total + (n * 55);
                                purchase.add("Espresso (Black)");
                                numberOf.add(n);
                                price.add(55);
                                sum.add(n * 55);
                                break;
                            case 4:
                                System.out.println("Number of Cold-Coffee (Frappe)");
                                n = input.nextInt();
                                total = total + (n * 70);
                                purchase.add("Cold-Coffee (Frappe)");
                                numberOf.add(n);
                                price.add(70);
                                sum.add(n * 70);
                                break;
                            case 5:
                                System.out.println("Number of Ice Tea (Lemon)");
                                n = input.nextInt();
                                total = total + (n * 51);
                                purchase.add("Ice Tea (Lemon)");
                                numberOf.add(n);
                                price.add(51);
                                sum.add(n * 51);
                                break;
                            case 6:
                                System.out.println("\t\t\t***BILL***");
                                System.out.println("\t\t\t   ====");
                                for (i = 0; i < purchase.size(); i++) {
                                    System.out.println(i + 1 + ". " + purchase.get(i) + "   " + numberOf.get(i) + " * " + price.get(i) + " = " + sum.get(i));
                                }
                                System.out.println("\t\t\t\t\tTOTAL= " + total + "/-");
                                System.out.println("\t\t\t\t\t===========");
                                break;
                            case 7:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invaild input!");
                        }
                    }
                case 3:
                    System.exit(0);
            }
        }
    }
}
