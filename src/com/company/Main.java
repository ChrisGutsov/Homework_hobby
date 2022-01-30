package com.company;
import java.io.FilterOutputStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

                // Програма в която потревбителя може да въведе своето име и любимо хоби.
                System.out.println("This is user and hobby checking program:");
                System.out.println("=======================================");
                System.out.println("Please enter you First name:");
                Scanner scanner = new Scanner(System.in);
                String firstName = scanner.next();
                System.out.println("Please enter you Last name:");
                Scanner scanner1 = new Scanner(System.in);
                String lastName = scanner1.next();
                System.out.println("What is your favorite hobby?");
                System.out.println("1. Hiking");
                System.out.println("2. Swimming");
                System.out.println("3. Photography");
                System.out.println("4. Watching TV");
                System.out.println("5. Drinking");
                System.out.println("Enter your choise:");
        int hobby = scanner.nextByte();

        if (hobby == 1){
            System.out.println(" " +firstName+" "+lastName +" Great hobby! Hiking is a long, vigorous walk.");
        }
        if (hobby == 2){
            System.out.println(" " +firstName+" "+lastName+" Swimming is great! you always be in a good shape!");
        }
        if (hobby == 3){
            System.out.println(" " +firstName +" "+lastName +" Great hobby! you may have great memories.");
        }
        if(hobby == 4){
            System.out.println(" " +firstName +" "+lastName +" Bad hobby! you may have healthy issues!");
        }
        if(hobby == 5){
            System.out.println(" " +firstName +" "+lastName +" Very Bad hobby! You are destroying life!!");
      }

    }
}
