package com.it.academy;


import java.util.Scanner;

public class primitiveTypes {
    public static void main(String[] args) {

        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   v v  aaaaa");
        System.out.println(" JJ  a     a   v  a     a");
        System.out.println("Age difference");
        Scanner scan = new Scanner(System.in);

        System.out.println("Age ot the first person is?");
        int age1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Age of second person is?");
        int age2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Is person 1 a regular customer?");
        String is1RegularCustomer = scan.nextLine();
        System.out.println("Is person 1 a regular customer?");
        String is2RegularCustomer = scan.nextLine();
        System.out.println("Let's check weekday while we're here. Type a number");
        int odp = scan.nextInt();
        scan.nextLine();
        switch (odp){
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwaretk");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedzilea");
                break;
            default:
                System.out.println("Wybrano zla wartosxc");

        }
        System.out.println("Fun fact. Age 1 would gie you a wheel with " + (2 * 3.14 * age1)+  " perimeter wheel");
        System.out.println("Another fun fact, age 2 would gie you wheel with " + (3.14 * (age2 * age2)) + " area");


        boolean per1 = false;
        boolean per2;
        if (is1RegularCustomer.equals("yes")){
            per1 = true;
        }else {
            per2 = false;
        }
        if (is2RegularCustomer.equals("yes")){
            per2 = true;
        }else {
            per2 = false;
        }

        Person person1 = new Person(age1, per1);
        Person person2 = new Person(age2, per2);
        person1.ageChecker(age1);
        person2.ageChecker(age2);
        person1.isRegularCustomer(per1);
        person2.isRegularCustomer(per2);


        if(age1 > age2){
            System.out.println("Person aged " + age1 + " is older");
        }else if(age1<age2){
            System.out.println("Person aged " + age2 + " is older");
        } else if(age1 == age2){
            System.out.println("same age");
        }else{
            System.out.println("Incorrect value entered");
        }


    }

    static class Person{
        int age;
        boolean isRegular;
        Person(int age, boolean isRegular){
            this.age = age;
            this.isRegular = isRegular;
        }
        public void ageChecker(int i){
            if(i > 65){
                System.out.println("Person qualifies for a 10% discount");
            }else if(i < 18){
                System.out.println("Person qualifies for a 25% discount");
            }
        }

        public void isRegularCustomer(boolean isRegular){
            if(isRegular == true){
                System.out.println("additional 5% added");
            }else {
                System.out.println("Not a regular customer");
            }
        }
    }
}
