// Name of programmer: Alexander Betancourt
// Name of program: Hello World with extra steps.. 
// Date started: 1/23/2023
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        // Variable declaration section.
        String userName = "";
        String greeting = "";
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("\n");
        // Input: get user name
        System.out.print("What should I call you?: ");
        userName = userInput.nextLine();
        userInput.close();
        // Oops you forgot to close the input stream.. 
        // Processing: Create a greeting
        greeting = "Hello " + userName + ", how can you make my day any worse..";

        // Output:
        System.out.print("\n" + greeting + "\n");
    }
}