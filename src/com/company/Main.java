package com.company;

/********************************************
 *	DEVELOPER:	Fatima Enriquez
 * COLLABORATORS: <name of peer, tutor, instructor>
 *	COURSE:	CS226 Discrete Structures
 *	PROJECT:	Project 3
 *	LAST MODIFIED:	<date of last change>
 ********************************************/
/********************************************
 *	Project 03
 *********************************************
 *	PROGRAM DESCRIPTION:
 *	Write a program that takes a positive integer from console input
 *	and outputs the prime factorization of the integer
 *	and states whether the number is prime or composite.
 *********************************************
 *	STATIC METHODS:
 * <list methods UML diagram style>
 *********************************************/

/*********************************************
 *	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
 *********************************************/

import java.util.Scanner; //to get user input

public class Main {
    /*********************************************
     * MAIN PROGRAM:
     *********************************************/
    public static void primeNumber(int n) {
        System.out.println("\nThe number you input is: " + n);

        if (n == 2 || n % 2 >= 1) {
            System.out.println("This number, " + n + ", is prime. \nIts prime factorization is: 1, " + n);
        } else {
            System.out.println("This number " + n + " is not prime.");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nWe are going to see if the number you include is prime or not. " +
                "Please enter a positive integer and we will see if it is prime or composite.");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        primeNumber(n);
    }
}
