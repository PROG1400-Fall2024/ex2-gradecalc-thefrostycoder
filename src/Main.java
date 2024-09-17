//PROG1400 Exercise 2
//Cody Foster - W0400746
//2024-09-17

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Define our variables
        String[] LETTER_GRADES = {"A", "B", "C", "D", "F"};
        int[] NUMBER_GRADES = {4, 3, 2, 1, 0};

        //Greet the user
        System.out.println("Welcome to the Gradebook!\n");
        System.out.println(("Please enter your letter grade: "));

        //Get our letter from the user
        Scanner scan = new Scanner(System.in);
        String gradeLetter = scan.next();

        //SUPER DIRTY OUTPUT - Definitely would be doing input validation in the real world
        System.out.println("Your grade is a " + NUMBER_GRADES[java.util.Arrays.asList(LETTER_GRADES).indexOf(gradeLetter)] + ".");



    }
}
