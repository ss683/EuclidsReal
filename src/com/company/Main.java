package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean goThru = true;
        boolean goThru2 = true;
        int first = 1;
        int second = 2;
        int answer;

        while (goThru == true) {
            System.out.println("What are the two numbers that you want to find the GCD of? (i.e. 55 225)");
            try {
                first = input.nextInt();
                second = input.nextInt();
                input.nextLine();
                goThru = false;

            } catch (InputMismatchException e) {
                System.out.println("You did not put in numbers. Try again.");
                input.nextLine();
            }
        }
        while (goThru2 == true) {
            System.out.println("Recursive or Iterative?");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Recursive")) {
                Recursive go = new Recursive(first, second);
                answer = go.GCD();
                goThru2 = false;
                System.out.println("GCD using Recursion: " + answer);
            } else if (choice.equalsIgnoreCase("Iterative")) {
                Iterative it = new Iterative(first, second);
                answer = it.GCD();
                goThru2 = false;
                System.out.println("GCD using Iteration: " + answer);
            } else
                System.out.println("Inputted wrong thing.");
        }
    }
    }
